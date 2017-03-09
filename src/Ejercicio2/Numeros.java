/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Laura Gonzalez
 */
public class Numeros {
    
    public static void main(String[] args){
    City ciudad=new City();
    Wall blockAve0 = new Wall(ciudad, 1, 1, Direction.WEST);
    Wall blockAve1 = new Wall(ciudad, 2, 1, Direction.WEST);
    Wall blockAve2 = new Wall(ciudad, 3, 1, Direction.WEST);
    Wall blockAve3 = new Wall(ciudad, 4, 1, Direction.WEST);
    Wall blockAve4 = new Wall(ciudad, 5, 1, Direction.WEST);

    Wall blockAve5 = new Wall(ciudad, 1, 4, Direction.WEST);
    Wall blockAve6 = new Wall(ciudad, 2, 4, Direction.WEST);
    Wall blockAve7 = new Wall(ciudad, 3, 4, Direction.WEST);
    Wall blockAve8 = new Wall(ciudad, 4, 4, Direction.WEST);
    Wall blockAve9 = new Wall(ciudad, 5, 4, Direction.WEST);

    Wall blockAve10 = new Wall(ciudad, 1, 7, Direction.WEST);
    Wall blockAve11 = new Wall(ciudad, 2, 7, Direction.WEST);
    Wall blockAve12 = new Wall(ciudad, 3, 7, Direction.WEST);
    Wall blockAve13 = new Wall(ciudad, 4, 7, Direction.WEST);
    Wall blockAve14 = new Wall(ciudad, 5, 7, Direction.WEST);

    Wall blockAve15 = new Wall(ciudad, 1, 9, Direction.EAST);
    Wall blockAve16 = new Wall(ciudad, 2, 9, Direction.EAST);
    Wall blockAve17 = new Wall(ciudad, 3, 9, Direction.EAST);
    Wall blockAve18 = new Wall(ciudad, 4, 9, Direction.EAST);
    Wall blockAve19 = new Wall(ciudad, 5, 9, Direction.EAST);

    Wall blockAve20 = new Wall(ciudad, 1, 1, Direction.NORTH);
    Wall blockAve21 = new Wall(ciudad, 1, 2, Direction.NORTH);
    Wall blockAve22 = new Wall(ciudad, 1, 3, Direction.NORTH);
    Wall blockAve23 = new Wall(ciudad, 1, 4, Direction.NORTH);
    Wall blockAve28 = new Wall(ciudad, 1, 5, Direction.NORTH);
    Wall blockAve24 = new Wall(ciudad, 1, 6, Direction.NORTH);
    Wall blockAve25 = new Wall(ciudad, 1, 7, Direction.NORTH);
    Wall blockAve26 = new Wall(ciudad, 1, 8, Direction.NORTH);
    Wall blockAve27 = new Wall(ciudad, 1, 9, Direction.NORTH);

    Wall blockAve29 = new Wall(ciudad, 5, 1, Direction.SOUTH);
    Wall blockAve30 = new Wall(ciudad, 5, 3, Direction.SOUTH);
    Wall blockAve31 = new Wall(ciudad, 5, 4, Direction.SOUTH);
    Wall blockAve32 = new Wall(ciudad, 5, 6, Direction.SOUTH);
    Wall blockAve33 = new Wall(ciudad, 5, 7, Direction.SOUTH);
    Wall blockAve34 = new Wall(ciudad, 5, 9, Direction.SOUTH);
    
    

    }
    
}
