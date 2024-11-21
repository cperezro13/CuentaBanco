package cuentabanco;
// Describiendo un sistema bancario
//Metodos son: consignar, retirar, tranferencia
// Clase cliente y clase cuenta

public class CuentaBanco {

    private Cliente cliente;
    private double saldo;

    public CuentaBanco(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void consignar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Consignacion exitosa. Saldo actual: " + saldo);
        } else {
            System.out.println("Monto de consignación inválido.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        } else if (monto > saldo) {
            System.out.println("No hay suficiente saldo para retirar esa cantidad.");
        } else {
            System.out.println("Monto de retiro inválido.");
        }
    }

    public void transferir(double monto, CuentaBanco cuentaDestino) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            cuentaDestino.consignar(monto);
            System.out.println("Transferencia exitosa. Saldo actual: " + saldo);
        } else if (monto > saldo) {
            System.out.println("No hay suficiente saldo para realizar la transferencia.");
        } else {
            System.out.println("Monto de transferencia inválido.");
        }
    }
}
