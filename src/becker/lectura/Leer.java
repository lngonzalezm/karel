/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker.lectura;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import java.util.Scanner;

/**
 *
 * @author Sergio y Camilo
 */
public class Leer {
   
   private final City city2;
   private final Robot robot;
   public int puntos;
   Scanner teclado = new Scanner (System.in);   
   
    public Leer() {
        
        this.city2= new City();
        this.robot= new Robot(city2, 0, 1, Direction.SOUTH,40);
    }

  

         public void VoltearALaDerecha()
         {
             for(int j=0;j<3;j++)
             {
                 this.robot.turnLeft();
             }
         }
         
         public void ColocarPuntos()
         {
             for(int j=0;j<puntos;j++)
             {
                 this.robot.putThing();
                 this.robot.move();
             }
         }
         
         public void VoltearALaIzquierda()
         {
             for(int j=0;j<2;j++)
             {
                 this.robot.turnLeft();
             }
         }
         
         public void Devolverse()
         {
             for (int j=0;j<puntos;j++)
             {
                 this.robot.move();
             }
         }

         
         public void GirarHaciaLaFilaDeAbajo(){
                 this.robot.turnLeft();
             
         }
         
    
    public void escribir (){
        
     for(int i=1;i<=4;i++)
     {
         this.robot.move();
         
         robot.turnLeft();
         
         System.out.println("Ingrese el numero de puntos deseados para la fila" + i);
         
         puntos = teclado.nextInt();
     
         ColocarPuntos();
         
         VoltearALaIzquierda();
         
         Devolverse();
         
         GirarHaciaLaFilaDeAbajo();
     }
}
}
   