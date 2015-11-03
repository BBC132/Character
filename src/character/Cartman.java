/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author BBC132
 */
public class Cartman {

    public void draw(Graphics graphics) {
        graphics.setColor(Color.red);
        graphics.drawRect(x, y, width, height);
//        cloak
        graphics.setColor(new Color(70,130,180));       
        graphics.fillArc(x + (width * 1 / 2), y + (height * 3 / 9), width * 7 / 14, height * 50 / 100, 175, 180);
        graphics.fillRect(x + (width * 1 / 2), y + (height * 56 / 90), width * 7 / 14, height * 30 / 100);
        graphics.setColor(new Color (0,0,128));
        graphics.fillArc(x + (width * 85 / 100), y + (height * 56 / 90), width * 2 / 14, height * 3 / 100, 175, 180);
        graphics.fillArc(x + (width * 93 / 100), y + (height * 60 / 90), width * 1 / 14, height * 3 / 100, 175, 180);
        graphics.fillArc(x + (width * 85 / 100), y + (height * 64 / 90), width * 1 / 14, height * 3 / 100, 175, 180);
        graphics.fillArc(x + (width * 83 / 100), y + (height * 68 / 90), width * 2 / 14, height * 3 / 100, 175, 180);
        graphics.fillArc(x + (width * 86 / 100), y + (height * 72 / 90), width * 2 / 14, height * 3 / 100, 175, 180);
        graphics.fillArc(x + (width * 93 / 100), y + (height * 76 / 90), width * 1 / 14, height * 3 / 100, 175, 180);
        
//        Right sleave
        graphics.setColor(new Color(178,34,34));
        graphics.fillRect(x + (width * 28 / 120), y + (height * 5 / 9), width * 2 / 14, height * 25 / 100);
        graphics.setColor(new Color(220, 20, 60));
        graphics.fillArc(x + (width * 25 / 120), y + (height * 18 / 36), width * 5 / 14, height * 30 / 100, 175, 120);
        graphics.fillArc(x + (width * 23 / 120), y + (height * 15 / 36), width * 5 / 14, height * 30 / 100, 175, 120);        
        graphics.setColor(new Color(178,34,34));

        //body
        graphics.setColor(new Color(220, 20, 60));
        graphics.fillArc(x + (width * 3 / 15), y + (height * 5 / 9), width * 10 / 14, height * 60 / 100, 175, -175);

        //faceshape
        graphics.setColor(new Color(255, 218, 185));
        graphics.fillOval(x + (width * 3 / 11), y + (height * 4 / 12), width * 6 / 10, height * 3 / 7);
//      hat
        graphics.setColor(new Color(70,130,180));
        graphics.fillArc(x + (width * 20 / 120), y + (height * 300 / 720), width * 20 / 140, height * 5 / 100, 100, 150);        
        graphics.fillArc(x + (width * 25 / 120), y + (height * 285 / 720), width * 100 / 140, height * 5 / 100, 100, 180);        
        graphics.fillArc(x + (width * 25 / 120), y + (height * 285 / 720), width * 100 / 140, height * 5 / 100, -100, 180);        
        graphics.fillArc(x + (width * 35 / 120), y + (height * 100 / 720), width * 45 / 140, height * 50 / 100, 100, 90);        
        graphics.fillArc(x + (width * 35 / 120), y + (height * 100 / 720), width * 45 / 140, height * 50 / 100, 100, -90);        
        graphics.fillArc(x + (width * 30 / 120), y + (height * 115 / 720), width * 85 / 140, height * 50 / 100, 100, -100);        
        graphics.fillArc(x + (width * 50 / 120), y + (height * 35 / 720), width * 40 / 140, height * 40 / 100, 100, -100);        
        graphics.fillArc(x + (width * 45 / 120), y + (height * 35 / 720), width * 60 / 140, height * 40 / 100, 100, 100);        
        graphics.fillOval(x + (width * 55 / 120), y + (height * 0 / 720), width * 25 / 140, height * 20 / 100);       
        graphics.fillArc(x + (width * 50 / 120), y + (height * 0 / 720), width * 25 / 140, height * 10 / 100, 70, 200);        
        graphics.fillArc(x + (width * 90 / 120), y + (height * 290 / 720), width * 24 / 140, height * 5 / 100, -150, 250);        
        graphics.fillRect(x + (width * 50 / 120), y + (height * 160 / 720), width * 30 / 140, height * 20 / 100);
        
        graphics.setColor(new Color(0,0,128));
        graphics.fillArc(x + (width * 20 / 120), y + (height * 300 / 720), width * 20 / 140, height * 5 / 100, 100, 150);        
        graphics.fillArc(x + (width * 54 / 120), y + (height * 1 / 720), width * 25 / 140, height * 10 / 100, 0, -20);        
        graphics.fillArc(x + (width * 64 / 120), y + (height * 100 / 720), width * 25 / 140, height * 10 / 100, 0, -10);        
        graphics.fillArc(x + (width * 75 / 120), y + (height * 100 / 720), width * 15 / 140, height * 10 / 100, -200, 10);        
        graphics.fillArc(x + (width * 91 / 120), y + (height * 255 / 720), width * 35 / 140, height * 10 / 100, -200, 10);        
        graphics.fillArc(x + (width * 45 / 120), y + (height * 10 / 720), width * 20 / 140, height * 20 / 100, 200, 10);        
        graphics.fillArc(x + (width * 44 / 120), y + (height * 20 / 720), width * 20 / 140, height * 20 / 100, 200, 10);        
        graphics.fillArc(x + (width * 43 / 120), y + (height * 30 / 720), width * 20 / 140, height * 20 / 100, 200, 10);        
        graphics.fillArc(x + (width * 42 / 120), y + (height * 40 / 720), width * 20 / 140, height * 20 / 100, 200, 10);        
        graphics.fillArc(x + (width * 41 / 120), y + (height * 50 / 720), width * 20 / 140, height * 20 / 100, 200, 10);        
        graphics.fillArc(x + (width * 40 / 120), y + (height * 60 / 720), width * 20 / 140, height * 20 / 100, 200, 10);        
        graphics.fillArc(x + (width * 39 / 120), y + (height * 70 / 720), width * 20 / 140, height * 20 / 100, 200, 10);        
        graphics.fillArc(x + (width * 38 / 120), y + (height * 80 / 720), width * 20 / 140, height * 20 / 100, 200, 10);        
        graphics.fillArc(x + (width * 37 / 120), y + (height * 90 / 720), width * 20 / 140, height * 20 / 100, 200, 10);        
        graphics.fillArc(x + (width * 34 / 120), y + (height * 145 / 720), width * 10 / 140, height * 15 / 100, 20, -130);        
        graphics.fillArc(x + (width * 54 / 120), y + (height * 15 / 720), width * 20 / 140, height * 10 / 100, 200, 10);        
        graphics.fillArc(x + (width * 37 / 120), y + (height * 90 / 720), width * 20 / 140, height * 20 / 100, 200, 10);        
        graphics.setColor(new Color(255,255,0));
//        star shape
        int[] xPoints = new int[10];
              xPoints[0] = x + (width * 90/160);
              xPoints[1] = x + (width * 100/160);
              xPoints[2] = x + (width * 110/160);
              xPoints[3] = x + (width * 100/160);
              xPoints[4] = x + (width * 110/160);
              xPoints[5] = x + (width * 90/160);
              xPoints[6] = x + (width * 75/160);
              xPoints[7] = x + (width * 80/160);
              xPoints[8] = x + (width * 70/160);
              xPoints[9] = x + (width * 80/160); 
              int[] yPoints = new int[10];
              yPoints[0] = y + (height * 120 / 720);
              yPoints[1] = y + (height * 170 / 720);
              yPoints[2] = y + (height * 190 / 720);
              yPoints[3] = y + (height * 210 / 720);
              yPoints[4] = y + (height * 280 / 720);
              yPoints[5] = y + (height * 220 / 720);
              yPoints[6] = y + (height * 280 / 720);
              yPoints[7] = y + (height * 210 / 720);
              yPoints[8] = y + (height * 190 / 720);
              yPoints[9] = y + (height * 170 / 720);
              
        graphics.fillPolygon(xPoints, yPoints, 10);
//      star details
        graphics.setColor(new Color(139,69,19));
        graphics.fillArc(x + (width * 55 / 120), y + (height * 152 / 720), width * 10 / 140, height * 10 / 100, 200, 10);        
        graphics.fillArc(x + (width * 55 / 120), y + (height * 150 / 720), width * 10 / 140, height * 10 / 100, -200, 10);        
        graphics.fillArc(x + (width * 57 / 120), y + (height * 140 / 720), width * 10 / 140, height * 10 / 100, -200, 10);        
        graphics.fillArc(x + (width * 61 / 120), y + (height * 105 / 720), width * 12 / 140, height * 10 / 100, 200, 10);        
        graphics.fillArc(x + (width * 71 / 120), y + (height * 105 / 720), width * 10 / 140, height * 10 / 100, 200, 10);        
        graphics.fillArc(x + (width * 74 / 120), y + (height * 128 / 720), width * 10 / 140, height * 10 / 100, 200, 10);        
        graphics.fillArc(x + (width * 77 / 120), y + (height * 170 / 720), width * 10 / 140, height * 10 / 100, -200, 10);        
        graphics.fillArc(x + (width * 75 / 120), y + (height * 200 / 720), width * 10 / 140, height * 10 / 100, -200, 10);        
        graphics.fillArc(x + (width * 757 / 1200), y + (height * 210 / 720), width * 10 / 140, height * 10 / 100, -200, 10);        
        graphics.fillArc(x + (width * 729/ 1200), y + (height * 200 / 720), width * 10 / 140, height * 10 / 100, 200, 10);        
        graphics.fillArc(x + (width * 630/ 1200), y + (height * 210 / 720), width * 10 / 140, height * 10 / 100, -200, 10);        
        graphics.fillArc(x + (width * 570/ 1200), y + (height * 180 / 720), width * 10 / 140, height * 10 / 100, 200, 10);                
        graphics.drawOval(x + (width * 620/ 1200), y + (height * 154 / 720), width * 9 / 100, height * 9 / 100);
        graphics.drawOval(x + (width * 650/ 1200), y + (height * 187 / 720), width * 4 / 100, height * 3 / 100);
        graphics.setColor(new Color(255,255,0));
        graphics.fillOval(x + (width * 645/ 1200), y + (height * 173 / 720), width * 5 / 100, height * 3 / 100);

        graphics.setColor(new Color(139,69,19));
        
        graphics.fillOval(x + (width * 640/ 1200), y + (height * 170 / 720), width * 2 / 100, height * 2 / 100);
        graphics.fillOval(x + (width * 685/ 1200), y + (height * 170 / 720), width * 2 / 100, height * 2 / 100);
        
//        right hand
        graphics.setColor(new Color(255, 218, 185)); 
        graphics.fillArc(x + (width * 24 / 120), y + (height * 36 / 72), width * 17 / 200, height * 24 / 192, -180, -180);
        graphics.setColor(new Color(255, 218, 185)); 
        graphics.fillArc(x + (width * 28 / 120), y + (height * 241 / 432), width * 10 / 200, height * 3 / 192, -180, -180);
        graphics.setColor(new Color(255, 218, 185));
//        graphics.setColor(Color.black);
        graphics.fillOval(x + (width * 24 / 120), y + (height * 173 / 432), width * 25 / 200, height * 30 / 192);
//       staff
        graphics.setColor(new Color(139,69,19));
        graphics.fillArc(x + (width * 33 / 120), y + (height * 310 / 720), width * 5 / 140, height * 50 / 100, 100, 150);        
        graphics.fillArc(x + (width * 32 / 120), y + (height * 280 / 720), width * 10 / 140, height * 50 / 100, 80, 150);        
        graphics.fillArc(x + (width * 29 / 120), y + (height * 100 / 720), width * 7 / 140, height * 50 / 100, -190, 190);        
        graphics.fillArc(x + (width * 29 / 120), y + (height * 100 / 720), width * 8 / 140, height * 50 / 100, -150, -190);        
        graphics.fillArc(x + (width * 29 / 120), y + (height * 100 / 720), width * 8 / 140, height * 50 / 100, -150, 190);
        graphics.fillArc(x + (width * 30 / 120), y + (height * 100 / 720), width * 16 / 200, height * 15 / 192, -320, 150);   
        graphics.fillArc(x + (width * 32 / 120), y + (height * 0 / 720), width * 15 / 140, height * 40 / 100, 100, 80);    
//        graphics.setColor(Color.black);
        graphics.fillArc(x + (width * 31 / 120), y + (height * 100 / 720), width * 12 / 200, height * 50 / 192, -320, 380);   
        graphics.setColor(new Color(210,105,30));
        graphics.fillArc(x + (width * 32 / 120), y + (height * 150 / 720), width * 5 / 140, height * 20 / 100, 80, 150);        
        graphics.fillArc(x + (width * 30 / 120), y + (height * 150 / 720), width * 5 / 140, height * 35 / 100, -80, 150);   
        graphics.fillArc(x + (width * 31 / 120), y + (height * 150 / 720), width * 6 / 140, height * 20 / 100, -80, 100);        
        graphics.setColor(Color.black);
        graphics.fillArc(x + (width * 33 / 120), y + (height * 300 / 720), width * 3 / 140, height * 20 / 100, -80, 100);        
        graphics.fillArc(x + (width * 32 / 120), y + (height * 350 / 720), width * 3 / 140, height * 20 / 100, -80, 100);        
        graphics.fillArc(x + (width * 33 / 120), y + (height * 0 / 720), width * 3 / 140, height * 20 / 100, -80, 100);        

        
//        fingers         
        graphics.setColor(new Color(255, 218, 185));
        graphics.fillArc(x + (width * 21 / 120), y + (height * 330 / 720), width * 14 / 140, height * 4 / 100, 100, -150);        
        graphics.setColor(new Color(255,127,80));                     
        graphics.drawArc(x + (width * 21 / 120), y + (height * 330 / 720), width * 14 / 140, height * 4 / 100, 100, -150);                
        graphics.setColor(new Color(255, 218, 185));      
        graphics.fillArc(x + (width * 22 / 120), y + (height * 310 / 720), width * 13 / 140, height * 4 / 100, 100, -150);        
        graphics.setColor(new Color(255,127,80));                     
        graphics.drawArc(x + (width * 22 / 120), y + (height * 310 / 720), width * 13 / 140, height * 4 / 100, 100, -150);        
        graphics.setColor(new Color(255, 218, 185));        
        graphics.fillArc(x + (width * 33 / 120), y + (height * 310 / 720), width * 13 / 140, height * 4 / 100, 100, 150);                
        graphics.setColor(new Color(255,127,80));              
        graphics.drawArc(x + (width * 33 / 120), y + (height * 310 / 720), width * 13 / 140, height * 4 / 100, 100, 150);        
        graphics.setColor(new Color(255, 218, 185));
        graphics.fillArc(x + (width * 21 / 120), y + (height * 348 / 720), width * 13 / 140, height * 4 / 100, 100, -150);                
        graphics.setColor(new Color(255,127,80));                     
        graphics.drawArc(x + (width * 21 / 120), y + (height * 348 / 720), width * 13 / 140, height * 4 / 100, 100, -150);         graphics.setColor(new Color(255, 218, 185));
        graphics.fillArc(x + (width * 22 / 120), y + (height * 18 / 36), width * 1 / 14, height * 3 / 100, 100, -150);        
        graphics.setColor(new Color(255,127,80));              
        graphics.drawArc(x + (width * 22 / 120), y + (height * 18 / 36), width * 1 / 14, height * 3 / 100, 100, -150);     


//Eye
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x + (width * 4 / 10), y + (height * 5 / 11), width * 2 / 10, height * 1 / 6);
        graphics.fillOval(x + (width * 6 / 10), y + (height * 5 / 11), width * 2 / 10, height * 1 / 6);
        graphics.setColor(Color.black);
        graphics.fillOval(x + (width * 5 / 10), y + (height * 3 / 6), width * 1 / 40, height * 1 / 40);
        graphics.fillOval(x + (width * 7 / 10), y + (height * 3 / 6), width * 1 / 40, height * 1 / 40);
        //mouth 
//        graphics.fillArc(x + (width * 63 / 120) , y + (height * 63 / 100), width * 2 / 20, height * 2 / 48, 200, -200);
        graphics.fillOval(x + (width * 63 / 120), y + (height * 63 / 100), width * 4 / 38, height * 1 / 38);
        graphics.setColor(Color.white);
        graphics.fillOval(x + (width * 65 / 120), y + (height * 127 / 200), width * 3 / 38, height * 1 / 76);
        graphics.setColor(Color.black);
        graphics.drawOval(x + (width * 65 / 120), y + (height * 127 / 200), width * 5 / 76, height * 1 / 76);
        graphics.drawOval(x + (width * 65 / 120), y + (height * 127 / 200), width * 4 / 76, height * 1 / 76);
        graphics.drawOval(x + (width * 65 / 120), y + (height * 127 / 200), width * 3 / 76, height * 1 / 76);
        graphics.drawOval(x + (width * 65 / 120), y + (height * 127 / 200), width * 2 / 76, height * 1 / 76);
        graphics.drawOval(x + (width * 65 / 120), y + (height * 127 / 200), width * 1 / 76, height * 1 / 76);
        graphics.setColor(new Color(255, 218, 185));
        graphics.fillOval(x + (width * 66 / 120), y + (height * 130 / 200), width * 2 / 38, height * 1 / 38);

//       Eye bros
        graphics.setColor(Color.black);
        graphics.fillArc(x + (width * 6 / 15), y + (height * 4 / 9), width * 5 / 14, height * 1 / 38, 180, -90);
        graphics.fillArc(x + (width * 6 / 10), y + (height * 4 / 9), width * 5 / 14, height * 1 / 38, 180, -90);
//       fat flabs
        graphics.setColor(Color.black);
//         graphics.drawArc(x + (width * 47 / 100) , y + (height * 64 / 100), width * 18 / 100, height * 5 / 100, -200, 180);
        graphics.drawArc(x + (width * 45 / 100), y + (height * 62 / 100), width * 6 / 20, height * 4 / 48, -200, 120);
        graphics.drawArc(x + (width * 38 / 100), y + (height * 61 / 100), width * 9 / 20, height * 6 / 48, -180, 120);
//      shirt
        graphics.setColor(Color.black);
        graphics.drawArc(x + (width * 31 / 120), y + (height * 500 / 720), width * 20 / 140, height * 24 / 100, 80, -180);        
        graphics.drawArc(x + (width * 47 / 120), y + (height * 540 / 720), width * 60 / 140, height * 20 / 100, 80, 130);
        graphics.setColor(Color.yellow);
        graphics.fillOval(x + (width * 40 / 120), y + (height * 490 / 720), width * 3 / 100, height * 3 / 100);
        graphics.fillOval(x + (width * 65 / 120), y + (height * 530 / 720), width * 3 / 100, height * 3 / 100);
                
//         belt
        graphics.setColor(new Color(32, 178, 170));
        graphics.drawArc(x + (width * 81 / 400), y + (height * 76 / 100), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 81 / 400), y + (height * 305 / 400), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 81 / 400), y + (height * 306 / 400), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 81 / 400), y + (height * 307 / 400), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 81 / 400), y + (height * 308 / 400), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 81 / 400), y + (height * 309 / 400), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 81 / 400), y + (height * 310 / 400), width * 190 / 200, height * 4 / 48, -180, 120);
