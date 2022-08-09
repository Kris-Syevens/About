// Day 1 of 30 Day Challenge

// Notes on TypeScript

// What is TypeScript?
// TypeScript is a syntactic superset of JavaScript which adds static typing.

// This basically means that TypeScript adds syntax on top of JavaScript, allowing developers to add types.

// A common way to use TypeScript is to use the official TypeScript compiler, which transpiles TypeScript code into JavaScript.

// There are three main primitives in JavaScript and TypeScript.

// boolean - true or false values
// number - whole numbers and floating point values
// string - text values like "TypeScript Rocks"

//Explicit

let myName: string = "Kristofer Syevens";
let isMale: boolean = true;
let myAge: number = 2022 - 1988;

console.log(myName);
console.log(isMale);
console.log(myAge);

//Implicit

let myCountry = "United States";

// TypeScript has special types that may not refer to any specific type of data.

// Type: any
// any is a type that disables type checking and effectively allows all types to be used.

let myDogName: any = "Dallas";

myDogName = 50;

console.log(myDogName);

// Type: unknown
// unknown is a similar, but safer alternative to any.

// TypeScript will prevent unknown types from being used

let myCatName: unknown = "Austin";

myCatName = 50;

console.log(myCatName);

// Type: never
// never effectively throws an error whenever it is defined.

// Type: undefined & null
// undefined and null are types that refer to the JavaScript primitives undefined and null respectively.

// Readonly
// The readonly keyword can prevent arrays from being changed.

// Example
// const names: readonly string[] = ["Dylan"];
// names.push("Jack"); // Error: Property 'push' does not exist on type 'readonly string[]'.
// // try removing the readonly modifier and see if it works?

// Type Inference
// TypeScript can infer the type of an array if it has values.

// Example
// const numbers = [1, 2, 3]; // inferred to type number[]
// numbers.push(4); // no error
// // comment line below out to see the successful assignment
// numbers.push("2"); // Error: Argument of type 'string' is not assignable to parameter of type 'number'.
// let head: number = numbers[0]; // no error

// Typed Arrays
// A tuple is a typed array with a pre-defined length and types for each index.

// Tuples are great because they allow each element in the array to be a known type of value.

// To define a tuple, specify the type of each element in the array:

// Example
// // define our tuple
// let ourTuple: [number, boolean, string];

// // initialize correctly
// ourTuple = [5, false, 'Coding God was here'];

// Readonly Tuple
// A good practice is to make your tuple readonly.

// Tuples only have strongly defined types for the initial values:

// Example
// // define our tuple
// let ourTuple: [number, boolean, string];
// // initialize correctly
// ourTuple = [5, false, 'Coding God was here'];
// // We have no type safety in our tuple for indexes 3+
// ourTuple.push('Something new and wrong');
// console.log(ourTuple);

// You see the new valueTuples only have strongly defined types for the initial values:

// Example
// // define our readonly tuple
// const ourReadonlyTuple: readonly [number, boolean, string] = [5, true, 'The Real Coding God'];
// // throws error as it is readonly.
// ourReadonlyTuple.push('Coding God took a day off');

// Named Tuples
// Named tuples allow us to provide context for our values at each index.

// // Example
// const graph: [x: number, y: number] = [55.2, 41.3];

// Destructuring Tuples
// Since tuples are arrays we can also destructure them.

// Example
// const graph: [number, number] = [55.2, 41.3];
// const [x, y] = graph;

// TypeScript has a specific syntax for typing objects.

// Read more about objects in our JavaScript Objects chapter.

// Example
// const car: { type: string, model: string, year: number } = {
//   type: "Toyota",
//   model: "Corolla",
//   year: 2009
// };

// Type Inference
// TypeScript can infer the types of properties based on their values.

// Example
// const car = {
//   type: "Toyota",
// };
// car.type = "Ford"; // no error
// car.type = 2; // Error: Type 'number' is not assignable to type 'string'.

// Optional Properties
// Optional properties are properties that don't have to be defined in the object definition.

// Example without an optional property
// const car: { type: string, mileage: number } = { // Error: Property 'mileage' is missing in type '{ type: string; }' but required in type '{ type: string; mileage: number; }'.
//   type: "Toyota",
// };
// car.mileage = 2000;
// Example with an optional property
// const car: { type: string, mileage?: number } = { // no error
//   type: "Toyota"
// };
// car.mileage = 2000;

