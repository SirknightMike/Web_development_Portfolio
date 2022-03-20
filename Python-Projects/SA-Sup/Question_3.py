while(True):
    month = { 1:'January',2:'February',3:'March',4:'April',5:'May',6:'June',7:'July',8:'August',9:'September',10:'October',11:'November',12:'December'}


    try: 
        userInput = int(input('Enter a number between 1 and 12 '))
        print(month[userInput]) # it looks threw months sets and searches threw it.
    except (ValueError, KeyError): # if a error occurs it will pop a validation text.
        print('Please enter a number 1 and 12')