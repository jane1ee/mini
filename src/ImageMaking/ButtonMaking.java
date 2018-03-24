package ImageMaking;

import java.awt.Button;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonMaking extends JPanel {
	Image imgae;

	public ButtonMaking() {

	}

	public JButton backgroundBtn(int check) {
		JButton btn1 = new JButton();
		switch (check) {
		case 1:
			btn1 = new JButton(new ImageIcon("Img/2nd/button/Button1.PNG"));
			btn1.setBounds(145, 280, 83, 54);
			break;
		case 2:
			btn1 = new JButton(new ImageIcon("Img/2nd/button/Button2.PNG"));
			btn1.setBounds(980, 260, 71, 84);
			break;
		case 3:
			btn1 = new JButton(new ImageIcon("IImg/2nd/button/Button3.PNG"));
			btn1.setBounds(655, 183, 127, 47);
			break;
		case 4:
			btn1 = new JButton(new ImageIcon("Img/2nd/button/Button4.PNG"));
			btn1.setBounds(500, 410, 44, 49);
			break;
		case 5:
			btn1 = new JButton(new ImageIcon("Img/2nd/button/Button5.PNG"));
			btn1.setBounds(981, 395, 198, 90);
			break;
		case 6:
		
		}

		btn1.setBorderPainted(false);
		btn1.setContentAreaFilled(false);
		btn1.setFocusPainted(false);
		btn1.setOpaque(false);

		btn1.setFocusPainted(true);

		return btn1;
	}

	public JButton exitCount(int check) {
		JButton btn1 = new JButton(new ImageIcon("Img/2nd/button/Count/0.PNG"));
		switch (check) {
		case 1:
			btn1.setBounds(0, 180, 200, 316);
			break;
		case 2:
			btn1.setBounds(220, 180, 200, 316);
			break;
		case 3:
			btn1.setBounds(440, 180, 200, 316);
			break;
		case 4:
			btn1.setBounds(660, 180, 200, 316);
			break;

		}

		btn1.setBorderPainted(false);
		btn1.setContentAreaFilled(false);
		btn1.setFocusPainted(false);
		btn1.setOpaque(false);

		btn1.setFocusPainted(true);

		return btn1;
	}

	public JButton Upcount(int a) {
		JButton btn1 = new JButton(
				new ImageIcon("Img/2nd/button/Count/" + String.valueOf(a) + ".PNG"));
		btn1.setBorderPainted(false);
		btn1.setContentAreaFilled(false);
		btn1.setFocusPainted(false);
		btn1.setOpaque(false);
		btn1.setBounds(660, 180, 200, 316);
		btn1.setFocusPainted(true);

		return btn1;
	}

	public JButton endButton() {
		JButton btn1 = new JButton(new ImageIcon("Img/2nd/button/endbutton.png"));
		btn1.setBorderPainted(false); // 테두리 없애기
		btn1.setContentAreaFilled(false);// 테두리배경없애기
		btn1.setFocusPainted(false);
		btn1.setOpaque(false);
		btn1.setFocusPainted(true);

		return btn1;
	}

}
