
package dao;
import Model.ChuyenBay;
import Model.Hang;
import Model.MayBay;
import Model.SanBay;
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
   SanBay sb = new SanBay("DN132");
   
        MayBay mb = new MayBay("221");
        ArrayList<ChuyenBay> list = new ArrayList<>(); 
//        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//        ChuyenBay cb = new ChuyenBay("VN252", "PQ", "DN",  df.parse("12/03/2024"),"22:00", df.parse("13/05/2024") ,"01:00" ,100000, mb, sb);
//        ChuyenBayDAO.getIntance().update(cb);
        list = ChuyenBayDAO.getIntance().selectAll();
        for (ChuyenBay chuyenBay : list) {
            System.out.println(chuyenBay.toString());
        }
  }   
}
