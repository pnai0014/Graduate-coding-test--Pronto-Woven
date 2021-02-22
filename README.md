# Graduate-coding-test--Pronto-Woven
### Title
* Program to track the robot's minimum Distance to traverse from its starting point. 
* Inputs: - a string of comma-separated commands eg `F1,R1,B2,L1,B3`
* Output: - the minimum amount of distance to get back to the starting point (`4` in this case)

### Design Decisions
#### The following steps are used to execute the code
* Create a node class for the robot, where define the valid parameters like x and y position value and current direction where the robot is facing.
* A robot is placed in a 2X2 matrix where the current position of the robot(node) is considered as (x,y), where x = 0 and y = 0.
* As given, the robot has 4 directions(north, south, east west) where he can move, the default direction for the robot is set to 'north'.
* When the robot gets the command to move forward, execute following steps:<br/>
Check the current direction of the robot.
If the current direction is 'north', increment y by the given value in the input.
If the current direction is 'south', decrement y by the given value in the input.
If the current direction is 'east', increment x by the given value in the input.
If the current direction is 'west', decrement x by the given value in the input.
* Similarly, when the robot gets the command to move backward, execute following steps:<br/>
Check the current direction of the robot.
If the current direction is 'north', decrement y by the given value in the input.
If the current direction is 'south', increment y by the given value in the input.
If the current direction is 'east', decrement x by the given value in the input.
If the current direction is 'west', increment x by the given value in the input.
* When the robot gets the command to turn right, execute following steps:
Take the mod value of the given input by 4 as the robot can turn in 4 directions.
For each direction(eg. north), calculate the mod value by the given input. 
Change the direction in a clockwise direction as the robot turns right. (eg. If current direction of the robot is east and the next command is R1, the mod value calculated is 1, so the current direction for the robot will change to South as it has to move in clockwise direction.)
As the robot just turns right, value for x and y wont change.
Similarly, when the robot gets the command to turn left, move the robot direction in anti clock wise direction.
* Finally, get the value of x and y and calculate the Manhattan distance (as the robot cannot move diagonally).
* Display the result.

### Code Execution and Testing
* Install JDK and JVM on the system. Install any IDE like Netbeans or Eclipse.
* Pull the package from the github repository and execute the code.
* Enter the valid input.
* The program will output the Start Position, and position of robot and direction by execution of each command.
* The shortest distance is displayed by considering the final x and y position and the start position.

### Extensibility
* In the given problem, the robot can only move in 4 directions, in which the diagonal commands are not being added.
* If the robot moves diagonally, the shortest distance calculated can be less as diagonal distance or euclidean distance can be calculated between the start and the end position.
* Also, there can be a seperate method that can be added to move the robot in a diagonal direction, which could not allow the existed code to change.
* The distance formula can be updated from Manhattan to the one that tracks diagonal movements.
* Another approach that can be used is implementing A* algorithm by considering a relevant heuristic value and finding the shortest distance in minimal time.

 
