/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial3edd;

/**
 *
 * @author Jo
 */
public class insertarHash {
    
    // Se utiliza un array de objetos de tamaño 10 para iniciar y al igual que el proyecto un 30% de uso para cambiar
    // Se utiliza un arbol binario para las colisiones para lograr la complejidad requerida
    // Cada objeto tiene su propio id con el que se calcula la posición y se agrega al árbol binario
    public void insertar(Object dato){
        //Crear nodo a agregar
        Nodo nuevo = nuevo(dato);
        //Calcular posicion con division
        int posicion = dato.getId() % this.size;
        //Verificar si hay colisión
        if (this.hayColision(posicion)){
            this.tabla[posicion].getNodo().getArbol().insertar(nuevo);
        }else{
            //Le agrego una lista vacia para cuando existan colisiones
            nuevo.crearLista();
            this.tabla[posicion] = nuevo;
        }
    }    
}
