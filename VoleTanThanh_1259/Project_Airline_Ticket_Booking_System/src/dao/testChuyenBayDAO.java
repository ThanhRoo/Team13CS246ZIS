/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.ChuyenBay;
import Model.MayBay;
import Model.SanBay;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Legion 5 Pro
 */
public class testChuyenBayDAO {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        MayBay mb = new MayBay("221");
        SanBay sb = new SanBay("SG511");
        ChuyenBay chuyenBay = new ChuyenBay("VN123", "Nghe An123", "Ha Noi", df.parse("22/05/2024"), "12:00", df.parse("22/05/2024"), "01:00", 1800000, 60, mb, sb);
        //       ChuyenBayDAO.getIntance().insert(chuyenBay);

        ChuyenBay chuyenBay1 = new ChuyenBay("VN123", "Nghe An", "Ha Noi", df.parse("22/05/2024"), "12:00", df.parse("22/05/2024"), "01:00", 1800000, 60, mb, sb);
//       ChuyenBayDAO.getIntance().update(chuyenBay1);
//       ChuyenBayDAO.getIntance().delete(chuyenBay);

//        ChuyenBay cb = new ChuyenBay("VN252", "PQ", "DN",  df.parse("12/03/2024"),"22:00", df.parse("13/05/2024") ,"01:00" ,100000,50, mb, sb);
//        ChuyenBay findID = new ChuyenBay("vn12");
//        ChuyenBay result = ChuyenBayDAO.getIntance().selectById(findID);
//        System.out.println(result.toString());
    }

}
