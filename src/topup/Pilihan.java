/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topup;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;
/**
 *
 * @author LENOVO
 */
public class Pilihan extends Awal {
    
    Random rand = new Random();
    int RNG = rand.nextInt(7);
    int uang = 0;
    int games;
    int pilihan = 0;
    SetGet ambil = new SetGet();
    
    
    void topupu()     {
        System.out.print("Masukkan uang : ");
        uang = now.nextInt();
        System.out.println("Processing...");
        
        
        if(RNG >= 3){
            saldo += uang;
            System.out.println("Berhasil Top Up");
        } else if(RNG < 3) {
            System.out.println("Gagal top up. Mohon coba lagi");
        }
        System.out.println("");
        
    
    }
    void ingame()   {
        String[] game = {"","Valorant","Steam Wallet"};
        for(int j = 1; j < game.length; j++)  {
            System.out.println(j + ". "+game[j]); 
        }
        System.out.print("->");
        games = now.nextInt();
        switch(games) {
            case 1 :
                int[] palo = {0,420,700,1375,2400};
                int[] rego = {0, 50000, 80000, 150000, 250000};
                
                for(int i = 1; i < palo.length; i++) {
                     System.out.println(i + ". "+ palo[i]+ " Points "+" : "+"Rp. "+ rego[i]);
                }
                System.out.print("-> ");
                pilihan = now.nextInt();
                saldo -= rego[pilihan];
                System.out.println("Processing...");
               
                
                if(saldo < rego[pilihan]) {
                    System.out.println("Saldo anda tidak mencukupi");
                    System.out.println("Coba lagi");
                } else if(saldo >= rego[pilihan]) {
                    System.out.println("Transaksi berhasil");
                }
                System.out.println("");
                
                
            case 2 : 
                int[] stim = {0, 60000, 90000, 120000, 250000};
                int[] harga = {0, 69100, 98000, 129000, 269500};
                
                for(int i = 1; i < stim.length; i++) {
                    System.out.println(i + ". "+"IDR "+ stim[i]+ " : "+ "Rp. "+harga[i]);
                }
                System.out.print("-> ");
                pilihan = now.nextInt();
                saldo -= harga[pilihan];
                System.out.println("Processing...");
                
                
                if(saldo < harga[pilihan]) {
                    System.out.println("Saldo anda tidak mencukupi");
                    System.out.println("Coba lagi");
                } else if(saldo >= harga[pilihan]) {
                    System.out.println("Transaksi berhasil");
                }
                System.out.println("");
                
        }
        
    }
}
