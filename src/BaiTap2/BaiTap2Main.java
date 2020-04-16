/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;
import BaiTap1.NhanVien;
/**
 *
 * @author ltpnt
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IQuanLy qlnv = new QuanLyNhanVien();
        NhanVien nhanVien1 = new NhanVien("Lê Thành Phương", 21, "Cam Hòa", 2000000, 20);
        NhanVien nhanVien2 = new NhanVien("Nguyễn Hoàng Anh Tiến", 21, "Nha Trang", 3000000, 150);
        NhanVien nhanVien3 = new NhanVien("Hồ Lê Thanh Thiện", 21, "Khánh Hòa", 3800000, 200);
        NhanVien nhanVien4 = new NhanVien("Nguyễn Tấn Vĩnh", 21, "Khánh Hòa", 2500000, 195);
        NhanVien nhanVien5 = new NhanVien("Ngô Bá Khá", 25, "Nghệ An", 1000000, 190);
        qlnv.them(nhanVien1);
        qlnv.them(nhanVien2);
        qlnv.them(nhanVien3);
        qlnv.them(nhanVien4);
        qlnv.them(nhanVien5);
        qlnv.inDS();
    }
    
}
