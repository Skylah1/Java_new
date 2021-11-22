package ui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.time.LocalDate;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JFrame;

public class InputPanel extends BasicPanel{
	
	// ���� ����
	private JLabel Line = new JLabel("aaaaaaaa"); // ��
	private JLabel Line1 = new JLabel("aaaaaaaaa"); // ��
	private JLabel Line2 = new JLabel("aaaaaaaaaaaaaaaaaaaaa"); // ��
	private JLabel Line3 = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"); // ��
	private JLabel Line4 = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaa"); // ��

	
	private ImageIcon input = new ImageIcon("images/input.png"); // �̹��� �ε�
	private JLabel inputimg=new JLabel("",input,SwingConstants.CENTER); // ���̺� ����
	
	private String[] YearArray = new String[16]; // ���ڿ� �迭 ��, ��, �� 
	private String[] MonthArray = new String[12];
	private String[] DateArray = new String[31];
	private String[] CategoryArray = {"�ĺ�                            ", "����     ", "�����      "};
	
	private JComboBox<String> Year = new JComboBox<String>(YearArray); // ��, ��, �� ������ �޺��ڽ�
	private JComboBox<String> Month = new JComboBox<String>(MonthArray);
	private JComboBox<String> Date = new JComboBox<String>(DateArray);
	private JComboBox<String> Category = new JComboBox<String>(CategoryArray);
	
	private ButtonGroup KRW_USD = new ButtonGroup(); // ���� ��ư �׷�
	
	private JRadioButton KRW = new JRadioButton("  ��ȭ                     ", true); // ���� ��ư
	private JRadioButton USD = new JRadioButton("  ��ȭ");
	
	private JLabel Calendar = new JLabel("��¥ ����         "); // ��
	private JLabel YearLabel = new JLabel(" ��  ");
	private JLabel MonthLabel = new JLabel(" ��  ");
	private JLabel DateLabel = new JLabel(" ��");
	private JLabel CategoryLabel = new JLabel("ī�װ� ����  ");
	
	private JTextArea ta = new JTextArea(7, 20); ////////////// �̰ɷ� �Է�
	
	public InputPanel(JFrame frame) { // ������
		super();
		buttonclick = new ButtonClick(frame);
		InitObject();
		CenterPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 30)); // ��������, �����Ÿ� 30
		CenterPanel.add(Line);
		CenterPanel.add(inputimg); // ������� ����
		CenterPanel.add(Line1);
		CenterPanel.add(Line2);
		CenterPanel.add(Calendar);
		CenterPanel.add(Year);
		CenterPanel.add(YearLabel);
		CenterPanel.add(Month);
		CenterPanel.add(MonthLabel);
		CenterPanel.add(Date);
		CenterPanel.add(DateLabel);
		CenterPanel.add(Line3);
		CenterPanel.add(CategoryLabel);
		CenterPanel.add(Category);
		CenterPanel.add(Line4);
		CenterPanel.add(KRW);
		CenterPanel.add(USD);
		
		SettingComboBox();
		
		InitSetting();
	}
	 
	private void InitObject() { // �ʱ�ȭ �۾� �� �ʱ⼼��
		
		Line.setBackground(Color.WHITE);
		Line.setForeground(Color.WHITE);
		Line.setFont(new Font("���ʷչ���", Font.BOLD, 16)); 
		
		Line1.setBackground(Color.WHITE);
		Line1.setForeground(Color.WHITE);
		Line1.setFont(new Font("���ʷչ���", Font.BOLD, 16)); 
		
		Line2.setBackground(Color.WHITE);
		Line2.setForeground(Color.WHITE);
		Line2.setFont(new Font("���ʷչ���", Font.BOLD, 16)); 
		
		Line3.setBackground(Color.WHITE);
		Line3.setForeground(Color.WHITE);
		Line3.setFont(new Font("���ʷչ���", Font.BOLD, 16)); 
		
		Line4.setBackground(Color.WHITE);
		Line4.setForeground(Color.WHITE);
		Line4.setFont(new Font("���ʷչ���", Font.BOLD, 16)); 
		
		
		
		for(int i=0; i<16; i++) YearArray[i] = String.valueOf(i+2015); // 2015~2030�� ����
		Year = new JComboBox<String>(YearArray);
		Year.setBackground(Color.WHITE);
		Year.setForeground(Color.BLACK);
		Year.setFont(new Font("���ʷչ���", Font.BOLD, 16)); 
		
		for(int i=0; i<12; i++) MonthArray[i] = String.valueOf(i+1); // 1~12�� ����
		Month = new JComboBox<String>(MonthArray);
		Month.setBackground(Color.WHITE);
		Month.setForeground(Color.BLACK);
		Month.setFont(new Font("���ʷչ���", Font.BOLD, 16)); 
		
		for(int i=0; i<31; i++) DateArray[i] = String.valueOf(i+1); // 1~31�� ����
		Date = new JComboBox<String>(DateArray);
		Date.setBackground(Color.WHITE);
		Date.setForeground(Color.BLACK);
		Date.setFont(new Font("���ʷչ���", Font.BOLD, 16)); 
		
		Category.setBackground(Color.WHITE);
		Category.setForeground(Color.BLACK);
		Category.setFont(new Font("���ʷչ���", Font.BOLD, 16)); 
		
		// ---------------------------------------------------------------------------------�޺��ڽ�
		KRW.setBackground(Color.WHITE);
		KRW.setForeground(Color.BLACK);
		KRW.setFont(new Font("���ʷչ���", Font.BOLD, 17)); 
		USD.setBackground(Color.WHITE);
		USD.setForeground(Color.BLACK);
		USD.setFont(new Font("���ʷչ���", Font.BOLD, 17)); 
		KRW_USD.add(KRW); KRW_USD.add(USD);
		
		//----------------------------------------------------------------------------------���� ��ư
		
		Calendar.setFont(new Font("���ʷչ���", Font.BOLD, 17)); 
		YearLabel.setFont(new Font("���ʷչ���", Font.BOLD, 17)); 
		MonthLabel.setFont(new Font("���ʷչ���", Font.BOLD, 17)); 
		DateLabel.setFont(new Font("���ʷչ���", Font.BOLD, 17)); 
		CategoryLabel.setFont(new Font("���ʷչ���", Font.BOLD, 17)); 
		
		// ---------------------------------------------------------------------------------��
	}
	
	private void SettingComboBox() { // �޺��ڽ� �ʱ� ��¥ ����(���� ��¥��)
		LocalDate now = LocalDate.now();
		Year.setSelectedIndex(now.getYear()-2015);
		Month.setSelectedIndex(now.getMonthValue()-1);
		Date.setSelectedIndex(now.getDayOfMonth()-1);
	}
}