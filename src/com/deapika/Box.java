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
class Box {
    private double width;
    private double height;
    private double depth;
    
    // construct clone of an object
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    
    // constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    
    // constructor used when no dimension specified
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    
    // constuctor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }
    
    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight; // weight of box
    
    // construct clone of an object
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
    
    // constructor when all parameters are specified
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
    
    // default constructor
    BoxWeight() {
        super();
        weight = -1;
    }
    
    // constructor used when cube is created
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

// Add shipping costs.
class Shipment extends BoxWeight {
    double cost;
    
    // construct clone of an object
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }
    
    // constructor when all parameters are specified
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }
    
    // default constructor
    Shipment() {
        super();
        cost = -1;
    }
    
    // constructor used when cube is created
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

//class DemoBoxWeight {
//    public static void main(String args[]) {
//        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
//        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
//        double vol;
//        
//        vol = mybox1.volume();
//        System.out.println("Volume of mybox1 is " + vol);
//        System.out.println("Weight of mybox1 is " + mybox1.weight);
//        
//        vol = mybox2.volume();
//        System.out.println("Volume of mybox2 is " + vol);
//        System.out.println("Weight of mybox2 is " + mybox2.weight);
//    }
//}

class DemoShipment {
    public static void main(String args[]) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        
        double vol;
        
        vol = shipment1.volume();
        System.out.println("Volume of shipment1 is " + vol);
        System.out.println("Weight of shipment is " + shipment1.weight);
        System.out.println("Shipping cost: $" + shipment1.cost);
        System.out.println();
        
        vol = shipment2.volume();
        System.out.println("Volume of shipment2 is " + vol);
        System.out.println("Weight of shipment2 is " + shipment2.weight);
        System.out.println("Shipping cost: $" + shipment2.cost);
    }
}
