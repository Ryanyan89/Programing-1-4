public class Main
{
    public static void main( String[] args )
    {
        //practice 1
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;
        cars= 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;
        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drives available.");
        System.out.println("There will be " + cars_not_driven + " empty cars today.");
        System.out.println("We can transport " + carpool_capacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + average_passengers_per_car + " in each car.");

        //practice 2
        int floor_number;
        double steps_until_next_floor;
        floor_number = 113;
        steps_until_next_floor = 2.71828;
        String words = "Computer science";
        String Firstword = words.substring(0,8);
        String Lastword = words.substring(8,16);
        String fullword = Firstword + Lastword;
        System.out.println("It is the " + floor_number + " floor");
        System.out.println("You will reach the next floor in " + steps_until_next_floor + " steps");
        System.out.println("You are in the game called " + fullword);

        //practice 3
        String Table ="+------------------------------------------------+";
        String First_Course = "|1|                Pre-Calculus 11|        Mr.Tam|";
        String Second_Course = "|2|                      French 11|     Ms.Hollet|";
        String Third_Course = "|3|                   Chemistry 11|      Ms.Ogden|";
        String Fourth_Course = "|4|                 Law Studies 12|           Lee|";
        String Fifth_Course = "|5|                  Psychology 11|       Ms.Quon|";
        String Sixth_Course = "|6|                  Programing 11|    Mr.Zaremba|";
        String Seventh_Course = "|7|                     Physics 11|       Mr.Jung|";
        String Eight_Course = "|8|                 Composition 11|      Ms.Dixon|";
        String Off_time_table_Course ="|9|             Work Experience 11|   Ms.Bulietta|";
        System.out.println(Table);
        System.out.println(First_Course);
        System.out.println(Second_Course);
        System.out.println(Third_Course);
        System.out.println(Fourth_Course);
        System.out.println(Fifth_Course);
        System.out.println(Sixth_Course);
        System.out.println(Seventh_Course);
        System.out.println(Eight_Course);
        System.out.println(Off_time_table_Course);
        System.out.println(Table);

    }
}

