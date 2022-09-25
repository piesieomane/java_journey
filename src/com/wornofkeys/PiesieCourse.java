package com.wornofkeys;

public class PiesieCourse {
    public static void main(String [] args) {
//        House myHouse = new House("Piesie", 4);
////        myHouse.ownername = "Ato";
//        myHouse.print();
//
//        House yourHouse = new House("David", 6);
//        yourHouse.print();
//
//        House hisHouse = new House ("Yeboah", 8);
//        hisHouse.print();
//
//        Hotel myHotel = new Hotel("Asuama", 34);
//        myHotel.print();
//        myHotel.print(3);
        Bird bird = new Bird("Eagle");
        //Only the class can access the static method
        System.out.println(Bird.getWings());

    }
}
