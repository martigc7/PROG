package programacio;

/**
 *
 * @author 47942307a
 */
import java.util.ArrayList;

public class ListaClientes {

    private ArrayList<Clientes> lista;

    public ListaClientes(){
        lista = new ArrayList<>();
    }

    public void altaCliente(Clientes c){
        lista.add(c);
    }

    public ArrayList<Clientes> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Clientes> lista) {
        this.lista = lista;
    }

    public Clientes getClienteByNumeroTelefono(int telefono){
        for (Clientes c : lista) {
            if (c.getTelefono() == telefono){
                return c;
            }
        }
        return null;
    }
}