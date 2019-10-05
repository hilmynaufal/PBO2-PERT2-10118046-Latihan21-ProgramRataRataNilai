/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pert2.pkg10118046.latihan21.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : membuat program rata rata nilai dari nilai yang di masukkan
 */
public class PBO2PERT210118046Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    int[] nilai = new int[100];
    int jmlMhs;
    
    public void inputMahasiswa() {
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        Scanner scanner = new Scanner(System.in);
        jmlMhs = scanner.nextInt();
        for (int i = 1;i<=jmlMhs;i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai[i] = scanner.nextInt();
        }
    }
    
    public void tampilMahasiswa()
    {
        for (int i = 1;i<=jmlMhs;i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " : " + nilai[i]);
        }
        float rataRata = hitungRataRata();
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);
    }
    
    public float hitungRataRata(){
        float jumlah = 0;  
        for (int i = 1;i<=jmlMhs;i++) {
            jumlah += nilai[i];
        }
        float hasil = jumlah/jmlMhs;
        return hasil;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBO2PERT210118046Latihan21ProgramRataRataNilai mahasiswa = new PBO2PERT210118046Latihan21ProgramRataRataNilai();
        mahasiswa.inputMahasiswa();
        mahasiswa.tampilMahasiswa();
        System.out.println("Developed by: M. Hilmy Naufal");
    }

}
