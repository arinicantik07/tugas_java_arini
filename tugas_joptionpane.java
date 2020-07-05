/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN4;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO 330
 */
public class tugas_joptionpane {
    public static void main(String[] args) {
        String tanya = JOptionPane.showInputDialog("dimana anda kuliah ? ");
        JOptionPane.showMessageDialog(null, "anda kuliah di " +tanya);
        
        tanya = JOptionPane.showInputDialog("dimana anda berlibur ? ");
        JOptionPane.showMessageDialog(null, "anda berlibur di" +tanya);
        
        tanya = JOptionPane.showInputDialog("apa makanan favorit anda ? ");
        JOptionPane.showMessageDialog(null, "makanan favorit anda adalah "+tanya);
        
        tanya = JOptionPane.showInputDialog("apa warna favorit anda ? ");
        JOptionPane.showMessageDialog(null, "warna favorit anda adalah "+tanya);
        
        tanya = JOptionPane.showInputDialog("dimana anda bermain ? ");
        JOptionPane.showMessageDialog(null, "anda bermain di "+tanya);
        
    }
}
