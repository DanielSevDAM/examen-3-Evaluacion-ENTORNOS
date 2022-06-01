/*
*	grupo  : 1º GDAM
*	alumno : Leo Daniel Sevillano Pantigoso
*	n.exp. : 7246
*	fecha  : 01/06/2022
 */
package Cheese;

import java.util.ArrayList;
/**
 *
 * @author Daniel Sevillano
 */
public class Main {
    
     public static void main(String[] args) {
         ListaProductos listaP = new ListaProductos();
         
        Producto Leche = new Producto("QDF", "Entera", 3, 2);
        
        Producto Yogur = new Producto("AFW", "Natural", 4, 1);

        listaP.addProducto(Leche);
        listaP.addProducto(Yogur);
        
        ArrayList<Producto> productos = listaP.getProductos();

        for (int i = 0; i < productos.size(); i++) {
            Producto prod = productos.get(i);
            prod.imprime_etiqueta();
        }
    
    
         System.out.println("1º Gdam: Entornos de desarrollo");
    }
 
    
}
