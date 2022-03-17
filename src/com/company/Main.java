package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Car car = new Car();
        try (Car car1= new Car()){
            car.drive();
        }catch  (Exception e){
            e.getMessage();
        }
    }
}