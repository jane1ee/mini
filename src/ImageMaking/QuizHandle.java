package ImageMaking;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class QuizHandle extends JFrame implements MouseListener {

	ButtonMaking bm = new ButtonMaking();
	JScrollPane scrollPane;
	JFrame frame = new JFrame();
	JFrame exFrame = new JFrame();
	int count = 0;

	public QuizHandle() {

	}

	public JPanel Quiz1() {

		ImageIcon icon = new ImageIcon("img/2nd/Quiz/Quiz1.PNG");
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {

				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}

		};

		return background;

	}

	public JPanel Quiz2() {

		ImageIcon icon = new ImageIcon("img/2nd/Quiz/Quiz2.PNG");
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {

				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}

		};

		return background;

	}

	public JPanel Quiz3() {

		ImageIcon icon = new ImageIcon("img/2nd/Quiz/Quiz3.PNG");
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {

				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}

		};

		return background;

	}

	public JPanel Quiz4() {

		ImageIcon icon = new ImageIcon("img/2nd/Quiz/Quiz4.PNG");
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {

				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}

		};

		return background;

	}

	public JPanel QuizExit() {
		ImageIcon icon = new ImageIcon("img/2nd/Quiz/Quiz5.PNG");
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {

				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}

		};

		return background;

	}

	public JLabel QuizCount(int a) {
		Image popupImg = new ImageIcon("img/2nd/button/Count/0.PNG").getImage()
				.getScaledInstance(200, 316, 0);

		JLabel label = new JLabel(new ImageIcon(popupImg));
		switch (a) {
		case 1:
			label.setBounds(0, 180, 200, 316);
			break;
		case 2:
			label.setBounds(220, 180, 200, 316);
			break;
		case 3:
			label.setBounds(440, 180, 200, 316);
			break;
		case 4:
			label.setBounds(660, 180, 200, 316);
			break;
			
		}
		return label;
	}
	public JLabel QuizCountUp(int a) {
		Image popupImg = new ImageIcon("img/2nd/button/Count/"+String.valueOf(a)+".PNG").getImage()
				.getScaledInstance(200, 316, 0);

		JLabel label = new JLabel(new ImageIcon(popupImg));
		switch (a) {
		case 1:
			label.setBounds(0, 180, 200, 316);
			break;
		case 2:
			label.setBounds(220, 180, 200, 316);
			break;
		case 3:
			label.setBounds(440, 180, 200, 316);
			break;
		case 4:
			label.setBounds(680, 180, 200, 316);
			break;
			
		}
		return label;
	}

	public JLabel QuizExited() {
		Image popupImg = new ImageIcon("img/2nd/Quiz/Quiz5.png").getImage()
				.getScaledInstance(879, 174, 0);

		JLabel label = new JLabel(new ImageIcon(popupImg));
		label.setBounds(10, 10, 879, 174);

		return label;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
