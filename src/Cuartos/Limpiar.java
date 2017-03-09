/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuartos;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Laura Gonzalez
 */
public class Limpiar {
    public static void main(String[] args){
    City ciudad = new City();
    Wall blockAve0 = new Wall(ciudad, 1, 5, Direction.EAST);
    Wall blockAve1 = new Wall(ciudad, 2, 5, Direction.EAST);
    Wall blockAve2 = new Wall(ciudad, 3, 5, Direction.EAST);
    Wall blockAve3 = new Wall(ciudad, 4, 5, Direction.EAST);
    Wall blockAve4 = new Wall(ciudad, 6, 5, Direction.EAST);
    Wall blockAve5 = new Wall(ciudad, 7, 5, Direction.EAST);
    Wall blockAve6 = new Wall(ciudad, 9, 5, Direction.EAST);
    Wall blockAve7 = new Wall(ciudad, 1, 7, Direction.WEST);
    Wall blockAve8 = new Wall(ciudad, 2, 7, Direction.WEST);
    Wall blockAve9 = new Wall(ciudad, 3, 7, Direction.WEST);
    Wall blockAve10 = new Wall(ciudad, 4, 7, Direction.WEST);
    Wall blockAve11 = new Wall(ciudad, 6, 7, Direction.WEST);
    Wall blockAve12 = new Wall(ciudad, 7, 7, Direction.WEST);
    Wall blockAve13 = new Wall(ciudad, 8, 7, Direction.WEST);
    Wall blockAve14 = new Wall(ciudad, 9, 7, Direction.WEST);
    Wall blockAve15 = new Wall(ciudad, 4, 2, Direction.SOUTH);
    Wall blockAve16 = new Wall(ciudad, 4, 3, Direction.SOUTH);
    Wall blockAve17 = new Wall(ciudad, 4, 4, Direction.SOUTH);
    Wall blockAve18 = new Wall(ciudad, 4, 5, Direction.SOUTH);
    Wall blockAve19 = new Wall(ciudad, 4, 7, Direction.SOUTH);
    Wall blockAve20 = new Wall(ciudad, 4, 8, Direction.SOUTH);
    Wall blockAve21 = new Wall(ciudad, 4, 9, Direction.SOUTH);
    Wall blockAve22 = new Wall(ciudad, 4, 10, Direction.SOUTH);
    Wall blockAve23 = new Wall(ciudad, 6, 2, Direction.NORTH);
    Wall blockAve28 = new Wall(ciudad, 6, 3, Direction.NORTH);
    Wall blockAve24 = new Wall(ciudad, 6, 4, Direction.NORTH);
    Wall blockAve25 = new Wall(ciudad, 6, 5, Direction.NORTH);
    Wall blockAve26 = new Wall(ciudad, 6, 7, Direction.NORTH);
    Wall blockAve27 = new Wall(ciudad, 6, 8, Direction.NORTH);
    Wall blockAve29 = new Wall(ciudad, 6, 9, Direction.NORTH);
    Wall blockAve30 = new Wall(ciudad, 6, 10, Direction.NORTH);
    Wall blockAve31 = new Wall(ciudad, 8, 5, Direction.WEST);
    Wall blockAve32 = new Wall(ciudad, 8, 5, Direction.NORTH);
    Wall blockAve33 = new Wall(ciudad, 8, 5, Direction.SOUTH);
    Robot robot= new Robot(ciudad,9,6,Direction.NORTH);
    Thing barril=new Thing (ciudad,1,2);
    Thing barril2=new Thing (ciudad,1,3);
    Thing barril3=new Thing (ciudad,1,4);
    Thing barril4=new Thing (ciudad,1,5);
    Thing barril5=new Thing (ciudad,1,7);
    Thing barril6=new Thing (ciudad,1,8);
    Thing barril7=new Thing (ciudad,1,9);
    Thing barril8=new Thing (ciudad,1,10);
    Thing barril9=new Thing (ciudad,2,2);
    Thing barril10=new Thing (ciudad,2,3);
    Thing barril11=new Thing (ciudad,2,4);
    Thing barril12=new Thing (ciudad,2,5);
    Thing barril13=new Thing (ciudad,2,7);
    Thing barril14=new Thing (ciudad,2,8);
    Thing barril15=new Thing (ciudad,2,9);
    Thing barril16=new Thing (ciudad,2,10);
    Thing barril17=new Thing (ciudad,3,2);
    Thing barril18=new Thing (ciudad,3,3);
    Thing barril19=new Thing (ciudad,3,4);
    Thing barril20=new Thing (ciudad,3,5);
    Thing barril21=new Thing (ciudad,3,7);
    Thing barril22=new Thing (ciudad,3,8);
    Thing barril23=new Thing (ciudad,3,9);
    Thing barril24=new Thing (ciudad,3,10);
    Thing barril25=new Thing (ciudad,4,2);
    Thing barril26=new Thing (ciudad,4,3);
    Thing barril27=new Thing (ciudad,4,4);
    Thing barril28=new Thing (ciudad,4,5);
    Thing barril29=new Thing (ciudad,4,7);
    Thing barril30=new Thing (ciudad,4,8);
    Thing barril31=new Thing (ciudad,4,9);
    Thing barril32=new Thing (ciudad,4,10);
    Thing barril33=new Thing (ciudad,6,2);
    Thing barril34=new Thing (ciudad,6,3);
    Thing barril35=new Thing (ciudad,6,4);
    Thing barril36=new Thing (ciudad,6,5);
    Thing barril37=new Thing (ciudad,6,7);
    Thing barril38=new Thing (ciudad,6,8);
    Thing barril39=new Thing (ciudad,6,9);
    Thing barril40=new Thing (ciudad,6,10);
    Thing barril41=new Thing (ciudad,7,2);
    Thing barril42=new Thing (ciudad,7,3);
    Thing barril43=new Thing (ciudad,7,4);
    Thing barril44=new Thing (ciudad,7,5);
    Thing barril45=new Thing (ciudad,7,7);
    Thing barril46=new Thing (ciudad,7,8);
    Thing barril47=new Thing (ciudad,7,9);
    Thing barril48=new Thing (ciudad,7,10);
    Thing barril49=new Thing (ciudad,8,2);
    Thing barril50=new Thing (ciudad,8,3);
    Thing barril51=new Thing (ciudad,8,4);
    Thing barril53=new Thing (ciudad,8,7);
    Thing barril54=new Thing (ciudad,8,8);
    Thing barril56=new Thing (ciudad,8,10);
    Thing barril57=new Thing (ciudad,9,2);
    Thing barril58=new Thing (ciudad,9,3);
    Thing barril59=new Thing (ciudad,9,4);
    Thing barril60=new Thing (ciudad,9,5);
    Thing barril61=new Thing (ciudad,9,7);
    Thing barril62=new Thing (ciudad,9,8);
    
    //robot limpia los cuartos 
        for (int i = 0; i < 9; i++) {
         robot.move();    
        }
        for (int j = 0; j < 2; j++) {
            
        robot.turnLeft();
        robot.move();
        robot.turnLeft();
        for (int i = 0; i < 4; i++) {
         robot.move();
         robot.pickThing();
        }
        for (int i = 0; i < 3; i++) {
         robot.turnLeft();
        }
        robot.move();
        for (int i = 0; i < 3; i++) {
         robot.turnLeft();
        }
        for (int i = 0; i < 4; i++) {
         robot.pickThing();
         robot.move();
        }
        }
        robot.turnLeft();
        robot.move();
        robot.turnLeft();
        for (int i = 0; i < 6; i++) {
         robot.move();
        }
        robot.turnLeft();
        for (int i = 0; i < 4; i++) {
         robot.move();
         robot.pickThing();
        }
        for (int i = 0; i < 3; i++) {
         robot.turnLeft();
        }
        robot.move();
        for (int i = 0; i < 3; i++) {
         robot.turnLeft();
        }
        for (int i = 0; i < 3; i++) {
         robot.pickThing();
         robot.move();
        }
        robot.pickThing();
        robot.turnLeft();
        for (int i = 0; i < 2; i++) {
         robot.move();
         robot.pickThing();
        }
        robot.turnLeft();
        robot.move();
        robot.turnLeft();
        robot.pickThing();
        robot.move();
        robot.pickThing();
        for (int i = 0; i < 3; i++) {
         robot.turnLeft();
        }
        robot.move();
        for (int i = 0; i < 3; i++) {
         robot.turnLeft();
        }
        robot.pickThing();
        robot.move();
        robot.pickThing();
        robot.turnLeft();
        robot.move();
        robot.pickThing();
        for (int i = 0; i < 3; i++) {
         robot.turnLeft();
        }
        robot.move();
        robot.turnLeft();
        robot.move();
        robot.move();
        robot.turnLeft();
        for (int i = 0; i < 4; i++) {
         robot.move();
         robot.pickThing();
        }
        for (int i = 0; i < 3; i++) {
         robot.turnLeft();
        }
        robot.move();
        for (int i = 0; i < 3; i++) {
         robot.turnLeft();
        }
        for (int i = 0; i < 3; i++) {
         robot.pickThing();
         robot.move();
        }
        robot.pickThing();
        for (int i = 0; i < 2; i++) {
         robot.turnLeft();
        robot.move();
        }
        for (int i = 0; i < 2; i++) {
         robot.move();
         robot.pickThing();
        }
        for (int i = 0; i < 3; i++) {
         robot.turnLeft();
        }
         robot.move();
        for (int i = 0; i < 3; i++) {
         robot.turnLeft();
        }
        for (int i = 0; i < 3; i++) {
         robot.pickThing();
         robot.move();
        }
        robot.turnLeft();
        robot.move();
        robot.turnLeft();
        for (int i = 0; i < 5; i++) {
         robot.move();
        }
        robot.turnLeft();
        for (int i = 0; i < 4; i++) {
         robot.move();
         robot.pickThing();
        }
        for (int i = 0; i < 3; i++) {
         robot.turnLeft();
        }
        robot.move();
        for (int i = 0; i < 3; i++) {
         robot.turnLeft();
        }
        for (int i = 0; i < 3; i++) {
         robot.pickThing();
         robot.move();
        }
        robot.pickThing();
        robot.turnLeft();
        robot.move();
        robot.turnLeft();
        for (int i = 0; i < 3; i++) {
         robot.pickThing();
         robot.move();
        }
        robot.pickThing();
        for (int i = 0; i < 3; i++) {
         robot.turnLeft();
        }
        robot.move();
        for (int i = 0; i < 3; i++) {
         robot.turnLeft();
        }
        for (int i = 0; i < 4; i++) {
         robot.pickThing();
         robot.move();
        }
        
    }     
}

