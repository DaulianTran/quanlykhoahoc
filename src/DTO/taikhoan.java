package DTO;

public class taikhoan {
	private String tentk;
	private String mk;
	
	public taikhoan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public taikhoan(String tentk, String mk) {
		super();
		this.tentk = tentk;
		this.mk = mk;
	}
	public String getTentk() {
		return tentk;
	}
	public void setTentk(String tentk) {
		this.tentk = tentk;
	}
	public String getMk() {
		return mk;
	}
	public void setMk(String mk) {
		this.mk = mk;
	}
	
	
}
