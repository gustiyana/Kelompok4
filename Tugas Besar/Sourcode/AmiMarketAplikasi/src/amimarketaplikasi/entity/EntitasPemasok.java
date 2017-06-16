/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amimarketaplikasi.entity;

/**
 *
 * @author Disca Amelia
 */
public class EntitasPemasok {
    public String id_pemasok,nama_pemasok,alamat_pemasok,nama_barang;
    public int jumlah_barang,no_telepon;

    public String getId_pemasok() {
        return id_pemasok;
    }

    public void setId_pemasok(String id_pemasok) {
        this.id_pemasok = id_pemasok;
    }

    public String getNama_pemasok() {
        return nama_pemasok;
    }

    public void setNama_pemasok(String nama_pemasok) {
        this.nama_pemasok = nama_pemasok;
    }

    public String getAlamat_pemasok() {
        return alamat_pemasok;
    }

    public void setAlamat_pemasok(String alamat_pemasok) {
        this.alamat_pemasok = alamat_pemasok;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getJumlah_barang() {
        return jumlah_barang;
    }

    public void setJumlah_barang(int jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }

    public int getNo_telepon() {
        return no_telepon;
    }

    public void setNo_telepon(int no_telepon) {
        this.no_telepon = no_telepon;
    }
}
