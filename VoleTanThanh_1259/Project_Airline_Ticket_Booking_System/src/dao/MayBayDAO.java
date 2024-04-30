/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import DataBase.JDBCUtil;
import Model.Hang;
import Model.MayBay;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Legion 5 Pro
 */
public class MayBayDAO implements DAOInterface<MayBay> {

    public static MayBayDAO getIntance() {
        return new MayBayDAO();
    }

    @Override
    public int insert(MayBay t) {
        int kq = 0;
        try {
            Connection c = JDBCUtil.getConnection();

            String sql = "INSERT INTO table_maybay (maMayBay, loaiMayBay, soGhe, maHangBay) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = c.prepareStatement(sql);
            // Thiết lập các tham số cho câu lệnh SQL
            preparedStatement.setString(1, t.getMaMayBay());
            preparedStatement.setString(2, t.getLoaiMayBay());
            preparedStatement.setInt(3, t.getSoGhe());
            preparedStatement.setString(4, t.getHangMayBay().getMaHangBay());

            // Thực thi câu lệnh SQL và nhận số hàng bị ảnh hưởng
            kq = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public int update(MayBay t) {
        int kq = 0;

        try {
            Connection c = JDBCUtil.getConnection();
            String sql = " UPDATE table_maybay"
                    + " SET "
                    + " loaiMayBay=? "
                    + ", soGhe=?"
                    + ", maHangBay=?"
                    + "WHERE maMayBay=?";

            PreparedStatement preparedStatement = c.prepareStatement(sql);
            preparedStatement.setString(1, t.getLoaiMayBay());
            preparedStatement.setInt(2, t.getSoGhe());
            preparedStatement.setString(3, t.getHangMayBay().getMaHangBay());
            preparedStatement.setString(4, t.getMaMayBay());
            kq = preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MayBayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return kq;
    }

    @Override
    public int delete(MayBay t) {
        int kq = 0;
        try {
            Connection c = JDBCUtil.getConnection();
            String sql = "DELETE FROM table_maybay WHERE maMayBay=? ";
            PreparedStatement preparedStatement = c.prepareStatement(sql);
            preparedStatement.setString(1, t.getMaMayBay());
            kq = preparedStatement.executeUpdate();
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public ArrayList<MayBay> selectAll() {
        ArrayList<MayBay> kq = new ArrayList<>();

        Connection connection = JDBCUtil.getConnection();

        try {
            String sql = "SELECT table_maybay.maMayBay, table_maybay.loaiMayBay, table_maybay.soGhe, table_maybay.maHangBay, table_hang.tenHangBay "
                    + "FROM table_maybay "
                    + "JOIN table_hang ON table_maybay.maHangBay = table_hang.maHangBay";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);;

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maMayBay = resultSet.getString("maMayBay");
                String loaiMayBay = resultSet.getString("loaiMayBay");
                int soGhe = resultSet.getInt("soGhe");
                String maHangBay = resultSet.getString("maHangBay");
                String tenHangBay = resultSet.getString("tenHangBay");
                Hang hang = new Hang(maHangBay, tenHangBay);
                MayBay mayBay = new MayBay(maMayBay, loaiMayBay, soGhe, hang);

                kq.add(mayBay);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public MayBay selectById(MayBay t) {
        MayBay kq = null;

        return kq;
    }

}
