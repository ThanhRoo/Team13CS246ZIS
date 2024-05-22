/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Legion 5 Pro
 */
public class SanBay {
    private String maSanBay;
    private String tenSanBay;
    private String diaChi;

    public SanBay() {
    }
     public SanBay(String maSanBay) {
         this.maSanBay = maSanBay;
    }
    public SanBay(String maSanBay, String tenSanBay, String diaChi) {
        this.maSanBay = maSanBay;
        this.tenSanBay = tenSanBay;
        this.diaChi = diaChi;
    }

    public String getMaSanBay() {
        return maSanBay;
    }

    public void setMaSanBay(String maSanBay) {
        this.maSanBay = maSanBay;
    }

    public String getTenSanBay() {
        return tenSanBay;
    }

    public void setTenSanBay(String tenSanBay) {
        this.tenSanBay = tenSanBay;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "SanBay{" + "maSanBay=" + maSanBay + ", tenSanBay=" + tenSanBay + ", diaChi=" + diaChi + '}';
    }
    
}
