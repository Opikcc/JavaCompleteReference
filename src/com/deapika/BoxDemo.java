/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deapika;

import com.deapika.Box;

/**
 *
 * @author newcomer
 */
public class BoxDemo extends Box {
    public static void main(String args[]) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        
//        myBox1.width    = 15;
//        myBox1.height   = 25;
//        myBox1.depth    = 35;
        myBox1.volume();
        
//        myBox2.width    = 155;
//        myBox2.height   = 255;
//        myBox2.depth    = 355;
        myBox2.volume();
    }
}