//         shoes
        graphics.setColor(new Color(128, 0, 0));
        graphics.fillArc(x + (width * 100 / 400), y + (height * 350 / 400), width * 50 / 200, height * 12 / 192, -200, 200);
        graphics.fillArc(x + (width * 230 / 400), y + (height * 355 / 400), width * 50 / 200, height * 12 / 192, -200, 200);
        
//         bottom of the clok
        graphics.setColor(new Color(220, 20, 60));
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1244 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1245 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1246 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1247 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1248 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1249 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1250 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1251 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1252 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1253 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1254 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1255 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1256 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1257 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1258 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1259 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1260 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1261 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1262 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1263 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1264 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1265 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1266 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1267 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1268 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1269 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1270 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1271 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1272 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1273 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1274 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1275 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1276 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1278 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1279 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1280 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1281 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1282 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1283 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1284 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1285 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1286 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1287 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1288 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1289 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1290 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1291 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1292 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1293 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1294 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1295 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1296 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1297 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1299 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1300 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1301 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1302 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1303 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1304 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1305 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1306 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1307 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1308 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1309 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1310 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1311 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1312 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1313 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1314 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1315 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1316 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1317 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1318 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1319 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1320 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1321 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1322 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1323 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1324 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1325 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1326 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1327 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1328 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1329 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1330 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1331 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1332 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1333 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1334 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1335 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1336 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1337 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1338 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1339 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1340 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1341 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1342 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
        graphics.drawArc(x + (width * 324 / 1600), y + (height * 1343 / 1600), width * 190 / 200, height * 4 / 48, -180, 120);
