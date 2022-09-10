package DTO;

public class lophoc {
	private int malophoc;
	private String tenlophoc;
	private int makhoahoc;
	private int thu;
	private int tietbatdau;
	private int sotiet;
	private int soluonghocvien;
	private String phonghoc;
	private int magiangvien;
	
	public lophoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public lophoc(int malophoc, String tenlophoc, int makhoahoc, int thu, int tietbatdau, int sotiet,
			int soluonghocvien, String phonghoc, int magiangvien) {
		super();
		this.malophoc = malophoc;
		this.tenlophoc = tenlophoc;
		this.makhoahoc = makhoahoc;
		this.thu = thu;
		this.tietbatdau = tietbatdau;
		this.sotiet = sotiet;
		this.soluonghocvien = soluonghocvien;
		this.phonghoc = phonghoc;
		this.magiangvien = magiangvien;
	}

	public int getMalophoc() {
		return malophoc;
	}
	public void setMalophoc(int malophoc) {
		this.malophoc = malophoc;
	}
	public String getTenlophoc() {
		return tenlophoc;
	}
	public void setTenlophoc(String tenlophoc) {
		this.tenlophoc = tenlophoc;
	}
	public int getMakhoahoc() {
		return makhoahoc;
	}
	public void setMakhoahoc(int makhoahoc) {
		this.makhoahoc = makhoahoc;
	}
	public int getThu() {
		return thu;
	}
	public void setThu(int thu) {
		this.thu = thu;
	}
	public int getTietbatdau() {
		return tietbatdau;
	}
	public void setTietbatdau(int tietbatdau) {
		this.tietbatdau = tietbatdau;
	}
	public int getSotiet() {
		return sotiet;
	}
	public void setSotiet(int sotiet) {
		this.sotiet = sotiet;
	}
	public int getSoluonghocvien() {
		return soluonghocvien;
	}
	public void setSoluonghocvien(int soluonghocvien) {
		this.soluonghocvien = soluonghocvien;
	}
	public String getPhonghoc() {
		return phonghoc;
	}
	public void setPhonghoc(String phonghoc) {
		this.phonghoc = phonghoc;
	}
	public int getMagiangvien() {
		return magiangvien;
	}
	public void setMagiangvien(int magiangvien) {
		this.magiangvien = magiangvien;
	}
	
	
}
