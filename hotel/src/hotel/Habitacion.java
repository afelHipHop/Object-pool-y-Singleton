
package hotel;

public class Habitacion {
    
    private boolean disponible;
    private int numero;
    
    public Habitacion(int n){
        disponible = true;
        numero = n;
    }
    
    public Habitacion(){
        
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
}