//         pouch
        graphics.setColor(new Color(0, 128, 128));
        graphics.fillOval(x + (width * 200 / 400), y + (height * 325 / 400), width * 18 / 200, height * 4 / 48);
        graphics.setColor(new Color(32, 178, 170));
        graphics.fillArc(x + (width * 204 / 400), y + (height * 323 / 400), width * 14 / 200, height * 12 / 192, -200, 200);
        graphics.setColor(new Color(0, 128, 128));
        graphics.fillArc(x + (width * 206 / 400), y + (height * 329 / 400), width * 12 / 200, height * 8 / 192, -200, 200);
        graphics.setColor(Color.yellow);
        graphics.fillOval(x + (width * 214 / 400), y + (height * 338 / 400), width * 4 / 300, height * 4 / 300);
//         left sleave
        graphics.setColor(new Color(178,34,34));
//        graphics.drawArc(x + (width * 264 / 400) , y + (height * 310 / 400), width * 13 / 200, height * 10 / 192, 160, -90);        
        graphics.drawArc(x + (width * 275 / 400), y + (height * 293 / 400), width * 20 / 200, height * 15 / 192, 180, -100);
        graphics.drawArc(x + (width * 285 / 400), y + (height * 315 / 400), width * 20 / 200, height * 10 / 192, -160, 90);
        graphics.setColor(new Color(178,34,34));
        graphics.fillOval(x + (width * 88 / 120), y + (height * 140 / 200), width * 16 / 106, height * 16 / 106);
