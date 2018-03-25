package gayoung;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class KkyRoom extends JFrame {
	// 배경
	JPanel background;
	// 버튼
	ButtonMaker btnMaker = new ButtonMaker();
	ImageIcon icon = new ImageIcon("img/5th/room/common room.jpg");
	InRoom ir = new InRoom();
	// OfferFrame offer = new OfferFrame();
	
	MyMouseListener listener = new MyMouseListener();
	JPanel panel1 = new JPanel();
//	JPanel panel2 = new JPanel();
	JFrame frame2 = new JFrame();
	LabelMaker lblMaker = new LabelMaker();
	Image bgImg;
	Image mouseImg;
	Cursor mouse;
	JScrollPane scrollPane;
	
	 // textarea 배경
	 Image textboxBg = new ImageIcon("img/textbox/textbox.png").getImage();
	 // 인트로 텍스트 박스
	 JTextArea storyConsol;
	 // 인트로 문구 배열
	 String[] intro;
	   
	 
	public KkyRoom() {

		setBounds(300, 130, 1280, 800);
		setIconImage(new ImageIcon("img/favicon.jpg").getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		playBgmSound(true);
		
		setTitle("GayoUng's room,I");
		background = new JPanel() { // 배경 Panel 생성후 컨텐츠페인으로 지정
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, 1280, 800, null);// 이미지를
																	// 1280,800의
																	// 사이즈로
																	// 0,0좌표에 그림
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				super.paintComponent(g);
			}
		};
		Toolkit tk2 = Toolkit.getDefaultToolkit();
		mouseImg = new ImageIcon("img/cursor/cursor.png").getImage().getScaledInstance(50, 70, 0);
		Point point = new Point(0, 0);
		mouse = tk2.createCustomCursor(mouseImg, point, "wonder");
		background.setCursor(mouse);
		
		background.setLayout(null);
		
		
		
		// 인트로
		storyConsol = new JTextArea() {
		   public void paintComponent(Graphics g) {
		      Dimension sizing = getSize();
		      g.drawImage(textboxBg, 0, 0, (int)sizing.getWidth(), (int)sizing.getHeight(), null);
		      setOpaque(false);
		      super.paintComponent(g);
		   }
		};
		storyConsol.setBounds(280, 480, 742, 232);
		storyConsol.setEditable(false);
		// 폰트 설정
		Font commonFont = new Font("맑은 고딕", Font.BOLD, 30);
		storyConsol.setForeground(Color.white);
		storyConsol.setFont(commonFont);
		storyConsol.setOpaque(true);
		
		new IntroThread().start();
		background.add(storyConsol);
		
		

		background.add(btnMaker.framePhotoBtn());
		background.add(btnMaker.lockerdoorBtn());
		background.add(btnMaker.doorBtn());

		JLabel bookFocusLbl = lblMaker.bookFocusLbl();
		bookFocusLbl.setVisible(false);
		background.add(bookFocusLbl);
		JButton bookshelfBtn = btnMaker.bookShelfBtn();
		background.add(bookshelfBtn);
		bookshelfBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookFocusLbl.setVisible(true);
				bookFocusLbl.addMouseListener(listener);

			}

		});

		JLabel lockerInsideLbl = lblMaker.lockerInsideFocusLbl();
		lockerInsideLbl.setVisible(false);
		background.add(lockerInsideLbl);
		JButton lockerInsideBtn = btnMaker.lockerInsideBtn();
		background.add(lockerInsideBtn);
		lockerInsideBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lockerInsideLbl.setVisible(true);
				lockerInsideLbl.addMouseListener(listener);
			}
		});

		JLabel memoFocusLbl = lblMaker.memoFocusLbl();
		memoFocusLbl.setVisible(false);
		background.add(memoFocusLbl);
		JButton memoFocusBtn = btnMaker.memoFocusBtn();
		background.add(memoFocusBtn);
		memoFocusBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memoFocusLbl.setVisible(true);
				memoFocusLbl.addMouseListener(listener);
			}
		});

		JLabel doorHintFocusLbl = lblMaker.doorHintFocusLbl();
		doorHintFocusLbl.setVisible(false);
		background.add(doorHintFocusLbl);
		JButton doorHintBtn = btnMaker.doorHintBtn();
		background.add(doorHintBtn);
		doorHintBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doorHintFocusLbl.setVisible(true);
				doorHintFocusLbl.addMouseListener(listener);
			}
		});

		scrollPane = new JScrollPane(background);
		setContentPane(scrollPane);
		setLocationRelativeTo(null);
		//setVisible(true);

//		return background;
	

	
		
		panel1 = new InRoom().OutroFrame();
		add(panel1);
		 
		setResizable(false);

		setVisible(true);
//		new OfferThread().start();

		// panel2.setVisible(false);
		// super.setVisible(true);

		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JScrollPane scrollPane;
		// setLayout(null);

		//

		//
		// new OfferThread().start();
	}
	
	// 인트로 쓰레드
   class IntroThread extends Thread {
      String storyLine = "";   // 한 줄씩 출력할 문자열 선언
	      
      public void run() {
          intro = new String[3];
            {
               intro[0] = "\n     5번째 방...";
               intro[1] = "\n     제발 마지막 방이였으면 좋겠는데....";
               intro[2] = "\n     힘내보자..!";
            }
            
         for(int i = 0; i < intro.length; i++) {
            for(int j = 0; j < intro[i].length(); j++) {
               // 0.005초에 한 글자씩 출력
               try {
                  Thread.sleep(50);
                  storyLine += intro[i].charAt(j);
                  storyConsol.setText(storyLine);
               } catch (InterruptedException e) {
                  e.printStackTrace();
               }
            }
            // 배열 하나가 출력되고 나면 1초 동안 정지
            try {
               Thread.sleep(1000);
               storyLine = "";
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
         }
         
         try {
			Thread.sleep(1500);
			background.remove(storyConsol);
			background.repaint();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
      }
   }
	
	
	
//	public Cursor cursor(){
//		 Image bgImg;
//			Image mouseImg;
//			Cursor mouse;
//		Toolkit tk = Toolkit.getDefaultToolkit();
//	      mouseImg = new ImageIcon("cursor.png").getImage();
//	      Point point = new Point(0, 0);
//	      mouse = tk.createCustomCursor(mouseImg, point, "wonder");
//		
//		return mouse;
//	}


//	class OfferThread extends Thread {
//
//		public void run() {
//			try {
//				// add(ir.OutroFrame());
//
//				Thread.sleep(2000);
//				TextBoxpanel txtBoxPanel = new TextBoxpanel();
////				panel2 = new InRoom().background();
////				setTitle("GayoUng's room,I");
////				setCursor(cursor());
//				
//				
////				frame2.setBounds(300, 130, 1280, 800);
////				frame2.add(panel2);
////				frame2.setVisible(true);
//
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//
//		}
//	}
//	public void playBgmSound(boolean loop) {
//		try {
//			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("bgm/National_Express.wav"));
//			Clip clip = AudioSystem.getClip();
//			clip.open(audioInputStream);
//			clip.start();
//			if (loop) {
//				clip.loop(-1);
//			}
//
//		} catch (Exception ex) {
//			System.out.println("Error with playing sound.");
//			ex.printStackTrace();
//		}
//	}
	class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			JLabel label = (JLabel) e.getSource();
			label.setVisible(false);
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}

	}
}
