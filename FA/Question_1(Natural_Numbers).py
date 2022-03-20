n = int(input("Enter a number to calculate sum: "))


if(n < 0):
    abs(n) # This makes any number an absolute number. This just helps if the user enters a negative, to turn the value into a positive value.
else:
    for i in range(1,n): # The equation Sn=n2/2(a+l) gives us the sum of a pattern. I first set l = n seen as n is the last number. Then I just simplify the equation((na+n*n)/2). a is just the first number = 1 so a is not required.((n+n*2)/2)
        sum = (n + n*n)/2 # This equation that I made calculates the sum of "n"(input from the user) natural numbers.
        average = sum/n # This will calculate the average of "sum".

print("Sum of the first ",n," natural numbers using formula is: ", sum)
print("Average of the first", n," natural numbers using formula is: ",average)