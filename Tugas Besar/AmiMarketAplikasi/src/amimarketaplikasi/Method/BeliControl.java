/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package amimarketaplikasi.Method;

import amimarketaplikasi.entity.EntitasBeli;
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
public class BeliControl {
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    String sql=null;

    public BeliControl(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javamarketdcc?","root","");
            st=con.createStatement();
        }catch(Exception a){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal, Terjadi kesalahaan Pada : \n"+a);
        }
    }

    public List tampil(){
        List logBeli = new ArrayList();
        sql="select nonota,tgl,total,bayar,kembali from beli order by idbeli asc";
        try{
            rs=st.executeQuery(sql);

            while(rs.next()){
                EntitasBeli eb=new EntitasBeli();
                eb.setNonota(rs.getString("nonota"));
                eb.setTgl(rs.getString("tgl"));
                eb.setTotal(rs.getInt("total"));
                eb.setBayar(rs.getInt("bayar"));
                eb.setKembali(rs.getInt("kembali"));
                logBeli.add(eb);
            }
        } catch(SQLException a){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahaan tampil, pada :\n"+a);
        }
        return logBeli;
    }

        public int tambahBeli(EntitasBeli e){
        sql="insert into beli values(null,'"+e.getNonota()+"','"+e.getTgl()
                +"','"+e.getTotal()+"','"+e.getBayar()+"','"+e.getKembali()+"')";
        int hasil=0;
        try{
            hasil=st.executeUpdate(sql);
        } catch(SQLException a){
            Logger.getLogger(BarangControl.class.getName()).log(Level.SEVERE,null,a);
        }
        return hasil;
    }

    public int deleteBeli(EntitasBeli e){
        sql="delete from beli where nonota='"+e.getNonota()+"'";
        int hasil=0;
        try{
            hasil=st.executeUpdate(sql);
        } catch(SQLException a){
            Logger.getLogger(BarangControl.class.getName()).log(Level.SEVERE,null,a);
        }
        return hasil;
    }
}
