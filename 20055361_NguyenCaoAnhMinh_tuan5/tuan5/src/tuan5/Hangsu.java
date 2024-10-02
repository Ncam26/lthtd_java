package tuan5;

import java.time.LocalDate;

public class Hangsu extends HangHoa{
 private String Ngaysanxuat;
 private LocalDate Ngaynhapkho;
 
	public Hangsu(String mahang, String tenhang, double donGia, int soluongtong, String ngaysanxuat,
		LocalDate ngaynhapkho) {
	super(mahang, tenhang, donGia, soluongtong);
	Ngaysanxuat = ngaysanxuat;
	Ngaynhapkho = ngaynhapkho;
}

	public String getNgaysanxuat() {
		return Ngaysanxuat;
	}

	public void setNgaysanxuat(String ngaysanxuat) {
		Ngaysanxuat = ngaysanxuat;
	}

	public LocalDate getNgaynhapkho() {
		return Ngaynhapkho;
	}

	public void setNgaynhapkho(LocalDate ngaynhapkho) {
		Ngaynhapkho = ngaynhapkho;
	}

	@Override
	public String toString() {
		return "Hangsu [Ngaysanxuat=" + Ngaysanxuat + ", Ngaynhapkho=" + Ngaynhapkho + "]";
	}

	public Hangsu(String mahang, String tenhang, double donGia, int soluongtong) {
		super(mahang, tenhang, donGia, soluongtong);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getTienVAT() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String danhGia() {
		// TODO Auto-generated method stub
		return null;
	}

}
