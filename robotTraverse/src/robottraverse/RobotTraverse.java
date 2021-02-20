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

           
    }
}
