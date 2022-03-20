import random
while(True):
    userchoice = input("How many numbers the list should contain: ")

    userList = []

    def sumList(): # This is a function that counts all the numbers in a random generated list.
        for i in range(1,int(userchoice)):
            x = random.randint(1,100) # x contains a random number between 1-100.
            userList.append(x) # the value of x is then put into a list called "userList".
        print(userList)
        sum_of_list = userList # a new list is created to count all the numbers in the list.
        Total = sum(sum_of_list) # This sum all the numbers in the list.
        print("The total is: ",Total)
    sumList()