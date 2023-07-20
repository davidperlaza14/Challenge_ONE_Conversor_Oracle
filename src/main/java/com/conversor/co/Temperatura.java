package com.conversor.co;

import javax.swing.JOptionPane;

/**
 *
 * @author davidperlaza14
 */
public class Temperatura {
    
    /**
     * Fahrenheit   °F = 1,8°C + 32°
     * 
     * Celsius      °C =5/9(°F-32°)
     *
     * Kelvin        K = °C + 273°
     */
    public void Temperatura() {
        
        String[] tipoTemperatura = {"Celsius", "Fahrenheit", "Kelvin"};
        
        Object temper1 = JOptionPane.showInputDialog(null, "Selecciona la temperatura que desea convertir:","",
                JOptionPane.QUESTION_MESSAGE, null, tipoTemperatura, tipoTemperatura[0]);
        
        float valor = Float.parseFloat(JOptionPane.showInputDialog(null, 
                "Digite los grados " + temper1.toString()+ " a convertir:"));
        
        Object temper2 = JOptionPane.showInputDialog(null, "Convertir de: " + temper1.toString() + " a: ","",
                JOptionPane.QUESTION_MESSAGE, null, tipoTemperatura, tipoTemperatura[0]);
        
        switch (temper1.toString()) {
            case "Celsius":
                convertir_de_celsius(temper2.toString(), valor);
                break;
            case "Fahrenheit":
                convertir_de_fahrenheit(temper2.toString(), valor);
                break;
            case "Kelvin":
                convertir_de_kelvin(temper2.toString(), valor);
                break;
        }   
    }
    
    
    
    public static void convertir_de_celsius(String temper2, float valor) {
        switch (temper2) {
            case "Celsius":
                JOptionPane.showMessageDialog(null, valor + "°C");
                break;
            case "Fahrenheit":
                JOptionPane.showMessageDialog(null, ((valor * 9 / 5) + 32) + "°F");
                break;
            case "Kelvin":
                JOptionPane.showMessageDialog(null, (valor + 273.15) + "K");
                break;           
        }
    }
    
    public static void convertir_de_fahrenheit(String temper2, float valor) {
        switch (temper2) {
            case "Celsius":
                JOptionPane.showMessageDialog(null, ((valor - 32) * 5 / 9) + "°C");
                break;
            case "Fahrenheit":
                JOptionPane.showMessageDialog(null, valor + "°F");
                break;
            case "Kelvin":
                JOptionPane.showMessageDialog(null, ((valor - 32) * (5 / 9) + 273.15) + "K");
                break;           
        }
    }
    
    public static void convertir_de_kelvin(String temper2, float valor) {
        switch (temper2) {
            case "Celsius":
                JOptionPane.showMessageDialog(null, ((valor - 32) * 5 / 9) + "°C");
                break;
            case "Fahrenheit":
                JOptionPane.showMessageDialog(null, ((valor - 273.15) + (9 / 5) + 32 ) + "°F");
                break;
            case "Kelvin":
                JOptionPane.showMessageDialog(null, valor + "K");
                break;           
        }
    }
    
    
    
    
}
