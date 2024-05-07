/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import DataBase.JDBCUtil;
import Model.Hang;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Legion 5 Pro
 */
public class HangDAO implements DAOInterface<Hang> {

    public static HangDAO getIntance() {
        return new HangDAO();
    }

    @Override
    public int insert(Hang t) {
        int kq = 0;
        try {
            Connection c = JDBCUtil.getConnection();

            String sql = "INSERT INTO table_hang (maHangBay, tenHangBay) VALUES (?, ?)";

            //tao bien PreparedStatement
            PreparedStatement pre;
            pre = c.prepareStatement(sql);

            pre.setString(1, t.getMaHangBay());
            pre.setString(2, t.getTenHangBay());

            kq = pre.executeUpdate();

            JDBCUtil.closeConnection(c);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public int update(Hang t) {
        int kq = 0;
        try {
            Connection c = JDBCUtil.getConnection();

            String sql = "UPDATE table_Hang "
                    + " SET "
                    + " tenHangBay=?"
                    + " WHERE maHangBay=?";

            PreparedStatement preparedStatement = c.prepareStatement(sql);
            preparedStatement.setString(1, t.getTenHangBay());
            preparedStatement.setString(2, t.getMaHangBay());

            kq = preparedStatement.executeUpdate();

            JDBCUtil.closeConnection(c);

        } catch (SQLException ex) {
            Logger.getLogger(HangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return kq;
    }

    @Override
    public int delete(Hang t) {
        int kq = 0;
        try {
            Connection c = JDBCUtil.getConnection();
            String sql = " DELETE from table_Hang "
                    + " WHERE maHangBay=? ";

            PreparedStatement preparedStatement = c.prepareStatement(sql);
            preparedStatement.setString(1, t.getMaHangBay());

            kq = preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(HangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }

    @Override
    public ArrayList<Hang> selectAll() {
        ArrayList<Hang> kq = new ArrayList<>();
        try {
            Connection c = JDBCUtil.getConnection();
            String sql = "SELECT * FROM table_Hang ";

            PreparedStatement preparedStatement;
            preparedStatement = c.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String maHangBay = rs.getString("maHangBay");
                String tenHangBay = rs.getString("tenHangBay");
                Hang hang = new Hang(maHangBay, tenHangBay);
                kq.add(hang);
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            Logger.getLogger(HangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return kq;
    }

    @Override
    public Hang selectById(Hang t) {
        Hang kq = null;

        try {
            Connection c = JDBCUtil.getConnection();

            String sql = "SELECT * FROM table_hang WHERE maHangBay=?";

            PreparedStatement preparedStatement = c.prepareStatement(sql);
            preparedStatement.setString(1, t.getMaHangBay());

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String maHangBay = rs.getString("maHangBay");
                String tenHangBay = rs.getString("tenHangBay");

                kq = new Hang(maHangBay, tenHangBay);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            Logger.getLogger(HangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return kq;
    }

}
