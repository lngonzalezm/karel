/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenar;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author Laura Gonzalez
 */
public class Pila {
    private final  City ciudad2;
    private final  Robot robot;
    private final Thing cosa;
    private final Thing cosa2;
    private final Thing cosa3;
    private final Thing cosa4;
    private final Thing cosa5;
    private final Thing cosa6;
    private final Thing cosa7;
    private final Thing cosa8;
    private final Thing cosa9;
    private final Thing cosa10;
    private final Thing cosa11;
    private final Thing cosa12;
    private final Thing cosa13;
    private final Thing cosa14;
    private final Thing cosa15;
    private final Thing cosa16;
    private final Thing cosa17;
    private final Thing cosa18;
    private final Thing cosa19;
    private final Thing cosa20;
    private final Thing cosa21;
    private final Thing cosa22;
    private final Thing cosa23;
    private final Thing cosa24;
    private final Thing cosa25;
    private final Thing cosa26;
    private final Thing cosa27;
    private final Thing cosa28;
    private final Thing cosa29;
    private final Thing cosa30;
    private final Thing cosa31;
    private final Thing cosa32;
    private final Thing cosa33;
    private final Thing cosa34;
    private final Thing cosa35;
    private final Thing cosa36;
    private final Thing cosa37;
    private final Thing cosa38;
    private final Thing cosa39;
    private final Thing cosa40;
    private final Thing cosa41;
    private final Thing cosa42;
    private final Thing cosa43; 
    
public Pila(){
    this.ciudad2= new City();
    this.robot= new Robot(ciudad2, 6, 1, Direction.NORTH);
    this.cosa=new Thing (ciudad2,0,1);
    this.cosa2=new Thing (ciudad2,1,1);
    this.cosa3=new Thing (ciudad2,2,1);
    this.cosa4=new Thing (ciudad2,3,1);
    this.cosa5=new Thing (ciudad2,4,1);
    this.cosa6=new Thing (ciudad2,5,1);
    this.cosa7=new Thing (ciudad2,6,1);
    this.cosa8=new Thing (ciudad2,0,2);
    this.cosa9=new Thing (ciudad2,1,2);
    this.cosa10=new Thing (ciudad2,2,2);
    this.cosa11=new Thing (ciudad2,3,2);
    this.cosa12=new Thing (ciudad2,4,2);
    this.cosa13=new Thing (ciudad2,5,2);
    this.cosa14=new Thing (ciudad2,6,2);
    this.cosa15=new Thing (ciudad2,0,3);
    this.cosa16=new Thing (ciudad2,1,3);
    this.cosa17=new Thing (ciudad2,2,3);
    this.cosa18=new Thing (ciudad2,3,3);
    this.cosa19=new Thing (ciudad2,4,3);
    this.cosa20=new Thing (ciudad2,5,3);
    this.cosa21=new Thing (ciudad2,6,3);
    this.cosa22=new Thing (ciudad2,1,4);
    this.cosa23=new Thing (ciudad2,2,4);
    this.cosa24=new Thing (ciudad2,3,4);
    this.cosa25=new Thing (ciudad2,4,4);
    this.cosa26=new Thing (ciudad2,5,4);
    this.cosa27=new Thing (ciudad2,6,4);
    this.cosa28=new Thing (ciudad2,2,5);
    this.cosa29=new Thing (ciudad2,3,5);
    this.cosa30=new Thing (ciudad2,4,5);
    this.cosa31=new Thing (ciudad2,5,5);
    this.cosa32=new Thing (ciudad2,6,5);
    this.cosa33=new Thing (ciudad2,3,6);
    this.cosa34=new Thing (ciudad2,4,6);
    this.cosa35=new Thing (ciudad2,5,6);
    this.cosa36=new Thing (ciudad2,6,6);
    this.cosa37=new Thing (ciudad2,4,7);
    this.cosa38=new Thing (ciudad2,5,7);
    this.cosa39=new Thing (ciudad2,6,7);
    this.cosa40=new Thing (ciudad2,5,8);
    this.cosa41=new Thing (ciudad2,6,8);
    this.cosa42=new Thing (ciudad2,6,8);
    this.cosa43=new Thing (ciudad2,6,9);
}    

    public void ordenar (){
        for (int i = 0; i < 6; i++) {
            robot.move();
            robot.pickThing();   
        }
        this.advanceRight();
        robot.move();
        this.advanceRight();
        for (int i = 0; i < 4; i++) {
            robot.pickThing();
            robot.move();   
        }
        robot.pickThing();
        robot.turnLeft();
        robot.move();
        robot.turnLeft();
        for (int i = 0; i < 4; i++) {
           robot.move();
           robot.pickThing(); 
        }
        this.advanceRight();
        robot.move();
        this.advanceRight();
        for (int i = 0; i < 2; i++) {   
        robot.move();
        robot.pickThing();
        }
        robot.turnLeft();
        robot.move();
        robot.move();
        robot.putThing();
        robot.turnLeft();
        robot.move();
        robot.putThing();
        robot.move();
        this.advanceRight();
        robot.move();
        this.advanceRight();
        for (int i = 0; i < 4; i++) {
            robot.putThing();
            robot.move();    
        }
        robot.turnLeft();
        robot.move();
        robot.turnLeft();
        for (int i = 0; i < 4; i++) {
            robot.putThing();
            robot.move();    
        }
        robot.putThing();
        this.advanceRight();
        robot.move();
        this.advanceRight();
        for (int i = 0; i < 6; i++) {
            robot.putThing();
            robot.move();    
        }
        
        
    }

    public void advanceRight(){
        for (int i = 0; i < 3; i++) {
          this.robot.turnLeft();  
        }
    }
    
    
    
    
    
    
    
    
}
