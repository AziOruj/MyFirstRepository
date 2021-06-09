package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Car {
    Car(int a){

    }
    Car(double b){

    }
    String color;
    String model;
    Integer atGucu;
    String type;
    public Car(ArrayList<String > array){
        color=array.get(0);
        model=array.get(1);
        atGucu=array.get(2)==null? null: Integer.valueOf(array.get(2));
        type=array.get(3);
    }
    public static void main(String[] args) {
        String filename="C:/Users/orujo/Downloads/task.txt";
        ArrayList<Car> cars = new ArrayList();
        try {
            File file =new File(filename);
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String br =myReader.nextLine().replace(';',',');

                ArrayList<String > carlist=new ArrayList();
                String a="";
                for(int x=0;x<br.length();x++){
                      a+=','==br.charAt(x)? "": br.charAt(x);
                      if(','==br.charAt(x)){
                          if("".equals(a)){
                              carlist.add(null);
                          }else{
                              carlist.add(a);
                              a="";
                          }
                      }
}
                cars.add(new Car(carlist));

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        for (Car car:cars){
            System.out.println(car.color+", "+car.model+", "+car.atGucu+", "+car.type);
        }
    }
//    public static ArrayList<Car> carList(String filename){
//
//        ArrayList<Car> cars = new ArrayList();
//        try {
//            File file =new File(filename);
//            Scanner myReader = new Scanner(file);
//            while (myReader.hasNextLine()) {
//                String br =myReader.nextLine();
//                cars.add(new Car(br.substring(0,br.length()-1) .split(",")));
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//        return cars;
//    }
//
        }

