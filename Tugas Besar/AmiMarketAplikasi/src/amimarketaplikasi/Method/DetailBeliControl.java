/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package amimarketaplikasi.Method;

import amimarketaplikasi.entity.EntitasDetailBeli;
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
 * @author Dlc
 */
public class DetailBeliControl {
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    String sql=null;

    public DetailBeliControl(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javamarketdcc?","root","");
            st=con.createStatement();
        }catch(Exception a){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal, Terjadi kesalahaan Pada : \n"+a);
        }
    }

    public List tampilBarang(String noNota){
        List logDetailBeli = new ArrayList();
        sql="select kdbarang,nmbarang,harga,jml,total from detailbeli where nonota='"+noNota+"'";
        try{
            rs=st.executeQuery(sql);

            while(rs.next()){
                EntitasDetailBeli eb=new EntitasDetailBeli();
                eb.setKdbarang(rs.getString("kdbarang"));
                eb.setNmbarang(rs.getString("nmbarang"));
                eb.setHarga(rs.getInt("harga"));
                eb.setJml(rs.getInt("jml"));
                eb.setTotal(rs.getInt("total"));
                logDetailBeli.add(eb);
            }
        } catch(SQLException a){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahaan tampil, pada :\n"+a);
        }
        return logDetailBeli;
    }

        public List CekBarang(String noNota,String kdBarang){
        List logDetailBeli = new ArrayList();
        sql="select kdbarang,nmbarang,harga,jml,total from detailbeli where nonota='"+noNota+"' and kdbarang='"+kdBarang+"'";
        try{
            rs=st.executeQuery(sql);

            while(rs.next()){
                EntitasDetailBeli eb=new EntitasDetailBeli();
                eb.setKdbarang(rs.getString("kdbarang"));
                eb.setNmbarang(rs.getString("nmbarang"));
                eb.setHarga(rs.getInt("harga"));
                eb.setJml(rs.getInt("jml"));
                eb.setTotal(rs.getInt("total"));
                logDetailBeli.add(eb);
            }
        } catch(SQLException a){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahaan Cek barang, pada :\n"+a);
        }
        return logDetailBeli;
    }

        public int tambahDetailBeli(EntitasDetailBeli e){
        sql="insert into detailbeli values('"+e.getNonota()+"','"+e.getKdbarang()
                +"','"+e.getNmbarang()+"','"+e.getHarga()+"','"+e.getJml()+"','"+e.getTotal()+"')";
        int hasil=0;
        try{
            hasil=st.executeUpdate(sql);
        } catch(SQLException a){
            Logger.getLogger(BarangControl.class.getName()).log(Level.SEVERE,null,a);
        }
        return hasil;
    }

    public int deleteDetailBeli(String nonota,String kdbarang){
        sql="delete from detailbeli where nonota='"+nonota+"' and kdbarang='"+kdbarang+"'";
        int hasil=0;
        try{
            hasil=st.executeUpdate(sql);
        } catch(SQLException a){
            Logger.getLogger(BarangControl.class.getName()).log(Level.SEVERE,null,a);
        }
        return hasil;
    }
    
    
    
    public List tampilBarang(){
        List logDetailBeli = new ArrayList();
        sql="select kdbarang,nmbarang,harga,jml,total from detailbeli order by id_pemasok asc";
        try{
            rs=st.executeQuery(sql);

            while(rs.next()){
                EntitasDetailBeli eb=new EntitasDetailBeli();
                eb.setKdbarang(rs.getString("kdbarang"));
                eb.setNmbarang(rs.getString("nmbarang"));
                eb.setHarga(rs.getInt("harga"));
                eb.setJml(rs.getInt("jml"));
                eb.setTotal(rs.getInt("total"));
                logDetailBeli.add(eb);
            }
        } catch(SQLException a){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahaan tampil, pada :\n"+a);
        }
        return logDetailBeli;
    }
}
