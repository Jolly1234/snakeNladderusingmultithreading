"# snakeNladderusingmultithreading" 
1. The input for your application will an M*N matrix and your application should read
the data from the given sample input, which would consist snakes & ladders data.
2. Your executable application should randomly generate a dice number D (ranges
from 1-6) and move the control to dth position accordingly. Continue the process
until it reaches EndPoint(100). Beware of Pit Stops(See point 4).
3. The above process should be done for 2 users where each user takes (not parallel)
turn and the user who reaches EndPoint first should be displayed. Note: Users can
be realised as Java Threads & print relevant information on the console for each
turn. For example: For every turn you need to print like the following;
USER DICE NO. PREVIOUS STATE CURRENT STATE
user1 4 23 27
user2 5 18 23
user1 . .. ..
4. Whenever you move the control to Dth position, Look out for the PitStop positions,
the control might jump ahead in case of Ladder or Fallback in-case of Snake like a
regular rule of Classical Snake and Ladder game.
5. Below is the details of the given input file
○ The first line of the input file represents Number of PitStops.
○ Each row of the remaining lines indicate a PitStop.
○ Each PitStop consists of 4 numbers, in the order of,
ST (Snake Tail), SH (Snake Head), LB (Ladder Bottom), LT (Ladder
Top)
For Example: For the below datapoint,
1 27 3 22
1 indicates ST, 27 indicates SH, 3 indicates LB & 22 indicates LT
Deliverable
And at last, Write an algorithm to find the shortest path to reach the EndPoint from the
StartPoint considering all the PitStops.

Sample Input
4
1 27 3 22
4 17 5 8
9 21 11 26
7 19 20 29
