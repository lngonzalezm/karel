/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laberinto;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Laura Gonzalez
 */
public class Escenario {
    public static void main(String[] args){
    City ciudad = new City();
    Thing nugget=new Thing (ciudad,3,4);
    Thing nugget2=new Thing (ciudad,5,3);
    Thing nugget3=new Thing (ciudad,2,6);
    Robot robot = new Robot(ciudad, 6, 6, Direction.NORTH);
    Wall blockAve0 = new Wall(ciudad, 4, 0, Direction.WEST);
    Wall blockAve1 = new Wall(ciudad, 5, 0, Direction.WEST);
    Wall blockAve2 = new Wall(ciudad, 5, 0, Direction.SOUTH);
    Wall blockAve3 = new Wall(ciudad, 6, 1, Direction.WEST);
    Wall blockAve4 = new Wall(ciudad, 6, 1, Direction.SOUTH);
    Wall blockAve5 = new Wall(ciudad, 6, 2, Direction.SOUTH);
    Wall blockAve6 = new Wall(ciudad, 6, 2, Direction.EAST);
    Wall blockAve7 = new Wall(ciudad, 5, 2, Direction.EAST);
    Wall blockAve8 = new Wall(ciudad, 4, 3, Direction.SOUTH);
    Wall blockAve9 = new Wall(ciudad, 4, 3, Direction.EAST);
    Wall blockAve10 = new Wall(ciudad, 3, 4, Direction.WEST);
    Wall blockAve11 = new Wall(ciudad, 3, 4, Direction.SOUTH);
    Wall blockAve12 = new Wall(ciudad, 6, 4, Direction.WEST);
    Wall blockAve13 = new Wall(ciudad, 5, 4, Direction.SOUTH);
    Wall blockAve14 = new Wall(ciudad, 5, 5, Direction.WEST);
    Wall blockAve15 = new Wall(ciudad, 4, 5, Direction.SOUTH);
    Wall blockAve16 = new Wall(ciudad, 4, 6, Direction.SOUTH);
    Wall blockAve17 = new Wall(ciudad, 5, 6, Direction.WEST);
    Wall blockAve18= new Wall(ciudad, 6, 6, Direction.WEST);
    Wall blockAve19 = new Wall(ciudad, 6, 6, Direction.SOUTH);
    Wall blockAve20 = new Wall(ciudad, 6, 7, Direction.WEST);
    Wall blockAve21 = new Wall(ciudad, 5, 7, Direction.SOUTH);
    Wall blockAve22 = new Wall(ciudad, 5, 8, Direction.WEST);
    Wall blockAve23 = new Wall(ciudad, 4, 8, Direction.WEST);
    Wall blockAve28 = new Wall(ciudad, 3, 8, Direction.WEST);
    Wall blockAve24 = new Wall(ciudad, 2, 7, Direction.SOUTH);
    Wall blockAve25 = new Wall(ciudad, 2, 7, Direction.WEST);
    Wall blockAve26 = new Wall(ciudad, 1, 6, Direction.SOUTH);
    Wall blockAve27 = new Wall(ciudad, 1, 6, Direction.WEST);
    Wall blockAve29 = new Wall(ciudad, 0, 5, Direction.SOUTH);
    Wall blockAve30 = new Wall(ciudad, 0, 4, Direction.SOUTH);
    Wall blockAve31 = new Wall(ciudad, 0, 3, Direction.SOUTH);
    Wall blockAve32 = new Wall(ciudad, 0, 2, Direction.SOUTH);
    Wall blockAve33 = new Wall(ciudad, 1, 2, Direction.WEST);
    Wall blockAve34 = new Wall(ciudad, 2, 2, Direction.WEST);
    Wall blockAve35 = new Wall(ciudad, 2, 1, Direction.SOUTH);
    Wall blockAve36 = new Wall(ciudad, 3, 1, Direction.WEST);
    Wall blockAve37 = new Wall(ciudad, 3, 0, Direction.SOUTH);
    Wall blockAve38 = new Wall(ciudad, 5, 2, Direction.WEST);
    Wall blockAve39 = new Wall(ciudad, 4, 1, Direction.SOUTH);
    Wall blockAve40 = new Wall(ciudad, 4, 2, Direction.WEST);
    Wall blockAve41 = new Wall(ciudad, 3, 2, Direction.SOUTH);
    Wall blockAve42 = new Wall(ciudad, 3, 3, Direction.WEST);
    Wall blockAve43 = new Wall(ciudad, 2, 3, Direction.WEST);
    Wall blockAve44 = new Wall(ciudad, 1, 3, Direction.SOUTH);
    Wall blockAve45 = new Wall(ciudad, 1, 4, Direction.SOUTH);
    Wall blockAve46 = new Wall(ciudad, 2, 5, Direction.WEST);
    Wall blockAve47 = new Wall(ciudad, 2, 5, Direction.SOUTH);
    Wall blockAve48 = new Wall(ciudad, 3, 6, Direction.WEST);
    Wall blockAve49 = new Wall(ciudad, 3, 6, Direction.SOUTH);
    for (int i = 0; i < 50; i++) {
        if(robot.frontIsClear()){
            robot.move();
          if (robot.canPickThing())
            robot.pickThing();
         }else {
            if (robot.canPickThing())
            robot.pickThing();
          robot.turnLeft();
          robot.turnLeft();
          robot.turnLeft();
          if (robot.frontIsClear()){
            robot.move();  
          }else{
              robot.turnLeft();
              robot.turnLeft();
              robot.move();
          }
        }  
    }
    
    
    
    
    
    
    
   }
}
