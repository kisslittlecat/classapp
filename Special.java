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
				JOptionPane.showMessageDialog(null, "�м����ˡ����ÿͿ��������һ��С�Ϳɷ���Ͳյĸ����豸����һ���ֶ����Ρ�����֮�⣬�������������һ�������豸�� \r\n"+
						"������������������Ʒ��     �綯����/�綯��������/�ֶ����Σ� ��е��֫��ר��С����ƿ�� ��������������ֲ�������װ�ã� \r\n"+
						"��Яʽ����Ũ������POC���� ������ѹ��������CPAP���� �����ں�﮵�صĸ����豸�ȡ� \r\n" + 
						"Ӥ���ÿͣ����ۺ��ֲ�λ�����������һ���۵�ʽӤ���� ��ҡ����Ӥ��������ȫ���Ρ� \r\n" + 
						"��äȮ/����Ȯ/����οȮ \r\n" + 
						"�ǻ� ", "���", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		btnNewButton.setBounds(26, 22, 224, 57);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u51B2\u6D6A\u677F");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�����˵�������Ҫ֧��2600Ԫ", "���", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_1.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		btnNewButton_1.setBounds(26, 145, 80, 34);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\u81EA\u884C\u8F66 ");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�����˵�������Ҫ֧��480Ԫ", "���", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_1_1.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(26, 89, 80, 34);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("\u6807\u67AA");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�����˵�������Ҫ֧��1300Ԫ", "���", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_1_2.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		btnNewButton_1_2.setBounds(26, 199, 80, 34);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("\u6E14\u5177");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�����˵�������Ҫ֧��300Ԫ", "���", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_1_2_1.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		btnNewButton_1_2_1.setBounds(260, 22, 80, 57);
		contentPane.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton("\u5C0F\u52A8\u7269");
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�����˵�������Ҫ֧��5200Ԫ", "���", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_1_2_1_1.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		btnNewButton_1_2_1_1.setBounds(260, 96, 80, 57);
		contentPane.add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_1_2_1_2 = new JButton("\u5A92\u4F53\u8BBE\u5907");
		btnNewButton_1_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�����˵�������Ҫ֧��490Ԫ", "���", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_1_2_1_2.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		btnNewButton_1_2_1_2.setBounds(260, 176, 80, 57);
		contentPane.add(btnNewButton_1_2_1_2);
	}
}
