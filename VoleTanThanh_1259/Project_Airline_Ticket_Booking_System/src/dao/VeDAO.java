package dao;

import DataBase.JDBCUtil;
import Model.ChuyenBay;
import Model.Hang;
import Model.HangVe;
import Model.KhachHang;
import Model.MayBay;
import Model.SanBay;
import Model.Ve;
import java.util.ArrayList;
import java.sql.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Legion 5 Pro
 */
public class VeDAO implements DAOInterface<Ve> {

    public static VeDAO getIntance() {
        return new VeDAO();
    }

    @Override
public int insert(Ve t) {
    int kq = 0;

    try {
        Connection c = JDBCUtil.getConnection();
        String sql = "INSERT INTO table_ve (soGheChon, ngayDat, maHangVe, tongTien, maChuyenBay, maKhachHang) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = c.prepareStatement(sql);
        preparedStatement.setInt(1, t.getSoGheChon());
        preparedStatement.setDate(2, new java.sql.Date(t.getNgayDat().getTime()));
        preparedStatement.setString(3, t.getHangVe().getMaHangVe());
        preparedStatement.setInt(4, t.getTongTien());
        preparedStatement.setString(5, t.getChuyenBay().getMaChuyenBay());
        preparedStatement.setInt(6, t.getKhachHang().getMaKhachHang());
        kq = preparedStatement.executeUpdate();
        JDBCUtil.closeConnection(c);
    } catch (SQLException ex) {
        Logger.getLogger(VeDAO.class.getName()).log(Level.SEVERE, null, ex);
    }

    return kq;
}
    @Override
    public int update(Ve t) {
        int kq = 0;

        return kq;
    }

    @Override
    public int delete(Ve t) {
        int kq = 0;

        return kq;
    }

    @Override
    public ArrayList<Ve> selectAll() {
        ArrayList<Ve> kq = new ArrayList<>();

        return kq;
    }

    @Override
    public Ve selectById(Ve t) {
        Ve kq = null;

        return kq;
    }
    

    public Ve selectByIdKhachHang(int mkh) {
    Ve kq = null;
    Connection c = null;
    PreparedStatement preparedStatement = null;
    ResultSet rs = null;

    try {
        c = JDBCUtil.getConnection();
        String sql = "SELECT * FROM table_ve "
        + "JOIN table_khachhang ON table_ve.maKhachHang = table_khachhang.maKhachHang "
        + "JOIN table_hangve ON table_ve.maHangVe = table_hangve.maHangVe "
        + "WHERE table_ve.maKhachHang = ?";

        preparedStatement = c.prepareStatement(sql);
        preparedStatement.setInt(1, mkh);
        rs = preparedStatement.executeQuery();

        while (rs.next()) {
            int maVe = rs.getInt("maVe");
            int soGhe = rs.getInt("soGheChon");
            java.sql.Date ngayDat = rs.getDate("ngayDat");
            HangVe hv = new HangVe(rs.getString("maHangVe"), rs.getString("tenHangVe"));
            int tongTien = rs.getInt("tongTien");

            String maChuyenBay = rs.getString("maChuyenBay");
            

            int maKhachHang = rs.getInt("maKhachHang");
            String ho = rs.getString("ho");
            String ten = rs.getString("ten");
            String sdt = rs.getString("SDT");
            java.sql.Date ngaySinh = rs.getDate("ngaySinh");
            String cccd = rs.getString("CCCD");
            String quocTich = rs.getString("quocTich");

            
            KhachHang kh = new KhachHang(ho, ten, sdt, ngaySinh, cccd, quocTich);
            
            ChuyenBay find = new ChuyenBay(maChuyenBay);
            ChuyenBay cb = ChuyenBayDAO.getIntance().selectById(find);

            kq = new Ve(maVe, soGhe, ngayDat, tongTien, cb, kh, hv);
        }
    } catch (SQLException ex) {
        Logger.getLogger(VeDAO.class.getName()).log(Level.SEVERE, null, ex);
    }   catch (ParseException ex) { 
            Logger.getLogger(VeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    return kq;

    }
}
