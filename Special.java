package myui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Special extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Special() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 381, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2\u662F\u5426\u4E3A\u53EF\u514D\u8D39\u8FD0\u8F93\u7684\u7279\u6B8A\u884C\u674E ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "残疾、伤、病旅客可免费托运一件小型可放入客舱的辅助设备，或一件手动轮椅。除此之外，还可以免费运输一件辅助设备， \r\n"+
						"包括但不限于以下物品：     电动轮椅/电动代步工具/手动轮椅； 机械假肢及专用小型气瓶； 心脏起搏器或其他植入人体的装置； \r\n"+
						"便携式氧气浓缩机（POC）； 持续正压呼吸机（CPAP）； 其它内含锂电池的辅助设备等。 \r\n" + 
						"婴儿旅客（无论何种舱位）可免费托运一件折叠式婴儿车 或摇篮或婴儿汽车安全座椅。 \r\n" + 
						"导盲犬/助听犬/精神抚慰犬 \r\n" + 
						"骨灰 ", "结果", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		btnNewButton.setBounds(26, 22, 224, 57);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u51B2\u6D6A\u677F");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "您托运的行李需要支付2600元", "结果", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		btnNewButton_1.setBounds(26, 145, 80, 34);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\u81EA\u884C\u8F66 ");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "您托运的行李需要支付480元", "结果", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(26, 89, 80, 34);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("\u6807\u67AA");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "您托运的行李需要支付1300元", "结果", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_1_2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		btnNewButton_1_2.setBounds(26, 199, 80, 34);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("\u6E14\u5177");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "您托运的行李需要支付300元", "结果", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_1_2_1.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		btnNewButton_1_2_1.setBounds(260, 22, 80, 57);
		contentPane.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton("\u5C0F\u52A8\u7269");
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "您托运的行李需要支付5200元", "结果", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_1_2_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		btnNewButton_1_2_1_1.setBounds(260, 96, 80, 57);
		contentPane.add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_1_2_1_2 = new JButton("\u5A92\u4F53\u8BBE\u5907");
		btnNewButton_1_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "您托运的行李需要支付490元", "结果", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_1_2_1_2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		btnNewButton_1_2_1_2.setBounds(260, 176, 80, 57);
		contentPane.add(btnNewButton_1_2_1_2);
	}
}