// Index Signatures
// Index signatures can be used for objects without a defined list of properties.

// Example
// const nameAgeMap: { [index: string]: number } = {};
// nameAgeMap.Jack = 25; // no error
// nameAgeMap.Mark = "Fifty"; // Error: Type 'string' is not assignable to type 'number'.

// An enum is a special "class" that represents a group of constants (unchangeable variables).

// Enums come in two flavors string and numeric. Lets start with numeric.

// Numeric Enums - Default
// By default, enums will initialize the first value to 0 and add 1 to each additional value:

// Example
// enum CardinalDirections {
//   North,
//   East,
//   South,
//   West
// }
// let currentDirection = CardinalDirections.North;
// // logs 0
// console.log(currentDirection);
// // throws error as 'North' is not a valid enum
// currentDirection = 'North'; // Error: "North" is not assignable to type 'CardinalDirections'.

// Numeric Enums - Initialized
// You can set the value of the first numeric enum and have it auto increment from that:

// Example
// enum CardinalDirections {
//   North = 1,
//   East,
//   South,
//   West
// }
// // logs 1
// console.log(CardinalDirections.North);
// // logs 4
// console.log(CardinalDirections.West);

// Numeric Enums - Fully Initialized
// You can assign unique number values for each enum value. Then the values will not incremented automatically:

// Example
// enum StatusCodes {
//   NotFound = 404,
//   Success = 200,
//   Accepted = 202,
//   BadRequest = 400
// }
// // logs 404
// console.log(StatusCodes.NotFound);
// // logs 200
// console.log(StatusCodes.Success);

// String Enums
// Enums can also contain strings. This is more common than numeric enums, because of their readability and intent.

// Example
// enum CardinalDirections {
//   North = 'North',
//   East = "East",
//   South = "South",
//   West = "West"
// };
// // logs "North"
// console.log(CardinalDirections.North);
// // logs "West"
// console.log(CardinalDirections.West);

// TypeScript allows types to be defined separately from the variables that use them.

// Aliases and Interfaces allows types to be easily shared between different variables/objects.

// Type Aliases
// Type Aliases allow defining types with a custom name (an Alias).

// Type Aliases can be used for primitives like string or more complex types such as objects and arrays:

// Example
// type CarYear = number
// type CarType = string
// type CarModel = string
// type Car = {
//   year: CarYear,
//   type: CarType,
//   model: CarModel
// }

// const carYear: CarYear = 2001
// const carType: CarType = "Toyota"
// const carModel: CarModel = "Corolla"
// const car: Car = {
//   year: carYear,
//   type: carType,
//   model: carModel
// };

// Interfaces
// Interfaces are similar to type aliases, except they only apply to object types.

// Example
// interface Rectangle {
//   height: number,
//   width: number
// }

// const rectangle: Rectangle = {
//   height: 20,
//   width: 10
// };

// Extending Interfaces
// Interfaces can extend each other's definition.

// Extending an interface means you are creating a new interface with the same properties as the original, plus something new.

// Example
// interface Rectangle {
//   height: number,
//   width: number
// }

// interface ColoredRectangle extends Rectangle {
//   color: string
// }

// const coloredRectangle: ColoredRectangle = {
//   height: 20,
//   width: 10,
//   color: "red"
// };

// Union types are used when a value can be more than a single type.

// Such as when a property would be string or number.

// Union | (OR)
// Using the | we are saying our parameter is a string or number:

// Example
// function printStatusCode(code: string | number) {
//   console.log(`My status code is ${code}.`)
// }
// printStatusCode(404);
// printStatusCode('404');

// TypeScript has a specific syntax for typing function parameters and return values.

// Read more about functions here.

// Return Type
// The type of the value returned by the function can be explicitly defined.

// Example
// // the `: number` here specifies that this function returns a number
// function getTime(): number {
//   return new Date().getTime();
// }

// Void Return Type
// The type void can be used to indicate a function doesn't return any value.

// Example
// function printHello(): void {
//   console.log('Hello!');
// }

// Parameters
// Function parameters are typed with a similar syntax as variable declarations.

// Example
// function multiply(a: number, b: number) {
//   return a * b;
// }

