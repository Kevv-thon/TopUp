/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topup;

/**
 *
 * @author LENOVO
 */
public class TopUp extends Awal{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilihan jambu = new Pilihan();
        boolean ulang = true;
        
        while (ulang) {
            jambu.Uiawal();
            jambu.menu();
        
            if(pilih == 1) {
                jambu.topupu();
            } else if (pilih == 2) {
                jambu.ingame();
            } else if (pilih == 3) {
                System.exit(1);
            }
            ulang = yay.equalsIgnoreCase("ya");
        }
        
      
       
    }
    
}
