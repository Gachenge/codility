#!/usr/bin/python3
"""string of arrows, eaqch pointing to a different cardinal point
find the minimum number of arrows that must be rotated so they all point
in the same direction"""


def cardinal(points):
    """take the string, count how many are pointing in one direction"""
    if points is None:
        print("No points passed")
    else:
        point = []
        point[:] = points
        upcount = 0
        rcount = 0
        dcount = 0
        lcount = 0
        for arrow in range(len(point)):
            if point[arrow] == '^':
                upcount += 1
            elif point[arrow] == '>':
                rcount += 1
            elif point[arrow] == 'v':
                dcount += 1
            elif point[arrow] == '<':
                lcount += 1
        maxi = max([upcount, rcount, dcount, lcount])
        numb = len(point)
        if numb - maxi == 0:
            print("All arrows face the same direction")
        else:
            print(numb-maxi)


if __name__ == "__main__":
    cardinal('^vv<v')
