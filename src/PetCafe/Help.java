package PetCafe;
import java.awt.*;
import java.awt.event.*;

public class Help extends Frame {
	Image img = null;
	
	Help(String title){
		super(title);
		
		// 프레임을 화면 중앙에 보이기
		Toolkit tk = Toolkit.getDefaultToolkit(); 
		Dimension screenSize = tk.getScreenSize();
		setBounds((screenSize.width)/2-500, 
				(screenSize.height)/2-300, 1000, 600);
		
		img = tk.getImage("images/doge2.jpg");
		
		// 닫기x 버튼 이벤트 처리
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				dispose();
			}
		});
		
		setVisible(true);
	}
	
	public void paint(Graphics g){
		int imgWidth, imgHeight;		
		if(img == null) {
			return;
		}	
		imgWidth = img.getWidth(this);
		imgHeight = img.getHeight(this);
		
		g.drawImage(img, 0, 0, this);
	}

}
