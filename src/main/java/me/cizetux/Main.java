package me.cizetux;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int i = 0;

        while(i < 5) {
            System.out.println(i++);
            Thread.sleep(200L);
        }
    }
}