//        lefthand
        graphics.setColor(new Color(255, 218, 185));
        graphics.fillOval(x + (width * 89 / 120), y + (height * 142 / 200), width * 13 / 106, height * 13 / 106);
        graphics.setColor(new Color(255,127,80));
        graphics.drawOval(x + (width * 89 / 120), y + (height * 142 / 200), width * 13 / 106, height * 13 / 106);
        graphics.setColor(new Color(255, 218, 185));
        graphics.fillArc(x + (width * 286 / 400), y + (height * 296 / 400), width * 13 / 200, height * 10 / 192, -300, 200);
//      thumb
        graphics.setColor(new Color(255,127,80));
        graphics.drawArc(x + (width * 300 / 400), y + (height * 279 / 400), width * 9 / 200, height * 16 / 192, -180, -180);
        graphics.setColor(new Color(255, 218, 185));
        graphics.fillArc(x + (width * 300 / 400), y + (height * 279 / 400), width * 9 / 200, height * 16 / 192, -180, -180);
//        right finger
        graphics.setColor(new Color(255,127,80));   
        graphics.drawArc(x + (width * 286 / 400), y + (height * 296 / 400), width * 13 / 200, height * 10 / 192, -300, 200);
        graphics.setColor(new Color(255, 218, 185));        
        graphics.fillArc(x + (width * 325 / 400), y + (height * 276 / 400), width * 9 / 200, height * 25 / 192, -180, -180);
