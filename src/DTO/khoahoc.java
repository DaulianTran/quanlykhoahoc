package DTO;

public class khoahoc {
	
	public khoahoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public khoahoc(int makhoahoc, String tenkhoahoc, int sotiet, int ngaybatdau, int ngayketthuc) {
		super();
		this.makhoahoc = makhoahoc;
		this.tenkhoahoc = tenkhoahoc;
		this.sotiet = sotiet;
		this.ngaybatdau = ngaybatdau;
		this.ngayketthuc = ngayketthuc;
	}
	
	private int makhoahoc;
	private String tenkhoahoc;
	private int sotiet;
	private int ngaybatdau;
	private int ngayketthuc;
	
	public int getMakhoahoc() {
		return makhoahoc;
	}
	public void setMakhoahoc(int makhoahoc) {
		this.makhoahoc = makhoahoc;
	}
	public String getTenkhoahoc() {
		return tenkhoahoc;
	}
	public void setTenkhoahoc(String tenkhoahoc) {
		this.tenkhoahoc = tenkhoahoc;
	}
	public int getSotiet() {
		return sotiet;
	}
	public void setSotiet(int sotiet) {
		this.sotiet = sotiet;
	}
	public int getNgaybatdau() {
		return ngaybatdau;
	}
	public void setNgaybatdau(int ngaybatdau) {
		this.ngaybatdau = ngaybatdau;
	}
	public int getNgayketthuc() {
		return ngayketthuc;
	}
	public void setNgayketthuc(int ngayketthuc) {
		this.ngayketthuc = ngayketthuc;
	}
	
}
