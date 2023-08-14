#!/usr/bin/python3
"""give 10% discounts to costs of over 1000"""


def discount():
    """calculate the amount discounted"""
    quantity = int(input("How many items did you buy?: "))
    disco = 0
    if quantity > 10:
        disco = 0.1 * (quantity*100)
    print(disco)


if __name__ == "__main__":
    discount()
