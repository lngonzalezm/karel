package Futbol;


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura Gonzalez
 */
public class Futbol {
  
    private City city;
    private Robot robot;
    private Thing balon;
   
   
    public Futbol() {
        this.city= new City();
        this.robot= new Robot(city, 5, 8, Direction.WEST);
        this.balon = new Thing (city, 5, 8);
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public Thing getBalon() {
        return balon;
    }

    public void setBalon(Thing balon) {
        this.balon = balon;
    }
    
 
    public void advance(){
        
        this.robot.move();
    } 
    
    public void advanceLeft(){
        this.robot.turnLeft();
    }
        
    public void advanceRight(){
        for (int i = 0; i < 3; i++) {
          this.robot.turnLeft();  
        }
        
    }    
       public void jugar (){
        this.robot.pickThing();
        for (int i = 0; i < 2; i++) {
            this.advance();
            this.advance();
            this.advanceRight();
            this.advance();
            this.advanceLeft();
            this.robot.putThing();
            this.robot.pickThing();
        }
        this.robot.putThing();
        this.robot.pickThing();
        this.advance();
        this.advance();
        this.advanceLeft();
        this.advance();
        this.advanceRight();
        this.advance();
        this.advance();
        this.robot.putThing();
        
    }    
        
        
    }
    
  
    
    

