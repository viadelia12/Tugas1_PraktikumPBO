
import java.util.Scanner;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        //deklarasi variabel
        double suhu;
        int opsi;
        
        Scanner input = new Scanner(System.in);

        System.out.println("+===========================+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+===========================+");
        System.out.println("Input Data");
        System.out.println("----------");
        //input suhu
        System.out.print("Suhu Dalam Celcius  : ");
        suhu = input.nextDouble();
        
        do{
            Konversi Celcius = new Konversi(suhu);
            System.out.println("");
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih   : ");
            opsi = input.nextInt();
            
            if(opsi == 1){
                System.out.println("");
                System.out.println("Suhu dalam Celcius\t : " + suhu + "°C");
                System.out.println("Dalam Fahrenheit\t : " + Celcius.Fahrenheit() + "°F");
                System.out.println("Dalam Reamur\t\t : " + Celcius.Reamur() + "°R");
                System.out.println("Dalam Kelvin\t\t : " + Celcius.Kelvin() + "°K");
                System.out.println("Kondisi Air " + Celcius.kondisiAir());
            }
            else if(opsi == 2){
                System.out.println("");
                System.out.println("Input Data");
                System.out.println("----------");
                System.out.print("Suhu Dalam Celcius\t: ");
                suhu = input.nextDouble();
            }
            else if(opsi == 3){
            }
            else{
                System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
            }
        }while(opsi != 3);
        
        
    }
}
