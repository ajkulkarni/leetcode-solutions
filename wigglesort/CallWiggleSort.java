/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wigglesort;

/**
 *
 * @author Ajay
 */
public class CallWiggleSort {
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a ={1,2,3,4,5};
        WiggleSort ws = new WiggleSort();
        ws.callWiggle(a,true);
        ws.callWiggle(a,false);
    }
}
