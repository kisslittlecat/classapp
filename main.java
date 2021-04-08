package myui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTable table_1;
	private JTextField textField_4;
	private JTextField textField_5;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 827);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u9009\u62E9\u822A\u7EBF\uFF1A");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		lblNewLabel.setBounds(23, 116, 72, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("\u6240\u9009\u8231\u4F4D\uFF1A");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(23, 192, 72, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\u673A\u7968\u7C7B\u578B\uFF1A");
		lblNewLabel_2_1.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(23, 154, 72, 28);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("VIP\u7EA7\u522B\uFF1A");
		lblNewLabel_2_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(23, 230, 72, 28);
		contentPane.add(lblNewLabel_2_1_1);

		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(99, 121, 165, 23);
		contentPane.add(comboBox_1);
		comboBox_1.setEditable(true);
		comboBox_1.setEnabled(true);
		comboBox_1.addItem("国内");
		comboBox_1.addItem("区域1");
		comboBox_1.addItem("区域2");
		comboBox_1.addItem("区域3");
		comboBox_1.addItem("区域4");
		comboBox_1.addItem("区域5");
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(99, 159, 165, 23);
		contentPane.add(comboBox_2);
		comboBox_2.setEditable(true);
		comboBox_2.setEnabled(true);
		comboBox_2.addItem("成人或儿童");
		comboBox_2.addItem("婴儿");
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(99, 197, 165, 23);
		contentPane.add(comboBox_3);
		comboBox_3.addItem("头等舱");
		comboBox_3.addItem("公务舱");
		comboBox_3.addItem("悦享经济舱、超级经济舱");
		comboBox_3.addItem("经济舱");
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(99, 235, 165, 23);
		contentPane.add(comboBox_4);
		comboBox_4.addItem("凤凰知音终身白金卡、白金卡");
		comboBox_4.addItem("凤凰知音金卡、银卡");
		comboBox_4.addItem("星空联盟金卡");
		comboBox_4.addItem("无");
		
		JLabel lblNewLabel_1_1 = new JLabel("\u822A\u73ED\u884C\u674E\u4EF7\u683C\u8BA1\u7B97\u5668");
		lblNewLabel_1_1.setFont(new Font("微软雅黑", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(23, 31, 255, 46);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(368, 122, 66, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(368, 198, 66, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(368, 160, 66, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
		JLabel lblNewLabel_1_2 = new JLabel("\u957F\uFF1A");
		lblNewLabel_1_2.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(321, 116, 29, 28);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("\u5BBD\uFF1A");
		lblNewLabel_1_2_1.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(321, 154, 29, 28);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("\u9AD8\uFF1A");
		lblNewLabel_1_2_2.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		lblNewLabel_1_2_2.setBounds(321, 192, 29, 28);
		contentPane.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("\u91CD\u91CF\uFF1A");
		lblNewLabel_1_3.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(321, 230, 58, 28);
		contentPane.add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(368, 236, 66, 21);
		contentPane.add(textField_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(23, 268, 411, 212);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\u884C\u674E\u4FE1\u606F");
		lblNewLabel_1_1_1.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(316, 44, 83, 28);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton = new JButton("\u6DFB\u52A0\u666E\u901A\u884C\u674E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String len=textField.getText();
				String wide=textField_1.getText();
				String high=textField_2.getText();
				String wei=textField_3.getText();
				textArea.setText(textArea.getText()+"您要托运的行李长为"+len+"宽为"+wide+"高为"+high+"重量为"+wei+"\r\n");
				textArea.setLineWrap(true);
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		btnNewButton.setBounds(23, 490, 125, 28);
		contentPane.add(btnNewButton);
		
		JTextField textField_5=new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(99, 88, 165, 21);
		contentPane.add(textField_5);
		
		
		JButton btnNewButton_1 = new JButton("\u8BA1\u7B97\u7279\u6B8A\u884C\u674E");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Special frame = new Special();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		btnNewButton_1.setBounds(23, 534, 125, 28);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u6E05\u7A7A");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textArea.setText("");
			}
		});
		btnNewButton_2.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		btnNewButton_2.setBounds(326, 490, 108, 28);
		contentPane.add(btnNewButton_2);
		
		String Text="<html><HTML><body style=color:black>区域一：美洲（除美国/加拿大外）/加勒比海地区与欧洲/非洲/中东/亚洲/西南太平洋之间的航线；<br />区域二：欧洲/中东与非洲/亚洲/西南太平洋之间航线；日本与西南太平洋之间航线； \r\n" + 
				"日本/西南太平洋与亚洲（不含日本及西南太平洋）/非洲之间航线；<br />区域三：加拿大与美洲（除美国/加拿大外）/加勒比海地区/欧洲/非洲/中东/亚洲/西南太平洋之间 航线；<br />区域四：美国（含夏威夷）与美洲（除美国外）/加勒比海地区/欧洲/非洲/中东/亚洲/西南太平洋\r\n" + 
				"之间航线；  <br />区域五：非洲与亚洲（除日本外)之间航线；欧洲与中东之间航线；亚洲（除日本)内航线； \r\n" + 
				"美洲（除美国/加拿大）及加勒比海地区内航线；上述未列明的航线;</body></html>";
		JLabel lblNewLabel_1_1_2 = new JLabel(Text);
		lblNewLabel_1_1_2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(28, 572, 417, 223);
		contentPane.add(lblNewLabel_1_1_2);
		
		
		JLabel lblNewLabel_1_2_3 = new JLabel("\u4EF6\u6570\uFF1A");
		lblNewLabel_1_2_3.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		lblNewLabel_1_2_3.setBounds(321, 82, 43, 28);
		contentPane.add(lblNewLabel_1_2_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(368, 88, 66, 21);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_2_3_1 = new JLabel("\u673A\u7968\u4EF7\u683C\uFF1A");
		lblNewLabel_1_2_3_1.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		lblNewLabel_1_2_3_1.setBounds(23, 82, 72, 28);
		contentPane.add(lblNewLabel_1_2_3_1);
		
		JButton btnNewButton_2_1 = new JButton("计算结果");
		btnNewButton_2_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				String len=textField.getText();
				Double len1=(double) Integer.parseInt(len);
				String wide=textField_2.getText();
				Double wide1=(double) Integer.parseInt(wide);
				String high=textField_1.getText();
				Double high1=(double) Integer.parseInt(high);
				String wei=textField_3.getText();
				Double wei1=(double) Integer.parseInt(wei);
				String count=textField_4.getText();
				Double count1=(double) Integer.parseInt(count);
				String price=textField_5.getText();
				Double price1=(double) Integer.parseInt(price);
				String area=comboBox_1.getSelectedItem().toString();
				String ticket=comboBox_2.getSelectedItem().toString();
				String clas=comboBox_3.getSelectedItem().toString();
				String vip=comboBox_4.getSelectedItem().toString();
				
				if(len1+wide1+high1< 60||len1+wide1+high1 >203|wei1<2||wei1>32) {
					JOptionPane.showMessageDialog(null, "您的行李尺寸、重量过大或过小，不合托运标准", "提示", JOptionPane.ERROR_MESSAGE); 
				}
				if(wei1>32) {
					JOptionPane.showMessageDialog(null, "所有舱位旅客托运超过 32 千克（70 磅）的普通托运行\r\n" + 
							"李，均须分成两件托运行", "提示", JOptionPane.ERROR_MESSAGE); 
				}
				if(count1==0) {
					JOptionPane.showMessageDialog(null, "行李数不为0", "提示", JOptionPane.ERROR_MESSAGE); 
				}
				
				if(area=="国内") {
					if(ticket=="成人或儿童") {
						if(clas=="头等舱") {
							if(vip=="无") {
								if(len1<=100&&wide1<=60&&high1<=40&&wei1<=40) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1<=100&&wide1<=60&&high1<=40&&wei1>40){
									Double res=(wei1-40)*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=wei1*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(vip=="凤凰知音终身白金卡、白金卡") {
								if(len1<=100&&wide1<=60&&high1<=40&&wei1<=70) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1<=100&&wide1<=60&&high1<=40&&wei1>70){
									Double res=(wei1-70)*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=wei1*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(vip=="凤凰知音金卡、银卡") {
								if(len1<=100&&wide1<=60&&high1<=40&&wei1<=60) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1<=100&&wide1<=60&&high1<=40&&wei1>60){
									Double res=(wei1-60)*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=wei1*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}				
							}
							else {
								if(len1<=100&&wide1<=60&&high1<=40&&wei1<=60) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1<=100&&wide1<=60&&high1<=40&&wei1>60){
									Double res=(wei1-60)*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=wei1*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							
						}
						else if(clas=="公务舱"){
							if(vip=="无") {
								if(len1<=100&&wide1<=60&&high1<=40&&wei1<=30) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1<=100&&wide1<=60&&high1<=40&&wei1>30){
									Double res=(wei1-30)*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=wei1*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(vip=="凤凰知音终身白金卡、白金卡") {
								if(len1<=100&&wide1<=60&&high1<=40&&wei1<=60) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1<=100&&wide1<=60&&high1<=40&&wei1>60){
									Double res=(wei1-60)*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=wei1*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(vip=="凤凰知音金卡、银卡") {
								if(len1<=100&&wide1<=50&&high1<=40&&wei1<=50) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1<=100&&wide1<=60&&high1<=40&&wei1>50){
									Double res=(wei1-60)*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=wei1*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}				
							}
							else {
								if(len1<=100&&wide1<=60&&high1<=40&&wei1<=50) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1<=100&&wide1<=60&&high1<=40&&wei1>50){
									Double res=(wei1-50)*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=wei1*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}	
						}
						else {
							if(vip=="无") {
								if(len1<=100&&wide1<=60&&high1<=40&&wei1<=20) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1<=100&&wide1<=60&&high1<=40&&wei1>20){
									Double res=(wei1-20)*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=wei1*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(vip=="凤凰知音终身白金卡、白金卡") {
								if(len1<=100&&wide1<=60&&high1<=40&&wei1<=50) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1<=100&&wide1<=60&&high1<=40&&wei1>50){
									Double res=(wei1-50)*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=wei1*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(vip=="凤凰知音金卡、银卡") {
								if(len1<=100&&wide1<=60&&high1<=40&&wei1<=40) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1<=100&&wide1<=60&&high1<=40&&wei1>40){
									Double res=(wei1-40)*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=wei1*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}				
							}
							else {
								if(len1<=100&&wide1<=60&&high1<=40&&wei1<=40) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1<=100&&wide1<=60&&high1<=40&&wei1>40){
									Double res=(wei1-40)*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=wei1*price1*1.5/100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}	
						}
					}
					else{
						if(len1<=100&&wide1<=60&&high1<=40&&wei1<=10) {
							JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元,另外可额外免费托运一\r\n" + 
									"辆折叠式婴儿车或摇篮", "结果", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(len1<=100&&wide1<=60&&high1<=40&&wei1>10){
							Double res=(wei1-10)*price1*1.5/100;
							JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元，另外可额外免费托运一\r\n" + 
									"辆折叠式婴儿车或摇篮", "结果", JOptionPane.INFORMATION_MESSAGE);
						}
						else{
							Double res=wei1*price1*1.5/100;
							JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元，另外可额外免费托运一\r\n" + 
									"辆折叠式婴儿车或摇篮", "结果", JOptionPane.INFORMATION_MESSAGE);
						}
					}
				}
				else {
					if(area=="区域一") {
						if(area=="头等舱"||area=="公务舱") {
							if(len1+wide1+high1<=158&&count1<=2) {
								JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
							}
							else if(len1+wide1+high1<=158&&count1>2){
								Double res;
								if(count1==3) {
									res=1400.0;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(count1==4) {
									res=2000.0*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									res=3000.0*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								
							}
							else if(len1+wide1+high1>158&&len1+wide1+high1<203&&count1<=2){
								Double res=980*count1;
								JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
							}
							else {
								Double res;
								if(count1==3) {
									res=1400.0+980*count1;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(count1==4) {
									res=2000.0*2+980*count1;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									res=3000.0*(count1-2)+980*count1;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
						}
						else if(area=="悦享经济舱、超级经济舱"||area=="经济舱") {
							if(count1<=2) {
								if(len1+wide1+high1<=158&&wei1<=23) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*380;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*980;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*980;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*1400;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(count1==3){
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*380+1400;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*980+1400;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*980+1400;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*1400+1400;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(count1==4) {
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*380+2000*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*980+2000*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*980+2000*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*1400+2000*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else {
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*380+3000*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*980+3000*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*980+3000*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*1400+3000*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
						}
					}
					else if(area=="区域二") {
						if(area=="头等舱"||area=="公务舱") {
							if(len1+wide1+high1<=158&&count1<=2) {
								JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
							}
							else if(len1+wide1+high1<=158&&count1>2){
								Double res;
								if(count1==3) {
									res=1100.0;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(count1==4) {
									res=1100.0*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									res=1590.0*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								
							}
							else if(len1+wide1+high1>158&&len1+wide1+high1<203&&count1<=2){
								Double res=690*count1;
								JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
							}
							else {
								Double res;
								if(count1==3) {
									res=1100.0+690*count1;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(count1==4) {
									res=1100.0*2+690*count1;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									res=1590.0*(count1-2)+690*count1;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
						}
						else if(area=="悦享经济舱、超级经济舱"||area=="经济舱") {
							if(count1<=2) {
								if(len1+wide1+high1<=158&&wei1<=23) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*280;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*690;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*690;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*1100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(count1==3){
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*280+1100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*690+1100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*690+1100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*1100+1100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(count1==4) {
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*280+1100*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*690+1100*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*690+1100*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*1100+1100*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else {
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*280+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*690+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*690+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*1100+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
						}
					}
					else if(area=="区域三") {
						if(area=="头等舱"||area=="公务舱") {
							if(len1+wide1+high1<=158&&count1<=2) {
								JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
							}
							else if(len1+wide1+high1<=158&&count1>2){
								Double res;
								if(count1==3) {
									res=1170.0;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(count1==4) {
									res=1170.0*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									res=1590.0*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								
							}
							else if(len1+wide1+high1>158&&len1+wide1+high1<203&&count1<=2){
								Double res=520*count1;
								JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
							}
							else {
								Double res;
								if(count1==3) {
									res=1170.0+520*count1;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(count1==4) {
									res=1170.0*2+520*count1;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									res=1590.0*(count1-2)+520*count1;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
						}
						else if(area=="悦享经济舱、超级经济舱") {
							if(count1<=2) {
								if(len1+wide1+high1<=158&&wei1<=23) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*520;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(count1==3){
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*520+1170;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*520+1170;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*520+1170;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*520+1170;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(count1==4) {
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*520+1170*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*520+1170*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*520+1170*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*520+1170*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else {
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*520+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*520+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*520+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*520+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
						}
						else {
							if(count1<=1) {
								if(len1+wide1+high1<=158&&wei1<=23) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*520;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(count1==2){
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*520+1170;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*520+1170;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*520+1170;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*520+1170;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(count1==3) {
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*520+1170*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*520+1170*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*520+1170*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*520+1170*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else {
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*520+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*520+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*520+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*520+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
						}
					}
					else if(area=="区域四") {
						if(area=="头等舱"||area=="公务舱") {
							if(len1+wide1+high1<=158&&count1<=2) {
								JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
							}
							else if(len1+wide1+high1<=158&&count1>2){
								Double res;
								if(count1==3) {
									res=1380.0;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(count1==4) {
									res=1380.0*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									res=1590.0*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								
							}
							else if(len1+wide1+high1>158&&len1+wide1+high1<203&&count1<=2){
								Double res=1040*count1;
								JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
							}
							else {
								Double res;
								if(count1==3) {
									res=1380.0+1040*count1;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(count1==4) {
									res=1380.0*2+1040*count1;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									res=1590.0*(count1-2)+1040*count1;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
						}
						else if(area=="悦享经济舱、超级经济舱") {
							if(count1<=2) {
								if(len1+wide1+high1<=158&&wei1<=23) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1<=28&&wei1>23) {
									Double res=count1*690;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1<=32&&wei1>28) {
									Double res=count1*1040;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<=203&&wei1<=23) {
									Double res=count1*1040;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									Double res=count1*2050;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(count1==3){
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*690+1380;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*1040+1380;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*1040+1380;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*2050+1380;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(count1==4) {
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*690+1380*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*1040+1380*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*1040+1380*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*1040+1380*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else {
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*690+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*1040+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*1040+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*2050+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
						}
						else {
							if(count1<=1) {
								if(len1+wide1+high1<=158&&wei1<=23) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1<=28&&wei1>23){
									Double res=count1*690;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1<=32&&wei1>28){
									Double res=count1*1040;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<=203&&wei1<=23){
									Double res=count1*1040;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*2050;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(count1==2){
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*690+1380;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*1040+1380;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*1040+1380;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*2050+1380;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(count1==3) {
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*690+1380;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*1040+1380;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*1040+1380;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*2050+1380;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else {
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*690+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*1040+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*1040+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*2050+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
						}
					}
					else {
						if(area=="头等舱"||area=="公务舱") {
							if(len1+wide1+high1<=158&&count1<=2) {
								JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
							}
							else if(len1+wide1+high1<=158&&count1>2){
								Double res;
								if(count1==3) {
									res=830.0;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(count1==4) {
									res=1100.0*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									res=1590.0*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								
							}
							else if(len1+wide1+high1>158&&len1+wide1+high1<203&&count1<=2){
								Double res=520*count1;
								JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
							}
							else {
								Double res;
								if(count1==3) {
									res=830.0+520*count1;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(count1==4) {
									res=1100.0*2+520*count1;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									res=1590.0*(count1-2)+520*count1;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
						}
						else if(area=="悦享经济舱、超级经济舱") {
							if(count1<=2) {
								if(len1+wide1+high1<=158&&wei1<=23) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1<=28&&wei1>23) {
									Double res=count1*210;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1<=32&&wei1>28) {
									Double res=count1*520;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<=203&&wei1<=23) {
									Double res=count1*520;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									Double res=count1*830;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(count1==3){
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*210+830;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*520+830;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*520+830;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*830+830;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(count1==4) {
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*210+1100*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*520+1100*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*520+1100*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*830+1100*2;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else {
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*210+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*520+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*520+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*830+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
						}
						else {
							if(count1<=1) {
								if(len1+wide1+high1<=158&&wei1<=23) {
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付0元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1<=28&&wei1>23){
									Double res=count1*210;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1<=32&&wei1>28){
									Double res=count1*520;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<=203&&wei1<=23){
									Double res=count1*520;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*830;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(count1==2){
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*210+830;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*520+830;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*520+830;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*830+830;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else if(count1==3) {
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*210+1100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*520+1100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*520+1100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*830+1100;
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
							else {
								if(len1+wide1+high1<=158&&wei1>23&&wei1<=28){
									Double res=count1*210+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1<=158&&wei1>28&&wei1<=32){
									Double res=count1*520+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else if(len1+wide1+high1>158&&len1+wide1+high1<203&&wei1<=23){
									Double res=count1*520+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
								else{
									Double res=count1*830+1590*(count1-2);
									JOptionPane.showMessageDialog(null, "您托运的行李需要支付"+res+"元", "结果", JOptionPane.INFORMATION_MESSAGE);
								}
							}
						}
					}	
				}	
				
			}
		});
		btnNewButton_2_1.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		btnNewButton_2_1.setBounds(326, 528, 108, 28);
		contentPane.add(btnNewButton_2_1);
	}
}
