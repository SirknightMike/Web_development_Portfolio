import random

randomInt = []

for i in range(10):
    x = random.randint(10,50) # x will contain a random value between 10-50
    randomInt.append(x) # the value of x is then placed in the list "randomInt".This process will be repeated 10 times.
    
    
print(randomInt)
evenNumbers = []
for i in randomInt:
    if(i%2 == 0): # It is deviding threw each element in "randomInt" and looking for any remainder if the element does not 
        evenNumbers.append(i) # have a remainder it is added to a list called "evenNumbers" 

print("The even numbers are: "+str(evenNumbers))
