import java.util.ArrayList;

public class Venta {
    private Cliente cliente;
    private ArrayList<Pajaro> pajaros = new ArrayList<>();

    public Venta(Cliente cliente){
        this.cliente = cliente;
    }
    public void añadirPajaro(Pajaro p){
        pajaros.add(p);
    }
    public double calcularTotal(){
        double total = 0;
        for (Pajaro p : pajaros){
            total += p.getPrecio();
        }
        return total;
    }
    public void mostrarInfo(){
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Pajaros comprados:");
        for (Pajaro p : pajaros){
            System.out.println(" - " + p);
        }
        System.out.println("Total: " + calcularTotal() + "€");
        System.out.println("------------");
    }
}

