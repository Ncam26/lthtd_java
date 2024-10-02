package tuan5;

public class HangDienMay extends HangHoa {
private int Thoigianbaohanh;
private double Congsuat;

	public HangDienMay(String mahang, String tenhang, double donGia, int soluongtong, int thoigianbaohanh,
		double congsuat) {
	super(mahang, tenhang, donGia, soluongtong);
	Thoigianbaohanh = thoigianbaohanh;
	Congsuat = congsuat;
}
	public int getThoigianbaohanh() {
		return Thoigianbaohanh;
	}


	public void setThoigianbaohanh(int thoigianbaohanh) throws IllegalAccessException {
		if (thoigianbaohanh >0) {
			throw new IllegalAccessException("thoigianbaohanh>=0");
		} 
		Thoigianbaohanh = thoigianbaohanh;
	}


	public double getCongsuat() throws IllegalAccessException {
		if (Congsuat<0) {
			throw new  IllegalAccessException("congsuat>=0");
		}
		return Congsuat;
	}


	public void setCongsuat(double congsuat) {
		Congsuat = congsuat;
	}


	public HangDienMay(String mahang, String tenhang, double donGia, int soluongtong) {
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
