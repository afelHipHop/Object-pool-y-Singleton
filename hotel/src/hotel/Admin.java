
package hotel;

public class Admin {
    
   Habitacion habitacion1;
   Habitacion habitacion2;
   Habitacion habitacion3;
   Habitacion habitacion4;
   Habitacion habitacion5;
   
   Hotel hotel;
   
   public void asignacion(){
       hotel = Hotel.getInstance();
       
       habitacion1 = hotel.getHabitacion();
       System.out.println(habitacion1.getNumero());
       habitacion2 = hotel.getHabitacion();
       System.out.println(habitacion2.getNumero());
       habitacion3 = hotel.getHabitacion();
       System.out.println(habitacion3.getNumero());
       hotel.desocuparHabitacion(habitacion1);
       habitacion1 = hotel.getHabitacion();
       System.out.println(habitacion1.getNumero());
       habitacion4 = hotel.getHabitacion();
       System.out.println(habitacion4.getNumero());
       hotel.desocuparHabitacion(habitacion3);
       habitacion3 = hotel.getHabitacion();
       System.out.println(habitacion3.getNumero());
   }
    
}
