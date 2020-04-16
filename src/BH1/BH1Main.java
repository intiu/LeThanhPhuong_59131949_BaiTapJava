/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BH1;
import BH1.CaNhan;
/**
 *
 * @author ltpnt
 */
public class BH1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LopHoc lophoc = new LopHoc();
        HocSinh hocSinh1 = new HocSinh("59CNTT3", "đọc sách", "Lê Thành Phương", 21, "Cam Hòa", "0947814411");
        HocSinh hocSinh2 = new HocSinh("59CNTT3", "đọc rap", "Nguyễn Hoàng Anh Tiến", 21, "Nha Trang", "091234551");
        GiaoVien giaoVien1 = new GiaoVien("Phát triển ứng dụng web", "Công nghệ phần mềm", "Võ Chí Thành", 30, "Nha Trang", "012345678");
        GiaoVien giaoVien2 = new GiaoVien("Lập trình thiết bị di động", "Công nghệ phần mềm", "Huỳnh Tuấn Anh", 32, "Nha Trang", "012345678");
        
        lophoc.themHocSinh(hocSinh1);
        lophoc.themHocSinh(hocSinh2);
        lophoc.themGVGD(giaoVien1);
        lophoc.themGVGD(giaoVien2);
        
        lophoc.inDSHS();
        lophoc.inDSGVGD();
    }
    
}
