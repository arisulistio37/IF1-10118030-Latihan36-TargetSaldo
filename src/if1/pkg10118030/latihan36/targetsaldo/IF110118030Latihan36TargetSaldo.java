/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan36.targetsaldo;

/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi program : program ini berisi tentang Target saldo tabungan
 */
public class IF110118030Latihan36TargetSaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Target tabungan = new Target();

        tabungan.saldo = 3500000;
        tabungan.bunga = 8;
        int saldoTarget = 6000000;

        tabungan.HitungLamaSaldoTarget(tabungan.saldo,saldoTarget);
    }
    
}
