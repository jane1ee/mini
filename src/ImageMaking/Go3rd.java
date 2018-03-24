package ImageMaking;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import khSecondProject.Run;

public class Go3rd extends JFrame {
	// 배경
	JScrollPane scrollPane;
	JPanel background;
    Image gifBg;
    Toolkit tk;
	// 마우스
	Image mouseImg;
	Cursor mouse;
	Point point;
    
	
	public Go3rd() {
		OutroFrame();	// 메소드 실행
	}
	

	
	public void OutroFrame() {
	      tk = Toolkit.getDefaultToolkit();
	      // 마우스 이미지 설정
	      mouseImg = new ImageIcon("img/cursor/cursor.png").getImage();
	      point = new Point(0, 0);
	      mouse = tk.createCustomCursor(mouseImg, point, "wonder");
	      setCursor(mouse);
	      
	      // 배경
	      gifBg = tk.getImage("img/opendoor/opendoor.gif");

	      background = new JPanel() {
	         public void paint(Graphics g) {
	            if (gifBg == null)
	               return;

	            g.drawImage(gifBg, 0, 0, this);
	            setOpaque(false);
	            super.paintComponent(g);
	         }

	      };
	     this.add(background);
	      scrollPane = new JScrollPane(background);
	      this.add(scrollPane);

	      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      this.setSize(1280, 800);
	      this.setLocation(300, 130);

	      this.setLocationRelativeTo(null);
	      this.setTitle("to the Next Room");
	      this.setIconImage(new ImageIcon("img/favicon.jpg").getImage());
	      this.setResizable(false);

	      // 방문 여는 효과음
	      OpenBGM("bgm/DoorOpen.wav");
	      this.setVisible(true);
	      new NextThread().start();
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
	
	
	class NextThread extends Thread {
		@Override
		public void run() {
			try {
				Thread.sleep(5000);
				Run run = new Run();
				dispose();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
