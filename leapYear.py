#!/usr/bin/python3
"""check if a year is a leap year"""


def leap():
    """leap year should be divisible by 4 or if century divisible by 400"""
    year = int(input("Enter the year : "))
    if (year % 4 == 0 and year % 100 != 0) or year % 400 == 0:
        print(f"{year} is a leap year")
    else:
        print(f"{year} is NOT a leap year")


if __name__ == "__main__":
    leap()
