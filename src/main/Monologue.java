package main;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import library.LightOff;

import java.awt.Graphics;

public class Monologue extends JFrame {
	// 마우스
	Toolkit tk;
	Image mouseImg;
	Cursor mouse;
	Point point;
	
	JTextArea storyConsol;
	Image monologueBG;

	Image image1 = new ImageIcon("img/intro/monologueBG/monologueBG1.png").getImage();
	Image image2 = new ImageIcon("img/intro/monologueBG/monologueBG2.png").getImage();
	Image image3 = new ImageIcon("img/intro/monologueBG/monologueBG3.png").getImage();

	JPanel monologue;

	String[] message = {
			"\n\n\n\n\n\n\n                               오늘은 파이널 프로젝트 발표날\n                                        발표 준비를 위해\n                                 평소보다 일찍 집을 나섰다.",
			"\n\n\n\n\n\n\n\n                                                 어....?", // 출력후
																						// 화면
																						// 변경
			"\n\n\n\n\n\n\n                                    머리에 큰 타격과 함께\n                                   의식이 흐려졌다............", // 출력
																																			// 후
																																			// 화면
																																			// 변경
			"\n\n\n\n\n\n\n\n                           .......눈을 떠보니 완전히 낯선 곳이다.",
			"\n\n\n\n\n\n\n                                문을 열어봤지만 열리지 않는다... \n                                      핸드폰은 먹통인 상태.\n                                이제 3시간 뒤면 발표 시작인데... ",
			"\n\n\n\n\n\n\n                                      발표 자료와 대본 모두 \n                                  나한테 있는데 어떻게 하지?",
			"\n\n\n\n\n\n\n\n                                    우선 이 방을 탈출하자......." };

	public Monologue() {
	}

	public JPanel monologue() {
		// 마우스 커서
		tk = Toolkit.getDefaultToolkit();
		// 마우스 이미지 설정
		mouseImg = new ImageIcon("img/cursor/cursor.png").getImage();
		point = new Point(0, 0);
		mouse = tk.createCustomCursor(mouseImg, point, "wonder");
		
		monologue = new JPanel();
		monologue.setBounds(0, 0, 1280, 800);
		monologue.setLayout(null);
		
		monologueBG = image1;
		Font f1 = new Font("나눔스퀘어", Font.BOLD, 40);

		storyConsol = new JTextArea() {
			@Override
			protected void paintComponent(Graphics g) {

				g.drawImage(monologueBG, 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);

			}
		};
		storyConsol.setBounds(0, 0, 1280, 800);
		storyConsol.setEditable(false);
		storyConsol.setForeground(Color.white);
		storyConsol.setFont(f1);
		
		setCursor(mouse);
		monologue.add(storyConsol);
		new Monolog().start();
		return monologue;
	}


	public class Monolog extends Thread {
		String mMessage = "";

		@Override
		public void run() {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			for (int i = 0; i < message.length; i++) {
				for (int j = 0; j < message[i].length(); j++) {
					try {
						Thread.sleep(30);
						mMessage += message[i].charAt(j);
						storyConsol.setText(mMessage);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(1000);
					mMessage = "";
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (i == 1) {
					monologueBG = image2;
				} else if (i == 2) {
					monologueBG = image3;
				}
			}
		}
	}
}
