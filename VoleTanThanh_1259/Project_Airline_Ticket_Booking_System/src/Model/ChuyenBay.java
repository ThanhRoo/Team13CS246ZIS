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
public class ChuyenBay {
    private String maChuyenBay;
    private String diemDi;
    private String diemDen;
    private Date thoiGianDi;
    private String gioCatCanh;
    private Date thoiGianDen;
    private String gioHaCanh;
    private int gia;
    private MayBay mayBay;
    private SanBay sanBay;
    private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
    public ChuyenBay(){
    }
    public ChuyenBay(String maChuyenBay){
        this.maChuyenBay = maChuyenBay;
    }
    public ChuyenBay(String maChuyenBay, String diemDi, String diemDen, Date thoiGianDi,String gioCatCanh, Date thoiGianDen,String gioHaCanh, int gia, MayBay mayBay, SanBay sanBay) throws ParseException {
        this.maChuyenBay = maChuyenBay;
        this.diemDi = diemDi;
        this.diemDen = diemDen;
        this.thoiGianDi =thoiGianDi  ;
        this.thoiGianDen = thoiGianDen ;
        this.gia = gia;
        this.mayBay = mayBay;
        this.sanBay = sanBay;
        this.gioCatCanh = gioCatCanh;
        this.gioHaCanh = gioHaCanh;
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public String getDiemDi() {
        return diemDi;
    }

    public void setDiemDi(String diemDi) {
        this.diemDi = diemDi;
    }

    public String getDiemDen() {
        return diemDen;
    }

    public void setDiemDen(String diemDen) {
        this.diemDen = diemDen;
    }

    public Date getThoiGianDi() {
        return thoiGianDi;
    }

    public void setThoiGianDi(Date thoiGianDi) {
        this.thoiGianDi = thoiGianDi;
    }

    public Date getThoiGianDen() {
        return thoiGianDen;
    }

    public String getGioCatCanh() {
        return gioCatCanh;
    }

    public void setGioCatCanh(String gioCatCanh) {
        this.gioCatCanh = gioCatCanh;
    }

    public String getGioHaCanh() {
        return gioHaCanh;
    }

    public void setGioHaCanh(String gioHaCanh) {
        this.gioHaCanh = gioHaCanh;
    }

    public SimpleDateFormat getDf() {
        return df;
    }

    public void setDf(SimpleDateFormat df) {
        this.df = df;
    }
    
    public void setThoiGianDen(Date thoiGianDen) {
        this.thoiGianDen = thoiGianDen;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public MayBay getMayBay() {
        return mayBay;
    }

    public void setMayBay(MayBay mayBay) {
        this.mayBay = mayBay;
    }

    public SanBay getSanBay() {
        return sanBay;
    }

    public void setSanBay(SanBay sanBay) {
        this.sanBay = sanBay;
    }

    @Override
    public String toString() {
        return "ChuyenBay{" + "maChuyenBay=" + maChuyenBay + ", diemDi=" + diemDi + ", diemDen=" + diemDen + ", thoiGianDi=" + thoiGianDi + ", gioCatCanh=" + gioCatCanh + ", thoiGianDen=" + thoiGianDen + ", gioHaCanh=" + gioHaCanh + ", gia=" + gia + ", mayBay=" + mayBay + ", sanBay=" + sanBay + ", df=" + df + '}';
    }
    
    
}
