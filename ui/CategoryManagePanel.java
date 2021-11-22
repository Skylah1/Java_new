package ui;

import javax.swing.*;
import java.awt.*;

public class CategoryManagePanel extends BasicPanel {
	
	private ImageIcon catema = new ImageIcon("images/catema.png"); // �̹��� �ε�
	private JLabel catemaimg=new JLabel("",catema,SwingConstants.CENTER); // ���̺� ����

	// ���� ����
	private JLabel Line = new JLabel("aaaaaaa"); // ��
	private JLabel Line1 = new JLabel("aaaaaaaa"); // ��
	private JLabel Line2 = new JLabel("aaaaaaaa"); // ��
	private JLabel Line3 = new JLabel("aaaaaaaa"); // ��
	private JLabel Line4 = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaa"); // ��

	
	private JButton add = new JButton("�߰�"); // ��ư
	private JButton delete = new JButton("����");
	private JButton change = new JButton("����");
	
	
	// ==========================================================================
	
	
	private JTextField addName = new JTextField(12);
	private JLabel addN = new JLabel("  �߰��� ī�װ� �̸�                "); // ��
	
	
	// ==========================================================================
	
	
	private String[] delCateArr = {"�ĺ�                            ", "����     ", "�����    "};
	private JComboBox<String> delCate = new JComboBox<String>(delCateArr); // ��ġ ������ �޺��ڽ�
	private JLabel delcate = new JLabel(" ������ ī�װ� ����   "); // ��
	
	
	private String[] chaCateArr = {"�ĺ�                            ", "����     ", "�����    "};
	private JComboBox<String> chaCate = new JComboBox<String>(chaCateArr); // ��ġ ������ �޺��ڽ�
	private JLabel chacate = new JLabel(" ������ ī�װ� ����   "); // ��
	
	
	// ==========================================================================
		
	public CategoryManagePanel(JFrame frame) { // ������
		buttonclick = new ButtonClick(frame);
		InitObject();
		CenterPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 30)); // ��������, �����Ÿ� 30
		CenterPanel.add(Line);
		CenterPanel.add(catemaimg);
		
		CenterPanel.add(addN); // ������� ����
		CenterPanel.add(addName);
		CenterPanel.add(Line1);
		CenterPanel.add(add);
		
		CenterPanel.add(delcate);
		CenterPanel.add(delCate);
		CenterPanel.add(Line2);
		CenterPanel.add(delete);
		
		
		CenterPanel.add(chacate);
		CenterPanel.add(chaCate);
		CenterPanel.add(Line3);
		CenterPanel.add(change);

	}
	
	
	
	private void InitObject() { // �ʱ�ȭ �۾� �� �ʱ⼼��
		
		Line.setBackground(Color.WHITE);
		Line.setForeground(Color.WHITE);
		Line.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
		Line1.setBackground(Color.WHITE);
		Line1.setForeground(Color.WHITE);
		Line1.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
		Line2.setBackground(Color.WHITE);
		Line2.setForeground(Color.WHITE);
		Line2.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
		Line3.setBackground(Color.WHITE);
		Line3.setForeground(Color.WHITE);
		Line3.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
		
		// ========================================================================
		
		
		add.setBackground(new Color(244,244,244));
		add.setForeground(Color.BLACK);
		add.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
		
		delete.setBackground(new Color(244,244,244));
		delete.setForeground(Color.BLACK);
		delete.setFont(new Font("���ʷչ���", Font.BOLD, 18));
		
		
		change.setBackground(new Color(244,244,244));
		change.setForeground(Color.BLACK);
		change.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
		
		// ========================================================================
		
		addName.setBackground(Color.WHITE);
		addName.setForeground(Color.BLACK);
		addName.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
		delCate.setBackground(Color.WHITE);
		delCate.setForeground(Color.BLACK);
		delCate.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
		
		chaCate.setBackground(Color.WHITE);
		chaCate.setForeground(Color.BLACK);
		chaCate.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
		// ========================================================================
		
		
		addN.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		delcate.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		chacate.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
	}
	
}