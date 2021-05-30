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
		setIconImage(new ImageIcon("images/icon.png").getImage());				// �������̹���
		
		
		//***********************************************************************************  ĵ���� 
		
		c1 = new Canvas() {
			public void paint(Graphics g) {
				g.drawImage(img, 0, 0, this);
			}
		};
		
		c1.setBackground(Color.pink);
		c1.setBounds(100, 130, 280, 300);
		
		
		
		
		
		//***********************************************************************************  �ؽ�Ʈ
		
		ta = new TextArea("", 5, 10, TextArea.SCROLLBARS_NONE);
		ta.setBounds(380, 130, 350, 300);
		ta.setEditable(false);
		ta.setFont(f1);
		ta.setForeground(new Color(75,75,75));
		
		
		
		
		//***********************************************************************************  ��ư
		
		
	      b1 = new Button("����");
	      b1.setFont(f1);
	      b1.setBounds(800, 150,80,50);
	      b1.setBackground(new Color(57, 57, 57));
	      b1.setForeground(Color.white);
	      b1.addActionListener(new EventCanvas());
	        
	      
	      b2 = new Button("����");
	      b2.setFont(f1);
	      b2.setBounds(800, 250,80,50);
	      b2.setBackground(new Color(57, 57, 57));
	      b2.setForeground(Color.white);
	      b2.addActionListener(new EventCanvas());
	      
	      b3 = new Button("��ī");
	      b3.setFont(f1);
	      b3.setBounds(800, 350,80,50);
	      b3.setBackground(new Color(57, 57, 57));
	      b3.setForeground(Color.white);
	      b3.addActionListener(new EventCanvas());
	      
			//***********************************************************************************  ��
	      
		   L1 = new Label("�̸��� Ŭ���غ�����~");
		   L1.setFont(new Font("Serif", Font.BOLD, 20));
		   L1.setBounds(300,500,350,70);
		   L1.setForeground(Color.white);
		   L1.setBackground(new Color(57,57,57));
		   L1.setAlignment(Label.CENTER);
		
		
		   
		   
		//****************** �����ӿ� ������Ʈ, �����̳� ���̱� ************
		add(c1); add(ta);
		add(b1); add(b2); add(b3);
		add(L1);
		
		
		//***********************************************************************************  �������� ȭ�� �߾ӿ� ���̱�

		setBounds((screenSize.width)/2-500, (screenSize.height)/2-350, 1000, 700);
		setLayout(null); // ������ ���̾ƿ� ������!
		setResizable(false); // ������ Ȯ��,��� �ȵ�!
		
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				dispose(); // �޸𸮿��� ����
			}
		});
		

		    
		
		//*********************************************************************  �º�����
		setVisible(true);			
		
	}
	
	
	
	// ����Ŭ���� 
	class EventCanvas implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			Button b = (Button)e.getSource();
			
			int r = (int)(Math.random()*3);	//0,1,2
			String imgArr[] = {"images/dog1.jpg", "images/dog2.jpg", "images/dog3.jpg"};
			
			
			
			
			if(b.getLabel() == "����") {
				img = tk.getImage(imgArr[0]);
				ta.setText("\n\n\n �̸� : ���� (1)  \n\n"
						+ " ���� : ���ơ�  \n\n"
						+ " ���� : ��縮Ʈ���� \n\n\n"
						+ " ����� �� ������, ������ �¼��ϰ� Ȱ���� ���̿���."
						+ " ");
				c1.repaint();
				
			}else if(b.getLabel() == "����") {
				img = tk.getImage(imgArr[1]);
				ta.setText("\n\n\n �̸� : ���� (1)  \n\n"
						+ " ���� : ���ơ�  \n\n"
						+ " ���� : �����ڱ� \n\n\n"
						+ " ����� �� ������, �ֱ��� ���ƿ�."
						+ " ");
				c1.repaint();
				
			}else if(b.getLabel() == "��ī") {
				img = tk.getImage(imgArr[2]);
				ta.setText("\n\n\n �̸� : ��ī (1)  \n\n"
						+ " ���� : ���ơ�  \n\n"
						+ " ���� : ����Ǫ�� \n\n\n"
						+ " ����� �� ������, ������ �¼��ϰ� Ȱ���� ���̿���."
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
		
		// ������ �߾ӿ� �̹��� ��ġ�ϱ�
		g.drawImage(img, (getWidth()-imgW)/2, 
					     (this.getHeight()-imgH)/2, this);
		
	}

}
