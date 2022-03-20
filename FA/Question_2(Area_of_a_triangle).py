attempts = 3

while(True):
    def area_of_triangle(base, height):# This is the formula for calculating the area of a traingle.
         return 0.5 * base * height

    base1 = int(input("Give the base:" ))
    height1 = int(input("Give the height:"))

    if(base1 > height1):
        attempts = attempts -1
        if(attempts == 0):
            print("You have exhausted your 3 attempts pleasse try again later")
            break
    elif(base1 <= height1): # When the base is less or equal to the height. The calculation is made.
        print(area_of_triangle(base1, height1))
    