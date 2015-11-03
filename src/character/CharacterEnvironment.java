/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author BBC132
 */
class CharacterEnvironment extends Environment {
    
    Cartman cartman;
    private Cartman cmBig, cmSmall;
    
    public CharacterEnvironment() {
        cmBig = new Cartman(10, 10, 400, 400);
        cmSmall = new Cartman(500, 10, 200, 200);
        
        
    }

    @Override
    public void initializeEnvironment() {
//        cartmanImage = ResourceTools.loadImageFromResource("Character/Cartman2.jpg");
    }
    Image cartmanImage;

    @Override
    public void timerTaskHandler() {

    }

    @Override
    public void keyPressedHandler(KeyEvent e) {

    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
        
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
//        if (cmSmall != null){
//            cmSmall.setX(e.getX());
//            cmSmall.setY(e.getY());
//    }
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        
        if (cmSmall != null){
            cmSmall.draw(graphics);
            
        }
        if (cmBig != null){
            cmBig.draw(graphics);
            
        }
//        graphics.drawImage(cartmanImage, 0, 0, this);
//        graphics.drawImage(cartmanImage, 100, 600, this);
//
//     faceshape;
//        graphics.setColor(new Color(255,218,185));
//        graphics.fillOval(360, 140, 250, 180);
//     eyes
//        graphics.setColor(Color.white);
//        graphics.fillOval(440, 180, 60, 80);
//        graphics.fillOval(500, 180, 60, 80);
//        graphics.setColor(Color.black);
//        graphics.fillOval(485, 208, 7, 7);
//        graphics.fillOval(533, 212, 7, 7);
          if (cmBig != null){
            cmBig.draw(graphics);
            
        }


    }

}
