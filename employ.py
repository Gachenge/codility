#!/usr/bin/python3
"""pick where to post employees"""


def postings():
    """post employees based on sex, age or marital status"""
    age = int(input("Enter the age of employee: "))
    if age < 20 or age > 60:
        print("ERROR")
    sex = input("What is your sex? 'M' or 'F': ")
    marital = input("Are you married? 'Y' or 'N': ")
    if sex == 'F':
        print("You will work in urban areas")
    elif age >= 20 and age <= 40:
        print("You will work anywhere")
    elif age > 40 and age <= 60:
        print("You will work in urban areas")


if __name__ == "__main__":
    postings()
