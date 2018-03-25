package ImageMaking;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import khSecondProject.Run;
import main.DoorOpen;
import main.Opening;

public class MainFrameV1 extends JFrame implements MouseListener, MouseMotionListener {

	JFrame MainFrame = new JFrame();
	JFrame popupFrame = new JFrame();
	JLabel label = new JLabel();
	JFrame QuizFrame = new JFrame();
	JPanel QuizPanel = new JPanel();
	ButtonMaking bm = new ButtonMaking();
	QuizHandle quiz = new QuizHandle();
	JFrame endFrame = new JFrame();
	JScrollPane scrollPane;
	ImageIcon backImg = new ImageIcon("Img/2nd/Room/room2.jpg");
	JButton bt1 = new JButton();
	JButton bt2 = new JButton();
	JButton bt3 = new JButton();
	JButton bt4 = new JButton();
	JButton bt5 = new JButton();
	JButton hintBt = new JButton();
	int exitCount1 = 0;
	int exitCount2 = 0;
	int exitCount3 = 0;
	int exitCount4 = 0;

	JPanel background = new JPanel() {
		public void paintComponent(Graphics g) {

			g.drawImage(backImg.getImage(), 0, 0, null);
			setOpaque(false);
			super.paintComponent(g);
		}

	};

	public MainFrameV1() {
		introFrame();
		endFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		background = new JPanel() {
			public void paintComponent(Graphics g) {

				g.drawImage(backImg.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}

		};
		// TODO Auto-generated constructor stub
		background.setLayout(null);
		background.addMouseListener(this);
		background.addMouseMotionListener(this);

		QuizPanel.setLayout(null);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image img = tk.getImage("Img/cursor/cursor.png");
		Cursor my = tk.createCustomCursor(img, new Point(10, 10), "dinamic");
		background.setCursor(my);

		bt1 = bm.backgroundBtn(1);
		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				popup();
				new ClockThread().start();
				QuizFrames(1);

			}
		});
		bt2 = bm.backgroundBtn(2);
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				popup();
				new ClockThread().start();
				QuizFrames(2);

			}
		});

		bt3 = bm.backgroundBtn(3);
		bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				popup();
				new ClockThread().start();
				QuizFrames(3);

			}
		});
		bt4 = bm.backgroundBtn(4);
		bt4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				popup();
				new ClockThread().start();
				QuizFrames(4);

			}
		});
		bt5 = bm.backgroundBtn(5);
		bt5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				popup();
				new ClockThread().start();
				QuizExit();

			}
		});

		background.add(bt1);
		background.add(bt2);
		background.add(bt3);
		background.add(bt4);
		background.add(bt5);

		MainFrame.add(background);

		scrollPane = new JScrollPane(background);
		MainFrame.setContentPane(scrollPane);

		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainFrame.setSize(1280, 800);

		MainFrame.setLocationRelativeTo(null);
		MainFrame.setResizable(false);

		MainFrame.setIconImage(new ImageIcon("img/favicon.jpg").getImage());
		MainFrame.setVisible(true);

	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JButton getBt1() {
		return bt1;
	}

	public void setBt1(JButton bt1) {
		this.bt1 = bt1;
	}

	public JButton getBt2() {
		return bt2;
	}

	public void setBt2(JButton bt2) {
		this.bt2 = bt2;
	}

	public void popup() {

		// J다이얼로그 해보자
		popupFrame.setSize(542, 81);
		Image popupImg = new ImageIcon("img/popup/event.png").getImage().getScaledInstance(542, 81, 0);
		JLabel label = new JLabel(new ImageIcon(popupImg));
		popupFrame.add(label);
		popupFrame.setUndecorated(true); // 툴바지우기
		popupFrame.setLocationRelativeTo(null);
		popupFrame.setResizable(false);

		popupFrame.setVisible(true);

	}

	public void QuizFrames(int check) {
		QuizFrame.dispose();

		QuizPanel.setLayout(null);

		QuizFrame.setLayout(null);
		switch (check) {
		case 1:

			QuizPanel = quiz.Quiz1();
			QuizFrame.setSize(500, 400);

			break;
		case 2:
			QuizPanel = quiz.Quiz2();
			QuizFrame.setSize(550, 450);
			break;
		case 3:
			QuizPanel = quiz.Quiz3();
			QuizFrame.setSize(640, 420);
			break;
		case 4:
			QuizPanel = quiz.Quiz4();
			QuizFrame.setSize(590, 550);
			break;
		case 5:
			QuizExit();
			break;

		}

		QuizFrame.add(QuizPanel);
		scrollPane = new JScrollPane(QuizPanel);
		QuizFrame.setLocationRelativeTo(MainFrame);

		QuizFrame.setContentPane(scrollPane);

		QuizFrame.setResizable(false);
		QuizFrame.setUndecorated(true);

		QuizPanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				QuizFrame.dispose();
			}
		});

		// QuizFrame.setUndecorated(true);

	}

	public void QuizExit() {
		JButton endBt = new JButton();

		QuizFrame.dispose();
		QuizFrame = new JFrame();
		QuizFrame.setLayout(null);
		QuizFrame.setSize(879, 700);
		QuizFrame.setLocationRelativeTo(MainFrame);
		JLabel labelExit = quiz.QuizExited();
		JLabel labelCount1 = quiz.QuizCount(1);
		JLabel labelCount2 = quiz.QuizCount(2);
		JLabel labelCount3 = quiz.QuizCount(3);
		JLabel labelCount4 = quiz.QuizCount(4);
		JButton exitB1 = bm.endButton();
		JButton exitB2 = bm.endButton();
		JButton exitB3 = bm.endButton();
		JButton exitB4 = bm.endButton();
		exitB1.setBounds(0, 496, 200, 90);
		exitB2.setBounds(220, 496, 200, 90);
		exitB3.setBounds(440, 496, 200, 90);
		exitB4.setBounds(660, 496, 200, 90);

		QuizFrame.add(labelExit);
		QuizFrame.repaint();
		QuizFrame.add(labelCount1);

		QuizFrame.add(labelCount2);
		QuizFrame.add(labelCount3);
		QuizFrame.add(labelCount4);
		QuizFrame.add(exitB1);
		QuizFrame.add(exitB2);
		QuizFrame.add(exitB3);
		QuizFrame.add(exitB4);

		Toolkit tk = Toolkit.getDefaultToolkit();
		Image img = tk.getImage("img/cursor/cursor.png");
		Cursor my = tk.createCustomCursor(img, new Point(15, 15), "dinamic");

		exitB1.setCursor(my);
		exitB2.setCursor(my);
		exitB3.setCursor(my);
		exitB4.setCursor(my);

		exitB1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (exitCount1 == 10)
					exitCount1 = 0;
				Image popupImg = new ImageIcon("img/2nd/button/Count/"
						+ String.valueOf(exitCount1 = ++exitCount1 == 10 ? 0 : exitCount1) + ".PNG").getImage()
								.getScaledInstance(200, 316, 0);

				labelCount1.setIcon(new ImageIcon(popupImg));
				exitRoom(exitCount1, exitCount2, exitCount3, exitCount4);
			}

		});
		exitB2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (exitCount2 == 10)
					exitCount2 = 0;
				Image popupImg = new ImageIcon("img/2nd/button/Count/"
						+ String.valueOf(exitCount2 = ++exitCount2 == 10 ? 0 : exitCount2) + ".PNG").getImage()
								.getScaledInstance(200, 316, 0);

				labelCount2.setIcon(new ImageIcon(popupImg));
				exitRoom(exitCount1, exitCount2, exitCount3, exitCount4);
			}
		});
		exitB3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Image popupImg = new ImageIcon("img/2nd/button/Count/"
						+ String.valueOf(exitCount3 = ++exitCount3 == 10 ? 0 : exitCount3) + ".PNG").getImage()
								.getScaledInstance(200, 316, 0);

				labelCount3.setIcon(new ImageIcon(popupImg));
				exitRoom(exitCount1, exitCount2, exitCount3, exitCount4);
			}
		});

		exitB4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (exitCount2 == 10)
					exitCount2 = 0;
				Image popupImg = new ImageIcon("img/2nd/button/Count/"
						+ String.valueOf(exitCount4 = ++exitCount4 == 10 ? 0 : exitCount4) + ".PNG").getImage()
								.getScaledInstance(200, 316, 0);

				labelCount4.setIcon(new ImageIcon(popupImg));
				exitRoom(exitCount1, exitCount2, exitCount3, exitCount4);
			}
		});

		QuizFrame.setUndecorated(true);
	}

	public void exitRoom(int count1, int count2, int count3, int count4) {
		int check = 0;
		if (exitCount1 == 5 && exitCount2 == 5 && exitCount3 == 5 && exitCount4 == 5) {
			new endThread().start();
			check++;

		}
		if (check == 1) {
			MainFrame.dispose();

		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (QuizFrame.isShowing()) {
			QuizFrame.dispose();
		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	class ClockThread extends Thread {

		public void run() {
			try {
				Thread.sleep(1000);
				popupFrame.dispose();
				QuizFrame.setVisible(true);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	class endThread extends Thread {

		public void run() {
			try {
				endFrame();
				QuizFrame.dispose();
				Thread.sleep(6000);
				Run run = new Run();
				MainFrame.dispose();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public void introFrame() {

		Image img;
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("img/2nd/Room/introRoom.gif");

		background = new JPanel() {
			public void paint(Graphics g) {
				if (img == null)
					return;

				g.drawImage(img, 0, 0, this);
				setOpaque(false);
				super.paintComponent(g);
			}

		};
		MainFrame.add(background);
		scrollPane = new JScrollPane(background);
		MainFrame.add(scrollPane);

		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainFrame.setSize(1280, 800);

		MainFrame.setLocationRelativeTo(null);
		MainFrame.setResizable(false);

		MainFrame.setIconImage(new ImageIcon("img/favicon.jpg").getImage());
		MainFrame.setVisible(true);

	}

	public void endFrame() {
		DoorOpen door = new DoorOpen("2");
	}

	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		if (bt1.isFocusOwner() || bt2.isFocusOwner() || bt3.isFocusOwner() || bt4.isFocusOwner()
				|| bt5.isFocusOwner()) {
			Toolkit tk2 = Toolkit.getDefaultToolkit();
			Image img2 = tk2.getImage("img/cursor/check.png");
			Cursor my2 = tk2.createCustomCursor(img2, new Point(10, 10), "dinamic");

			bt1.setCursor(my2);
			bt2.setCursor(my2);
			bt3.setCursor(my2);
			bt4.setCursor(my2);
			bt5.setCursor(my2);
		}
	}

}
