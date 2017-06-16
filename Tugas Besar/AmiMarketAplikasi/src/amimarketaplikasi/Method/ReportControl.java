/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package amimarketaplikasi.Method;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ONE-System
 */
public class ReportControl {
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    String sql=null;

    public ReportControl(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javamarketdcc?","root","");
            st=con.createStatement();
        }catch(Exception a){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal, Terjadi kesalahaan Pada : \n"+a);
        }
    }

    public void cetakSeleruhBarang(){
        try{
        String sumber;
        String tujuan;
        sumber= "src/amimarketaplikasi/ReportSumber/Barang.jrxml";
        tujuan = "src/amimarketaplikasi/ReportHasil/Barang.html";
        Map params = new HashMap();
        JasperReport jr = JasperCompileManager.compileReport(sumber);
        JasperPrint jp = JasperFillManager.fillReport(jr,params,con);
        JasperExportManager.exportReportToHtmlFile(jp, tujuan);
        JasperViewer.viewReport(jp,false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Gagal tampilakn report"+ex);
        }
    }

    public void cetakPerSatuan(String satuan){
        try{
        String sumber;
        String tujuan;
        sumber= "src/amimarketaplikasi/ReportSumber/BarangPerUnit.jrxml";
        tujuan = "src/amimarketaplikasi/ReportHasil/BarangPerUnit.html";
        Map params = new HashMap();
        params.put("satuan", satuan);
        JasperReport jr = JasperCompileManager.compileReport(sumber);
        JasperPrint jp = JasperFillManager.fillReport(jr,params,con);
        JasperExportManager.exportReportToHtmlFile(jp, tujuan);
        JasperViewer.viewReport(jp,false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Gagal tampilakn report"+ex);
        }
    }

    public void cetakNota(String nonota){
         try{
        String sumber;
        String tujuan;
        sumber= "src/amimarketaplikasi/ReportSumber/kwitansi.jrxml";
        tujuan = "src/amimarketaplikasi/ReportHasil/kwitansi.html";
        Map params = new HashMap();
        params.put("beli_nonota", nonota);
        JasperReport jr = JasperCompileManager.compileReport(sumber);
        JasperPrint jp = JasperFillManager.fillReport(jr,params,con);
        JasperExportManager.exportReportToHtmlFile(jp, tujuan);
        JasperViewer.viewReport(jp,false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Gagal tampilakn report"+ex);
        }
    }

    public void laporanHarian(){
         try{
        String sumber;
        String tujuan;
        sumber= "src/amimarketaplikasi/ReportSumber/laporanharian.jrxml";
        tujuan = "src/amimarketaplikasi/ReportHasil/laporanharian.html";
        Map params = new HashMap();
        JasperReport jr = JasperCompileManager.compileReport(sumber);
        JasperPrint jp = JasperFillManager.fillReport(jr,params,con);
        
        JasperViewer.viewReport(jp,false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Gagal tampilakn report"+ex);
    
   
        }
    }
    
    public void laporanHarian2(){
         try{
        String sumber;
        String tujuan;
        sumber= "src/amimarketaplikasi/ReportSumber/laporanharian2.jrxml";
        tujuan = "src/amimarketaplikasi/ReportHasil/laporanharian2.html";
        Map params = new HashMap();
        JasperReport jr = JasperCompileManager.compileReport(sumber);
        JasperPrint jp = JasperFillManager.fillReport(jr,params,con);
        
        JasperViewer.viewReport(jp,false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Gagal tampilakn report"+ex);
    
   
        }
    }
    
}


    
         
    
