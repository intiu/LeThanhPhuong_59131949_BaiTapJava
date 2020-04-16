/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author ltpnt
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinhVienPoly sinhvienpoly = new SinhVienIT(8, 7, 6,"Lê Thành Phương");
        SinhVienIT sinhvienit = new SinhVienIT(5, 10, 7, "Nguyễn Hoàng Anh Tiến");
        SinhVienBiz sinhvienbiz = new SinhVienBiz(9, 9.3, "Nguyễn Tấn Vĩnh");
        sinhvienpoly.xuat();
        sinhvienit.xuat();
        sinhvienbiz.xuat();
    }
    
}
