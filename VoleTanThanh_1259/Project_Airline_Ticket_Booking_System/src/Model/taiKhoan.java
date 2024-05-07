/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Legion 5 Pro
 */
   class TaiKhoan {
    private int maTaiKhoan;
    private String email;
    private String matKhau;
    private String hoTen;
    private String sdt;
    private String quyenTruyCap;
    private KhachHang khachHang ;
            
    public TaiKhoan() {
    }

    public TaiKhoan(int maTaiKhoan, String email, String matKhau, String hoTen, String sdt, String quyenTruyCap, KhachHang khachHang) {
        this.maTaiKhoan = maTaiKhoan;
        this.email = email;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.quyenTruyCap = quyenTruyCap;
        this.khachHang = khachHang;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    

    public void setMaTaiKhoan(int maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setQuyenTruyCap(String quyenTruyCap) {
        this.quyenTruyCap = quyenTruyCap;
    }
    
}
