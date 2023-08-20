#!/usr/bin/python3

n = int(input())
prime = True
for i in range(n):
    num = int(input())
    prime = True
    if num <= 1:
        prime = False
    else:
        for j in range(2, int(num**0.5)+1):
            if num % j == 0:
                prime = False
                break
        if prime is True:
            print("Prime")
        else:
            print("Not prime")
