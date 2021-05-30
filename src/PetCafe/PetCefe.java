package PetCafe;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PetCefe extends Frame {
	Toolkit tk = Toolkit.getDefaultToolkit(); 
	Dimension screenSize = tk.getScreenSize();
	Image img;
	Canvas c1;

	PetCefe(String title){
		super(title);
		
		img = tk.getImage("images/f.jpg");											// 배경이미지
		setIconImage(new ImageIcon("images/icon.png").getImage());				// 아이콘이미지
		
	
		// 프레임을 화면 중앙에 보이기
		setBounds((screenSize.width)/2-500, 
				  (screenSize.height)/2-350, 1000, 700);
		setLayout(null);
		setResizable(false); // 프레임 확대,축소 안됨!
		
		// 닫기X 버튼 이벤트 처리
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				System.exit(0); // 프로그램 종료
			}
		});
		
		/*********************************  메뉴 부분 **********************************************/
		MenuBar mb = new MenuBar();
		
		Menu mFile = new Menu(" 카페 둘러보기 ");
		MenuItem miOpen = new MenuItem("메인");
		MenuItem miOpen1 = new MenuItem("음료");
		MenuItem miOpen2 = new MenuItem("놀이터");
		MenuItem miExit = new MenuItem("카페 나가기");
		mFile.add(miOpen); 	mFile.add(miOpen1); 	mFile.add(miOpen2);
		mFile.addSeparator(); // 수평선 추가
		mFile.add(miExit);
		
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0); // 프로그램 종료
			}
		});
		
		miOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repaint();
				img = tk.getImage("images/f1.jpg");	
			}
		});
		
		miOpen1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repaint();
				img = tk.getImage("images/f2.jpg");	
			}
		});
		
		miOpen2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repaint();
				img = tk.getImage("images/f3.jpg");	
			}
		});
		
		
/*****************************************************  메뉴1 **********************************************/		
		
		Menu mEvent1 = new Menu(" 주문하기 ");
		MenuItem mEvent1_1 = new MenuItem("음료");
		MenuItem mEvent1_2 = new MenuItem("간식");
		mEvent1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CafeOrder("음료 주문하기"); 
			}
		});
		mEvent1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CafeOrder("간식 주문하기"); 
			}
		});
		mEvent1.add(mEvent1_1);
		mEvent1.add(mEvent1_2);
		
		
		
		
/*****************************************************  메뉴2 **********************************************/			
		
		Menu mEvent2 = new Menu(" 애견 구경가기 ");
		MenuItem mEvent2_1 = new MenuItem("강아지");
		MenuItem mEvent2_2 = new MenuItem("고양이");
		mEvent2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AnimalShow("강아지"); // 프로그램 종료
			}
		});
		mEvent2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AnimalShow("고양이"); // 프로그램 종료
			}
		});
		mEvent2.add(mEvent2_1);
		mEvent2.add(mEvent2_2);
		
		
		
		
/*****************************************************  메뉴3 **********************************************/		
		
		Menu mEvent3 = new Menu(" 게시판 ");
		MenuItem mEvent3_1 = new MenuItem("리뷰 남기기");
		mEvent3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Board("리뷰 남기기"); // 프로그램 종료
			}
		});
		
		MenuItem mEvent3_2 = new MenuItem("질문사항");
		mEvent3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Board("질문사항");
			}
		});
		
		mEvent3.add(mEvent3_1);
		mEvent3.add(mEvent3_2);
		
		
/*****************************************************  메뉴3 **********************************************/		
		
		Menu mEvent4 = new Menu(" 산책 ");
		MenuItem mEvent4_1 = new MenuItem("강아지 산책게임");
		mEvent4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Game2(); 
			}
		});
		
		mEvent4.add(mEvent4_1);
		
		
		
		
		
		
		
		
		
		Menu mHelp = new Menu("도움말");
		MenuItem miHelp = new MenuItem("프로그램 설명");
		miHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Help("JH Park _ Programing");
			}
		});
		
		mHelp.add(miHelp);
		

		
		/*********** 메뉴바 mb에 메뉴 붙이는 부분 *************/
		mb.add(mFile);
		mb.add(mEvent1);
		mb.add(mEvent2);
		mb.add(mEvent3);
		mb.add(mEvent4);
		mb.add(mHelp);
		
		
		/*********** 메인 라벨 *************/

		/*********** 프레임에 컨포넌트 붙이는 부분 *************/
		setMenuBar(mb); // 프레임에 메뉴바 붙이기
		
		setVisible(true);	
	}
	
	public void paint(Graphics g){
		int imgW = img.getWidth(this);
		int imgH = img.getHeight(this);
		
		// 프레임 중앙에 이미지 배치하기
		g.drawImage(img, (getWidth()-imgW)/2, 
					     (this.getHeight()-imgH)/2, this);
	}
	

	public static void main(String[] args) {
		new PetCefe("Pet Cafe");
	}
}




