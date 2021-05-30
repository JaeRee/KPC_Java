package PetCafe;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AnimalShow extends Frame {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		Image img, dog1, dog2, dog3;
		Button b1, b2, b3;
		TextArea ta;
		Label L1;
		Canvas c1;
		Font f1 = new Font("Serif", Font.BOLD, 16);


	
	AnimalShow(String title){
		
		super(title);
		img = tk.getImage("images/f3.jpg");
		setIconImage(new ImageIcon("images/icon.png").getImage());				// 아이콘이미지
		
		
		//***********************************************************************************  캔버스 
		
		c1 = new Canvas() {
			public void paint(Graphics g) {
				g.drawImage(img, 0, 0, this);
			}
		};
		
		c1.setBackground(Color.pink);
		c1.setBounds(100, 130, 280, 300);
		
		
		
		
		
		//***********************************************************************************  텍스트
		
		ta = new TextArea("", 5, 10, TextArea.SCROLLBARS_NONE);
		ta.setBounds(380, 130, 350, 300);
		ta.setEditable(false);
		ta.setFont(f1);
		ta.setForeground(new Color(75,75,75));
		
		
		
		
		//***********************************************************************************  버튼
		
		
	      b1 = new Button("몽룡");
	      b1.setFont(f1);
	      b1.setBounds(800, 150,80,50);
	      b1.setBackground(new Color(57, 57, 57));
	      b1.setForeground(Color.white);
	      b1.addActionListener(new EventCanvas());
	        
	      
	      b2 = new Button("누리");
	      b2.setFont(f1);
	      b2.setBounds(800, 250,80,50);
	      b2.setBackground(new Color(57, 57, 57));
	      b2.setForeground(Color.white);
	      b2.addActionListener(new EventCanvas());
	      
	      b3 = new Button("모카");
	      b3.setFont(f1);
	      b3.setBounds(800, 350,80,50);
	      b3.setBackground(new Color(57, 57, 57));
	      b3.setForeground(Color.white);
	      b3.addActionListener(new EventCanvas());
	      
			//***********************************************************************************  라벨
	      
		   L1 = new Label("이름을 클릭해보세요~");
		   L1.setFont(new Font("Serif", Font.BOLD, 20));
		   L1.setBounds(300,500,350,70);
		   L1.setForeground(Color.white);
		   L1.setBackground(new Color(57,57,57));
		   L1.setAlignment(Label.CENTER);
		
		
		   
		   
		//****************** 프레임에 컴포넌트, 컨테이너 붙이기 ************
		add(c1); add(ta);
		add(b1); add(b2); add(b3);
		add(L1);
		
		
		//***********************************************************************************  프레임을 화면 중앙에 보이기

		setBounds((screenSize.width)/2-500, (screenSize.height)/2-350, 1000, 700);
		setLayout(null); // 프레임 레이아웃 사용안함!
		setResizable(false); // 프레임 확대,축소 안됨!
		
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				dispose(); // 메모리에서 제거
			}
		});
		

		    
		
		//*********************************************************************  셋비져블
		setVisible(true);			
		
	}
	
	
	
	// 내부클래스 
	class EventCanvas implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			Button b = (Button)e.getSource();
			
			int r = (int)(Math.random()*3);	//0,1,2
			String imgArr[] = {"images/dog1.jpg", "images/dog2.jpg", "images/dog3.jpg"};
			
			
			
			
			if(b.getLabel() == "몽룡") {
				img = tk.getImage(imgArr[0]);
				ta.setText("\n\n\n 이름 : 몽룡 (1)  \n\n"
						+ " 성별 : 남아♂  \n\n"
						+ " 견종 : 골든리트리버 \n\n\n"
						+ " 사람을 잘 따르며, 성격이 온순하고 활발한 아이예요."
						+ " ");
				c1.repaint();
				
			}else if(b.getLabel() == "누리") {
				img = tk.getImage(imgArr[1]);
				ta.setText("\n\n\n 이름 : 누리 (1)  \n\n"
						+ " 성별 : 여아♀  \n\n"
						+ " 견종 : 웰시코기 \n\n\n"
						+ " 사람을 잘 따르며, 애교가 많아요."
						+ " ");
				c1.repaint();
				
			}else if(b.getLabel() == "모카") {
				img = tk.getImage(imgArr[2]);
				ta.setText("\n\n\n 이름 : 모카 (1)  \n\n"
						+ " 성별 : 남아♂  \n\n"
						+ " 견종 : 토이푸들 \n\n\n"
						+ " 사람을 잘 따르며, 성격이 온순하고 활발한 아이예요."
						+ " ");
				c1.repaint();
			}else {
				img = tk.getImage(imgArr[r]);
				c1.repaint();
			}
		
		}
	}
	
	
	public void paint(Graphics g){
		int imgW = img.getWidth(this);
		int imgH = img.getHeight(this);
		
		// 프레임 중앙에 이미지 배치하기
		g.drawImage(img, (getWidth()-imgW)/2, 
					     (this.getHeight()-imgH)/2, this);
		
	}

}
