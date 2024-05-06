
package dao;
import Model.ChuyenBay;
import Model.Hang;
import Model.HangVe;
import Model.KhachHang;
import Model.MayBay;
import Model.SanBay;
import Model.Ve;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 *
 * @author Legion 5 Pro
 */
public class test {
    public static void main(String[] args) throws ParseException {
 //  SanBay sb = new SanBay("DN132");
   
//        MayBay mb = new MayBay("221");
       
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//        ChuyenBay cb = new ChuyenBay("VN252", "PQ", "DN",  df.parse("12/03/2024"),"22:00", df.parse("13/05/2024") ,"01:00" ,100000,50, mb, sb);
//        ArrayList<ChuyenBay> list = new ArrayList<>(); 
       // ChuyenBayDAO.getIntance().update(cb);
//        list = ChuyenBayDAO.getIntance().selectAll();
//        for (ChuyenBay chuyenBay : list) {
//            System.out.println(chuyenBay.toString());
//            System.out.println(chuyenBay.getMayBay().getHangMayBay().getTenHangBay() + chuyenBay.getMayBay().getHangMayBay().getMaHangBay());
//        }
//        ChuyenBay find = new ChuyenBay("VN252");
//        ChuyenBay kq = ChuyenBayDAO.getIntance().selectById(find);
//        int trong = kq.getsoChoConTrong();
//        trong--;
//        kq.setsoChoConTrong(trong);
//        ChuyenBayDAO.getIntance().update(kq);
//        System.out.println(kq.toString());
//        System.out.println(kq.getMayBay().getHangMayBay().getTenHangBay() + kq.getMayBay().getHangMayBay().getMaHangBay() ) ;
//        KhachHang kh = new KhachHang(0);
//        HangVe hv = new HangVe("VIP");
//        Ve ve = new Ve(52, df.parse("22/05/2024"),2000000 , find, kh, hv);
//        VeDAO.getIntance().insert(ve);
//        Ve timtheoId = VeDAO.getIntance().selectByIdKhachHang(0);
//        System.out.println(  timtheoId.toString());
        
        String diemDen = "DN" ;
        String diemDi = "PQ" ;
        ChuyenBay cb = new ChuyenBay(diemDi, diemDen, df.parse("12/03/2024"));
        
        ArrayList<ChuyenBay> listCB = ChuyenBayDAO.getIntance().timKiemChuyenBay(cb);
        for (ChuyenBay chuyenBay : listCB) {
            System.out.println(chuyenBay.toString());
        }
  }   
}
