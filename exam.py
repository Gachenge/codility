#!/usr/bin/python3
"""student can only sit an exam if he has over 75% attendance"""


def attend():
    classes = int(input("How many classes were held?: "))
    attended = int(input("How many classes did you attend?: "))
    perc = (attended/classes)*100
    if perc >= 75:
        print(f"You are free to take your exams. You attended {perc}% classes")
    else:
        medical = input("Do you have medical cause for not attending\
                        enough classes? reply with 'Y' or 'N': ")
        if medical == 'Y':
            print("You can sit for the exams due to medical reasons")
        elif medical == 'N':
            print(f"You attended {perc}% classes.\
                  Not enough to sit for your exams")
        else:
            print(f"You may not sit for the exams.\
                  You attended {perc}% of classes")


if __name__ == "__main__":
    attend()
