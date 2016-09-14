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
public class EDIRochaT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lineallistclass list = new lineallistclass();
        list.insertfinal(7);
        list.insertfinal(2);
        list.insertfinal(11);
        list.insertfirst(25);
        list.insertfirst(62);
        list.insertfinal("chan chan channnn");
        list.showlist();
        list.enode(7.7);
        list.showlist();
        // TODO code application logic here
    }
    
}
