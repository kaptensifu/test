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
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
                
        Ayam A[] = new Ayam[3];
        A[0] = new Sapi();
        A[1] = new Kambing();
        
        System.out.println("Jumlah sapi diawal = " + A[0].gettotal());
        System.out.println("Jumlah kambing diawal = " + A[1].gettotal());
        
        for (i=0;i<2;i++){
            A[i].naik();
        }
        System.out.println("Jumlah sapi terbaru = " + A[0].gettotal());
        System.out.println("Jumlah kambing terbaru = " + A[1].gettotal());
    }
    
}
