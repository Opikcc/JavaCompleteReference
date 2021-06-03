/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deapika;

import com.deapika.*;

/**
 *
 * @author newcomer
 */
class ExecMain implements BidangDatar {
    public double luas() {
        double panjang = 100;
        double lebar = 100;
        double luas;
        
        luas = panjang * lebar;
        
        return luas;
    }
    public static void main(String args[]) {
        A superOb = new A();
        B subOb = new B();
        
        // The superclass may be used by itself.
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of super; ");
        superOb.showij();
        System.out.println("");
        
        /* The subclass has access to all pblic members of its superclass. */
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Content of subUb");
        subOb.showij();
        subOb.showk();
        System.out.println("");
        
        System.out.println("Sum of i, j and k in subOb:");
        subOb.sum();
        
        ExecMain X = new ExecMain();
        System.out.println("Luas : " + X.luas());
    }
}
