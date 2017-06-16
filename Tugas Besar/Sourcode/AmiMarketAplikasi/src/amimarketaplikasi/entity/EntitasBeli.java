/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package amimarketaplikasi.entity;

/**
 *
 * @author Dlc
 */
public class EntitasBeli {
String nonota,pembeli;
String tgl;

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }
int total,bayar,kembali;

    public int getBayar() {
        return bayar;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }

    public int getKembali() {
        return kembali;
    }

    public void setKembali(int kembali) {
        this.kembali = kembali;
    }

    public String getNonota() {
        return nonota;
    }

    public void setNonota(String nonota) {
        this.nonota = nonota;
    }

    public String getPembeli() {
        return pembeli;
    }

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }



    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
