package gayoung;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;



public class ButtonMaker {
	   OfferFrame offer = new OfferFrame();
	   
	   
	   JFrame frame;
	   JFrame offerF;
	   JPanel answerP = new JPanel(); 
	   ImageIcon panelIcon;
	 
	public JButton memoFocusBtn(){
	    JButton button = new JButton();
	    setBtn(button);
	    button.setBounds(615, 398, 170, 100);
	    return button;
	}
	
	public JButton bookShelfBtn(){
		JButton bookShelfBtn = new JButton();
		setBtn(bookShelfBtn);
	    bookShelfBtn.setBounds(395, 275, 58, 57);
	
	    return bookShelfBtn;
	}
	
	public JButton lockerInsideBtn(){
	    JButton button = new JButton();
	    button.setBounds(598, 586, 207, 60);
	    setBtn(button);
	    return button;
	}
	public JButton doorHintBtn(){
		JButton button = new JButton();
	    button.setBounds(1095, 550, 80, 70);
	    setBtn(button);
	    
	    return button;
	}
	
	public JButton framePhotoBtn(){
		Image photo = new ImageIcon("img/5th/room/who_r_u.jpg").getImage().getScaledInstance(170, 100, 0);
		JButton button = new JButton(new ImageIcon(photo));
		setBtn(button);
		button.setBounds(615, 398, 170, 100);//버튼 위치
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				 String answer="GUI";
			      //액자 문제 프레임
			      frame = new JFrame();
			      frame.setUndecorated(true); // 타이틀바 제거
			      frame.setLayout(null);
			      frame.setBounds(500, 500, 435, 380);
			      frame.setResizable(false);  // 프레임 고정
			      //액자 문제 
			      JButton problemFI = new JButton(new ImageIcon("img/5th/quiz/bookshelf.png"));
			      problemFI.setBounds(0, 0, 435, 284);
			      problemFI.setBorderPainted(false);
			      problemFI.addActionListener(new ActionListener() {
			         
			         @Override
			         public void actionPerformed(ActionEvent e) {
			            frame.dispose();
			         }
			      });
			      Font f1 = new Font("양재블럭체", Font.CENTER_BASELINE, 15);
			      //패털 배경 설정
			      panelIcon = new ImageIcon("img/5th/quiz/panelImage.png");
			      JPanel panel = new JPanel(){
			         @Override
			         protected void paintComponent(Graphics g) {
			            g.drawImage(panelIcon.getImage(), 0, 0, null);
			            setOpaque(false);
			            super.paintComponent(g);
			         }
			      };
			      
			      panel.setBounds(0, 284, 435, 100);
			      panel.setLayout(null);
			      // 정답 라벨      
			      JLabel answer1 = new JLabel("정답 ");
			      answer1.setBounds(50, 10, 100, 100);
			      answer1.setForeground(Color.white);
			      answer1.setFont(f1);
			      // 정답 입력 받을 textfild
			      JTextField answerTF = new JTextField(30);
			      answerTF.setBounds(110, 45 ,200 ,30);
			      panel.add(answer1);
			      panel.add(answerTF);
			      answerTF.addActionListener(new ActionListener() {
			         @Override
			         public void actionPerformed(ActionEvent e) {
			            if (answerTF.getText().equals(answer)) {
			               // 정답시 새로운 창
			                   JOptionPane.showMessageDialog(null, "정답입니다.");
			                   frame.dispose();
			                   btnSound();
			                   button.setVisible(false);
			               } else {
			               // 틀릴시 새로운 창
			                  JOptionPane.showMessageDialog(null, "틀렸습니다.");
			               }
			                     // 답 입력 후 삭제
			               answerTF.setText("");
			               }
			            });
			      answerP = panel;
			      frame.add(problemFI);
			      frame.add(answerP);   
			      
			      offerF = offer.offerFrame(1);
			      offerF.setVisible(true);
			      new OfferThread().start();
				}  
		});
		
		return button;
	}
	 
	
	public JButton lockerdoorBtn(){
		 Image lockerDoor = new ImageIcon("img/5th/room/locker_door.JPG").getImage().getScaledInstance(207, 63, 0);
		 JButton button=new JButton(new ImageIcon(lockerDoor));
		 button.setBounds(598, 584, 207, 63);
		 setBtn(button);
		 button.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					 String answer="벽";
				      //액자 문제 프레임
				      frame = new JFrame();
				      frame.setUndecorated(true); // 타이틀바 제거
				      frame.setLayout(null);
				      frame.setBounds(200, 200, 435, 380);
				      frame.setResizable(false);  // 프레임 고정
				      //액자 문제 
				      JButton problemFI = new JButton(new ImageIcon("img/5th/room/frame.JPG"));
				      problemFI.setBounds(0, 0, 435, 284);
				      problemFI.setBorderPainted(false);
				      problemFI.addActionListener(new ActionListener() {
				         
				         @Override
				         public void actionPerformed(ActionEvent e) {
				            frame.dispose();
				         }
				      });
				      Font f1 = new Font("양재블럭체", Font.CENTER_BASELINE, 15);
				      //패털 배경 설정
				      panelIcon = new ImageIcon("img/5th/quiz/panelImage.png");
				      JPanel panel = new JPanel(){
				         @Override
				         protected void paintComponent(Graphics g) {
				            g.drawImage(panelIcon.getImage(), 0, 0, null);
				            setOpaque(false);
				            super.paintComponent(g);
				         }
				      };
				      
				      panel.setBounds(0, 284, 435, 100);
				      panel.setLayout(null);
				      // 정답 라벨      
				      JLabel answer1 = new JLabel("정답 ");
				      answer1.setBounds(50, 10, 100, 100);
				      answer1.setForeground(Color.white);
				      answer1.setFont(f1);
				      // 정답 입력 받을 textfild
				      JTextField answerTF = new JTextField(30);
				      answerTF.setBounds(110, 45 ,200 ,30);
				  
				      panel.add(answer1);
				      panel.add(answerTF);
				      answerTF.addActionListener(new ActionListener() {
				         @Override
				         public void actionPerformed(ActionEvent e) {
				            if (answerTF.getText().equals(answer)) {
				               // 정답시 새로운 창
				                   JOptionPane.showMessageDialog(null, "정답입니다.");
				                   frame.dispose();
				                   btnSound();
				                   button.setVisible(false);
				               } else {
				               // 틀릴시 새로운 창
				                  JOptionPane.showMessageDialog(null, "틀렸습니다.");
				               }
				                     // 답 입력 후 삭제
				               answerTF.setText("");
				               }
				            });
				      answerP = panel;
				      frame.add(problemFI);
				      frame.add(answerP);   
				      
				      offerF = offer.offerFrame(1);
				      offerF.setVisible(true);
				      new OfferThread().start();
					}  
			});
		 return button;
	}
	
	
	public JButton doorBtn(){
		Image nextDoor = new ImageIcon("img/5th/room/nextroomdoor.png").getImage().getScaledInstance(227, 366, 0);
		JButton button=new JButton(new ImageIcon(nextDoor));
		button.setBounds(850, 240, 227, 366);
		setBtn(button);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				 String answer="0805";
			      //액자 문제 프레임
			      frame = new JFrame();
			      frame.setUndecorated(true); // 타이틀바 제거
			      frame.setLayout(null);
			      frame.setBounds(200, 200, 435, 380);
			      frame.setResizable(false);  // 프레임 고정
			      //액자 문제 
			      JButton problemFI = new JButton(new ImageIcon("img/5th/quiz/locker.JPG"));
			      problemFI.setBounds(0, 0, 435, 284);
			      problemFI.setBorderPainted(false);
			      problemFI.addActionListener(new ActionListener() {
			         
			         @Override
			         public void actionPerformed(ActionEvent e) {
			            frame.dispose();
			         }
			      });
			      Font f1 = new Font("양재블럭체", Font.CENTER_BASELINE, 15);
			      //패털 배경 설정
			      panelIcon = new ImageIcon("img/5th/quiz/panelImage.png");
			      JPanel panel = new JPanel(){
			         @Override
			         protected void paintComponent(Graphics g) {
			            g.drawImage(panelIcon.getImage(), 0, 0, null);
			            setOpaque(false);
			            super.paintComponent(g);
			         }
			      };
			      
			      panel.setBounds(0, 284, 435, 100);
			      panel.setLayout(null);
			      // 정답 라벨      
			      JLabel answer1 = new JLabel("정답 ");
			      answer1.setBounds(50, 10, 100, 100);
			      answer1.setForeground(Color.white);
			      answer1.setFont(f1);
			      // 정답 입력 받을 textfild
			      JTextField answerTF = new JTextField(30);
			      answerTF.setBounds(110, 45 ,200 ,30);
			      panel.add(answer1);
			      panel.add(answerTF);
			      answerTF.addActionListener(new ActionListener() {
			         @Override
			         public void actionPerformed(ActionEvent e) {
			            if (answerTF.getText().equals(answer)) {
			               // 정답시 새로운 창
			                   JOptionPane.showMessageDialog(null, "정답입니다.");
			                   frame.dispose();
			                   btnSound();
			               } else {
			               // 틀릴시 새로운 창
			                  JOptionPane.showMessageDialog(null, "틀렸습니다.");
			               }
			                     // 답 입력 후 삭제
			               answerTF.setText("");
			               }
			            });
			      answerP = panel;
			      frame.add(problemFI);
			      frame.add(answerP);   
			      
			      offerF = offer.offerFrame(1);
			      offerF.setVisible(true);
			      new OfferThread().start();
				}  
		});
		return button;
	}
	
	public void setBtn(JButton btn){
		btn.setBorderPainted(false);
	    btn.setFocusPainted(false);
	    btn.setContentAreaFilled(false);
	}
	
	public void btnSound() {
	    try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("bgm/Screen_Door_Close.wav"));
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	        
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}
  class OfferThread extends Thread{
	      
	      public void run(){
	         try {
	            Thread.sleep(1000);
	            offerF.setVisible(false);
	            frame.setVisible(true);
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	         
	      }
	 }
}