// Optional Parameters
// By default TypeScript will assume all parameters are required, but they can be explicitly marked as optional.

// Example
// // the `?` operator here marks parameter `c` as optional
// function add(a: number, b: number, c?: number) {
//   return a + b + (c || 0);
// }

// Default Parameters
// For parameters with default values, the default value goes after the type annotation:

// Example
// function pow(value: number, exponent: number = 10) {
//   return value ** exponent;
// }

// Named Parameters
// Typing named parameters follows the same pattern as typing normal parameters.

// Example
// function divide({ dividend, divisor }: { dividend: number, divisor: number }) {
//   return dividend / divisor;
// }

// Rest Parameters
// Rest parameters can be typed like normal parameters, but the type must be an array as rest parameters are always arrays.

// Example
// function add(a: number, b: number, ...rest: number[]) {
//   return a + b + rest.reduce((p, c) => p + c, 0);
// }

// Type Alias
// Function types can be specified separately from functions with type aliases.

// These types are written similarly to arrow functions, read more about arrow functions here.

// Example
// type Negate = (value: number) => number;

// // in this function, the parameter `value` automatically gets assigned the type `number` from the type `Negate`
// const negateFunction: Negate = (value) => value * -1;

// There are times when working with types where it's necessary to override the type of a variable, such as when incorrect types are provided by a library.

// Casting is the process of overriding a type.

// Casting with as
// A straightforward way to cast a variable is using the as keyword, which will directly change the type of the given variable.

// Example
// let x: unknown = 'hello';
// console.log((x as string).length);

// *** <> does work well with REACT
// Casting with <>
// Using <> works the same as casting with as.

// Example
// let x: unknown = 'hello';
// console.log((<string>x).length);

// Force casting
// To override type errors that TypeScript may throw when casting, first cast to unknown, then to the target type.

// Example
// let x = 'hello';
// console.log(((x as unknown) as number).length); // x is not actually a number so this will return undefined

// TypeScript adds types and visibility modifiers to JavaScript classes.

// Learn more about JavaScript classes here.

// Members: Types
// The members of a class (properties & methods) are typed using type annotations, similar to variables.

// Example
// class Person {
//   name: string;
// }

// const person = new Person();
// person.name = "Jane";

// Members: Visibility
// Class members also be given special modifiers which affect visibility.

// There are three main visibility modifiers in TypeScript.

// public - (default) allows access to the class member from anywhere
// private - only allows access to the class member from within the class
// protected - allows access to the class member from itself and any classes that inherit it, which is covered in the inheritance section below
// Example
// class Person {
//   private name: string;

//   public constructor(name: string) {
//     this.name = name;
//   }

//   public getName(): string {
//     return this.name;
//   }
// }

// const person = new Person("Jane");
// console.log(person.getName()); // person.name isn't accessible from outside the class since it's private

// Parameter Properties
// TypeScript provides a convenient way to define class members in the constructor, by adding a visibility modifiers to the parameter.

// Example
// class Person {
//   // name is a private member variable
//   public constructor(private name: string) {}

//   public getName(): string {
//     return this.name;
//   }
// }

// const person = new Person("Jane");
// console.log(person.getName());

// Readonly
// Similar to arrays, the readonly keyword can prevent class members from being changed.

// Example
// class Person {
//   private readonly name: string;

//   public constructor(name: string) {
//     // name cannot be changed after this initial definition, which has to be either at it's declaration or in the constructor.
//     this.name = name;
//   }

//   public getName(): string {
//     return this.name;
//   }
// }

// const person = new Person("Jane");
// console.log(person.getName());

// Inheritance: Implements
// Interfaces (covered here) can be used to define the type a class must follow through the implements keyword.

// Example
// interface Shape {
//   getArea: () => number;
// }

// class Rectangle implements Shape {
//   public constructor(protected readonly width: number, protected readonly height: number) {}

//   public getArea(): number {
//     return this.width * this.height;
//   }
// }

// Inheritance: Extends
// Classes can extend each other through the extends keyword. A class can only extends one other class.

// Example
// interface Shape {
//   getArea: () => number;
// }

// class Rectangle implements Shape {
//   public constructor(protected readonly width: number, protected readonly height: number) {}

//   public getArea(): number {
//     return this.width * this.height;
//   }
// }

