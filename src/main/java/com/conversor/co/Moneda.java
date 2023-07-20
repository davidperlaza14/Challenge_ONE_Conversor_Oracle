package com.conversor.co;

import javax.swing.JOptionPane;

/**
 * Challenge Conversor ONE Oracle Alura latam
 * @author davidperlaza14
 */
public class Moneda {
    /**
     * 
     * - Convertir de la moneda de tu país a Dólar
     * - Convertir de la moneda de tu país  a Euros
     * - Convertir de la moneda de tu país  a Libras Esterlinas
     * - Convertir de la moneda de tu país  a Yen Japonés
     * - Convertir de la moneda de tu país  a Won sul-coreano
     * 
     * Recordando que también debe ser posible convertir inversamente
     * 
     */
    public void Moneda (){
        String[] tipoMoneda = {"Pesos Colombianos", "Dólares",
            "Euros","Libras Esterlinas","Yen Japonés", "Won sur-coreano" };
        
        Object monedaInicial = JOptionPane.showInputDialog(null,"Selecciona la moneda de tu país:","",
            JOptionPane.QUESTION_MESSAGE, null, tipoMoneda, tipoMoneda[0]);
        
        double cantidad = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la cantidad de " + monedaInicial.toString() + " a convertir: "));
        
        Object monedaFinal = JOptionPane.showInputDialog(null,"Convertir de " + monedaInicial.toString() + " a:", "",
                JOptionPane.QUESTION_MESSAGE, null, tipoMoneda, tipoMoneda[0]);
        
        switch (monedaInicial.toString()) {
            case "Pesos Colombianos":
                convertir_de_pesos(monedaFinal.toString(), cantidad);                
                break;
            case "Dólares":
                convertir_de_dolares(monedaFinal.toString(), cantidad);              
                break;
            case "Euros":
                convertir_de_euro(monedaFinal.toString(), cantidad);              
                break;
            case "Libras Esterlinas":
                convertir_de_libra(monedaFinal.toString(), cantidad);                
                break;
            case "Yen Japonés":
                convertir_de_yen(monedaFinal.toString(), cantidad);                
                break;
            case "Won sur-coreano":
                convertir_de_won(monedaFinal.toString(), cantidad);                
                break;
        }    
    }
    
    public static void convertir_de_pesos(String monedaFinal, double cantidad) {
        switch (monedaFinal) {
            case "Pesos Colombianos":
                JOptionPane.showMessageDialog(null,"COP$" + cantidad);
                break;
            case "Dólares":
                JOptionPane.showMessageDialog(null, "US$" + cantidad * 0.00025);
                break;
            case "Euros":
                JOptionPane.showMessageDialog(null, "€" + cantidad * 0.00022);
                break;
            case "Libras Esterlinas":
                JOptionPane.showMessageDialog(null, "£" + cantidad * 0.00019);
                break;
            case "Yen Japonés":
                JOptionPane.showMessageDialog(null, "¥" + cantidad * 0.035);
                break;
            case "Won sur-coreano":
                JOptionPane.showMessageDialog(null, "₩" + cantidad * 0.31);
                break;
                
        }
    }
   
    public static void convertir_de_dolares(String monedaFinal, double cantidad) {
        switch (monedaFinal) {
            case "Dólares":
                JOptionPane.showMessageDialog(null,"US$"+ cantidad);
                break;
            case "Pesos Colombianos":
                JOptionPane.showMessageDialog(null, "COP$" + cantidad * 4005.28);
                break;
            case "Euros":
                JOptionPane.showMessageDialog(null, "€" + cantidad * 0.89);
                break;
            case "Libras Esterlinas":
                JOptionPane.showMessageDialog(null, "£" + cantidad * 0.77);
                break;
            case "Yen Japonés":
                JOptionPane.showMessageDialog(null, "¥" + cantidad * 139.80);
                break;
            case "Won sur-coreano":
                JOptionPane.showMessageDialog(null, "₩" + cantidad * 1265.63);
                break;
                
        }
    }
    
    public static void convertir_de_euro(String monedaFinal, double cantidad) {
        switch (monedaFinal) {
            case "Euros":
                JOptionPane.showMessageDialog(null,"€" + cantidad);
                break;
            case "Pesos Colombianos":
                JOptionPane.showMessageDialog(null, "COP$"+ cantidad * 4495.07 );
                break;
            case "Dólares":
                JOptionPane.showMessageDialog(null, "US$"  + cantidad * 1.12);
                break;
            case "Libras Esterlinas":
                JOptionPane.showMessageDialog(null, "£" + cantidad * 0.87);
                break;
            case "Yen Japonés":
                JOptionPane.showMessageDialog(null, "¥" + cantidad * 156.84);
                break;
            case "Won sur-coreano":
                JOptionPane.showMessageDialog(null, "₩" + cantidad * 1420.09);
                break;
    }
    
    
    
    
    
    
}

    public static void convertir_de_libra(String monedaFinal, double cantidad) {
        switch (monedaFinal) {
            case "Libras Esterlinas":
                JOptionPane.showMessageDialog(null, "£" + cantidad);
                break;
            case "Dólares":
                JOptionPane.showMessageDialog(null, "US$" + cantidad * 1.29);
                break;
            case "Euros":
                JOptionPane.showMessageDialog(null, "€" + cantidad * 1.15);
                break;
            case "Pesos Colombianos ":
                JOptionPane.showMessageDialog(null, "COP$" + cantidad * 5180.91);
                break;
            case "Yen Japonés":
                JOptionPane.showMessageDialog(null, "¥" + cantidad * 180.88);
                break;
            case "Won sur-coreano":
                JOptionPane.showMessageDialog(null, "₩" + cantidad * 1637.04);
                break;
        }
    }
    
    public static void convertir_de_yen(String monedaFinal, double cantidad) {
        switch (monedaFinal) {
            case "Yen Japonés":
                JOptionPane.showMessageDialog(null, "¥" + cantidad);
                break;
            case "Dólares":
                JOptionPane.showMessageDialog(null, "US$" + cantidad * 0.0072);
                break;
            case "Euros":
                JOptionPane.showMessageDialog(null, "€" + cantidad * 0.0064);
                break;
            case "Libras Esterlinas":
                JOptionPane.showMessageDialog(null, "£" + cantidad * 0.0055);
                break;
            case "Pesos Colombianos":
                JOptionPane.showMessageDialog(null, "COP$" + cantidad * 28.64);
                break;
            case "Won sur-coreano":
                JOptionPane.showMessageDialog(null, "₩" + cantidad * 9.05);
                break;
                
        }
    }
    
    public static void convertir_de_won(String monedaFinal, double cantidad) {
        switch (monedaFinal) {
            case "Won sur-coreano":
                JOptionPane.showMessageDialog(null, "₩" + cantidad);
                break;
            case "Dólares":
                JOptionPane.showMessageDialog(null, "US$" + cantidad * 0.00079);
                break;
            case "Euros":
                JOptionPane.showMessageDialog(null, "€" + cantidad * 0.00070);
                break;
            case "Libras Esterlinas":
                JOptionPane.showMessageDialog(null, "£" + cantidad * 0.00061);
                break;
            case "Pesos Colombianos":
                JOptionPane.showMessageDialog(null, "COP$" + cantidad * 3.16);
                break;
            case "Yen Japonés":
                JOptionPane.showMessageDialog(null, "¥" + cantidad * 0.11);
                break;
                
        }
    }





}