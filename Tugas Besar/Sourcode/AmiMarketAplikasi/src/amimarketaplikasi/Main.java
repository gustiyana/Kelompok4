/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package amimarketaplikasi;

import amimarketaplikasi.GUI.FormLogin;




/**
 *
 * @author ONE-System
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                try {
            FormLogin a =new FormLogin (null, true);
            a.setVisible(true);
            
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
      
    }
    }


