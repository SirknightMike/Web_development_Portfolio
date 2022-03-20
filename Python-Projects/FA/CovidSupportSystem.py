SA_Confirmed_casses = 27403
USA_Confirmed_casses = 1700000
China_Confirmed_casses = 82995
while(True):
    print("Welcome to the COVID 19 support service. Please select an option below:")

    optionList = ["1.Statistics", "2.Prevention", "3.Symptoms", "4.Treatment", "5.Report case", "6.Exit"]
    numberList = "\n".join(optionList) #This will allow the elements of the list to be printed out, all in new lines
    print(numberList)



    userChoice = input("Enter choice(1/2/3/4/5/6): ")
    if(userChoice == "1"):
        print("\n""Currently in SA there are",SA_Confirmed_casses,"Confirmed casses")
        print("Currently in USA there are",USA_Confirmed_casses,"Confirmed casses")
        print("Currently in China there are",China_Confirmed_casses,"Confirmed casses")
        randomCountry_Info = input("\n""Would you like to see the Confirmed casses for a random country? y/n: ")
        if(randomCountry_Info == "y"): #when the user says yes the program will ask the user to enter a number between 0 to 9. Each number will give a random country.
            country_selection = input("To select a random country, type a number from 0 to 9: ")
            country_List = ["Denmark with 9733 confirmed casses", "England with 5493 confirmed casses", "Germany with 12788 confirmed casses", "France with 1233 confirmed casses", "Spain with 500 confirmed casses", "Brazil with 135 confirmed casses", "New Zealand with 150 confirmed casses", "Australia has 7155 confirmed casses","Japan with 9700 confirmed casses","Madagascar with 54 confirmed casses"]
            print(country_List[int(country_selection)])

    elif(userChoice == "2"): #when the user choses option 2 it will bring information of how to prevent COVID19
        print("To prevent the spread of COVID-19:")
        print("Clean your hands often. Use soap and water, or an alcohol-based hand rub.")
        print("Don't touch your eyes, nose or mouth.")
        print("Cover your nose and mouth with your bent elbow or a tissue when you cough or sneeze.")
        print("Stay home if you feel unwell.")
        print("If you have a fever, cough and difficulty breathing, seek medical attention. Call in advance.")
        print("Follow the directions of your local health authority.")

    elif(userChoice == "3"): #when the user choses option 3. It will give information of symptoms that might occur if having COVID19
        print("\n""Most common symptoms:")
        print("fever""\n""dry cough""\n""tiredness")
        print("\n""Less common symptoms: ")
        print("aches and pains""\n""sore throat""\n""diarrhoea""\n""conjunctivitis""\n""headache""\n""loss of taste or smell""\n""a rash on skin, or discolouration of fingers or toes")
        print("\n""Serious symptoms: ")
        print("difficulty breathing or shortness of breath""\n""chest pain or pressure""\n""loss of speech or movement")

    elif(userChoice == "4"): #when the user choses option 4. It will give information of the treatment, of how to treat the virus.
        print("\n""If you feel sick you should rest, drink plenty of fluid, and eat nutritious food. Stay in a seperate room")
        print("from other family members, and use a dedicated bathroom if possible. Clean and disinfect")
        print("frequently touched surfaces.")

    elif(userChoice == "5"): #when the user choses option 5. It will ask the user a few question that the user should answer. To know if the user might have COVID19.
        covidAnalize = input("Do you have any of the syptoms? y/n: ")
        if(covidAnalize == "n"):
            print("You do not have COVID19")
        elif(covidAnalize == "y"):
            userTemperature = input("Is your temperature above 38.5 C? y/n: ")
            if(userTemperature == "n"):
                print("You do not have COVID19")
            elif(userTemperature == "y"):
                userCountry = input("In which country are you select an option below:""\n""1.SA""\n""2.USA""\n""3.China""\n")
                if(userCountry == "1"):
                    print("There are now ",SA_Confirmed_casses + 1," casses")
                elif(userCountry == "2"):
                    print("There are now ",USA_Confirmed_casses + 1," casses")
                elif(userCountry == "3"):
                    print("There are now ",China_Confirmed_casses + 1," casses")
    
    elif(userChoice == "6"):# When option 6 is selected. It will end the program and exit.
        break


    

