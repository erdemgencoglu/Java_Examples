Number Guessing Game

User picks a number between 1 and 100. Then computer tries to guess that number. Computer
makes guesses until it finds the number user picked. If the cmputer's guess is wrong, user should
provide the information of if the number is bigger or smaller than computer's guess. Output of the
application should be like below when user picks 42. Write the Guess Game Java application.

Guessing: 50 (0:right guess 1:my number is lower 2:my number is higher) : 1
Guessing: 25 (0:right guess 1:my number is lower 2:my number is higher) : 2
Guessing: 37 (0:right guess 1:my number is lower 2:my number is higher) : 2
Guessing: 43 (0:right guess 1:my number is lower 2:my number is higher) : 1
Guessing: 40 (0:right guess 1:my number is lower 2:my number is higher) : 2
Guessing: 41 (0:right guess 1:my number is lower 2:my number is higher) : 2
Guessing: 42 (0:right guess 1:my number is lower 2:my number is higher) : 0
Computer guessed 42 at 7 steps...

//Guess game pseudo code
Define lower and upper bounds
Set lower bound to zero and upper bound to hundred
while computer doesn't make right guess
guess= (upper+lower)/2
Prompt user guess and result
if(result is smaller)
upper bound= guess
else if(result is bigger)
lower bound=guess
