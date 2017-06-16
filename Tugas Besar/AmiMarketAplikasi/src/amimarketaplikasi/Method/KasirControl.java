/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package amimarketaplikasi.Method;


import amimarketaplikasi.entity.EntitasKasir;
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
 * 
 */
public class KasirControl {
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    String sql=null;

    public KasirControl(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javamarketdcc","root","");
            st=con.createStatement();            
        }catch(Exception a){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal, Terjadi kesalahaan Pada : \n"+a);
        }
    }
    
    public List cariLogin(String username,String password){
        List logLogin = new ArrayList();
        int result;
        sql="select username,password from kasir where username='"+username+"' and password='"+password+"'";
        try{
            rs=st.executeQuery(sql);

            while(rs.next()){
                EntitasKasir ep=new EntitasKasir();
                ep.setUsername(rs.getString("username"));
                ep.setPassword(rs.getString("password"));
                logLogin.add(ep);
            }
        } catch(SQLException a){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahaan login, pada :\n"+a);
        }
        return logLogin;
    }

     public List tampil(){
        List logKasir = new ArrayList();       
        sql="select id_kasir,nama_kasir,username,password,alamat from kasir order by id_kasir asc";
        try{
            rs=st.executeQuery(sql);

            while(rs.next()){
                EntitasKasir ek =new EntitasKasir();
                ek.setId_kasir(rs.getString("id_kasir"));
                ek.setNama_kasir(rs.getString("nama_kasir"));
                ek.setUsername(rs.getString("username"));
                ek.setPassword(rs.getString("password"));
                ek.setAlamat(rs.getString("alamat"));
                logKasir.add(ek);
            }
        } catch(SQLException a){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahaan tampil, pada :\n"+a);
        }
        return logKasir;
    }

    public List cariKasir(String cari){
        List logKasir = new ArrayList();
        sql="select id_kasir,nama_kasir,username,password,alamat from kasir where id_kasir like '%"+cari+"%' or nama_kasir like '%"+cari+"%'";
        try{
            rs=st.executeQuery(sql);

            while(rs.next()){
                EntitasKasir ek =new EntitasKasir();
                ek.setId_kasir(rs.getString("id_kasir"));
                ek.setNama_kasir(rs.getString("nama_kasir"));
                ek.setUsername(rs.getString("username"));
                ek.setPassword(rs.getString("password"));
                ek.setAlamat(rs.getString("alamat"));
                logKasir.add(ek);
            }
        } catch(SQLException a){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahaan tampil, pada :\n"+a);
        }
        return logKasir;
    }

    public List cariKasirDenganId(String id_kasir){
        List logKasir = new ArrayList();
        sql="select id_kasir,nama_kasir,username,password,alamat from kasir where id_kasir='"+id_kasir+"'";
        try{
            rs=st.executeQuery(sql);

            while(rs.next()){
                EntitasKasir ek =new EntitasKasir();
                ek.setId_kasir(rs.getString("id_kasir"));
                ek.setNama_kasir(rs.getString("nama_kasir"));
                ek.setUsername(rs.getString("username"));
                ek.setPassword(rs.getString("password"));
                ek.setAlamat(rs.getString("alamat"));
                logKasir.add(ek);
            }
        } catch(SQLException a){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahaan tampil, pada :\n"+a);
        }
        return logKasir;
    }

    public int tambahKasir(EntitasKasir e){
        sql="insert into kasir (id_kasir,nama_kasir,username,password,alamat) values"
                + "('"+e.getId_kasir()+"','"+e.getNama_kasir()+"','"+e.getUsername()+"','"+e.getPassword()+"','"+e.getAlamat()+"')";
        int hasil=0;
        try{
            hasil=st.executeUpdate(sql);
        } catch(SQLException a){
            Logger.getLogger(BarangControl.class.getName()).log(Level.SEVERE,null,a);
        }
        return hasil;
    }

    public int deleteKasir(EntitasKasir e){
        sql="delete from kasir where id_kasir='"+e.getId_kasir()+"'";
        int hasil=0;
        try{
            hasil=st.executeUpdate(sql);
        } catch(SQLException a){
            Logger.getLogger(BarangControl.class.getName()).log(Level.SEVERE,null,a);
        }
        return hasil;
    }

    public int editKasir(EntitasKasir e){
        sql="update kasir set nama_kasir='"+e.getNama_kasir()+"',username='"+e.getUsername()+"',password='"+e.getPassword()+"',alamat='"+e.getAlamat()+"' where id_kasir='"+e.getId_kasir()+"'";
        int hasil=0;
        try{
            hasil=st.executeUpdate(sql);
        } catch(SQLException a){
            Logger.getLogger(BarangControl.class.getName()).log(Level.SEVERE,null,a);
        }
        return hasil;
    }

    
}
