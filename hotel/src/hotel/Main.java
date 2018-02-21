/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.util.Scanner;

/**
 *
 * @author personal
 */
public class Main {

    public static void main(String[] args) {
        Admin a = new Admin();
        a.verificarDisponibilidad();
        System.out.println("¿Asignar habitacion?");
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        if (text.equals("Si"))
            a.asignarHabitacion();
        else{
            System.out.println("¿Liberar habitacion?");
            s = new Scanner(System.in);
            text = s.nextLine();
            if (text.equals("Si")){
                System.out.println("¿que habitacion desea liberar?");
                s = new Scanner(System.in);
                text = s.nextLine();
                if(Integer.parseInt(text)>0 && Integer.parseInt(text)<12)
                    a.registrarSalida(Integer.parseInt(text));
                else
                    System.out.println("valor invalido, intentelo mas tarde");
            }
            else
                System.out.println("vuelva pronto");
            
        }
        
    }
    
}
