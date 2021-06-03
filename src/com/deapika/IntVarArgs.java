/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deapika;

/**
 *
 * @author newcomer
 */
class IntVarArgs {    
    public static void testVa(int ... v) {
        for(int x : v) System.out.println(x);
    }
}
