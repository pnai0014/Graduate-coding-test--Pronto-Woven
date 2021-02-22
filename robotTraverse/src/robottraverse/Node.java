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
public class Node {

    String direction;
    int x, y;

    //Default Constructor
    Node() {
        this.direction = Constants.NORTH;
        this.x = 0;
        this.y = 0;
    }

    //Parametrized Constructor
    Node(String direction, int x, int y) {
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    //Getter for direction
    public String getDirection() {
        return direction;
    }

    //Getter for X Position
    public int getX() {
        return x;
    }

    //Getter for Y Position
    public int getY() {
        return y;
    }

    //Setter for direction
    public void setDirection(String direction) {
        this.direction = direction;
    }

    //Setter for X Position
    public void setX(int x) {
        this.x = x;
    }

    //Setter for Y Position
    public void setY(int y) {
        this.y = y;
    }

}
