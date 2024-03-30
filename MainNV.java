package quanliNV;
import java.util.* ;
public class MainNV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLiNhanVien listNV = new QuanLiNhanVien();
		
		do {
			 System.out.println(" ");
	         System.out.println("1. Nhập thông tin nhân viên");
	         System.out.println("2. Xuất thông tin nhân viên");
	         System.out.println("3. Tìm nhân viên theo mã cá nhân");
	         System.out.println("4. Xuất danh sách nhân viên theo mã");
	         System.out.println("0. Thoát chương trình");        
	         System.out.println(" ");
	         int n;
	         do {
	            try {
	               int num = sc.nextInt();
	               if (num>=0 && num<5){
	                  n = num;
	                  break;
	               } else {
	                  System.out.println("Vui lòng chỉ nhập số từ 0 --> 4");
	               }
	            } catch (Exception e) {
	               System.out.println("Vui lòng chỉ nhập số nguyên từ 0 --> 4");
	               sc.nextLine();
	            }
	         } while (true);
	         switch (n){
	            case 1:	               
	            	listNV.nhapDS();
	            	System.out.println("---------------");
	               break;
	            case 2:
	            	listNV.xuatDS();
	               break;
	            case 3:       	
	            	listNV.timNVtheoMa();
	               break;
	            case 4:
	            	System.out.print("Nhập lương tối thiểu: ");
                    int luongMin = sc.nextInt();
                    System.out.print("Nhập lương tối đa: ");
                    int luongMax = sc.nextInt();
	            	listNV.xuatTheoLuong(luongMin, luongMax);
	            	System.out.println("_____________________");
	               break;
	            case 0:
	               break ;
	         }

	      }while (true);
	   }

}
