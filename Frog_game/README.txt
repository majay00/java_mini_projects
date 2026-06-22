===================================================
  FROG WALL CLIMBING PROBLEM - HOW TO PLAY
===================================================

OBJECTIVE:
  A frog wants to climb to the top of a wall.
  Find out how many jumps it takes to reach the top.

HOW IT WORKS:
  - Every day the frog jumps UP 3 units.
  - Every night the frog slides DOWN 2 units.
  - Net progress per day = 1 unit.
  - The frog wins when it reaches or crosses the wall height.

EXAMPLE:
  Wall height = 5

  Jump 1: Goes up to 3 --> Has not reached 5, slides to 1
  Jump 2: Goes up to 4 --> Has not reached 5, slides to 2
  Jump 3: Goes up to 5 --> REACHED THE TOP! Stop here.

  Answer = 3 jumps

HOW TO RUN THE PROGRAM:
  1. Compile:  javac Frog.java
  2. Run:      java Frog
  3. Enter the wall height when asked.
  4. The program will print the number of jumps needed.

SPECIAL CASE:
  If wall height = 0, the answer is 0 jumps (no wall to climb).

===================================================
