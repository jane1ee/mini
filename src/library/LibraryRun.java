package library;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class LibraryRun {
	
	public LibraryRun() {
		LightOff lightOff = new LightOff();
		lightOff.setTitle("서재");
		lightOff.setLocation(300, 130);
		lightOff.setSize(1280, 800);
		lightOff.setResizable(false);
		lightOff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lightOff.setIconImage(new ImageIcon("img/favicon.jpg").getImage());
		lightOff.setVisible(true);	
	}
	
//	public static void main(String[] args) {
//		LibraryRun lr = new LibraryRun();
//	}
}
