package gayoung;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class OfferFrame {
   JFrame selectF;
   public JFrame offerFrame(int num){
      selectF = new JFrame();
      selectF.setUndecorated(true);
      selectF.setResizable(false);
      selectF.setBounds(700, 500, 540, 80);
      switch(num){
      case 1 :
         //문제가 있는 경우 라벨
         JLabel haveL = new JLabel(new ImageIcon("img/popup/event.png"));
         haveL.setBounds(0,0,540,80);
         selectF.add(haveL);
         break;
      case 2 :
         //아무것도 없을 경우 라벨
         JLabel noHaveL = new JLabel(new ImageIcon("img/popup/nothing.png"));
         noHaveL.setBounds(0,0,540,80);
         selectF.add(noHaveL);
         break;
      case 3 :
         //아이템이 있을 경우 라벨
         JLabel whatL = new JLabel(new ImageIcon("img/popup/clue.png"));
         whatL.setBounds(0,0,540,80);
         selectF.add(whatL);
         break;
      }
      return selectF;
      
   }
   
   
  
    
}

