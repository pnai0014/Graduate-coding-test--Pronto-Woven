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
        String regex = "^([FBLR]{1}[1-9]\\d*)(,[FBLR]{1}[1-9]\\d*)*$";
        Pattern p = Pattern.compile(regex);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please enter the input String");
            input = sc.next();
            m = p.matcher(input);
        } while (!m.matches());

        System.out.println("Start Position X:" + currentPosition.getX() + " Y:" + currentPosition.getY());
        String splitInput[] = input.split(",");
        for (int i = 0; i < splitInput.length; i++) {
            char command = splitInput[i].charAt(0);
            int value = Integer.parseInt(splitInput[i].substring(1));
            System.out.println("command:" + command + " val:" + value);
            //Print New Position
            //movefront(currentPosition, command, value);
            switch (command) {
                case 'F':
                    moveForward(currentPosition, value);
                    break;
                case 'B':
                    moveBackward(currentPosition, value);
                    break;
                case 'R':
                    moveRight(currentPosition, value);
                    break;
                case 'L':
                    moveLeft(currentPosition, value);
                    break;
            }
            }

    }

    public static void moveForward(Node currentPosition, int value) {}

    public static void moveBackward(Node currentPosition, int value) {}
    
    public static void moveRight(Node currentPosition, int modValue) {}
    
    public static void moveLeft(Node currentPosition, int modValue) {}
}
