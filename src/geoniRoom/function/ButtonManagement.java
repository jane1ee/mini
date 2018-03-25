package geoniRoom.function;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ButtonManagement {
	JButton button;

	
	
	public ButtonManagement(){}
	
	public JButton clockButton(){
		button = new JButton((new ImageIcon("img/4th/button/clockButton.png")));
		button.setBorderPainted(false); // 외각선을 없애준다
		button.setContentAreaFilled(false); // 내용영역 채우기 않함
		button.setFocusPainted(false); // 선택 되었을때 생기는 테두리 사용여부
		button.setBounds(950, 240, 67, 59);  // 시계 버튼 사이즈 및 위치
		button.setVisible(true);

		return button;
	}
	
	public JButton frameButton(){
		button = new JButton((new ImageIcon("img/4th/button/frameButton.png")));
		button.setBorderPainted(false); // 외각선을 없애준다
		button.setContentAreaFilled(false); // 내용영역 채우기 않함
		button.setFocusPainted(false); // 선택 되었을때 생기는 테두리 사용여부
		button.setBounds(278, 150, 228, 206);  // 액자 버튼 사이즈 및 위치
		
		return button;
		
	}
	
	public JButton lightButton(){
		button = new JButton((new ImageIcon("img/4th/button/lightButton.png")));
		button.setBorderPainted(false); // 외각선을 없애준다
		button.setContentAreaFilled(false); // 내용영역 채우기 않함
		button.setFocusPainted(false); // 선택 되었을때 생기는 테두리 사용여부
		button.setBounds(728,236, 56, 65);  // 전등 버튼 사이즈 및 위치
		
		return button;
		
	}
	
	public JButton vaseButton(){
		button = new JButton((new ImageIcon("img/4th/button/vaseButton.png")));
		button.setBorderPainted(false); // 외각선을 없애준다
		button.setContentAreaFilled(false); // 내용영역 채우기 않함
		button.setFocusPainted(false); // 선택 되었을때 생기는 테두리 사용여부
		button.setBounds(663 , 363, 42, 44);  // 꽃병 버튼 사이즈 및 위치
		
		return button;
	}
	public JButton hintVisualize(){
		button = new JButton((new ImageIcon("img/4th/button/hintVisualize.jpg")));
		button.setBorderPainted(false); // 외각선을 없애준다
		button.setContentAreaFilled(false); // 내용영역 채우기 않함
		button.setFocusPainted(false); // 선택 되었을때 생기는 테두리 사용여부
		button.setBounds(945 , 350,81, 69);  // 힌트 보이게하는 버튼 사이즈 및 위치
		
		return button;
	}
	
	public JButton hintButton(){
		button = new JButton((new ImageIcon("img/4th/button/hintButton.png")));
		button.setBorderPainted(false); // 외각선을 없애준다
		button.setContentAreaFilled(false); // 내용영역 채우기 않함
		button.setFocusPainted(false); // 선택 되었을때 생기는 테두리 사용여부
		button.setBounds(800 , 580, 150, 182);  // 힌트 보이게하는 버튼 사이즈 및 위치
		
		return button;
	}
	
	public JButton clockHintButton(){
<<<<<<< HEAD
		button = new JButton((new ImageIcon("img/4th/button/hintButton/clock.png")));
=======
		button = new JButton((new ImageIcon("img/button/hintButton/clock.png")));
>>>>>>> 00b55bac3390127d8524e0fb28b27d91ba2504d9
		button.setBorderPainted(false); // 외각선을 없애준다
		button.setContentAreaFilled(false); // 내용영역 채우기 않함
		button.setFocusPainted(false); // 선택 되었을때 생기는 테두리 사용여부
		button.setBounds(0 , 0,100, 100);  // 시계 버튼 사이즈 및 위치
		
		return button;
	}
	
	public JButton frameHintButton(){
<<<<<<< HEAD
		button = new JButton((new ImageIcon("img/4th/button/hintButton/frame.png")));
=======
		button = new JButton((new ImageIcon("img/button/hintButton/frame.png")));
>>>>>>> 00b55bac3390127d8524e0fb28b27d91ba2504d9
		button.setBorderPainted(false); // 외각선을 없애준다
		button.setContentAreaFilled(false); // 내용영역 채우기 않함
		button.setFocusPainted(false); // 선택 되었을때 생기는 테두리 사용여부
		button.setBounds(100 ,0 ,100, 100);  // 액자 버튼 사이즈 및 위치
		
		return button;
	}
	
	public JButton lightHintButton(){
<<<<<<< HEAD
		button = new JButton((new ImageIcon("img/4th/button/hintButton/light.png")));
=======
		button = new JButton((new ImageIcon("img/button/hintButton/light.png")));
>>>>>>> 00b55bac3390127d8524e0fb28b27d91ba2504d9
		button.setBorderPainted(false); // 외각선을 없애준다
		button.setContentAreaFilled(false); // 내용영역 채우기 않함
		button.setFocusPainted(false); // 선택 되었을때 생기는 테두리 사용여부
		button.setBounds(200 , 0,100, 100);  // 전등 버튼 사이즈 및 위치
		
		return button;
	}
	
	public JButton vaseHintButton(){
<<<<<<< HEAD
		button = new JButton((new ImageIcon("img/4th/button/hintButton/vase.png")));
=======
		button = new JButton((new ImageIcon("img/button/hintButton/vase.png")));
>>>>>>> 00b55bac3390127d8524e0fb28b27d91ba2504d9
		button.setBorderPainted(false); // 외각선을 없애준다
		button.setContentAreaFilled(false); // 내용영역 채우기 않함
		button.setFocusPainted(false); // 선택 되었을때 생기는 테두리 사용여부
		button.setBounds(300 ,0,100, 100);  // 꽃병 버튼 사이즈 및 위치
		
		return button;
	}
	public JButton countUpButton(){
<<<<<<< HEAD
		JButton countUpButton = new JButton(new ImageIcon("img/4th/finish/upImage.png"));
=======
		JButton countUpButton = new JButton(new ImageIcon("img/finish/upImage.png"));
>>>>>>> 00b55bac3390127d8524e0fb28b27d91ba2504d9
		countUpButton.setBorderPainted(false);
		countUpButton.setContentAreaFilled(false);
		countUpButton.setFocusPainted(false);
	
		return countUpButton;
		
	}
	
	public JButton exitButton(){
<<<<<<< HEAD
		button = new JButton(new ImageIcon("img/4th/button/enter.png"));
=======
		button = new JButton(new ImageIcon("img/button/enter.png"));
>>>>>>> 00b55bac3390127d8524e0fb28b27d91ba2504d9
		button.setBorderPainted(false); // 외각선을 없애준다
		button.setContentAreaFilled(false); // 내용영역 채우기 않함
		button.setFocusPainted(false); // 선택 되었을때 생기는 테두리 사용여부
		button.setBounds(15 ,100,55, 55);  // 탈출 버튼 사이즈 및 위치
		
		return button;
	}
	public JButton exitDoor(){
<<<<<<< HEAD
		button = new JButton(new ImageIcon("img/4th/button/exitDoorButton.png"));
=======
		button = new JButton(new ImageIcon("img/button/exitDoorButton.png"));
>>>>>>> 00b55bac3390127d8524e0fb28b27d91ba2504d9
		button.setBorderPainted(false); // 외각선을 없애준다
		button.setContentAreaFilled(false); // 내용영역 채우기 않함
		button.setFocusPainted(false); // 선택 되었을때 생기는 테두리 사용여부
		button.setBounds(545 ,190,110, 394);  // 탈출 버튼 사이즈 및 위치
		
		return button;
	}
	
	public JButton finishExitButton(){
<<<<<<< HEAD
		button = new JButton(new ImageIcon("img/4th/button/exit.png"));
=======
		button = new JButton(new ImageIcon("img/button/exit.png"));
>>>>>>> 00b55bac3390127d8524e0fb28b27d91ba2504d9
		button.setBorderPainted(false); // 외각선을 없애준다
		button.setContentAreaFilled(false); // 내용영역 채우기 않함
		button.setFocusPainted(false); // 선택 되었을때 생기는 테두리 사용여부
		button.setBounds(435 ,100,55, 55);  // 탈출 버튼 사이즈 및 위치
		
		return button;
	}
	
}
