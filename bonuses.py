#!/usr/bin/python3
"""give 5% bonus to employees if this is past their 5th year of service"""


def bonus():
    """give 5% bonuses"""
    years = int(input("How many years have you worked here?: "))
    salary = int(input("What is your current salary?: "))
    bonus = 0
    if years > 5:
        bonus = 0.05 * salary
    print(bonus)


if __name__ == "__main__":
    bonus()
