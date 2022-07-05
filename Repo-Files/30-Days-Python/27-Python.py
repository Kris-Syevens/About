# Day 27 of 30

# DESCRIPTION:
# Imagine you are creating a game where the user has to guess the correct number. But there is a limit of how many guesses the user can do.

# If the user tries to guess more than the limit, the function should throw an error.
# If the user guess is right it should return true.
# If the user guess is wrong it should return false and lose a life.
# Can you finish the game so all the rules are met?
import random

def guessing_game():
    print("""
    *************************************
    
    Welcome to the guess game!
    You'll have 3 tries to guess a number
    from 1-20.

    *************************************
    """)
    counter = 1
    tries = 3
    secret_number = random.randrange(1,10)

    while tries > 0:
        user_guess = int(input(f"Attempt No. {counter} Guess a number: "))
        if user_guess == secret_number:
            print("\nWinner winner, chicken dinner! ")
            print("\nYOOOOOUUUUU WIIIIIINNNNNN!!!!! ")
            break
        else:
            tries -= 1
            counter += 1
            if tries == 0:
                print("Sorry, better luck next time. Play again?")
                break
    

guessing_game()