// class Square extends Rectangle {
//   public constructor(width: number) {
//     super(width, width);
//   }

//   // getArea gets inherited from Rectangle
// }

// Override
// When a class extends another class, it can replace the members of the parent class with the same name.

// Newer versions of TypeScript allow explicitly marking this with the override keyword.

// Example
// interface Shape {
//   getArea: () => number;
// }

// class Rectangle implements Shape {
//   // using protected for these members allows access from classes that extend from this class, such as Square
//   public constructor(protected readonly width: number, protected readonly height: number) {}

//   public getArea(): number {
//     return this.width * this.height;
//   }

//   public toString(): string {
//     return `Rectangle[width=${this.width}, height=${this.height}]`;
//   }
// }

// class Square extends Rectangle {
//   public constructor(width: number) {
//     super(width, width);
//   }

//   // this toString replaces the toString from Rectangle
//   public override toString(): string {
//     return `Square[width=${this.width}]`;
//   }
// }

// By default the override keyword is optional when overriding a method, and only helps to prevent accidentally overriding a method that does not exist. Use the setting noImplicitOverride to force it to be used when overriding.

// Abstract Classes
// Classes can be written in a way that allows them to be used as a base class for other classes without having to implement all the members. This is done by using the abstract keyword. Members that are left unimplemented also use the abstract keyword.

// Example
// abstract class Polygon {
//   public abstract getArea(): number;

//   public toString(): string {
//     return `Polygon[area=${this.getArea()}]`;
//   }
// }

// class Rectangle extends Polygon {
//   public constructor(protected readonly width: number, protected readonly height: number) {
//     super();
//   }

//   public getArea(): number {
//     return this.width * this.height;
//   }
// }

// Generics allow creating 'type variables' which can be used to create classes, functions & type aliases that don't need to explicitly define the types that they use.

// Generics makes it easier to write reusable code.

// Functions
// Generics with functions help make more generalized methods which more accurately represent the types used and returned.

// Example
// function createPair<S, T>(v1: S, v2: T): [S, T] {
//   return [v1, v2];
// }
// console.log(createPair<string, number>('hello', 42)); // ['hello', 42]

// Classes
// Generics can be used to create generalized classes, like Map.

// Example
// class NamedValue<T> {
//   private _value: T | undefined;

//   constructor(private name: string) {}

//   public setValue(value: T) {
//     this._value = value;
//   }

//   public getValue(): T | undefined {
//     return this._value;
//   }

//   public toString(): string {
//     return `${this.name}: ${this._value}`;
//   }
// }

// let value = new NamedValue<number>('myNumber');
// value.setValue(10);
// console.log(value.toString()); // myNumber: 10

// Type Aliases
// Generics in type aliases allow creating types that are more reusable.

// Example
// type Wrapped<T> = { value: T };

// const wrappedValue: Wrapped<number> = { value: 10 };

// Default Value
// Generics can be assigned default values which apply if no other value is specified or inferred.

// Example
// class NamedValue<T = string> {
//   private _value: T | undefined;

//   constructor(private name: string) {}

//   public setValue(value: T) {
//     this._value = value;
//   }

//   public getValue(): T | undefined {
//     return this._value;
//   }

//   public toString(): string {
//     return `${this.name}: ${this._value}`;
//   }
// }

// let value = new NamedValue('myNumber');
// value.setValue('myValue');
// console.log(value.toString()); // myNumber: myValue

// Extends
// Constraints can be added to generics to limit what's allowed. The constraints make it possible to rely on a more specific type when using the generic type.

// Example
// function createLoggedPair<S extends string | number, T extends string | number>(v1: S, v2: T): [S, T] {
//   console.log(`creating pair: v1='${v1}', v2='${v2}'`);
//   return [v1, v2];
// }

// TypeScript comes with a large number of types that can help with some common type manipulation, usually referred to as utility types.

// This chapter covers the most popular utility types.

// Partial
// Partial changes all the properties in an object to be optional.

// Example
// interface Point {
//   x: number;
//   y: number;
// }

// let pointPart: Partial<Point> = {}; // `Partial` allows x and y to be optional
// pointPart.x = 10;

// Required
// Required changes all the properties in an object to be required.

// Example
// interface Car {
//   make: string;
//   model: string;
//   mileage?: number;
// }

