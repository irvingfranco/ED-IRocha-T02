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
        if(isempty()){ 
            first = node;
            last= node;
        } else{
            node.next = (nodeclass)first;
                    first = node;
        }
    }
    
    public void insertfinal(T n){
        nodeclass node = new nodeclass(n);
        if(isempty()){ 
            first = node;
            last = node;
        } else { 
            nodeclass prev;
            prev = last;
            prev.next = last = node;
           
        }
    }
    public void eliminarfirst(){
        first = first.next;
    }
    
    public void eliminarfinal(){
        nodeclass node = first;
        nodeclass prev = null;
        while(node.next!=null){
            prev = node;
            node = node.next;
            
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
     public boolean enode(T data){
        nodeclass a, b;
        if (isempty()){ 
            return false;
        } else { 
            a = first; 
            b = first;
            while (a.data != data && a != null){ 
                b = a;
                a = a.next; 
            }
            if(a == null){return false;} 
            else {
                b.next=a.next;
                return true;
            }
        }
    }
    }
