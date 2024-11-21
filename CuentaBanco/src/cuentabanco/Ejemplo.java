package cuentabanco;

public class Ejemplo {

    public class Main {

        public static void main(String[] args) {
            
            Cliente cliente1 = new Cliente("Nestor Bolivar", "12345678");
            Cliente cliente2 = new Cliente("Cristian Perez", "87654321");

            CuentaBanco cuenta1 = new CuentaBanco(cliente1);
            CuentaBanco cuenta2 = new CuentaBanco(cliente2);

            cuenta1.consignar(1000.0);
            cuenta2.consignar(5000.0);

            cuenta1.retirar(200.0);

            cuenta1.transferir(300.0, cuenta2);

            System.out.println("Saldo final de " + cuenta1.getCliente().getNombre() + ": " + cuenta1.getSaldo());
            System.out.println("Saldo final de " + cuenta2.getCliente().getNombre() + ": " + cuenta2.getSaldo());
        }
    }
}