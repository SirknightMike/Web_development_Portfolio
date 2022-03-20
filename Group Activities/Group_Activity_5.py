import random

userCredits = 100

while(True): 
    print("====================================")
    print("WELCOME TO YOU WILL ALWAYS LOSE")
    print("====================================")

    print("WIN BIG OR GO HOME WITH NOTHING.....")
    print("====================================")

    print("GET 3 OF THE SAME NUMBER TO WIN DUBBLE WHAT YOU PLAYED")
    print("====================================")

    print("YOU CURRENTLY HAVE ", userCredits," CREDITS, HOW MUCH WOULD YOU LIKE TO PLAY ") 
    betting_Credits = int(input())

   
    if(betting_Credits > 100): # This will look for if the user has an input(betting_Credits) greater than 100
        print("YOU SEEM TO BE TO BROKE TO DO THAT, GOOD BYE")
        print("YOU HAVE CASHED OUT 100 CREDITS")
        print("COME LOSE AGAIN SOON!!!!!!! HAHAHAHAHA")

    if(betting_Credits <= 100): # When bettings_Credits is less or equal to 100 the following will be excuted:
        print("YOUR NUMBER ARE......")
        print("====================================")
        randomNumber1 = int(random.randint(1,10)) # This will get a random integer number between 1 and 10
        randomNumber2 = int(random.randint(1,10))
        randomNumber3 = int(random.randint(1,10))
        print(randomNumber1, randomNumber2, randomNumber3) # The random values will then be printed out
        
        if(randomNumber1 == randomNumber2 and randomNumber1 == randomNumber3 and randomNumber2 == randomNumber3):
            winning_Amount = betting_Credits*2 # This will give the user double amount back if the "if statement"  is true
            print("YOU HAVE WON ",int(winning_Amount),"CREDITS!!!!!!!!!!!!!!")
            userCredits = userCredits + winning_Amount # This adds the new value that is won to the amount of credits the user has.
        else:
            userCredits = userCredits - betting_Credits # When the user losses it will subtract from the user's Credit amount("userCredits")
            print("YOU LOST THAT ONE!!!!!!!!!!!!!!!! HAHAHAHAHAHAHA")
        
        print("====================================")
        print("WOULD YOU LIKE TO PLAY AGAIN???? Y/N")
        print("====================================")
        
        is_user_contuening = input()
        
        if(is_user_contuening == "n" or is_user_contuening == "N"): # This will be excuted when the user answers "n" or "N"
             print("YOU HAVE CASHED OUT",userCredits," CREDITS")
             print("COME LOSE AGAIN SOON !!!!!!!!!! HAHAHAHAHAHA" )
             break
        elif(is_user_contuening == "y" or is_user_contuening == "Y"): # This will be excuted when the user answers "y" or "Y" 
            pass # This will allow the program to pass and enter the while loop again.
      

