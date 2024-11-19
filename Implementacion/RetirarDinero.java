package Implementacion;
import Interface.Retirar;

public class RetirarDinero implements Retirar {

    @Override
    public void retirar(double valor, String puntoRetiro) {
        System.out.println("Usted va a retirar " + valor + " en el punto " + puntoRetiro);
    }

   
    
}
