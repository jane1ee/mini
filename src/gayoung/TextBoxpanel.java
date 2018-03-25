package gayoung;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextBoxpanel {
	
	 // textarea 배경
	 Image textboxBg = new ImageIcon("img/textbox/textbox.png").getImage();
	 // 인트로 텍스트 박스
	 JTextArea storyConsol;
	 // 인트로 문구 배열
	 String[] intro;
	   
	 // 클릭할 때마다 카운트 : 한 줄씩 출력
	 int clickCnt = 0;
	 Image bgImg;
	 Image mouseImg;
	 Cursor mouse;
		
	   public TextBoxpanel() {
	      
	      
	      bgImg = new ImageIcon("img/5th/room/commonroomfull.jpg").getImage();
	      JPanel background = new JPanel() {
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

	      // 마우스 커서
	      Toolkit tk = Toolkit.getDefaultToolkit();
	      mouseImg = new ImageIcon("img/cursor/cursor.png").getImage();
	      Point point = new Point(0, 0);
	      mouse = tk.createCustomCursor(mouseImg, point, "wonder");
	      background.setCursor(mouse);
	      
	      // 인트로
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
	      Font commonFont = new Font("맑은 고딕", Font.BOLD, 30);
	      storyConsol.setForeground(Color.white);
	      storyConsol.setFont(commonFont);
	      storyConsol.setOpaque(true);
	      
	      
	      background.add(storyConsol);
	      new IntroThread().start();
	   }
	   

   // 인트로 쓰레드
   class IntroThread extends Thread {
      String storyLine = "";   // 한 줄씩 출력할 문자열 선언
      
      public void run() {
          intro = new String[3];
            {
               intro[0] = "\n     5번째 방...";
               intro[1] = "\n     제발 마지막 방이였으면 좋겠는데....";
               intro[2] = "\n     힘내보자..!";
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