
package gameland;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import url.conexionBD.Conexion;
import url.controlador.ProductoJpaController;
import url.controladorBD.Producto;

public class Gameland {

 
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Login entrar = new Login();
        //entrar.setVisible(true);
        EntityManagerFactory emf = Conexion.obtenerConexion();
        ProductoJpaController control = new ProductoJpaController(emf);
        List<Producto> lis = new ArrayList<>();
        Producto producto = new Producto();
        lis = control.findProductoEntities();
        for (int i = 0; i < lis.size(); i++) {
            System.out.println(lis.get(i).getDescripcion());
        }

    }
    
}
