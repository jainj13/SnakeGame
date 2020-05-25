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
    
    private void setup(){
    
    
    
    } 
    public Game_set (Snake player1, Snake player2){
        snakes[0] = player1;
        snakes[1] = player2;
        
    }
    
    
    
}
