package App;

import java.awt.EventQueue;

//import DAO.CheckLogin;
//import GUI.DangNhap;
import GUI.course;

public class app {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					course frame = new course();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

