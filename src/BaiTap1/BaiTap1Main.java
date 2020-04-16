/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author ltpnt
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("Lê Thành Phương", 21, "Cam Hòa", 1000000, 200);
        NhanVien nhanVien2 = new NhanVien("Nguyễn Hoàng Anh Tiến", 21, "Nha Trang", 1500000, 150);
        System.out.println(nhanVien1.getThongTin()+"Tiền Thưởng:"+nhanVien1.tinhThuong());
        System.out.println(nhanVien2.getThongTin()+"Tiền Thưởng:"+nhanVien2.tinhThuong());
    }
    
}
