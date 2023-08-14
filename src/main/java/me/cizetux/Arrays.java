package me.cizetux;

public class Arrays {
    public static void main(String[] args) {
        String[] cars = new String[]{"Camaro", "Corvette", "Tesla", "BMW"};
        System.out.println(cars[1]);

        int i;
        for (i = 0; i < 10; ++i) {
            System.out.println("Output #" + i);
        }

        for (i = 0; i < cars.length; ++i) {
            printCarInfo(cars[i]);
        }

        System.out.println("\n------ 2eme solution ----------\n");
        String[] var6 = cars;
        int var3 = cars.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            String carType = var6[var4];
            printCarInfo(carType);
        }

    }

    static void printCarInfo(String car) {
        System.out.println("The car type is: " + car);
    }
}
