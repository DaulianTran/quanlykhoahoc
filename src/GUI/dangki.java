package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import DAO.CheckLogin;
import DTO.taikhoan;

public class dangki extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JLabel userLb;
	private JLabel passLb;
	private JLabel ConpassLb;
	private JTextField userF;
	private JPasswordField passF;
	private JPasswordField ConpassF;
	private JLabel Signup;
	private JLabel text;
	private JFrame Sign;
	private JPanel SU;
	
	private JButton SignUp;
	private JButton Login;
	
	public dangki() {
		initComponets();
	}
	
	public void initComponets() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		Signup = new JLabel("SIGN UP");
		Signup.setFont(new Font("arial", Font.BOLD, 20));
		Signup.setForeground(Color.blue);
		Signup.setBounds(150, 10, 100, 100);
		
		userLb = new JLabel("User Name: ");
		userLb.setBounds(70, 100, 70, 30);
		
		passLb = new JLabel("Password: ");
		passLb.setBounds(70, 170, 70, 30);
		
		ConpassLb = new JLabel("Confirm: ");
		ConpassLb.setBounds(70, 240, 80, 30);
		
		userF = new JTextField(30);
		userF.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		userF.setBounds(70, 130, 250, 30);
		
		passF = new JPasswordField(20);
		passF.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		passF.setBounds(70, 200, 250, 30);
		
		ConpassF = new JPasswordField(20);
		ConpassF.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		ConpassF.setBounds(70, 270, 250, 30);
		
		text = new JLabel("Already a member?");
		text.setFont(new Font("arial", Font.ITALIC, 14));
		text.setBounds(100, 310, 130, 20);
		
		Login = new JButton("Login");
		Login.setFont(new Font("arial", Font.BOLD, 14));
		Login.setHorizontalAlignment(SwingConstants.LEFT);
		Login.setBackground(Color.white);
		Login.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		Login.setBounds(230, 310, 40, 20);
		Login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DangNhap login = new DangNhap();
				new CheckLogin(login);
				login.showLoginView();
				Sign.setVisible(false);
			}
		});
		
		SignUp = new RoundJButton(30);
		SignUp.setText("Sign Up");
		SignUp.setBounds(90, 350, 200, 40);
		SignUp.addActionListener(this);
		SignUp.setBackground(Color.getColor("", 0x0099FF));
		SignUp.setForeground(Color.white);
		
		SU = new Drawing();
		SU.setSize(400, 430);
		SU.setLayout(null);
		SU.add(SignUp);
		SU.add(passF);
		SU.add(passLb);
		SU.add(userF);
		SU.add(userLb);
		SU.add(ConpassLb);
		SU.add(ConpassF);
		SU.add(Signup);
		SU.add(text);
		SU.add(Login);
		
		Sign = new JFrame("Sign Up");
		Sign.add(SU);
		Sign.setBounds(500, 150, 400, 470);
		Sign.setLayout(null); 
	}
	public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
	public void showSign() {
		Sign.setVisible(true);
	}
	public void turnoffSign() {
		Sign.setVisible(false);
	}
	public void addSignListener(ActionListener listener) {
	        SignUp.addActionListener(listener);
	}
	 public taikhoan getTaikhoan() {
			return new taikhoan(userF.getText(),String.copyValueOf(passF.getPassword()));
		}
	 public String getConfirm() {
		 return String.copyValueOf(ConpassF.getPassword()).trim();
	 }
	public String getUserF() {
		return userF.getText().trim();
	}
	public String getPassF() {
		return String.copyValueOf(passF.getPassword()).trim();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public class Drawing extends JPanel{
		static final long serialVersionUID = 1L;
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			this.setBackground(Color.white);
			
			Graphics2D g2D = (Graphics2D) g;
			
			g2D.drawLine(70, 160, 320, 160);
			g2D.drawLine(70, 230, 320, 230);
			g2D.drawLine(70, 300, 320, 300);
		}
	}
	public class RoundJButton extends JButton{
		private static final long serialVersionUID = 1L;
	    private Shape shape;
	    private int size;
	    public RoundJButton(int size) {
	        this.size = size;
	        setOpaque(false); // As suggested by @AVD in comment.
	    }
	    protected void paintComponent(Graphics g) {
	         g.setColor(getBackground());
	         g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, size, size);
	         super.paintComponent(g);
	    }
	    protected void paintBorder(Graphics g) {
	         g.setColor(getForeground());
	         g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, size, size);
	    }
	    public boolean contains(int x, int y) {
	         if (shape == null || !shape.getBounds().equals(getBounds())) {
	             shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, size, size);
	         }
	         return shape.contains(x, y);
	    }
	}
}
