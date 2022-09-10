package DAO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.swing.JOptionPane;

import DTO.taikhoan;
import GUI.DangNhap;

public class CheckLogin {
	
	private DangNhap dn;
	private taikhoan tk;
	
	 public CheckLogin(DangNhap view) {
	    	this.dn = view;
	    	view.addLoginListener(new check());
	    } 
	 class check implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tk = dn.getTaikhoan();
				Connection conn = null;
				Statement stmt = null;
				try {
					String username = "root";
					String password = "";
		            Class.forName("com.mysql.jdbc.Driver");
					String dbURL = "jdbc:mysql://127.0.0.1/quanlikhoahoc";
					conn = DriverManager.getConnection(dbURL,username,password);
					
					stmt = conn.createStatement();
					
					String Username = tk.getTentk();
					String Password = tk.getMk();
					String url = "SELECT * FROM taikhoan WHERE tentaikhoan='"+Username+"' AND matkhau='"+Password+"'";
					ResultSet rs = stmt.executeQuery(url);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Kết nối thành công");
					}
					else {
						JOptionPane.showMessageDialog(null, "dang nhap that bai");
					}
					conn.close();
				}
				catch(Exception b){
					System.out.println(b);
				}
			}	
	 	}
}
