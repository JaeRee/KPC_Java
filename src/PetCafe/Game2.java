package PetCafe;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game2 extends JFrame {
	static Image bufferImage;
	static Graphics screenGraphic;
	static Image background = new ImageIcon("images/BG2.jpg").getImage();
	static Image dog = new ImageIcon("images/siba.png").getImage();
	static Image food = new ImageIcon("images/food.png").getImage();
	static Image icon = new ImageIcon("images/icon.png").getImage();
	static int dogX, dogY;	// 강아지 위치
	static int dogWidth = dog.getWidth(null);
	static int dogHeight = dog.getHeight(null);	// 강아지 가로, 세로 크기
	static int foodX, foodY;	// 개밥 위치
	static int foodWidth = food.getWidth(null);
	static int foodHeight = food.getHeight(null);	// 개밥 가로, 세로 크기
	static int score;	// 점수
	
	public boolean up, down, left, right;	// 키 눌림
	
	

	
	public Game2() {
		setTitle("강아지 산책");
		setVisible(true);
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("["+ currentThreadName + "]" + " thread starts here...");
		setBounds(0, 0, 1000, 700);
		//setSize(1000, 700);
		// setLocationRelativeTo(null);
		// setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(icon);
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_UP:
					up = true;
					break;
				case KeyEvent.VK_DOWN:
					down = true;
					break;
				case KeyEvent.VK_LEFT:
					left = true;
					break;
				case KeyEvent.VK_RIGHT:
					right = true;
					break;
				}
			}
			
			public void keyReleased(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_UP:
					up = false;
					break;
				case KeyEvent.VK_DOWN:
					down = false;
					break;
				case KeyEvent.VK_LEFT:
					left = false;
					break;
				case KeyEvent.VK_RIGHT:
					right = false;
					break;
				}
			}
		});	// 키보드 움직임 처리를 위한 키리스너 부착
		init();	// 게임 초기화
		
		while (true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			
			} catch(RuntimeException re) {
				System.out.println("!!!!!!["+ currentThreadName + "]" + " Caught Exception!!!");
			}
			keyProcess();
			crashCheck();
			
		} 
	}
	
	
	
	public void init() {
		score = 0;
		
		dogX = (1000 - dogWidth)/2;
		dogY = (700 - dogHeight)/2;
		
		foodX = (int)(Math.random()*(1001-dogWidth));
		foodY = (int)(Math.random()*(701-dogHeight-30))+30;	// 점수 초기화, 강아지와 개밥 위치 설정
		
	}
	
	public void keyProcess() {
		if (up && dogY - 3 > 30) dogY-=3;
		if (down && dogY + dogHeight + 3 < 700) dogY+=3;
		if (left && dogX - 3 > 0) dogX-=3;
		if (right && dogX + dogWidth + 3 < 1000) dogX+=3;
	}	// 강아지 움직임
	
	public void crashCheck() {
		if (dogX + dogWidth > foodX && foodX + foodWidth > dogX && dogY + dogHeight > foodY && foodY + foodHeight > dogY) {
			score+=100;
			foodX = (int)(Math.random()*(1001-dogWidth));
			foodY = (int)(Math.random()*(701-dogHeight-30))+30;
		}
	}	// 강아지와 개밥 충돌 체크
	
	
	public void paint(Graphics g) {
		bufferImage = createImage(1000, 700);
		screenGraphic = bufferImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(bufferImage, 0, 0, null);
	}	// 더블 버퍼링
	
	public void screenDraw(Graphics g) {
		g.drawImage(background, 0, 0, null);
		g.drawImage(food, foodX, foodY, null);
		g.drawImage(dog, dogX, dogY, null);
		g.setColor(Color.black);
		g.setFont(new Font("Serif", Font.BOLD, 30));
		g.drawString("산책 점수 : " + score, 700, 650);
		this.repaint();
	}
	

	
	




}