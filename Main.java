
import Implementacion.RetirarDinero;
import Implementacion.SaldarFactura;
import Implementacion.TransferenciaDinero;

public class Main {
    public static void main(String[] args) {
        RetirarDinero retirarDinero = new RetirarDinero();
        SaldarFactura saldarFactura= new SaldarFactura();
        TransferenciaDinero transferenciaDinero = new TransferenciaDinero();



        retirarDinero.retirar(50.000, "La castellana");
        saldarFactura.pagarFactura(10.000, 1267);
        transferenciaDinero.transferir(15.000, "Nu Bank");
     }
}
