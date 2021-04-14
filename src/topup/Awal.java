/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topup;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Awal {
    public int saldo = 100000;
    Scanner now = new Scanner(System.in);
    public static int pilih;
    public static String yay = "ya";
    
    
    void Uiawal() {
        System.out.println("Selamat datang di TopKevv");
        System.out.println("                            Saldo : "+saldo);
        System.out.println("Apa yang ingin anda lakukan hari ini?");
    }
    void menu()  {
        String[] menu = {"","Top Up Saldo","In-game Cash","Exit"};
        for (int i = 1; i < menu.length; i++) {
            System.out.println(i +". "+menu[i]);
            
       }
       System.out.print("-> ");
       pilih = now.nextInt();
        System.out.println("");
       
       

     
    }

}
