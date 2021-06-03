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

// An enumeration of apple varieties.
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumSample {
    public static void main(String args[]) {
        Apple ap;
        
        ap = Apple.Cortland;
        
        System.out.println(ap);
    }
}
