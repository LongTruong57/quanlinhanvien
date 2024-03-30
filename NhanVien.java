package quanliNV;

public class NhanVien {
	private String ten ;
	private String maNV ;
	private int luong ;
	
	// contructor mặc định
	public NhanVien () {
		
	}
	
	// contructor có tham số
	public NhanVien(String ten , String maNV , int luong) {
		this.ten = ten ;
		this.maNV = maNV ;
		this.luong = luong ; 		
	}

	// getter vs setter
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}
	
	// inthongtin
	public void inThongTin() {
		System.out.println("Tên nhân viên: " + this.ten);
		System.out.println("Mã nhân viên: " + this.maNV);
		System.out.println("lương của nhân viên sau khi nhân với 90 : " + tinhLuong() + "đ");
	}
	
	//tinhluong
	public int tinhLuong() {
		return luong*90 ;
	}
	
	
	
	
//	end
}
