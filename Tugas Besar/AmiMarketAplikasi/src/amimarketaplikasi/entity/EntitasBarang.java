/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package amimarketaplikasi.entity;

/**
 *
 * @author ONE-System
 */
public class EntitasBarang {
public String kdbarang,nmbarang,satuan;
public int stok,harga;

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }


    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getKdbarang() {
        return kdbarang;
    }

    public void setKdbarang(String kdbarang) {
        this.kdbarang = kdbarang;
    }

    public String getNmbarang() {
        return nmbarang;
    }

    public void setNmbarang(String nmbarang) {
        this.nmbarang = nmbarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
