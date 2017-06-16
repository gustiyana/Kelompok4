/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package amimarketaplikasi.Method;

import amimarketaplikasi.entity.EntitasBarang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ONE-System
 */
public class BarangControl {
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    String sql=null;

    public BarangControl(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javamarketdcc","root","");
            st=con.createStatement();
        }catch(Exception a){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal, Terjadi kesalahaan Pada : \n"+a);
        }
    }

    public List tampil(){
        List logBarang = new ArrayList();       
        sql="select kdbarang,nmbarang,satuan,stok,harga from barang order by idbarang asc";
        try{
            rs=st.executeQuery(sql);

            while(rs.next()){
                EntitasBarang eb=new EntitasBarang();
                eb.setKdbarang(rs.getString("kdbarang"));
                eb.setNmbarang(rs.getString("nmbarang"));
                eb.setSatuan(rs.getString("satuan"));
                eb.setStok(rs.getInt("stok"));
                eb.setHarga(rs.getInt("harga"));
                logBarang.add(eb);
            }
        } catch(SQLException a){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahaan tampil, pada :\n"+a);
        }
        return logBarang;
    }

        public List tampilSatuan(){
        List logBarang = new ArrayList();
        sql="select distinct(satuan) from barang order by idbarang asc";
        try{
            rs=st.executeQuery(sql);

            while(rs.next()){
                EntitasBarang eb=new EntitasBarang();
                eb.setSatuan(rs.getString("satuan"));
                logBarang.add(eb);
            }
        } catch(SQLException a){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahaan tampil, pada :\n"+a);
        }
        return logBarang;
    }


    public List cariBarang(String cari){
        List logBarang = new ArrayList();
        sql="select kdbarang,nmbarang,satuan,stok,harga from barang where kdbarang like '%"+cari+"%' or nmbarang like '%"+cari+"%'";
        try{
            rs=st.executeQuery(sql);

            while(rs.next()){
                EntitasBarang eb=new EntitasBarang();
                eb.setKdbarang(rs.getString("kdbarang"));
                eb.setNmbarang(rs.getString("nmbarang"));
                eb.setSatuan(rs.getString("satuan"));
                eb.setStok(rs.getInt("stok"));
                eb.setHarga(rs.getInt("harga"));
                logBarang.add(eb);
            }
        } catch(SQLException a){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahaan tampil, pada :\n"+a);
        }
        return logBarang;
    }

    public List cariBarangDenganKode(String kdBarang){
        List logBarang = new ArrayList();
        sql="select kdbarang,nmbarang,satuan,stok,harga from barang where kdbarang='"+kdBarang+"'";
        try{
            rs=st.executeQuery(sql);

            while(rs.next()){
                EntitasBarang eb=new EntitasBarang();
                eb.setKdbarang(rs.getString("kdbarang"));
                eb.setNmbarang(rs.getString("nmbarang"));
                eb.setSatuan(rs.getString("satuan"));
                eb.setStok(rs.getInt("stok"));
                eb.setHarga(rs.getInt("harga"));
                logBarang.add(eb);
            }
        } catch(SQLException a){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahaan tampil, pada :\n"+a);
        }
        return logBarang;
    }

    public int tambahBarang(EntitasBarang e){
        sql="insert into barang (kdbarang,nmbarang,satuan,stok,harga) values('"+e.getKdbarang()+"','"+e.getNmbarang()
                +"','"+e.getSatuan()+"','"+e.getStok()+"','"+e.getHarga()+"')";
        int hasil=0;
        try{
            hasil=st.executeUpdate(sql);
        } catch(SQLException a){
            Logger.getLogger(BarangControl.class.getName()).log(Level.SEVERE,null,a);
        }
        return hasil;
    }

    public int deleteBarang(EntitasBarang e){
        sql="delete from barang where kdbarang='"+e.getKdbarang()+"'";
        int hasil=0;
        try{
            hasil=st.executeUpdate(sql);
        } catch(SQLException a){
            Logger.getLogger(BarangControl.class.getName()).log(Level.SEVERE,null,a);
        }
        return hasil;
    }

    public int editBarang(EntitasBarang e){
        sql="update barang set nmbarang='"+e.getNmbarang()+"',satuan='"+e.getSatuan()
            +"',stok='"+e.getStok()+"',harga='"+e.getHarga()+"' where kdbarang='"+e.getKdbarang()+"'";
        int hasil=0;
        try{
            hasil=st.executeUpdate(sql);
        } catch(SQLException a){
            Logger.getLogger(BarangControl.class.getName()).log(Level.SEVERE,null,a);
        }
        return hasil;
    }

    public int updateStok(int stok,String kdBarang){
        sql="update barang set stok='"+stok+"' where kdbarang='"+kdBarang+"'";
        int hasil=0;
        try{
            hasil=st.executeUpdate(sql);
        } catch(SQLException a){
            Logger.getLogger(BarangControl.class.getName()).log(Level.SEVERE,null,a);
        }
        return hasil;
    }
}
