package gayoung;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class LabelMaker {
	
	
	
	public JLabel bookFocusLbl(){
		 Image bookFocusImg = new ImageIcon("img/5th/hint/bookFocus.JPG").getImage().getScaledInstance(300, 300, 0);
		 JLabel bookFocusLbl=new JLabel(new ImageIcon(bookFocusImg));
		 bookFocusLbl.setBounds(300,200,300,300);
		    
		 return bookFocusLbl;
	}
	public JLabel lockerInsideFocusLbl(){
		 Image lockerFocusImg = new ImageIcon("img/5th/hint/doorq.png").getImage().getScaledInstance(300, 300, 0);
		 JLabel lockerInFocusLbl=new JLabel(new ImageIcon(lockerFocusImg));
		 lockerInFocusLbl.setBounds(400,500,300,300);
		
		return lockerInFocusLbl;
	}
	public JLabel memoFocusLbl(){
	     Image memoFocusImg = new ImageIcon("img/5th/quiz/photo_question.png").getImage().getScaledInstance(300, 300, 0);
		 JLabel memoFocusLbl=new JLabel(new ImageIcon(memoFocusImg));
		 memoFocusLbl.setBounds(600,300,300,300);
		 
		 return memoFocusLbl;
	}
	public JLabel doorHintFocusLbl(){
		 Image doorHintFocusImg = new ImageIcon("img/5th/hint/doorhint.png").getImage().getScaledInstance(300, 300, 0);
		 JLabel doorHintFocusLbl=new JLabel(new ImageIcon(doorHintFocusImg));
		 doorHintFocusLbl.setBounds(1000,500,300,300);
		
		 return doorHintFocusLbl;
	}
	public JLabel photoFrame(){
		Image photo = new ImageIcon("img/5th/room/who_r_u.jpg").getImage().getScaledInstance(350, 250, 0);
		JLabel label = new JLabel(new ImageIcon(photo));
		return label;
	}
	
}
