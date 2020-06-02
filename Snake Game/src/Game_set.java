/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin
 */
//imports
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.Timer;




public class Game_set extends JPanel implements ActionListener{

    //coin and powerup positions
    private int coinx;
    private int coiny;
    private int powerx;
    private int powery;
    
    //using images in jframe to have custom sprites
    private Image coin;
    private Image powerup;
    private Image Snake1;
    private Image Snake2;
    private Image body1;
    private Image body2;
    
    //array holds two snake obj
    Snake[] snakes = new Snake[2];
    
     private void set_Images(){

         //Creating image icon and assinging each one to previously set variable
        ImageIcon c = new ImageIcon("src/Char_image/coin.png");
        coin = c.getImage();
        
        ImageIcon p = new ImageIcon("src/Char_image/Powerup.png");
        powerup = p.getImage();
        
        ImageIcon sb1 = new ImageIcon("src/Char_image/Snake1.png");
        Snake1 = sb1.getImage();
        
        ImageIcon sb2 = new ImageIcon("src/Char_image/Snake2.png");
        Snake2 = sb2.getImage();
        
        ImageIcon b1 = new ImageIcon("src/Char_image/Body1.png");
        body1 = b1.getImage();
        
        ImageIcon b2 = new ImageIcon("src/Char_image/Body2.png");
        body2 = b2.getImage();
        
     }
    public Game_set (Snake player1, Snake player2){
        snakes[0] = player1;
        snakes[1] = player2;
        
    }
    
    private void Init_board (){
    }
        
    // variable to check for condition
    private final int delay  = 50;
    
    // variable to turn on and off
    private boolean ingame = true;
    
    private Timer timer;
   
 //game set up method   
        private void initGame(){
        
            //place snake but avoid being out of bounce
            for (int z = 0; z < snakes[0].length; z++){
                snakes[0].Xpos[z] = 50 - z *10;
                snakes[0].Ypos[z] = 50;
            }
            
            for (int z = 0; z < snakes[1].length; z++){
                snakes[1].Xpos[z] = 400 - z *10;
                snakes[1].Ypos[z] = 50;
            }

        
        //coin drop STILL HAVE TO MAKE THE METHOD FOR IT
        
        ingame = true;
        
        timer = new Timer(delay, this);
        timer.start();
        //Start the game and timer
    }
    
    }
    

