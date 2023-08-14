#!/usr/bin/python3
"""returns elements on odd positions in a list"""


def elemodd():
    lists = input("enter the elements: ").split(' ')
    """get the elements at odd position"""
    maxi = lists[0]
    for i in range(len(lists)):
        if i % 2 != 0:
            print(lists[i])
        if lists[i] > maxi:
            maxi = lists[i]
    print(f"The largest element is : {maxi}")


if __name__ == "__main__":
    elemodd()
