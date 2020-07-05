/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN4;
import java.util.Scanner;
/**
 *
 * @author LENOVO 330
 */
public class tugas_scanner {
    public static void main(String[] args) {
        int tinggi;
        int sepatu;
        int nocelana;
        int kodepos;
        int noRt;
        System.out.println("berapa tinggi anda ?");
        Scanner inputUser = new Scanner(System.in);
        tinggi = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa ukuran sepatu anda ?"); 
        Scanner User = new Scanner (System.in);
        sepatu = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa ukuran celana anda ?");
        inputUser = new Scanner (System.in);
        nocelana = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa kodepos anda ?");
        inputUser = new Scanner (System.in);
        kodepos = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berap nomer rt anda");
        inputUser = new Scanner (System.in);
        noRt = Integer.parseInt(inputUser.nextLine());
        
        System.out.println(" tinggi badan anda adalah "+ tinggi);
        System.out.println("ukuran sepatu anda adalah"+sepatu);
        System.out.println("ukuran celana anda adalah"+nocelana);
        System.out.println("kodepos anda adalah"+ kodepos);
        System.out.println("no rt anda adalah"+noRt);
        
        
        
        
        
        
        
        
        
        
        
    }
    }