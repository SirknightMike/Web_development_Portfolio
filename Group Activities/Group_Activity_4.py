import turtle
import time
# Creating a Screen for our game
frame = turtle.Screen()
frame.bgcolor("Black") # This sets the colour of the background
frame.title("Group Activity 4") # This is the name of the program 

# Creating a player:
player = turtle.Turtle()
player.color("yellow") # This gives the player colour.
player.shape("triangle") # This makes the shape of the player.
player.penup() # This disable the trail that is made by the player.

# Our player movement

speed =1


def turnleft():
    player.left(30) # This allows the user to turn left
def turnRight():
    player.right(30) # This will allow the user to turn right
def increaseSpeed():
    global speed # This increases the speed of the player.
    speed +=1
def timerCount(t = 10): # This is the pause and stop watch function
    is_paused = False
    while(True):
        if not is_paused:
            time.sleep(1) # This allows the next line of code to be excuted every seconde
            t = t -1 
            print(t)
            if(t == 0):
                print("GAME OVER")
                time.sleep()
                break
        


turtle.listen()
turtle.onkey(turnleft,"Left") # this looks when the user presses the left arrow button(key).
turtle.onkey(turnRight,"Right") # this looks when the user presses the right arrow button(key).
turtle.onkey(increaseSpeed,"Up") # this looks when the user presses the up arrow button(key).
turtle.onkey(timerCount,"p") # This looks when user is pressing the "p" button and then the function "timerCount" is called

while (True):
    player.forward(speed)

turtle.done()