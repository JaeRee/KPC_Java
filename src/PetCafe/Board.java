package PetCafe;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Board extends Frame {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		Image img;
		Font f1 = new Font("Serif", Font.BOLD, 16);
		
		Button b1;
		TextArea ta; // 행과 열이 있는 내용 많을 때
		TextField tf; // 한 줄로 입력할 때

	
	Board(String title){
		
		super(title);
		img = tk.getImage("images/qna.jpg");
		setIconImage(new ImageIcon("images/icon.png").getImage());				// 아이콘이미지
		setLayout(null); // 프레임 레이아웃 사용안함!
		
		Color Co1 = new Color(255,219,105); 
		
		b1 = new Button("등록");
		b1.addActionListener(new EventChat());
		b1.setBounds(910,650,30,20);
		

		
		
		/************** TextArea ta 부분 ****************/
		ta = new TextArea(" 재밋고 좋은 시간 보내고 가요~ \n 강아지들이 너무 귀여워요ㅠ\n", 4, 10);
		ta.setBounds(8, 550, 1000, 100);
		ta.setEditable(false); // 비활성
		ta.setBackground(Co1);

		
		/************** TextField tf 부분 ****************/
		tf = new TextField(""); // 1. 이벤트 소스
		tf.setBounds(8, 650, 900, 20);
		tf.addActionListener(new EventChat()); // 2. 이벤트 리스너(감지기)

		
		
		
		
		/************** 프레임에 컨포넌트 붙이기 ****************/
		add(ta); 
		add(tf); 
		add(b1);
		
		
		
		
		
		setBounds((screenSize.width)/2-500, (screenSize.height)/2-350, 1000, 700);
		setResizable(false); // 프레임 확대,축소 안됨!
		
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				dispose(); // 메모리에서 제거
			}
		});
		

		    
		
		//*********************************************************************  셋비져블
		setVisible(true);			
		
	}
	
	
	// 3. 이벤트 처리기
	class EventChat implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ta.append(tf.getText() + "\n");
			tf.requestFocus(); 
			tf.selectAll();
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
