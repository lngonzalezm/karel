/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mover;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Laura Gonzalez
 */
public class Cuarto {
   public static void main(String[] args){
    City ciudad = new City();
    //Construcción del cuarto1
    Robot robot= new Robot(ciudad,10,1,Direction.NORTH);
    Wall blockAve0 = new Wall(ciudad, 5, 1, Direction.WEST);
    Wall blockAve1 = new Wall(ciudad, 6, 1, Direction.WEST);
    Wall blockAve2 = new Wall(ciudad, 7, 1, Direction.WEST);
    Wall blockAve3 = new Wall(ciudad, 8, 1, Direction.WEST);
    Wall blockAve4 = new Wall(ciudad, 9, 1, Direction.WEST);
    Wall blockAve5 = new Wall(ciudad, 5, 5, Direction.EAST);
    Wall blockAve6 = new Wall(ciudad, 6, 5, Direction.EAST);
    Wall blockAve7 = new Wall(ciudad, 7, 5, Direction.EAST);
    Wall blockAve8 = new Wall(ciudad, 8, 5, Direction.EAST);
    Wall blockAve9 = new Wall(ciudad, 9, 5, Direction.EAST);
    Wall blockAve15 = new Wall(ciudad, 5, 1, Direction.NORTH);
    Wall blockAve16 = new Wall(ciudad, 5, 2, Direction.NORTH);
    Wall blockAve17 = new Wall(ciudad, 5, 3, Direction.NORTH);
    Wall blockAve18 = new Wall(ciudad, 5, 4, Direction.NORTH);
    Wall blockAve19 = new Wall(ciudad, 5, 5, Direction.NORTH);
    Wall blockAve28 = new Wall(ciudad, 9, 2, Direction.SOUTH);
    Wall blockAve24 = new Wall(ciudad, 9, 3, Direction.SOUTH);
    Wall blockAve25 = new Wall(ciudad, 9, 4, Direction.SOUTH);
    Wall blockAve26 = new Wall(ciudad, 9, 5, Direction.SOUTH);
    //Construcción del cuarto 2
    Wall blockAve20 = new Wall(ciudad, 2, 7, Direction.WEST);
    Wall blockAve21 = new Wall(ciudad, 3, 7, Direction.WEST);
    Wall blockAve22 = new Wall(ciudad, 4, 7, Direction.WEST);
    Wall blockAve23 = new Wall(ciudad, 5, 7, Direction.WEST);
    Wall blockAve10 = new Wall(ciudad, 6, 7, Direction.WEST);
    Wall blockAve11 = new Wall(ciudad, 2, 11, Direction.EAST);
    Wall blockAve12 = new Wall(ciudad, 3, 11, Direction.EAST);
    Wall blockAve13 = new Wall(ciudad, 4, 11, Direction.EAST);
    Wall blockAve14 = new Wall(ciudad, 5, 11, Direction.EAST);
    Wall blockAve27 = new Wall(ciudad, 6, 11, Direction.EAST); 
    Wall blockAve29 = new Wall(ciudad, 2, 7, Direction.NORTH);
    Wall blockAve30 = new Wall(ciudad, 2, 8, Direction.NORTH);
    Wall blockAve31 = new Wall(ciudad, 2, 9, Direction.NORTH);
    Wall blockAve32 = new Wall(ciudad, 2, 10, Direction.NORTH);
    Wall blockAve33 = new Wall(ciudad, 2, 11, Direction.NORTH);
    Wall blockAve34 = new Wall(ciudad, 6, 8, Direction.SOUTH);
    Wall blockAve35 = new Wall(ciudad, 6, 9, Direction.SOUTH);
    Wall blockAve36 = new Wall(ciudad, 6, 10, Direction.SOUTH);
    Wall blockAve37 = new Wall(ciudad, 6, 11, Direction.SOUTH);
    //Creación de los ladrillos
    Thing ladrillo=new Thing (ciudad,8,1);
    Thing ladrillo2=new Thing (ciudad,6,1);
    Thing ladrillo3=new Thing (ciudad,5,2);
    Thing ladrillo4=new Thing (ciudad,9,2);
    Thing ladrillo5=new Thing (ciudad,5,4);
    Thing ladrillo6=new Thing (ciudad,9,4);
    Thing ladrillo7=new Thing (ciudad,6,5);
    Thing ladrillo8=new Thing (ciudad,8,5);
    
    //Robot recoge y deja los ladrillos 
        
    for (int i = 0; i < 5; i++) {
           
         if(robot.canPickThing())  
             robot.pickThing();
         robot.move();
       }
    for (int j = 0; j < 3; j++) {
             robot.turnLeft();
           }
    for(int i=0;i<2;i++){
      for (int k = 0; k < 4; k++) {
           
         if(robot.canPickThing())  
             robot.pickThing();
         robot.move();
       }
       for (int j = 0; j < 3; j++) {
             robot.turnLeft();
           }  
    }
    for (int i = 0; i < 4; i++) {
           
         if(robot.canPickThing())  
             robot.pickThing();
         robot.move();
       }
    robot.turnLeft();
    robot.move();
    robot.turnLeft();
       for (int i = 0; i < 6; i++) {
         robot.move();   
       }
    robot.turnLeft();
    for (int i = 0; i < 8; i++) {
      robot.move();  
        if((i==4 || i==6)){
            robot.putThing();  
        } 
       }
for (int k = 0; k< 3; k++) {
           

    for (int j = 0; j < 3; j++) {
             robot.turnLeft();
           }
    for (int i = 0; i < 4; i++) {
      robot.move();  
        if((i==0 || i==2)){
            robot.putThing();  
        }
    }
           }
    
}
}
