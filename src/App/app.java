package App;

import java.awt.EventQueue;

import DAO.CheckLogin;
import GUI.DangNhap;

public class app {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				DangNhap login = new DangNhap();
				new CheckLogin(login);
				login.showLoginView();
			}
		});
	}
}

