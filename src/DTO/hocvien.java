package DTO;

import java.util.Date;

public class hocvien {
	private int mahocvien;
	private String tenhocvien;
	private String diachi;
	private Date ngaysinh;
	private String dienthoai;
	
	
	public hocvien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public hocvien(int mahocvien, String tenhocvien, String diachi, Date ngaysinh, String dienthoai) {
		super();
		this.mahocvien = mahocvien;
		this.tenhocvien = tenhocvien;
		this.diachi = diachi;
		this.ngaysinh = ngaysinh;
		this.dienthoai = dienthoai;
	}
	
	public int getMahocvien() {
		return mahocvien;
	}
	public void setMahocvien(int mahocvien) {
		this.mahocvien = mahocvien;
	}
	public String getTenhocvien() {
		return tenhocvien;
	}
	public void setTenhocvien(String tenhocvien) {
		this.tenhocvien = tenhocvien;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getDienthoai() {
		return dienthoai;
	}
	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}
	
	
}
