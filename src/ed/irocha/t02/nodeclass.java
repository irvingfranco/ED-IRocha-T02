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
public class nodeclass<T> {
    T data;
    nodeclass next;
    
    public nodeclass(T data){
        this.data = data;
        this.next = null;
    }
}
