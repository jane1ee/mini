package main;

import java.awt.Graphics;
import java.awt.Image;
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

import geoniRoom.Background;

public class DoorOpen extends JFrame {
	JPanel background;
	JFrame endFrame;
	JScrollPane scrollPane;
	private String file;
	
	public DoorOpen() {
	}
	
	public DoorOpen(String file) {
		this.file = file;
		Image img;
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("img/opendoor/opendoor(" + file + ").gif");
		
		background = new JPanel(){
			@Override
			public void paint(Graphics g) {
				if(img == null){
					return;
				}
				g.drawImage(img, 0, 0, this);
				setOpaque(false);
				super.paint(g);
			}
		};
		endFrame = new JFrame();
		endFrame.add(background);
		endFrame.setTitle("to the Next Room");
		scrollPane = new JScrollPane(background);
		endFrame.add(scrollPane);

		endFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		endFrame.setSize(1280, 800);
		
		endFrame.setLocationRelativeTo(null);
		endFrame.setResizable(false);
		endFrame.setIconImage(new ImageIcon("img/favicon.jpg").getImage());
		
		// 방문 여는 효과음
		DoorOpen door = new DoorOpen();
	    door.Opening("bgm/DoorOpen.wav");
		endFrame.setVisible(true);
		
		new CloseThread().start();
	}
	
	// 배경음악 메소드 : 나무문
	public static void Opening(String file) {
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
	
	
	class CloseThread extends Thread {
		@Override
		public void run() {
			try {
				Thread.sleep(6000);
				endFrame.dispose();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
