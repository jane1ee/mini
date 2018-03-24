package ImageMaking;

import java.awt.Frame;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.swing.JFrame;

public class SoundPlayer {

	public static void DoorOpen() {

		Frame jframe=new Frame();
		jframe.setVisible(true);
		try {

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("bgm/DoorOpen.wav").getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
		

			clip.open(audioInputStream);
			clip.start();

		} catch (Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		DoorOpen();
	}
}