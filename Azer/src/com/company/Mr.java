package com.company;

import test.Camel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

   class Mr {
    String color;
    String model;
    String atgucu;
    String type;
    public Mr(String[] car){
        color=car[0].equals("")? null:car[0];
        model=car[1].equals("")? null:car[1];
        atgucu=car[2].equals("")? null:car[2];
        type=car[3].equals("")? null:car[3];
    }

    public static void main(String[] args) {
        String a="";
        String []t={"",""};
        System.out.println(a==t[0]);
        ArrayList<Mr> cars=new ArrayList<>();
        ArrayList<String[] > car =new ArrayList<>();
        try {
            File myObj = new File("C:/Users/orujo/Downloads/task.txt");
            Scanner myReader = new Scanner(myObj);


            int x=0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                car.add(data.split(","));

                cars.add(new Mr(car.get(x)));
                x++;
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        for (int x=0;x<cars.size();x++){
            System.out.println(cars.get(x).color+"/"+cars.get(x).model+"/"+cars.get(x).atgucu+"/"+cars.get(x).type);

        }

    }

}
