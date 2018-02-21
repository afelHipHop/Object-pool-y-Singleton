
package hotel;

public class Hotel {
    
    private Habitacion[] habitaciones;
    
    private static Hotel instance;
    
    public static Hotel getInstance(){
        if(instance == null)
            instance = new Hotel();
        return instance;
    }
            
    private Hotel(){
        
    }
    public void room(){
        habitaciones = new Habitacion[10];
        for(int i=0; i<10; i++){
            habitaciones[i]=new Habitacion();
            habitaciones[i].setDisponible(true);
            habitaciones[i].setNumero(i+1);
        }
    }
    
    public Habitacion getHabitacion(){
        for(int i=0; i<10; i++){
            if(habitaciones[i].isDisponible()){
                System.out.println("la habitacion "+i+" ahora esta ocupada");
                habitaciones[i].setDisponible(false);
                return habitaciones[i];
            }
        }
        return null;
    }
    
    public void desocuparHabitacion(Habitacion h){
        System.out.println("la habitacion "+h.getNumero()+" ya esta disponible");
        h.setDisponible(true);
    }
}