// let myCar: Required<Car> = {
//   make: 'Ford',
//   model: 'Focus',
//   mileage: 12000 // `Required` forces mileage to be defined
// };
// Record
// Record is a shortcut to defining an object type with a specific key type and value type.

// Example
// const nameAgeMap: Record<string, number> = {
//   'Alice': 21,
//   'Bob': 25
// };

// keyof is a keyword in TypeScript which is used to extract the key type from an object type.

// keyof with explicit keys
// When used on an object type with explicit keys, keyof creates a union type with those keys.

// Example
// interface Person {
//   name: string;
//   age: number;
// }
// // `keyof Person` here creates a union type of "name" and "age", other strings will not be allowed
// function printPersonProperty(person: Person, property: keyof Person) {
//   console.log(`Printing person property ${property}: "${person[property]}"`);
// }
// let person = {
//   name: "Max",
//   age: 27
// };
// printPersonProperty(person, "name"); // Printing person property name: "Max"

// keyof with index signatures
// keyof can also be used with index signatures to extract the index type.

// type StringMap = { [key: string]: unknown };
// // `keyof StringMap` resolves to `string` here
// function createStringPair(property: keyof StringMap, value: string): StringMap {
//   return { [property]: value };
// }

// TypeScript has a powerful system to deal with null or undefined values.

// By default null and undefined handling is disabled, and can be enabled by setting strictNullChecks to true.

// The rest of this page applies for when strictNullChecks is enabled.

// Types
// null and undefined are primitive types and can be used like other types, such as string.

// Example
// let value: string | undefined | null = null;
// value = 'hello';
// value = undefined;

// Optional Chaining
// Optional Chaining is a JavaScript feature that works well with TypeScript's null handling. It allows accessing properties on an object, that may or may not exist, with a compact syntax. It can be used with the ?. operator when accessing properties.

// Example
// interface House {
//   sqft: number;
//   yard?: {
//     sqft: number;
//   };
// }
// function printYardSize(house: House) {
//   const yardSize = house.yard?.sqft;
//   if (yardSize === undefined) {
//     console.log('No yard');
//   } else {
//     console.log(`Yard is ${yardSize} sqft`);
//   }
// }

// let home: House = {
//   sqft: 500
// };

// printYardSize(home); // Prints 'No yard'

// Nullish Coalescence
// Nullish Coalescence is another JavaScript feature that also works well with TypeScript's null handling. It allows writing expressions that have a fallback specifically when dealing with null or undefined. This is useful when other falsy values can occur in the expression but are still valid. It can be used with the ?? operator in an expression, similar to using the && operator.

// Example
// function printMileage(mileage: number | null | undefined) {
//   console.log(`Mileage: ${mileage ?? 'Not Available'}`);
// }

// printMileage(null); // Prints 'Mileage: Not Available'
// printMileage(0); // Prints 'Mileage: 0'

// Null Assertion
// TypeScript's inference system isn't perfect, there are times when it makes sense to ignore a value's possibility of being null or undefined. An easy way to do this is to use casting, but TypeScript also provides the ! operator as a convenient shortcut.

// Example
// function getValue(): string | undefined {
//   return 'hello';
// }
// let value = getValue();
// console.log('value length: ' + value!.length);

// Array bounds handling
// Even with strictNullChecks enabled, by default TypeScript will assume array access will never return undefined (unless undefined is part of the array type).

// The config noUncheckedIndexedAccess can be used to change this behavior.

// Example
// let array: number[] = [1, 2, 3];
// let value = array[0]; // with `noUncheckedIndexedAccess` this has the type `number | undefined`

// NPM packages in the broad JavaScript ecosystem doesn't always have types available.

// Sometimes the projects are no longer maintained, and other times they aren't interested in, agree with, or have time to use TypeScript.

// Using non-typed NPM packages in TypeScript
// Using untyped NPM packages with TypeScript will not be type safe due to lack of types.

// To help TypeScript developers use such packages, there is a community maintained project called Definitely Typed.

// Definitely Typed is a project that provides a central repository of TypeScript definitions for NPM packages which do not have types.

// Example
// npm install --save-dev @types/jquery
// No other steps are usually needed to use the types after installing the declaration package, TypeScript will automatically pick up the types when using the package itself.
