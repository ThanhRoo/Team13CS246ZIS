/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Legion 5 Pro
 */
public class KhachHang {
    private int maKhachHang;
    private String ho;
    private String ten;
    private String sdt;
    private Date ngaySinh;
    private String cccd;
    private String quocTich;
    private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    public KhachHang() {
    }

    public KhachHang(String ho, String ten, String sdt, Date ngaySinh, String cccd, String quocTich) throws ParseException {
        this.ho = ho;
        this.ten = ten;
        this.sdt = sdt;
        this.ngaySinh = ngaySinh;
        this.cccd = cccd;
        this.quocTich = quocTich;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }
    
    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    
}
