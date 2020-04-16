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
    public static void main(String[] args){
        IQuanLy qlnv = new QuanLyNhanVien();
        NhanVien nhanvien1 = new NhanVien("Lê Thành Phương", 21, "Cam Hòa", 2000000, 20);
        NhanVien nhanvien2 = new NhanVien("Nguyễn Hoàng Anh Tiến", 21, "Nha Trang", 3000000, 150);
        NhanVien nhanvien3 = new NhanVien("Hồ Lê Thanh Thiện", 21, "Khánh Hòa", 3800000, 200);
        NhanVien nhanvien4 = new NhanVien("Nguyễn Tấn Vĩnh", 21, "Khánh Hòa", 2500000, 195);
        NhanVien nhanvien5 = new NhanVien("Ngô Bá Khá", 25, "Nghệ An", 1000000, 190);
        qlnv.them(nhanvien1);
        qlnv.them(nhanvien2);
        qlnv.them(nhanvien3);
        qlnv.them(nhanvien4);
        qlnv.them(nhanvien5);
        qlnv.inDS();
    }
    
}
