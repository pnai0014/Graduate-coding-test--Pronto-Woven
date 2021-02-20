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

    public String getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setDirection(String direction) {
        System.out.println("in node class: "+direction);
        this.direction = direction;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
