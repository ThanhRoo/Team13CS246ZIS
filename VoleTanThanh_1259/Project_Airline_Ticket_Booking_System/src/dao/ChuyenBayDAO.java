package dao;

import DataBase.JDBCUtil;
import Model.ChuyenBay;
import Model.Hang;
import Model.MayBay;
import Model.SanBay;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Legion 5 Pro
 */
public class ChuyenBayDAO implements DAOInterface<ChuyenBay> {

    public static ChuyenBayDAO getIntance() {
        return new ChuyenBayDAO();
    }

    @Override
    public int insert(ChuyenBay t) {
        int kq = 0;
        try {
            Connection c = JDBCUtil.getConnection();
            String sql = "INSERT INTO table_chuyenbay (maChuyenBay, diemDi, diemDen, thoiGianDi, gioCatCanh, thoiGianDen, gioHaCanh, soChoConTrong, gia, maSanBay, maMayBay) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = c.prepareStatement(sql);
            preparedStatement.setString(1, t.getMaChuyenBay());
            preparedStatement.setString(2, t.getDiemDi());
            preparedStatement.setString(3, t.getDiemDen());

            preparedStatement.setDate(4, new java.sql.Date(t.getThoiGianDi().getTime()));

            preparedStatement.setString(5, t.getGioCatCanh());
            preparedStatement.setDate(6, new java.sql.Date(t.getThoiGianDen().getTime()));
            preparedStatement.setString(7, t.getGioHaCanh());
            preparedStatement.setInt(8, t.getGia());
            preparedStatement.setInt(9, t.getsoChoConTrong());
            preparedStatement.setString(10, t.getSanBay().getMaSanBay());
            preparedStatement.setString(11, t.getMayBay().getMaMayBay());

            kq = preparedStatement.executeUpdate();
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenBayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return kq;
    }

    @Override
    public int update(ChuyenBay t) {
        int kq = 0;
        try {
            Connection c = JDBCUtil.getConnection();
            String sql = "UPDATE table_chuyenbay SET diemDi=?, diemDen=?, thoiGianDi=?, gioCatCanh=?, thoiGianDen=?, gioHaCanh=?, gia=?, soChoConTrong=?, maSanBay=?, maMayBay=? WHERE maChuyenBay=?";

            PreparedStatement preparedStatement = c.prepareStatement(sql);
            preparedStatement.setString(1, t.getDiemDi());
            preparedStatement.setString(2, t.getDiemDen());
            preparedStatement.setDate(3, new java.sql.Date(t.getThoiGianDi().getTime()));
            preparedStatement.setString(4, t.getGioCatCanh());
            preparedStatement.setDate(5, new java.sql.Date(t.getThoiGianDen().getTime()));
            preparedStatement.setString(6, t.getGioHaCanh());
            preparedStatement.setInt(7, t.getGia());
            preparedStatement.setInt(8, t.getsoChoConTrong());
            preparedStatement.setString(9, t.getSanBay().getMaSanBay());
            preparedStatement.setString(10, t.getMayBay().getMaMayBay());
            preparedStatement.setString(11, t.getMaChuyenBay());

            kq = preparedStatement.executeUpdate();
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenBayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return kq;
    }

    @Override
    public int delete(ChuyenBay t) {
        int kq = 0;
        try {
            Connection c = JDBCUtil.getConnection();
            String sql = "DELETE FROM table_chuyenbay WHERE maChuyenBay=?";

            PreparedStatement preparedStatement = c.prepareStatement(sql);
            preparedStatement.setString(1, t.getMaChuyenBay());

            kq = preparedStatement.executeUpdate();
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenBayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return kq;
    }

    @Override
    public ArrayList<ChuyenBay> selectAll() {
        ArrayList<ChuyenBay> kq = new ArrayList<>();

        try {
            Connection c = JDBCUtil.getConnection();

            String sql = "SELECT * FROM table_chuyenbay "
                    + "JOIN table_sanbay ON table_chuyenbay.maSanBay = table_sanbay.maSanBay "
                    + "JOIN table_maybay ON table_chuyenbay.maMayBay = table_maybay.maMayBay "
                    + "JOIN table_hang ON table_maybay.maHangBay = table_hang.maHangBay";

            PreparedStatement preparedStatement = c.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            //table_maybay.soGhe, table_maybay.maHangBay, table_hang.tenHangBay
            while (rs.next()) {
                String maChuyenBay = rs.getString("maChuyenBay");
                String diemDi = rs.getString("diemDi");
                String diemDen = rs.getString("diemDen");

                java.sql.Date thoiGianDi = rs.getDate("thoiGianDi");

                String gioCatCanh = rs.getString("gioCatCanh");
                java.sql.Date thoiGianDen = rs.getDate("thoiGianDen");
                String gioHaCanh = rs.getString("gioHaCanh");
                int gia = rs.getInt("gia");
                int soChoConTrong = rs.getInt("soChoConTrong");
                String maSanBay = rs.getString("maSanBay");
                String tenSanBay = rs.getString("tenSanBay");
                String diaChi = rs.getString("diaChi");
                String maMayBay = rs.getString("maMayBay");
                String loaiMayBay = rs.getString("loaiMayBay");
                int soGhe = rs.getInt("soGhe");
                String maHangBay = rs.getString("maHangBay");
                String tenHangBay = rs.getString("tenHangBay");

                Hang hang = new Hang(maHangBay, tenHangBay);
                SanBay sanBay = new SanBay(maSanBay, tenSanBay, diaChi);
                MayBay mayBay = new MayBay(maMayBay, loaiMayBay, soGhe, hang);

                ChuyenBay chuyenBay = new ChuyenBay(maChuyenBay, diemDi, diemDen, new Date(thoiGianDi.getTime()), gioCatCanh, new Date(thoiGianDen.getTime()), gioHaCanh, gia, soChoConTrong, mayBay, sanBay);
                kq.add(chuyenBay);
                JDBCUtil.closeConnection(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenBayDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ChuyenBayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return kq;
    }

    @Override
    public ChuyenBay selectById(ChuyenBay t) {
        ChuyenBay kq = null;

        try {
            Connection c = JDBCUtil.getConnection();
            String sql = "SELECT * FROM table_chuyenbay "
                    + "JOIN table_sanbay ON table_chuyenbay.maSanBay = table_sanbay.maSanBay "
                    + "JOIN table_maybay ON table_chuyenbay.maMayBay = table_maybay.maMayBay "
                    + "JOIN table_hang ON table_maybay.maHangBay = table_hang.maHangBay "
                    + "WHERE maChuyenBay=?";

            PreparedStatement preparedStatement = c.prepareStatement(sql);
            preparedStatement.setString(1, t.getMaChuyenBay());

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String maChuyenBay = rs.getString("maChuyenBay");
                String diemDi = rs.getString("diemDi");
                String diemDen = rs.getString("diemDen");

                java.sql.Date thoiGianDi = rs.getDate("thoiGianDi");

                String gioCatCanh = rs.getString("gioCatCanh");
                java.sql.Date thoiGianDen = rs.getDate("thoiGianDen");
                String gioHaCanh = rs.getString("gioHaCanh");
                int gia = rs.getInt("gia");
                int soChoConTrong = rs.getInt("soChoConTrong");
                String maSanBay = rs.getString("maSanBay");
                String tenSanBay = rs.getString("tenSanBay");
                String diaChi = rs.getString("diaChi");
                String maMayBay = rs.getString("maMayBay");
                String loaiMayBay = rs.getString("loaiMayBay");
                int soGhe = rs.getInt("soGhe");
                String maHangBay = rs.getString("maHangBay");
                String tenHangBay = rs.getString("tenHangBay");

                Hang hang = new Hang(maHangBay, tenHangBay);
                SanBay sanBay = new SanBay(maSanBay, tenSanBay, diaChi);
                MayBay mayBay = new MayBay(maMayBay, loaiMayBay, soGhe, hang);

                kq = new ChuyenBay(maChuyenBay, diemDi, diemDen, new Date(thoiGianDi.getTime()), gioCatCanh, new Date(thoiGianDen.getTime()), gioHaCanh, gia, soChoConTrong, mayBay, sanBay);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(ChuyenBayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return kq;
    }

    public ArrayList<ChuyenBay> timKiemChuyenBay(ChuyenBay t) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<ChuyenBay> kq = new ArrayList<>();
        
        try {
            Connection c = JDBCUtil.getConnection();
        String sql = "SELECT * FROM table_chuyenbay "
                + "JOIN table_sanbay ON table_chuyenbay.maSanBay = table_sanbay.maSanBay "
                + "JOIN table_maybay ON table_chuyenbay.maMayBay = table_maybay.maMayBay "
                + "JOIN table_hang ON table_maybay.maHangBay = table_hang.maHangBay "
                + "WHERE diemDi =? AND diemDen=? AND thoiGianDi=?";
            PreparedStatement preparedStatement = c.prepareStatement(sql);
            preparedStatement.setString(1, t.getDiemDi());
            preparedStatement.setString(2, t.getDiemDen());
            preparedStatement.setDate(3, new java.sql.Date(t.getThoiGianDi().getTime()));
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                                 String maChuyenBay = rs.getString("maChuyenBay");
                String diemDi = rs.getString("diemDi");
                String diemDen = rs.getString("diemDen");

                java.sql.Date thoiGianDi = rs.getDate("thoiGianDi");

                String gioCatCanh = rs.getString("gioCatCanh");
                java.sql.Date thoiGianDen = rs.getDate("thoiGianDen");
                String gioHaCanh = rs.getString("gioHaCanh");
                int gia = rs.getInt("gia");
                int soChoConTrong = rs.getInt("soChoConTrong");
                String maSanBay = rs.getString("maSanBay");
                String tenSanBay = rs.getString("tenSanBay");
                String diaChi = rs.getString("diaChi");
                String maMayBay = rs.getString("maMayBay");
                String loaiMayBay = rs.getString("loaiMayBay");
                int soGhe = rs.getInt("soGhe");
                String maHangBay = rs.getString("maHangBay");
                String tenHangBay = rs.getString("tenHangBay");

                Hang hang = new Hang(maHangBay, tenHangBay);
                SanBay sanBay = new SanBay(maSanBay, tenSanBay, diaChi);
                MayBay mayBay = new MayBay(maMayBay, loaiMayBay, soGhe, hang);

                ChuyenBay chuyenBay = new ChuyenBay(maChuyenBay, diemDi, diemDen, new Date(thoiGianDi.getTime()), gioCatCanh, new Date(thoiGianDen.getTime()), gioHaCanh, gia, soChoConTrong, mayBay, sanBay);
                kq.add(chuyenBay);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenBayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ParseException ex) {
            Logger.getLogger(ChuyenBayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

        return kq;
    }

}
