package gayoung;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class KkyRoom extends JFrame {
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
	//

	public KkyRoom() {

		setBounds(300, 130, 1280, 800);
		setIconImage(new ImageIcon("img/favicon.jpg").getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		playBgmSound(true);
		
		setTitle("GayoUng's room,I");
		JPanel background = new JPanel() { // 배경 Panel 생성후 컨텐츠페인으로 지정
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
		new OfferThread().start();

		// panel2.setVisible(false);
		// super.setVisible(true);

		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JScrollPane scrollPane;
		// setLayout(null);

		//

		//
		// new OfferThread().start();
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


	class OfferThread extends Thread {

		public void run() {
			try {
				// add(ir.OutroFrame());

				Thread.sleep(2000);
				TextBoxpanel txtBoxPanel = new TextBoxpanel();
//				panel2 = new InRoom().background();
//				setTitle("GayoUng's room,I");
//				setCursor(cursor());
				
				
//				frame2.setBounds(300, 130, 1280, 800);
//				frame2.add(panel2);
//				frame2.setVisible(true);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
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
