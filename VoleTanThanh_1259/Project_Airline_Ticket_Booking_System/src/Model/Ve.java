/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Legion 5 Pro
 */
public class Ve {
    private int maVe;
    private int soGheChon;
    private Date ngayDat;
    private int tongTien;
    private ChuyenBay chuyenBay;
    private KhachHang khachHang;
    private HangVe hangVe;

    public Ve() {
    }
    public Ve(int maVe) {
        this.maVe = maVe;
    }
    public Ve(int maVe,int soGheChon, Date ngayDat, int tongTien, ChuyenBay chuyenBay, KhachHang khachHang, HangVe hangVe) {
        this.maVe = maVe;
        this.soGheChon = soGheChon;
        this.ngayDat = ngayDat;
        this.tongTien = tongTien;
        this.chuyenBay = chuyenBay;
        this.khachHang = khachHang;
        this.hangVe = hangVe;
    }
     public Ve(int soGheChon, Date ngayDat, int tongTien, ChuyenBay chuyenBay, KhachHang khachHang, HangVe hangVe) {
        this.soGheChon = soGheChon;
        this.ngayDat = ngayDat;
        this.tongTien = tongTien;
        this.chuyenBay = chuyenBay;
        this.khachHang = khachHang;
        this.hangVe = hangVe;
    }
     
    public int getMaVe() {
        return maVe;
    }

    public void setMaVe(int maVe) {
        this.maVe = maVe;
    }

    public int getSoGheChon() {
        return soGheChon;
    }

    public void setSoGheChon(int soGheChon) {
        this.soGheChon = soGheChon;
    }

   
    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public ChuyenBay getChuyenBay() {
        return chuyenBay;
    }

    public void setChuyenBay(ChuyenBay chuyenBay) {
        this.chuyenBay = chuyenBay;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public HangVe getHangVe() {
        return hangVe;
    }

    public void setHangVe(HangVe hangVe) {
        this.hangVe = hangVe;
    }

    @Override
    public String toString() {
        return "Ve{" + "maVe=" + maVe + ", soGheChon=" + soGheChon + ", ngayDat=" + ngayDat + ", tongTien=" + tongTien + ", chuyenBay=" + chuyenBay + ", khachHang=" + khachHang + ", hangVe=" + hangVe + '}';
    }

   

    
 
    
}
