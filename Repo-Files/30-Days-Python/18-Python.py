# Day 18 of 30

# DESCRIPTION:
# Write a function that merges two sorted arrays into a single one. The arrays only contain integers. Also, the final outcome must be sorted and not have any duplicate.

def merge_arr(arr1, arr2):
    new_joint_arr = set(arr1 +  arr2)
    final_list = list(new_joint_arr)
    final_list.sort()
    return final_list


a = ["a", "b", "b", "c", "d"]
b = ["x", "x", "y", "z", "z", "m"]

print(merge_arr(a, b)) # [a, b, c, d, m, x, y, z]