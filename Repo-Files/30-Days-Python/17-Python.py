# Day 17 of 30

# DESCRIPTION:
# HELP! Jason can't find his textbook! It is two days before the test date, and Jason's textbooks are all out of order! Help him sort a list (ArrayList in java) full of textbooks by subject, so he can study before the test.

# The sorting should NOT be case sensitive

def sort_textbooks(arr):
    sorted_arr = arr
    sorted_arr.sort()

    return sorted_arr


print(sort_textbooks(["zimmy science", "muppet and pals", "happy potter", "sorccery", "blue moon waves", "honest abe"]))