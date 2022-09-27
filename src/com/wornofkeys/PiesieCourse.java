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
//        Bird bird = new Bird("Eagle");
//        //Only the class can access the static method
//        System.out.println(Bird.getWings());
//        Crow crow = new Crow("Crow");
////        crow.sing();
////        crow.averageLifespan();
//        if (crow instanceof Bird) {
//            System.out.println("A crow is of a Bird");
//        }
//
//        Robin robin = new Robin("animal");
//        robin.sing();
//        robin.averageLifespan();
        //Enum
//        System.out.println(DaysOfWeek.FRIDAY.getDisplayName());
//        System.out.println(DaysOfWeek.FRIDAY.isWorkday());
        DaysOfWeek day = DaysOfWeek.MONDAY;

        if(day.isWorkday()) {
            System.out.println("Going to work today");
        }else {
            System.out.println("It is a weekend");
        }

        for (DaysOfWeek anyday : DaysOfWeek.values()){
            System.out.println(anyday.getDisplayName() + ":" + anyday.isWorkday());
        }
    }
}
