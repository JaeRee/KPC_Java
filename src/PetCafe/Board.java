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
		TextArea ta; // ��� ���� �ִ� ���� ���� ��
		TextField tf; // �� �ٷ� �Է��� ��

	
	Board(String title){
		
		super(title);
		img = tk.getImage("images/qna.jpg");
		setIconImage(new ImageIcon("images/icon.png").getImage());				// �������̹���
		setLayout(null); // ������ ���̾ƿ� ������!
		
		Color Co1 = new Color(255,219,105); 
		
		b1 = new Button("���");
		b1.addActionListener(new EventChat());
		b1.setBounds(910,650,30,20);
		

		
		
		/************** TextArea ta �κ� ****************/
		ta = new TextArea(" ��԰� ���� �ð� ������ ����~ \n ���������� �ʹ� �Ϳ������\n", 4, 10);
		ta.setBounds(8, 550, 1000, 100);
		ta.setEditable(false); // ��Ȱ��
		ta.setBackground(Co1);

		
		/************** TextField tf �κ� ****************/
		tf = new TextField(""); // 1. �̺�Ʈ �ҽ�
		tf.setBounds(8, 650, 900, 20);
		tf.addActionListener(new EventChat()); // 2. �̺�Ʈ ������(������)

		
		
		
		
		/************** �����ӿ� ������Ʈ ���̱� ****************/
		add(ta); 
		add(tf); 
		add(b1);
		
		
		
		
		
		setBounds((screenSize.width)/2-500, (screenSize.height)/2-350, 1000, 700);
		setResizable(false); // ������ Ȯ��,��� �ȵ�!
		
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				dispose(); // �޸𸮿��� ����
			}
		});
		

		    
		
		//*********************************************************************  �º�����
		setVisible(true);			
		
	}
	
	
	// 3. �̺�Ʈ ó����
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
		
		// ������ �߾ӿ� �̹��� ��ġ�ϱ�
		g.drawImage(img, (getWidth()-imgW)/2, 
					     (this.getHeight()-imgH)/2, this);
		
	}

}
