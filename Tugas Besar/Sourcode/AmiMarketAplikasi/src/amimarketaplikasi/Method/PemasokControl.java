/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amimarketaplikasi.Method;

import amimarketaplikasi.entity.EntitasPemasok;
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
 * @author Disca Amelia
 */
public class PemasokControl {
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    String sql=null;

    public PemasokControl(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javamarketdcc?","root","");
            st=con.createStatement();            
        }catch(Exception a){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal, Terjadi kesalahaan Pada : \n"+a);
        }
    }
     public List tampil(){
        List logPemasok = new ArrayList();       
        sql="select id_pemasok,nama_pemasok,alamat_pemasok,no_telepon,nama_barang,jumlah_barang from pemasok order by id_pemasok asc";
        try{
            rs=st.executeQuery(sql);

            while(rs.next()){
                EntitasPemasok ep =new EntitasPemasok();
                ep.setId_pemasok(rs.getString("id_pemasok"));
                ep.setNama_pemasok(rs.getString("nama_pemasok"));
                ep.setAlamat_pemasok(rs.getString("alamat_pemasok"));
                ep.setNo_telepon(rs.getInt("no_telepon"));
                ep.setNama_barang(rs.getString("nama_barang"));
                ep.setJumlah_barang(rs.getInt("jumlah_barang"));
                logPemasok.add(ep);
            }
        } catch(SQLException a){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahaan tampil, pada :\n"+a);
        }
        return logPemasok;
    }

    public List cariPemasok(String cari){
        List logPemasok = new ArrayList();
        sql="select id_pemasok,nama_pemasok,alamat_pemasok,no_telepon,nama_barang,jumlah_barang from pemasok where id_pemasok like '%"+cari+"%' or nama_pemasok like '%"+cari+"%'";
        try{
            rs=st.executeQuery(sql);

            while(rs.next()){
                EntitasPemasok ep =new EntitasPemasok();
                ep.setId_pemasok(rs.getString("id_pemasok"));
                ep.setNama_pemasok(rs.getString("nama_pemasok"));
                ep.setAlamat_pemasok(rs.getString("alamat_pemasok"));
                ep.setNo_telepon(rs.getInt("no_telepon"));
                ep.setNama_barang(rs.getString("nama_barang"));
                ep.setJumlah_barang(rs.getInt("jumlah_barang"));
                logPemasok.add(ep);
            }
        } catch(SQLException a){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahaan tampil, pada :\n"+a);
        }
        return logPemasok;
    }

    public List cariPemasokDenganId(String id_pemasok){
        List logPemasok = new ArrayList();
        sql="select id_pemasok,nama_pemasok,alamat_pemasok,no_telepon,nama_barang,jumlah_barang from pemasok where id_pemasok='"+id_pemasok+"'";
        try{
            rs=st.executeQuery(sql);

            while(rs.next()){
              EntitasPemasok ep =new EntitasPemasok();
                ep.setId_pemasok(rs.getString("id_pemasok"));
                ep.setNama_pemasok(rs.getString("nama_pemasok"));
                ep.setAlamat_pemasok(rs.getString("alamat_pemasok"));
                ep.setNo_telepon(rs.getInt("no_telepon"));
                ep.setNama_barang(rs.getString("nama_barang"));
                ep.setJumlah_barang(rs.getInt("jumlah_barang"));
                logPemasok.add(ep);  
            }
        } catch(SQLException a){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahaan tampil, pada :\n"+a);
        }
        return logPemasok;
    }

    public int tambahPemasok(EntitasPemasok e){
        sql="insert into pemasok (id_pemasok,nama_pemasok,alamat_pemasok,no_telepon,nama_barang,jumlah_barang) values"
                + "('"+e.getId_pemasok()+"','"+e.getNama_pemasok()+"','"+e.getAlamat_pemasok()+"','"+e.getNo_telepon()+"','"+e.getNama_barang()+"','"+e.getJumlah_barang()+"')";
        int hasil=0;
        try{
            hasil=st.executeUpdate(sql);
        } catch(SQLException a){
            Logger.getLogger(BarangControl.class.getName()).log(Level.SEVERE,null,a);
        }
        return hasil;
    }

    public int deletePemasok(EntitasPemasok e){
        sql="delete from pemasok where id_pemasok='"+e.getId_pemasok()+"'";
        int hasil=0;
        try{
            hasil=st.executeUpdate(sql);
        } catch(SQLException a){
            Logger.getLogger(BarangControl.class.getName()).log(Level.SEVERE,null,a);
        }
        return hasil;
    }

    public int editPemasok(EntitasPemasok e){
        sql="update pemasok set nama_pemasok='"+e.getNama_pemasok()+"',alamat_pemasok='"+e.getAlamat_pemasok()+"',no_telepon='"+e.getNo_telepon()+"',nama_barang='"+e.getNama_barang()+"',jumlah_barang='"+e.getJumlah_barang()+"'where id_pemasok='"+e.getId_pemasok()+"'";
        int hasil=0;
        try{
            hasil=st.executeUpdate(sql);
        } catch(SQLException a){
            Logger.getLogger(BarangControl.class.getName()).log(Level.SEVERE,null,a);
        }
        return hasil;
    }

}
