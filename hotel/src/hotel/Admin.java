
package hotel;

public class Admin {
    
    private Habitacion[] habitaciones= new Habitacion[10];
    Hotel h;
    
    public void verificarDisponibilidad(){
        h = Hotel.getInstance();
        for(int i=0; i<10; i++){
            System.out.println("Habitacion: "+habitaciones[i].getNumero()+" Disponible: "+habitaciones[i].isDisponible());
        }
    }
    
    public void asignarHabitacion(){
        h.getHabitacion();
    }
    
    public void registrarSalida(int n){
        h.desocuparHabitacion(habitaciones[n-1]);
    }
    
}
