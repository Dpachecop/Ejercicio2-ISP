package Implementacion;
import Interface.Pagar;

public class SaldarFactura implements Pagar {

    @Override
    public void pagarFactura(double valor, int idFactura) {
       System.out.println(
        "Usted va a pagar la factura de id: #" +idFactura 
       + " con un valor de: " + valor );
    }
    
}
