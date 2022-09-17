package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.Sizes;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class course extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("abc");
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					course frame = new course();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	/**
	 * Create the frame.
	 */
	public void course() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("137px"),
				ColumnSpec.decode("206px:grow"),},
			new RowSpec[] {
				RowSpec.decode("28px"),
				RowSpec.decode("41px"),
				RowSpec.decode("274px:grow"),}));
		
		table = new JTable();
		panel_1.add(table, "1, 3, 2, 1, fill, fill");
		
		JLabel lblNewLabel_1 = new JLabel("Danh s\u00E1ch kh\u00F3a h\u1ECDc");
		panel_1.add(lblNewLabel_1, "1, 2, 2, 1, center, fill");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField = new JTextField();
		panel_1.add(textField, "2, 1, fill, fill");
		textField.setColumns(10);
		
		JLabel lblTm = new JLabel("T\u00ECm ki\u1EBFm kh\u00F3a h\u1ECDc");
		panel_1.add(lblTm, "1, 1, fill, fill");
		lblTm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("95px"),
				FormSpecs.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("192px:grow"),
				FormSpecs.UNRELATED_GAP_COLSPEC,},
			new RowSpec[] {
				FormSpecs.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("28px"),
				FormSpecs.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("27px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("27px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("28px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("27px"),
				FormSpecs.PARAGRAPH_GAP_ROWSPEC,
				RowSpec.decode("28px"),}));
		
		JLabel lblNewLabel = new JLabel("Th\u00EAm kh\u00F3a h\u1ECDc");
		panel.add(lblNewLabel, "2, 2, 3, 1, fill, fill");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_1 = new JTextField();
		panel.add(textField_1, "4, 4, fill, fill");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("M\u00E3 kh\u00F3a h\u1ECDc");
		panel.add(lblNewLabel_2, "2, 4, fill, fill");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_2_1 = new JLabel("T\u00EAn kh\u00F3a h\u1ECDc");
		panel.add(lblNewLabel_2_1, "2, 6, fill, fill");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_2 = new JTextField();
		panel.add(textField_2, "4, 6, fill, fill");
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		panel.add(textField_3, "4, 8, fill, fill");
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2_2 = new JLabel("S\u1ED1 t\u00EDn ch\u1EC9");
		panel.add(lblNewLabel_2_2, "2, 8, fill, fill");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_2_3 = new JLabel("Khoa");
		panel.add(lblNewLabel_2_3, "2, 10, fill, fill");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_4 = new JTextField();
		panel.add(textField_4, "4, 10, fill, fill");
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Th\u00EAm kh\u00F3a h\u1ECDc");
		panel.add(btnNewButton, "2, 12, 3, 1, center, fill");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
	}
}
