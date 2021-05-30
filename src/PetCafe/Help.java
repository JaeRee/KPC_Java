package PetCafe;
import java.awt.*;
import java.awt.event.*;

public class Help extends Frame {
	Image img = null;
	
	Help(String title){
		super(title);
		
		// �������� ȭ�� �߾ӿ� ���̱�
		Toolkit tk = Toolkit.getDefaultToolkit(); 
		Dimension screenSize = tk.getScreenSize();
		setBounds((screenSize.width)/2-500, 
				(screenSize.height)/2-300, 1000, 600);
		
		img = tk.getImage("images/doge2.jpg");
		
		// �ݱ�x ��ư �̺�Ʈ ó��
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
