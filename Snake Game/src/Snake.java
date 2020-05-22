/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin
 */

//used for keyboard input
import java.awt.event.KeyEvent;

public class Snake{
    
//coordinate positions
    int[] Xpos;
    int[] Ypos;
    
   
    int length = 2;
   
    //used to determine direction of movement
    boolean up = false;
    boolean down = false;
    boolean left = false;
    boolean right = false;

    //variables to store data of movement keys
    int rightdir;
  
    //basic set up for snake object 
    
public Snake (int right, int left, int up, int down){
       rightdir = right
    }

public void movement(KeyEvent ev){

int dir = ev.getKeyCode();
        

//simple set up for each direction

        if (dir == rightdir){
            right = true;
            left = false;
            up = false;
            down = false;
            
        }
        
        }

}
