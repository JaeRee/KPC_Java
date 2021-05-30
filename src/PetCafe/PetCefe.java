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
		
		img = tk.getImage("images/f.jpg");											// ����̹���
		setIconImage(new ImageIcon("images/icon.png").getImage());				// �������̹���
		
	
		// �������� ȭ�� �߾ӿ� ���̱�
		setBounds((screenSize.width)/2-500, 
				  (screenSize.height)/2-350, 1000, 700);
		setLayout(null);
		setResizable(false); // ������ Ȯ��,��� �ȵ�!
		
		// �ݱ�X ��ư �̺�Ʈ ó��
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				System.exit(0); // ���α׷� ����
			}
		});
		
		/*********************************  �޴� �κ� **********************************************/
		MenuBar mb = new MenuBar();
		
		Menu mFile = new Menu(" ī�� �ѷ����� ");
		MenuItem miOpen = new MenuItem("����");
		MenuItem miOpen1 = new MenuItem("����");
		MenuItem miOpen2 = new MenuItem("������");
		MenuItem miExit = new MenuItem("ī�� ������");
		mFile.add(miOpen); 	mFile.add(miOpen1); 	mFile.add(miOpen2);
		mFile.addSeparator(); // ���� �߰�
		mFile.add(miExit);
		
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0); // ���α׷� ����
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
		
		
/*****************************************************  �޴�1 **********************************************/		
		
		Menu mEvent1 = new Menu(" �ֹ��ϱ� ");
		MenuItem mEvent1_1 = new MenuItem("����");
		MenuItem mEvent1_2 = new MenuItem("����");
		mEvent1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CafeOrder("���� �ֹ��ϱ�"); 
			}
		});
		mEvent1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CafeOrder("���� �ֹ��ϱ�"); 
			}
		});
		mEvent1.add(mEvent1_1);
		mEvent1.add(mEvent1_2);
		
		
		
		
/*****************************************************  �޴�2 **********************************************/			
		
		Menu mEvent2 = new Menu(" �ְ� ���氡�� ");
		MenuItem mEvent2_1 = new MenuItem("������");
		MenuItem mEvent2_2 = new MenuItem("�����");
		mEvent2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AnimalShow("������"); // ���α׷� ����
			}
		});
		mEvent2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AnimalShow("�����"); // ���α׷� ����
			}
		});
		mEvent2.add(mEvent2_1);
		mEvent2.add(mEvent2_2);
		
		
		
		
/*****************************************************  �޴�3 **********************************************/		
		
		Menu mEvent3 = new Menu(" �Խ��� ");
		MenuItem mEvent3_1 = new MenuItem("���� �����");
		mEvent3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Board("���� �����"); // ���α׷� ����
			}
		});
		
		MenuItem mEvent3_2 = new MenuItem("��������");
		mEvent3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Board("��������");
			}
		});
		
		mEvent3.add(mEvent3_1);
		mEvent3.add(mEvent3_2);
		
		
/*****************************************************  �޴�3 **********************************************/		
		
		Menu mEvent4 = new Menu(" ��å ");
		MenuItem mEvent4_1 = new MenuItem("������ ��å����");
		mEvent4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Game2(); 
			}
		});
		
		mEvent4.add(mEvent4_1);
		
		
		
		
		
		
		
		
		
		Menu mHelp = new Menu("����");
		MenuItem miHelp = new MenuItem("���α׷� ����");
		miHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Help("JH Park _ Programing");
			}
		});
		
		mHelp.add(miHelp);
		

		
		/*********** �޴��� mb�� �޴� ���̴� �κ� *************/
		mb.add(mFile);
		mb.add(mEvent1);
		mb.add(mEvent2);
		mb.add(mEvent3);
		mb.add(mEvent4);
		mb.add(mHelp);
		
		
		/*********** ���� �� *************/

		/*********** �����ӿ� ������Ʈ ���̴� �κ� *************/
		setMenuBar(mb); // �����ӿ� �޴��� ���̱�
		
		setVisible(true);	
	}
	
	public void paint(Graphics g){
		int imgW = img.getWidth(this);
		int imgH = img.getHeight(this);
		
		// ������ �߾ӿ� �̹��� ��ġ�ϱ�
		g.drawImage(img, (getWidth()-imgW)/2, 
					     (this.getHeight()-imgH)/2, this);
	}
	

	public static void main(String[] args) {
		new PetCefe("Pet Cafe");
	}
}




