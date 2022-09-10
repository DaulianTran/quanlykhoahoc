package DTO;

public class giangvien{
	private int magiangvien;
	private String tengiangvien;
	private String diachi;
	private String sdt;
	
	public giangvien() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public giangvien(int magiangvien, String tengiangvien, String diachi, String sdt) {
		super();
		this.magiangvien = magiangvien;
		this.tengiangvien = tengiangvien;
		this.diachi = diachi;
		this.sdt = sdt;
	}
	
	public int getMagiangvien() {
		return magiangvien;
	}
	public void setMagiangvien(int magiangvien) {
		this.magiangvien = magiangvien;
	}
	public String getTengiangvien() {
		return tengiangvien;
	}
	public void setTengiangvien(String tengiangvien) {
		this.tengiangvien = tengiangvien;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
}
