package PetCafe;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CafeOrder extends Frame {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		Image img;

	   Checkbox cb1,cb2,cb3,cb4,cb5,cb6,cb7, cb8, cb9;
	   CheckboxGroup group1, group2, group3;
	   Label L1, L2, L3, L4;
	   Panel p1, p2, p3;
	   Button ok;
	   int coffee_money, size_money=0;
	   
		Font f1 = new Font("Serif", Font.BOLD, 20);
		Font f2 = new Font("Serif", Font.BOLD, 19);
	
	CafeOrder(String title){
		
		super(title);
		img = tk.getImage("images/f2.jpg");
		setIconImage(new ImageIcon("images/icon.png").getImage());				// �������̹���

		
		
		
		//***********************************************************************************  �������� ȭ�� �߾ӿ� ���̱�

		setBounds((screenSize.width)/2-500, (screenSize.height)/2-350, 1000, 700);
		setLayout(null); // ������ ���̾ƿ� ������!
		setResizable(false); // ������ Ȯ��,��� �ȵ�!
		
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				dispose(); // �޸𸮿��� ����
			}
		});
		
		
		
		//********************************************************************************   Checkbox1 (Ŀ�Ǽ���)
		   group1 = new CheckboxGroup(); 
		   cb1 = new Checkbox("�Ƹ޸�ī��(1000��)",group1, false);
		   cb2 = new Checkbox("ī���(1500��)",group1, false);
		   cb3 = new Checkbox("īǪġ��(2000��)",group1, false);
		   
		   
		   //********************************************************************************  Checkbox2 (�������)
		   group2 = new CheckboxGroup(); 
		   cb4 = new Checkbox("Small(+0��)",group2, false);
		   cb5 = new Checkbox("Medium(+500��)",group2, false);
		   cb6 = new Checkbox("Large(+1000��)",group2, false);
		   
		   //********************************************************************************  Checkbox2 (�������)
		   group3 = new CheckboxGroup(); 
		   cb7 = new Checkbox("������ ����(+1000",group3, false);
		   cb8 = new Checkbox("����� ����(+1000",group3, false);
		   cb9 = new Checkbox("�峭��		(+1000",group3, false);
		   
		    
		   //********************************************************************************    p1  (Ŀ�Ǽ���)
		   
	      p1 = new Panel();
	      p1.setLayout(new GridLayout(4,1));
	      p1.setBackground(Color.pink);
	      p1.setForeground(Color.black);
	      p1.setBounds(170,120,170,280);
	      
		   
		   //********************************************************************************   p2  (�������)
		   
	      p2 = new Panel();
	      p2.setLayout(new GridLayout(4,1));
	      p2.setBackground(Color.pink);
	      p2.setForeground(Color.black);
	      p2.setBounds(400,120,170,280);
	      
		   //********************************************************************************   p2  (�������)
		   
	      p3 = new Panel();
	      p3.setLayout(new GridLayout(4,1));
	      p3.setBackground(Color.pink);
	      p3.setForeground(Color.black);
	      p3.setBounds(630,120,170,280);

	      
	      
	      //*******************************************************************************   Label L1 �κ�  //
	      L1 = new Label();
	      L1.setBounds(30,80,150,50);
	      L1.setBackground(new Color(158,73,66));
	      L1.setAlignment(Label.CENTER);
	      L1.setText("Ŀ�� ����");
	      L1.setFont(f1);
	      
	      
	      L2 = new Label();
	      L2.setBounds(30,80,150,50);
	      L2.setBackground(new Color(158,73,66));
	      L2.setAlignment(Label.CENTER);
	      L2.setText("������ ����");
	      L2.setFont(f1);
	      
	      L3 = new Label();
	      L3.setBounds(30,80,150,50);
	      L3.setBackground(new Color(158,73,66));
	      L3.setAlignment(Label.CENTER);
	      L3.setText("���� ����");
	      L3.setFont(f1);
	      

	      
		   //**************************************************************** ��� ok��ư
		   ok = new Button("����ϱ�");
		   ok.setBounds(300, 430, 350, 70);
		   ok.setBackground(new Color(158,73,66));
		   ok.setFont(f1);
		   
		   ok.addActionListener(new EventF()); 		
		   
		   
		   //**************************************************************** �����Ͻ� Ŀ�Ǵ� ���
		   L4 = new Label();
		   L4.setBounds(300,530,350,70);
		   L4.setBackground(new Color(57,57,57));
		   L4.setAlignment(Label.CENTER);
		   
		   
		    
		 //*******************************************************************  �����Ͻ� Ŀ�Ǵ� ���

		   
			

		    
		    
		    p1.add(L1); p1.add(cb1);p1.add(cb2);p1.add(cb3);
		    p2.add(L2); p2.add(cb4); p2.add(cb5); p2.add(cb6);
		    p3.add(L3); p3.add(cb7); p3.add(cb8); p3.add(cb9);
		    add(ok); add(L4); 
		   add(p1); add(p2); add(p3);
		
		
	
		
		//*********************************************************************  �º�����
		setVisible(true);			
	}
	
	
	
	
	
	class EventF implements ActionListener{

		   public void actionPerformed(ActionEvent e) {
				
			if(cb1.getState()) {
				coffee_money+=1000;
			}else if(cb2.getState()) {
				coffee_money+=1500;
			}else if(cb3.getState()) {
				coffee_money+=2000;
			}
			
			if(cb4.getState()) {
				size_money+=0;
			}else if(cb5.getState()) {
				size_money+=500;
			}else if(cb6.getState()) {
				size_money+=1000;
			}
			
			
			L4.setText(coffee_money+size_money+"�� �Դϴ�.");
			L4.setForeground(Color.white);
			L4.setFont(f1);
			coffee_money=0; 
			size_money=0;
		
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
