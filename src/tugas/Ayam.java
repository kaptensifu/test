/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Acer
 */
public class Ayam {
    int jantan;
    private int betina;
    
    Ayam(){
        jantan = 10;
        betina = 5;
        System.out.println("Jumlah ayam jantan  di awal = " + jantan + " dan jumlah ayam betina di awal = " + betina);
        
    }
    private int hitung(int jantan,int betina){
        return jantan + betina;
    }
    void naik(){
        System.out.println("Beda kelamin beda jenis");
    }
    void setbetina(int betina){
        this.betina = betina;
        
    }
    int gettotal(){
        return hitung(jantan,betina);
    }
}