//        ring
        graphics.setColor(new Color(255,127,80));       
        graphics.drawArc(x + (width * 326 / 400), y + (height * 276 / 400), width * 8 / 200, height * 16 / 192, -180, -180);
        graphics.setColor(new Color(255, 218, 185));
        graphics.fillArc(x + (width * 312 / 400), y + (height * 273 / 400), width * 9 / 200, height *  25/ 192, -180, -180);
//        middle
        graphics.setColor(new Color(255,127,80));       
        graphics.drawArc(x + (width * 312 / 400), y + (height * 273 / 400), width * 9 / 200, height *  17/ 192, -180, -180);
  
        graphics.setColor(new Color(255, 218, 185));        
        graphics.fillArc(x + (width * 338 / 400), y + (height * 290 / 400), width * 8 / 200, height * 14 / 192, -180, -180);    
        graphics.setColor(new Color(255,127,80));       
        graphics.drawArc(x + (width * 338 / 400), y + (height * 290 / 400), width * 8 / 200, height * 14 / 192, -180, -180);
//        pinky
        graphics.setColor(new Color(255, 218, 185));                
        graphics.fillArc(x + (width * 330 / 400), y + (height * 290 / 400), width * 12 / 200, height * 14 / 192, 200, 200);    
        graphics.setColor(new Color(255,127,80));       
        graphics.drawArc(x + (width * 330 / 400), y + (height * 290 / 400), width * 12 / 200, height * 14 / 192, 200, 200);    
        graphics.setColor(new Color(255, 218, 185));
        graphics.fillArc(x + (width * 328 / 400), y + (height * 300 / 400), width * 10 / 200, height * 10 / 192, 360, 360);    
//        palm details
        graphics.setColor(new Color(255,127,80));       
        graphics.drawArc(x + (width * 312 / 400), y + (height * 294 / 400), width * 10 / 200, height * 2 / 192, 180, -180);    
        graphics.drawArc(x + (width * 304 / 400), y + (height * 294 / 400), width * 6 / 200, height * 3 / 192, 190, 120);    
        graphics.drawArc(x + (width * 305 / 400), y + (height * 300 / 400), width * 6 / 200, height * 3 / 192, 120, -150);    
        
        
   
        
    }

    public Cartman(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    private int x;
    private int y;
    private int height;
    private int width;

}
