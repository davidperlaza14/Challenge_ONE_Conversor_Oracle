/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.conversor.co;

import javax.swing.JOptionPane;

/**
 *
 * @author davidperlaza14
 */
public class Challenge_ONE_Conversor_Oracle {

    public static void main(String[] args) {
        Moneda moneda = new Moneda();
        Temperatura temperatura = new Temperatura();
        boolean salir = true;
        
        do {  
            try {
                String[] tipoDeConversor = {"conversor de moneda", "conversor de temperatura", "salir"};
                Object conversionInicial = JOptionPane.showInputDialog(null,"Selecciona lo que desea hacer:","",
              JOptionPane.QUESTION_MESSAGE,null, tipoDeConversor, tipoDeConversor[0]);
                switch (conversionInicial.toString()) {
                    case "conversor de moneda":
                        moneda.Moneda();
                        break;
                    case "conversor de temperatura":
                        temperatura.Temperatura();
                        break;
                    case "salir":
                        salir = false;
                }
            } catch (Exception e) {
                salir = false;
            }
            
        } while (salir);
        
    }
}
