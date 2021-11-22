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
	
	// 간격 조절
	private JLabel Line = new JLabel("aaaaaaaa"); // 라벨
	private JLabel Line1 = new JLabel("aaaaaaaaa"); // 라벨
	private JLabel Line2 = new JLabel("aaaaaaaaaaaaaaaaaaaaa"); // 라벨
	private JLabel Line3 = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"); // 라벨
	private JLabel Line4 = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaa"); // 라벨

	
	private ImageIcon input = new ImageIcon("images/input.png"); // 이미지 로딩
	private JLabel inputimg=new JLabel("",input,SwingConstants.CENTER); // 레이블 생성
	
	private String[] YearArray = new String[16]; // 문자열 배열 년, 월, 일 
	private String[] MonthArray = new String[12];
	private String[] DateArray = new String[31];
	private String[] CategoryArray = {"식비                            ", "유흥     ", "교통비      "};
	
	private JComboBox<String> Year = new JComboBox<String>(YearArray); // 년, 월, 일 저장할 콤보박스
	private JComboBox<String> Month = new JComboBox<String>(MonthArray);
	private JComboBox<String> Date = new JComboBox<String>(DateArray);
	private JComboBox<String> Category = new JComboBox<String>(CategoryArray);
	
	private ButtonGroup KRW_USD = new ButtonGroup(); // 라디오 버튼 그룹
	
	private JRadioButton KRW = new JRadioButton("  원화                     ", true); // 라디오 버튼
	private JRadioButton USD = new JRadioButton("  외화");
	
	private JLabel Calendar = new JLabel("날짜 설정         "); // 라벨
	private JLabel YearLabel = new JLabel(" 년  ");
	private JLabel MonthLabel = new JLabel(" 월  ");
	private JLabel DateLabel = new JLabel(" 일");
	private JLabel CategoryLabel = new JLabel("카테고리 설정  ");
	
	private JTextArea ta = new JTextArea(7, 20); ////////////// 이걸로 입력
	
	public InputPanel(JFrame frame) { // 생성자
		super();
		buttonclick = new ButtonClick(frame);
		InitObject();
		CenterPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 30)); // 왼쪽정렬, 수직거리 30
		CenterPanel.add(Line);
		CenterPanel.add(inputimg); // 순서대로 저장
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
	 
	private void InitObject() { // 초기화 작업 및 초기세팅
		
		Line.setBackground(Color.WHITE);
		Line.setForeground(Color.WHITE);
		Line.setFont(new Font("함초롱바탕", Font.BOLD, 16)); 
		
		Line1.setBackground(Color.WHITE);
		Line1.setForeground(Color.WHITE);
		Line1.setFont(new Font("함초롱바탕", Font.BOLD, 16)); 
		
		Line2.setBackground(Color.WHITE);
		Line2.setForeground(Color.WHITE);
		Line2.setFont(new Font("함초롱바탕", Font.BOLD, 16)); 
		
		Line3.setBackground(Color.WHITE);
		Line3.setForeground(Color.WHITE);
		Line3.setFont(new Font("함초롱바탕", Font.BOLD, 16)); 
		
		Line4.setBackground(Color.WHITE);
		Line4.setForeground(Color.WHITE);
		Line4.setFont(new Font("함초롱바탕", Font.BOLD, 16)); 
		
		
		
		for(int i=0; i<16; i++) YearArray[i] = String.valueOf(i+2015); // 2015~2030년 구성
		Year = new JComboBox<String>(YearArray);
		Year.setBackground(Color.WHITE);
		Year.setForeground(Color.BLACK);
		Year.setFont(new Font("함초롱바탕", Font.BOLD, 16)); 
		
		for(int i=0; i<12; i++) MonthArray[i] = String.valueOf(i+1); // 1~12월 구성
		Month = new JComboBox<String>(MonthArray);
		Month.setBackground(Color.WHITE);
		Month.setForeground(Color.BLACK);
		Month.setFont(new Font("함초롱바탕", Font.BOLD, 16)); 
		
		for(int i=0; i<31; i++) DateArray[i] = String.valueOf(i+1); // 1~31일 구성
		Date = new JComboBox<String>(DateArray);
		Date.setBackground(Color.WHITE);
		Date.setForeground(Color.BLACK);
		Date.setFont(new Font("함초롱바탕", Font.BOLD, 16)); 
		
		Category.setBackground(Color.WHITE);
		Category.setForeground(Color.BLACK);
		Category.setFont(new Font("함초롱바탕", Font.BOLD, 16)); 
		
		// ---------------------------------------------------------------------------------콤보박스
		KRW.setBackground(Color.WHITE);
		KRW.setForeground(Color.BLACK);
		KRW.setFont(new Font("함초롱바탕", Font.BOLD, 17)); 
		USD.setBackground(Color.WHITE);
		USD.setForeground(Color.BLACK);
		USD.setFont(new Font("함초롱바탕", Font.BOLD, 17)); 
		KRW_USD.add(KRW); KRW_USD.add(USD);
		
		//----------------------------------------------------------------------------------라디오 버튼
		
		Calendar.setFont(new Font("함초롱바탕", Font.BOLD, 17)); 
		YearLabel.setFont(new Font("함초롱바탕", Font.BOLD, 17)); 
		MonthLabel.setFont(new Font("함초롱바탕", Font.BOLD, 17)); 
		DateLabel.setFont(new Font("함초롱바탕", Font.BOLD, 17)); 
		CategoryLabel.setFont(new Font("함초롱바탕", Font.BOLD, 17)); 
		
		// ---------------------------------------------------------------------------------라벨
	}
	
	private void SettingComboBox() { // 콤보박스 초기 날짜 설정(현재 날짜로)
		LocalDate now = LocalDate.now();
		Year.setSelectedIndex(now.getYear()-2015);
		Month.setSelectedIndex(now.getMonthValue()-1);
		Date.setSelectedIndex(now.getDayOfMonth()-1);
	}
}