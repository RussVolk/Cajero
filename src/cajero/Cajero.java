//Programa que simula un cajero automático
//NOTA: La cuenta contiene un saldo inicial que el usuario ingresa
//Autor: Russlan Arriola
package cajero;

import javax.swing.JOptionPane;


public class Cajero {


    public static void main(String[] args) {

        int opcion, ingreso,saldoActual, retiro,saldo_inicial;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automático\n"
                + "Elija una opción del menú \n"
                + "1. Depositar dinero\n"
                +"2. Retirar dinero\n"
                +"3. Salir"));
        
       
        switch (opcion){
            case 1: 
            saldo_inicial=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el saldo inicial de su cuenta: "));   
            ingreso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto del depósito: "));
            saldoActual = saldo_inicial + ingreso;
            JOptionPane.showMessageDialog(null, "Su saldo actual es: "+"$"+saldoActual);
                break;
            
            case 2: 
                saldo_inicial=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el saldo inicial de su cuenta: ")); 
                retiro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de su retiro: "));
                    if (retiro>saldo_inicial){
                        JOptionPane.showMessageDialog(null, "Fondos insuficientes");
                    }
                    else {
                        saldoActual=saldo_inicial-retiro;
                        JOptionPane.showMessageDialog(null, "El saldo actual es: "+"$"+saldoActual);
                    }
                    break;
            case 3: break;
            default: JOptionPane.showMessageDialog(null,"La opción seleccionada no se ecuentra en el menú" );
    }
        
    }
    
}
