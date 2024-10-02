package tuan5;

public abstract class HangHoa {
protected final String Mahang ;
protected String Tenhang;
protected double DonGia;
protected int Soluongtong;

public HangHoa(String mahang, String tenhang, double donGia, int soluongtong) {
	super();
	Mahang = mahang;
	Tenhang = tenhang;
	DonGia = donGia;
	Soluongtong = soluongtong;
}
public String getTenhang() {
	return Tenhang;
}
public void setTenhang(String tenhang) {
	Tenhang = tenhang;
}
public double getDonGia() {
	return DonGia;
}
public void setDonGia(double donGia) {
	DonGia = donGia;
}
public int getSoluongtong() {
	return Soluongtong;
}
public void setSoluongtong(int soluongtong) {
	Soluongtong = soluongtong;
}
public String getMahang() {
	return Mahang;
}
public abstract double getTienVAT();
public abstract String danhGia();
@Override
public String toString() {
	return "HangHoa [Mahang=" + Mahang + ", Tenhang=" + Tenhang + ", DonGia=" + DonGia + ", Soluongtong=" + Soluongtong
			+ "]";
}

}
