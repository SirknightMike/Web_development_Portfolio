import requests
while(True):
    print("Welcome to the AA Calculator")
    print("Please select one of the following options: ")
    print("1. Have a look at the previous entry.")
    print("2. Make a new entry.")
    print("3. Close the program.")
    userChoice = input("1/2/3: ")
    if(userChoice == "2"):
        metersTraveled = int(input("How many meters have you traveled?: "))
        convertingToKillometers = metersTraveled /1000
        print(convertingToKillometers,"Km")

        print("Here is the list of vechiles, please select one: ")
        print("1. Hatchback")
        print("2. SUV")
        print("3. Sports Car")
        userSecondQuestionChoice = input("1/2/3: ")

        AA_Calc = 'https://raw.githubusercontent.com/tyrone0501/AA-Petrol-Price/main/Cars.json'
        response = requests.get(AA_Calc) 
        response_json = response.json()

        siteresponse1 = response_json["Hatchback"] # siteresponse1 will have the value of what the Hatchback on the website
        siteresponse2 = response_json["SUV"] #  siteresponse2 will have the value of what the SUV on the website
        siteresponse3 = response_json["SportsCar"] # siteresponse3

        if(userSecondQuestionChoice == "1"):
            Total  = siteresponse1 * convertingToKillometers
            print(Total)
        elif(userSecondQuestionChoice == "2"):
            Total = siteresponse2 * convertingToKillometers
            print(Total)
        elif(userSecondQuestionChoice == "3"):
            Total = siteresponse3 * convertingToKillometers
            print(siteresponse3 * convertingToKillometers)

        thirdQuestion = input("Please type in your description of where you traveled and why: ")

        

    myDictionary = {"Cost":Total, "KM": convertingToKillometers,"Description":thirdQuestion}
        
    if(userChoice == "1"): # When option 1 is selected then all information will show of the previous entry.
        print("Here is the previous entry")
        print("/nYour amount of kilometers is",myDictionary["KM"],"KM")
        print("Your total cost is R",myDictionary["Cost"])
        print("Your Description:",myDictionary["Description"])

    if(userChoice == "3"): # This will close the program if option 3 is selected.
        break