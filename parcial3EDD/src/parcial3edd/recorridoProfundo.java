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
public class recorridoProfundo {
    
    //Usando una pila de prioridad
    public void recorridoProfundo(){
        Pila prioridad = new Pila();
        //Obteniendo el primer vertice guardado en el grafo
        Nodo actual = null;
        //Obteniendo la primera arista del vertice
        Arista arista = actual.getAristas().getPrimero();
        //Agregando el primer vertice a la pila de prioridad
        prioridad.push(this.getInicio());
        while (!prioridad.isEmpty()){
            //Obtener el elemento de la pila
            actual = prioridad.pop();
            //Bloquear el vertice que se esta visitando
            actual.bloquear();
            while (arista!=null){
                //Verificar que el vertice a visitar no este bloqueado e imprimir
                if (!arista.isBloqueada()){
                    imprimirCamino(arista);
                }
                //Agregar vertice a la pila de espera
                prioridad.push(arista);
            }
        }
    }
}
