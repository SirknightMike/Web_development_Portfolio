wordList = []
while(True):
    words = input("Type in any worlds, at least 5 words or more: ")
    
    userInput = words.split() # This helps strings to splited into a list.
    wordcount = len(userInput) # This is a counter. It counts the amount of words.
    if(wordcount < 5): # If the user does not enter at least 5 words the program stops.
            break
    else: 
        reversed_string = words[::-1] # This will make the words backwards.
        print(reversed_string)