package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import DTO.taikhoan;


public class DangNhap extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private JPanel content;
	private JTextField userF;
	private JPasswordField passF;
	private JButton login;
	private JFrame LG;
	private JButton sign;
	private ImageIcon icon;
	private JLabel Licon;
	private ImageIcon name;
	private JLabel Lname;
	private ImageIcon work;
	private JLabel Lwork;
	private JLabel label;
	private JLabel text;
	
	public DangNhap() {
		initComponets();
	}
	
	public void initComponets() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		label = new JLabel("AD");
		label.setFont(new Font("arial", Font.BOLD, 20));
		label.setForeground(Color.blue);
		label.setBounds(370, 20, 200, 100);
		
		icon = new ImageIcon("images/Log.jpg");
		Image image = icon.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		icon = new ImageIcon(image, icon.getDescription());
		Licon = new JLabel(icon);
		Licon.setBounds(7,5, 25, 25);
		
		passF = new RoundJJPasswordField(30);
		passF.add(Licon);
		passF.setBorder(BorderFactory.createEmptyBorder(0, 40, 0, 0));
		passF.setBounds(330, 170, 200, 40);

		name = new ImageIcon("images/name.jpg");
		Image image2 = name.getImage().getScaledInstance(40, 30, Image.SCALE_SMOOTH);
		name = new ImageIcon(image2, name.getDescription());
		Lname = new JLabel(name);
		Lname.setBounds(5, 5, 40, 30);
		
		userF = new RoundJTextField(30);
		userF.add(Lname);
		userF.setText("user name");
		userF.addFocusListener(new userFocus());
//		userF.setForeground(Color.gray);
		userF.setBorder(BorderFactory.createEmptyBorder(0, 45, 0, 0));
		userF.setBounds(330, 100, 200, 40);
		
		work = new ImageIcon("images/working.jpg");
		Image image1 = work.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		work = new ImageIcon(image1, work.getDescription());
		Lwork = new JLabel(work);
		Lwork.setBounds(90, 90, 150, 150);
		
		text = new JLabel("Do not have an account?");
		text.setFont(new Font("arial", Font.ITALIC, 14));
		text.setBounds(350, 290, 170, 20);
		
		login = new DepthButton("24");
		login.setText("Login");
		login.setBackground(Color.green);
		login.setForeground(Color.blue);
		login.setBounds(350, 240, 170, 40);
		login.addActionListener(this);
		
		sign = new JButton("Sign Up");
		sign.setFont(new Font("arial", Font.BOLD, 14));
		sign.setHorizontalAlignment(SwingConstants.LEFT);
		sign.setBounds(400, 310, 90, 20);
		sign.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		sign.setBackground(Color.getColor("", 0xEEEEEE));
		sign.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LG.setVisible(false);
				dangki a = new dangki();
				
				a.showSign();
			}
		});
		
		content = new JPanel();
		content.setSize(600, 400);
		content.setLayout(null);
		content.add(login);
		content.add(passF);
		content.add(userF);
		content.add(sign);
		content.add(Lwork);
		content.add(label);
		content.add(text);
		
		LG = new JFrame("Login");
		LG.add(content);
		LG.setBounds(400, 200, 600, 400);
		LG.setLayout(null);
		
		passF.addKeyListener(new KeyAdapter() {
			@Override
			 public void keyPressed(KeyEvent e) {
	            if(e.getKeyCode() == KeyEvent.VK_ENTER){
	               login.doClick();
	            }
	        }

		});
	}
	public static class DepthButton extends JButton { 
		private static final long serialVersionUID = 1L;
		private Shape shape;
		public DepthButton(String text) { 
	      super(text); 
	      setContentAreaFilled(false); 
	     } 
	     @Override 
	     protected void paintComponent(Graphics g) { 
	      Graphics2D g2 = (Graphics2D) g; 

	      GradientPaint p; 
	      p = new GradientPaint(0, 0, new Color(0xFFFFFF), 0, getHeight(), getBackground()); 

	      Paint oldPaint = g2.getPaint(); 
	      g2.setPaint(p); 
	      g2.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 30, 30); 
	      g2.setPaint(oldPaint); 

	      super.paintComponent(g); 
	     }
	     protected void paintBorder(Graphics g) {
	         g.setColor(getForeground());
	         g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 30, 30);
	    }
	     public boolean contains(int x, int y) {
	         if (shape == null || !shape.getBounds().equals(getBounds())) {
	             shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 30, 30);
	         }
	         return shape.contains(x, y);
	    }
	}
	
	public class userFocus implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			String username = userF.getText().trim().toLowerCase();
			if(username.equals("user name")) {
				userF.setText("");
				userF.setForeground(Color.gray);
			}			
		}
		@Override
		public void focusLost(FocusEvent e) {
			String username = userF.getText().trim().toLowerCase();
			if(username.equals("user name") || username.equals("") ) {
				userF.setText("user name");
				userF.setForeground(Color.gray);
			}
		}
	}
	public taikhoan getTaikhoan() {
		return new taikhoan(userF.getText(),String.copyValueOf(passF.getPassword()));
	}
	
	public void showMessage(String message) {
        JOptionPane.showMessageDialog(LG, this, message, 0);
    }
	
	 public void addLoginListener(ActionListener listener) {
	        login.addActionListener(listener);
	    }
	 public void showLoginView() {
	       LG.setVisible(true); 
	    }
	 public void turnoffLogin(){
		 LG.setVisible(false);
	 }
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		if(userF.getText().equals("")) {
			showMessage("Enter User Name, Please!");
		}
		else if(passF.getText().equals("")) {
			showMessage("Enter Password, Please!");
		}
	}
	public class RoundJTextField extends JTextField{
		private static final long serialVersionUID = 1L;
		private Shape shape;
	    private int size;
	    public RoundJTextField(int size) {
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
	public class RoundJJPasswordField extends JPasswordField{
		private static final long serialVersionUID = 1L;
	    private Shape shape;
	    private int size;
	    public RoundJJPasswordField(int size) {
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

