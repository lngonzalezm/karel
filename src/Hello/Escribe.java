/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hello;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author Laura Gonzalez
 */
public class Escribe {

    static void escribe() {
        
    }
   private final City city2;
    private final Robot robot;
    private final Robot robot2;
    private final Robot robot3;
    private final Robot robot4;
    private final Robot robot5;
    
   
    public Escribe() {
        this.city2= new City();
        this.robot= new Robot(city2, 5, 1, Direction.NORTH,11);
        this.robot2= new Robot(city2, 5, 5, Direction.NORTH,11);
        this.robot3= new Robot(city2, 5, 9, Direction.NORTH,7);
        this.robot4= new Robot(city2, 5, 13, Direction.NORTH,7);
        this.robot5= new Robot(city2, 5, 17, Direction.NORTH,12);    
    } 
    
    public void escribir (){
        for (int i = 0; i < 5; i++) {
        
        this.robot.move();
        this.robot.putThing();
        this.robot2.move();
        this.robot2.putThing();
        this.robot3.move();
        this.robot3.putThing();
        this.robot4.move();
        this.robot4.putThing();
        this.robot5.move();
        this.robot5.putThing();   
        }
        
        for (int i = 0; i < 2; i++) {
          this.robot.turnLeft();
          this.robot3.turnLeft();
          this.robot4.turnLeft();
        }
       this.robot.move(); 
       this.robot.move();
       for (int i = 0; i < 4; i++) {
            this.robot3.move();
          this.robot4.move();
       }
     this.robot.turnLeft();  
     this.robot.move();
     this.robot.putThing();
     this.robot.move();
     this.robot.putThing();
     this.robot.turnLeft();
     this.robot.move();
     this.robot.putThing();
     this.robot.move();
     this.robot.putThing();
     for (int i = 0; i < 2; i++) {
          this.robot.turnLeft();
     }
    for (int i = 0; i < 3; i++) {
         this.robot.move(); 
    }
    this.robot.putThing();
    this.robot.move();
    this.robot.putThing();
    this.advanceRight2();
    this.advanceRight5();
    for (int i = 0; i < 2; i++) {
         this.robot2.move();
         this.robot2.putThing();
         this.robot5.move();
         this.robot5.putThing(); 
    }
    this.advanceRight2();
    
    this.robot2.move();
    this.robot2.move();
    this.advanceRight2();
    this.robot2.putThing(); 
    this.robot2.move();
    this.robot2.putThing(); 
    this.robot2.turnLeft();
    this.robot2.move();
    this.robot2.move();
    this.robot2.putThing();
    this.robot2.turnLeft();
    this.robot2.move();
    this.robot2.putThing();
    this.robot3.turnLeft();
    this.robot4.turnLeft();
        for (int i = 0; i < 2; i++) {
           this.robot3.move();
           this.robot3.putThing();
           this.robot4.move();
           this.robot4.putThing(); 
        }
    this.advanceRight5();
        for (int i = 0; i < 4; i++) {
         this.robot5.move();
         this.robot5.putThing();  
        }
    this.advanceRight5();
    this.robot5.move();
    this.robot5.putThing();
    

}
    public void advanceRight2(){
        for (int i = 0; i < 3; i++) {
          this.robot2.turnLeft();  
        }
    }
    public void advanceRight5(){
        for (int i = 0; i < 3; i++) {
          this.robot5.turnLeft();  
        }
    }
}