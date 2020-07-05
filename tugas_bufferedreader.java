/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO 330
 */
public class tugas_bufferedreader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
     String nama= "";
     String alamat = "";
     String pekerjaan = "";
     String saudara ="";
     String sepeda ="";
     
     InputStreamReader isr = new InputStreamReader (System.in);
     BufferedReader br = new BufferedReader (isr);
     
        System.out.println("siapa nama anda");
        nama = br.readLine();
        
        System.out.println("dimana alamat anda");
        alamat = br.readLine();
        
        System.out.println("dimana anda bekerja");
        pekerjaan = br.readLine();
        
        System.out.println("berapa saudara anda");
        saudara = br.readLine();
        
        System.out.println("apa sepeda montor anda");
        sepeda = br.readLine();
        
        System.out.println("nama anda adalah " + nama);
        System.out.println("alamat anda adalah " + alamat);
        System.out.println("pekerjaan anda adalah " + pekerjaan);
        System.out.println("anda " + saudara+ " sudara");
        System.out.println("sepeda motor adalah " + sepeda);
        
     
     
    }

        }
    
    

