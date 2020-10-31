/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan26.waktusaatini;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Aldy
 */
public class PBOIF210119047Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    //utama
    public static void main(String[] args) {
        // TODO code application logic here
        Date waktu = new Date();

        SimpleDateFormat format = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");
        System.out.println("Hari ini : "+ format.format(waktu));
    }
    
}
