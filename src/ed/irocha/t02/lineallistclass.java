/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.irocha.t02;

/**
 *
 * @author casa
 */
public class lineallistclass<T>{
    private nodeclass first;
    private nodeclass last;
    
    public void insertfirst(T n){
     nodeclass node = new nodeclass(n);
        if(isempty()){ // si la lista esta vacia
            first = node;
            last= node;
        } else{// si la lista no esta vacia
            node.next = first;
                    first = node;
        }
    }
    
    public void insertfinal(T n){
        nodeclass node = new nodeclass(n);
        if(isempty()){//si la lista esta vacia 
            first = node;
            last = node;
        } else { // si la lista no esta vacia
            nodeclass prev;
            prev = last;
            prev.next = last = node;
           
        }
    }
    public void eliminarfirst(){
        first = first.next;
    }
    
    public void eliminarfinal(){
        nodeclass node = first; // se crea un pntero que es igual al primero
        nodeclass prev = null;// se crea otro que sea igual a null
        while(node.next!=null){//si node.next es diferente de null
            prev = node;// el puntero es igual a node  
            node = node.next;// mientras node es igual a node.next asi se ir verificando si el siguien del ultimo nodo es igual a null
            
        }
        last = prev;
        prev.next = null;
    }
    
    private boolean isempty(){
        return first == null;
        
    }
    public void showlist(){
        if(!isempty()){
            nodeclass T;
            T = first;
            while(T!=null){
                System.out.println(T.data);
                T = T.next;
            }
            }else{
                System.out.println("la lista esta vacia");    
                    }
        }
     public boolean enode(T data){//enode es para eliminar el nodo
        nodeclass a, b;
        if (isempty()){ //si es que esta vacio 
            return false;
        } else { //si contiene algo
            a = first; // se coloca el auxiliar al inicio de la lista
            b = first;
            while (a.data != data && a != null){ // mientras no encuetre el dato o no llega al final de la lista va a recorrer la lista
                b = a;//el dato de a se guarda en b
                a = a.next; // te se vuelve el siguiente para ir recorriendo la lista
            }
            if(a == null){return false;} //significa que no lo  encontro
            else {
                b.next=a.next;
                return true;
            }
        }
    }
    }
