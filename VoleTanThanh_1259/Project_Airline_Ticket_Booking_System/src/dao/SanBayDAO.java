/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import DataBase.JDBCUtil;
import Model.SanBay;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Legion 5 Pro
 */
public class SanBayDAO implements DAOInterface<SanBay> {
    
    public static SanBayDAO getIntance() {
        return new SanBayDAO();
    }
    
    @Override
    public int insert(SanBay t) {
        int kq = 0;
        
        try {
            Connection c = JDBCUtil.getConnection();
            
            String sql = " INSERT INTO table_sanbay (maSanBay, tenSanBay, diaChi) VALUES (?, ?, ?)";
            
            PreparedStatement preparedStatement = c.prepareStatement(sql);
            
            preparedStatement.setString(1, t.getMaSanBay());
            preparedStatement.setString(2, t.getTenSanBay());
            preparedStatement.setString(3, t.getDiaChi());
            
            kq = preparedStatement.executeUpdate();
            
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            Logger.getLogger(SanBayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return kq;
    }
    
    @Override
    public int update(SanBay t) {
        int kq = 0;
        
        try {
            Connection c = JDBCUtil.getConnection();
            
            String sql = "UPDATE table_sanbay "
                    + " SET "
                    + " tenSanBay=?"
                    + ", diaChi=?"
                    + " WHERE maSanBay=?";
            
            PreparedStatement preparedStatement = c.prepareStatement(sql);
            
            preparedStatement.setString(1, t.getTenSanBay());
            preparedStatement.setString(2, t.getDiaChi());
            preparedStatement.setString(3, t.getMaSanBay());
            kq = preparedStatement.executeUpdate();
            
            JDBCUtil.closeConnection(c);
            
        } catch (SQLException ex) {
            Logger.getLogger(SanBayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return kq;
    }
    
    @Override
    public int delete(SanBay t) {
        int kq = 0;
        
        try {
            Connection c = JDBCUtil.getConnection();
            
            String sql = " DELETE FROM table_sanbay "
                    + " WHERE maSanBay=? ";
            
            PreparedStatement preparedStatement = c.prepareStatement(sql);
            
            preparedStatement.setString(1, t.getMaSanBay());
            kq = preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(SanBayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return kq;
    }
    
    @Override
    public ArrayList<SanBay> selectAll() {
        ArrayList<SanBay> kq = new ArrayList<>();
        try {
            Connection c = JDBCUtil.getConnection();
            
            String sql = "SELECT * FROM table_sanbay ";
            
            PreparedStatement preparedStatement = c.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String maSanBay = rs.getString("maSanBay");
                String tenSanBay = rs.getString("tenSanBay");
                String diaChi = rs.getString("diaChi");
                SanBay sanbay = new SanBay(maSanBay, tenSanBay, diaChi);
                kq.add(sanbay);
            }
            
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            Logger.getLogger(SanBayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    @Override
    public SanBay selectById(SanBay t) {
        SanBay kq = null;
        
        try {
            Connection c = JDBCUtil.getConnection();
            
            String sql = "SELECT * FROM table_sanbay WHERE maSanBay=?";
            
            PreparedStatement preparedStatement = c.prepareStatement(sql);
            preparedStatement.setString(1,t.getMaSanBay());
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {                
                String maSanBay = rs.getString("maSanBay");
                String tenSanBay = rs.getString("tenSanBay");
                String diaChi = rs.getString("diaChi");
                
                kq = new SanBay(maSanBay, tenSanBay, diaChi);
                
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            Logger.getLogger(SanBayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return kq;
    }
    
}
