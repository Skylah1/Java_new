package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonClick implements ActionListener{
	private JFrame frame = new JFrame();
	public ButtonClick(JFrame frame) {
		this.frame = frame;
	}
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		String compareText = b.getText().replace(" ", "");
		if(compareText.equals("�Է�")) {
			frame.setContentPane(new InputPanel(frame));
			frame.setVisible(true);
		}
		else if(compareText.equals("��ȸ")) { // "��ȸ"�� ��� InquiryFrame���� �Ѿ
			frame.setContentPane(new InquiryPanel(frame));
			frame.setVisible(true);
		}
		else if(compareText.equals("�����ѵ�����")) { // "���� �ѵ� ����"�� ��� ManageFrame���� �Ѿ
			frame.setContentPane(new ManagePanel(frame));
			frame.setVisible(true);
		}
		else if(compareText.equals("ī�װ�����")) { // "ī�װ� ����"�� ��� CategoryManageFrame���� �Ѿ
			frame.setContentPane(new CategoryManagePanel(frame));
			frame.setVisible(true);
		}
		else if(compareText.equals("�˸�")) { // "ī�װ� ����"�� ��� CategoryManageFrame���� �Ѿ
			// ����� ���� �̿�
			frame.setVisible(true);
		}
		
	}
}