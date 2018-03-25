package main;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class Opening extends  JFrame {
	// 배경
	JScrollPane scrollPane;
	JPanel background;
    Image gifBg;
    Toolkit tk;
	// 마우스
	Image mouseImg;
	Cursor mouse;
	Point point;
    
	
	public Opening() {
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
}
