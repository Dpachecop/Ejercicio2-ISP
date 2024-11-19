package Implementacion;
/*Interfaz que va a implementar todos los metodos de operaciones
 * para posteriormente refatorizar en interfaces aparte
 * 
 * 
 */


 public interface OperacionBancaria {
 
    public void Transferir(String banco);
    public void Retirar(String puntoRetiro);
    public void pagarFactura(String valor, int idFactura);


 }