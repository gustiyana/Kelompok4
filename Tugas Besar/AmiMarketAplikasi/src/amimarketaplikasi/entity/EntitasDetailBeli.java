/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package amimarketaplikasi.entity;

/**
 *
 * @author Dlc
 */
public class EntitasDetailBeli {
String nonota,kdbarang,nmbarang;
int harga,jml,total;

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJml() {
        return jml;
    }

    public void setJml(int jml) {
        this.jml = jml;
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

    public String getNonota() {
        return nonota;
    }

    public void setNonota(String nonota) {
        this.nonota = nonota;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
