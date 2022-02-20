/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Konversi {
    double SuhuCelcius;
    
    public Konversi(double SuhuCelcius){
        this.SuhuCelcius = SuhuCelcius;
    }
    
    double Reamur(){
        return (SuhuCelcius*0.8);
    }
    
    double Fahrenheit(){
        return (SuhuCelcius*1.8+32);
    }
    
    double Kelvin(){
        return (SuhuCelcius+273.15);
    }
    
    String kondisiAir(){
        if(SuhuCelcius <= 0){
            return "Beku";
        }
        else if(SuhuCelcius >= 100){
            return "Mendidih";
        }
        else{
            return "Normal";
        }
    }
}
