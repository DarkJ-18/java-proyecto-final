import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> listadeCompras;

    public TarjetaDeCredito(double limite) {
        this.saldo = limite;
        this.limite = limite;
        listadeCompras = new ArrayList<>();
    }

    public boolean lanzarCompra(Compra compra){
        if (this.saldo >= compra.getValor() ){
            this.saldo -= compra.getValor();
            this.listadeCompras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListadeCompras() {
        return listadeCompras;
    }


}
