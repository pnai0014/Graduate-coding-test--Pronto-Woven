/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robottraverse;

/**
 *
 * @author naikp
 */
import java.util.*;
import java.util.regex.*;

public class RobotTraverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node currentPosition = new Node();
        String input = "";
        Matcher m;
        String regex = "^([FBLR]{1}[1-9]\\d*)(,[FBLR]{1}[1-9]\\d*)*$"; //Regular expression to accept the correct string.
        try {
            Pattern p = Pattern.compile(regex);
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Please enter the valid input String (eg. F1,R2,B3,L145)");
                input = sc.next();
                m = p.matcher(input);
            } while (!m.matches()); // Loop until the input matches the regular expression 

            System.out.println("Start Position X:" + currentPosition.getX() + " Y:" + currentPosition.getY());
            String splitInput[] = input.split(","); // Split the comma seperated values
            for (int i = 0; i < splitInput.length; i++) {
                char command = splitInput[i].charAt(0); // Extract the command value eg. F/B/R/L 
                int value = Integer.parseInt(splitInput[i].substring(1)); // Extract the value
                System.out.println("Command:" + command + " Value:" + value);
                int modValue = value % 4; // Calculate mod value when robot turns right or left
                //Switch case to based on the input command
                switch (command) {
                    case 'F':
                        moveForward(currentPosition, value);
                        break;
                    case 'B':
                        moveBackward(currentPosition, value);
                        break;
                    case 'R':
                        turnRight(currentPosition, modValue);
                        break;
                    case 'L':
                        turnLeft(currentPosition, modValue);
                        break;
                }
                //Print the New position
                System.out.println("New Position X:" + currentPosition.getX() + " Y:" + currentPosition.getY() + " current Direction: " + currentPosition.getDirection());
            }
            //Calculate the Manhattan Distance
            System.out.println("The shortest distance is: " + (Math.abs(currentPosition.getX()) + Math.abs(currentPosition.getY())));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // Method to move forward
    public static void moveForward(Node currentPosition, int value) {
        if (currentPosition.getDirection().equals(Constants.NORTH)) {

            currentPosition.setY(currentPosition.getY() + value);
        } else if (currentPosition.getDirection().equals(Constants.SOUTH)) {
            currentPosition.setY(currentPosition.getY() - value);
        } else if (currentPosition.getDirection().equals(Constants.EAST)) {
            currentPosition.setX(currentPosition.getX() + value);
        } else if (currentPosition.getDirection().equals(Constants.WEST)) {
            currentPosition.setX(currentPosition.getX() - value);
        }
    }

    //Method to move Backward
    public static void moveBackward(Node currentPosition, int value) {
        if (currentPosition.getDirection().equals(Constants.NORTH)) {

            currentPosition.setY(currentPosition.getY() - value);
        } else if (currentPosition.getDirection().equals(Constants.SOUTH)) {
            currentPosition.setY(currentPosition.getY() + value);

        } else if (currentPosition.getDirection().equals(Constants.EAST)) {
            currentPosition.setX(currentPosition.getX() - value);
        } else if (currentPosition.getDirection().equals(Constants.WEST)) {
            currentPosition.setX(currentPosition.getX() + value);
        }
    }

    //ChHANGE DIRECTION 90 DEGREE RIGHT IN CLOCK WISE DIRECTION
    public static void turnRight(Node currentPosition, int modValue) {
        if (currentPosition.getDirection().equals(Constants.NORTH)) {
            if (modValue == 1) {
                currentPosition.setDirection(Constants.EAST);
            } else if (modValue == 2) {
                currentPosition.setDirection(Constants.SOUTH);
            } else if (modValue == 3) {
                currentPosition.setDirection(Constants.WEST);
            }

        } else if (currentPosition.getDirection().equals(Constants.SOUTH)) {
            if (modValue == 1) {
                currentPosition.setDirection(Constants.WEST);
            } else if (modValue == 2) {
                currentPosition.setDirection(Constants.NORTH);
            } else if (modValue == 3) {
                currentPosition.setDirection(Constants.EAST);
            }

        } else if (currentPosition.getDirection().equals(Constants.EAST)) {
            if (modValue == 1) {
                currentPosition.setDirection(Constants.SOUTH);
            } else if (modValue == 2) {
                currentPosition.setDirection(Constants.WEST);
            } else if (modValue == 3) {
                currentPosition.setDirection(Constants.NORTH);
            }

        } else if (currentPosition.getDirection().equals(Constants.WEST)) {
            if (modValue == 1) {
                currentPosition.setDirection(Constants.NORTH);
            } else if (modValue == 2) {
                currentPosition.setDirection(Constants.EAST);
            } else if (modValue == 3) {
                currentPosition.setDirection(Constants.SOUTH);
            }

        }

    }

    //CHANGE DIRECTION 90 DEGREE LEFT IN ANTICLOCK WISE DIRECTION
    public static void turnLeft(Node currentPosition, int modValue) {

        if (currentPosition.getDirection().equals(Constants.NORTH)) {
            if (modValue == 1) {
                currentPosition.setDirection(Constants.WEST);
            } else if (modValue == 2) {
                currentPosition.setDirection(Constants.SOUTH);
            } else if (modValue == 3) {
                currentPosition.setDirection(Constants.EAST);
            }

        } else if (currentPosition.getDirection().equals(Constants.EAST)) {
            if (modValue == 1) {
                currentPosition.setDirection(Constants.NORTH);
            } else if (modValue == 2) {
                currentPosition.setDirection(Constants.WEST);
            } else if (modValue == 3) {
                currentPosition.setDirection(Constants.SOUTH);
            }

        } else if (currentPosition.getDirection().equals(Constants.SOUTH)) {
            if (modValue == 1) {
                currentPosition.setDirection(Constants.EAST);
            } else if (modValue == 2) {
                currentPosition.setDirection(Constants.NORTH);
            } else if (modValue == 3) {
                currentPosition.setDirection(Constants.WEST);
            }

        } else if (currentPosition.getDirection().equals(Constants.WEST)) {
            if (modValue == 1) {
                currentPosition.setDirection(Constants.SOUTH);
            } else if (modValue == 2) {
                currentPosition.setDirection(Constants.EAST);
            } else if (modValue == 3) {
                currentPosition.setDirection(Constants.NORTH);
            }
        }

    }
}
