package Implementacion;
import Interface.Transferir;

public class TransferenciaDinero  implements Transferir{

    @Override
    public void transferir(double valor, String banco) {
       System.out.println("Usted va a enviar: $" + valor + " al banco: " + banco);
    }
    
}
