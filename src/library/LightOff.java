package library;

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
import java.io.BufferedInputStream;
import java.io.FileInputStream;
<<<<<<< HEAD
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
=======
>>>>>>> 00b55bac3390127d8524e0fb28b27d91ba2504d9

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

<<<<<<< HEAD
import main.Propotie;

=======
>>>>>>> 00b55bac3390127d8524e0fb28b27d91ba2504d9

public class LightOff extends JFrame {
	// 배경
	JScrollPane scrollPane;
	JPanel background;
	Image bgImg;
	// frame
	JFrame lightOff;
	// textarea 배경
	Image textboxBg = new ImageIcon("img/textbox/textbox.png").getImage();
	// 인트로 텍스트 박스
	JTextArea storyConsol;
	// 인트로 문구 배열
	String[] intro;
	
	// 클릭할 때마다 카운트 : 한 줄씩 출력
	int clickCnt = 0;
	// 스위치 클릭시 이벤트
	int switchClick = 0;
	// 마우스
	Toolkit tk;
	Image mouseImg;
	Cursor mouse;
	Point point;
	
	
	public LightOff() {
		// 마우스 커서
		tk = Toolkit.getDefaultToolkit();
		mouseImg = new ImageIcon("img/cursor/cursor.png").getImage();
		point = new Point(0, 0);
		mouse = tk.createCustomCursor(mouseImg, point, "wonder");
		this.setCursor(mouse);
		
		// 처음 : 불 꺼진 배경화면
		bgImg = new ImageIcon("img/1st/library/lightoff.PNG").getImage();
		background = new JPanel() {
			public void paintComponent(Graphics g) {
				// 사이즈 가져오기
				Dimension sizing = getSize();
				// 이미지, 위치, 사이즈
				g.drawImage(bgImg, 0, 0, (int)sizing.getWidth(), (int)sizing.getHeight(), null);
				// 투명하게? : 아니
				setOpaque(false);
				// 배경 그리기
				super.paintComponent(g);
			}
		};
		
		
		scrollPane = new JScrollPane(background);
		setContentPane(scrollPane);


		// 방문 여는 효과음
		OpenBGM("bgm/DoorOpen.wav");

		// 패널 레이아웃 설정
		background.setLayout(null);
		
		
		// 인트로 : 스위치 버튼 클릭 유도
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
		Font commonFont = new Font("나눔스퀘어", Font.BOLD, 30);
		storyConsol.setForeground(Color.white);
		storyConsol.setFont(commonFont);
		storyConsol.setOpaque(true);
		
		new IntroThread().start();
		background.add(storyConsol);
		
		
<<<<<<< HEAD
		Propotie pp = new Propotie();
		
=======
>>>>>>> 00b55bac3390127d8524e0fb28b27d91ba2504d9
		
		//  스위치 버튼 이미지 설정, 버튼 생성, 위치 지정
		ImageIcon blackSwitch = new ImageIcon("img/1st/library/offedswitch.png");
		JButton switchBtn = new JButton(blackSwitch);
		switchBtn.setBounds(832, 228, blackSwitch.getIconWidth(), blackSwitch.getIconHeight());
		switchBtn.setBorderPainted(false);
		// 스위치버튼 클릭 이벤트
		switchBtn.addMouseListener(new SwitchAction());
<<<<<<< HEAD
		switchBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				BreakLibrary breakLibrary = new BreakLibrary();
				Runnable task1 = ()->{
					
					breakLibrary.setTitle("THE ROOM");
					breakLibrary.setLocation(300, 130);
					breakLibrary.setSize(1280, 800);
					breakLibrary.setResizable(false);
					breakLibrary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					breakLibrary.setIconImage(new ImageIcon("img/favicon.jpg").getImage());
					breakLibrary.setVisible(true);
				};
				
				Runnable task2 = ()->{
					breakLibrary.flowtime(breakLibrary.timeBox, pp.getTime());
				};
				
				ExecutorService exr = Executors.newFixedThreadPool(2);
				exr.submit(task1);
				exr.submit(task2);
				exr.shutdown();
				
				
				// 창닫기
				dispose();
			}
		});
=======
>>>>>>> 00b55bac3390127d8524e0fb28b27d91ba2504d9
		
		// 버튼 프레임에 추가
		background.add(switchBtn);		
	}
	

	
	// 스위치 클릭시 마우스 이벤트
	class SwitchAction implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
<<<<<<< HEAD
=======
			BreakLibrary breakLibrary = new BreakLibrary();
			breakLibrary.setTitle("서재");
			breakLibrary.setLocation(300, 130);
			breakLibrary.setSize(1280, 800);
			breakLibrary.setResizable(false);
			breakLibrary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			breakLibrary.setIconImage(new ImageIcon("img/favicon.jpg").getImage());
			breakLibrary.setVisible(true);
			// 창닫기
			dispose();
>>>>>>> 00b55bac3390127d8524e0fb28b27d91ba2504d9
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// 버튼 마우스 오프 : 커서 원래대로 돌아오기
			mouseImg = new ImageIcon("img/cursor/cursor.png").getImage();
			point = new Point(0, 0);
			mouse = tk.createCustomCursor(mouseImg, point, "wonder");
			setCursor(mouse);
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// 버튼 마우스 온 : 커서 변경
			mouseImg = new ImageIcon("img/cursor/check.png").getImage();
			point = new Point(20, 20);
			mouse = tk.createCustomCursor(mouseImg, point, "find");
			setCursor(mouse);
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}
	}

	// 배경음악 메소드 : 나무문
	public static void  OpenBGM(String file) {
		try {
			AudioInputStream ais =
					AudioSystem.getAudioInputStream(new BufferedInputStream(new FileInputStream(file)));
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// 인트로 쓰레드
	class IntroThread extends Thread {
		String storyLine = "";	// 한 줄씩 출력할 문자열 선언
		
		public void run() {
			 intro = new String[5];
				{
					intro[0] = "\n     앗….\n     문이 잠겼네….";
					intro[1] = "\n     ……너무 어두워.";
					intro[2] = "\n     방을 둘러보자.";
					intro[3] = "\n     벽에 스위치가 있다!";
					intro[4] = "\n     스위치를 눌러 불을 켜보자.";
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
		}
	}
}
