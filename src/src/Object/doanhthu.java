/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author 5SCOMPUTER
 */
public class doanhthu {
    private String MaSP;
    private String TenSP;
    private int SoLuong;
    private int DonGia;
    private String TenKH;
    private String GhiChu;
    private String MaHD;
    private int tongHD;
    private String Ngay;
    private int tongNhap;

    public doanhthu() {
    }

    public doanhthu(String MaSP, String TenSP, int SoLuong, int DonGia, String TenKH, String GhiChu, String MaHD, int tongHD, String Ngay, int tongNhap) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.TenKH = TenKH;
        this.GhiChu = GhiChu;
        this.MaHD = MaHD;
        this.tongHD = tongHD;
        this.Ngay = Ngay;
        this.tongNhap = tongNhap;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public int getTongHD() {
        return tongHD;
    }

    public void setTongHD(int tongHD) {
        this.tongHD = tongHD;
    }

    public String getNgay() {
        return Ngay;
    }

    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }

    public int getTongNhap() {
        return tongNhap;
    }

    public void setTongNhap(int tongNhap) {
        this.tongNhap = tongNhap;
    }

    
    
}
