package quanliNV;
import java.util.* ;
public class QuanLiNhanVien {
	ArrayList<NhanVien> nv = new ArrayList<NhanVien>() ;
	static Scanner sc = new Scanner(System.in) ;
	
	// nhập 1 danh sách đối tượng nhân viên
	public void nhapDS() {
		System.out.println("Nhập tên nhân viên: ");
		String ten = sc.nextLine();
		
		System.out.println("Nhập mã số nhân viên: ");
		String maNV = sc.nextLine();
		
		System.out.println("Nhập lương của nhân viên: "); 
		int luong = Integer.parseInt(sc.nextLine()) ;
		
		
		NhanVien NV = new NhanVien(ten,maNV,luong) ;
		nv.add(NV);
	}
	
	// xuất danh sách các đối tượng nhân viên
	public void xuatDS() {
		System.out.println("===== Thông tin nhân viên =====");
		for(NhanVien x : nv) {
			x.inThongTin();
		}
		System.out.println("______________________________");
	}
	
	// tìm kiếm nhân viên theo mã
	public void timNVtheoMa() {
		System.out.println("Nhập mã nhân viên cần rìm: ");
		String timMa = sc.nextLine();
		
		int count = 0 ;
		System.out.println(" ");
		System.out.println("Thông tin nhân viên tìm được: ");
		
		for(int i = 0 ; i < nv.size() ; i++) {
			if(nv.get(i).getMaNV().equals(timMa)) {
				count ++ ;
				nv.get(i).inThongTin();
				System.out.println(" ");
				System.out.println("___________________________");
			}
		}
		
		if(count == 0) {
			System.out.println("====> không tìm thấy nhân viên nào có mã số này <====");
			System.out.println(" ");
		}
	}
	
	//xuất ds nhân viên theo bảng lương
	public void xuatTheoLuong(int luongMin , int luongMax) {
		System.out.println("Danh sách các nhân viên nằm trong khoảng lương:");
		System.out.println(" ");
		boolean vungluong = false ;
		for(NhanVien x : nv) {
			if(x.getLuong() >= luongMin && x.getLuong() <= luongMax) {
				x.inThongTin();
				System.out.println(" ---------------------");
				vungluong = true ;
			}
		}
		if(!vungluong){			
			System.out.println("----không có nhân viên nào trong khoảng lương này----");
			System.out.println(" ---------------------");
		}
	}
	
	
	
	
	
	
	
	
//end
} 
