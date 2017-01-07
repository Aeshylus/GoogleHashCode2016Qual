package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            DroneWorld world = DroneWorld.fromFile("E:\\Projects\\Java\\src\\TestFile.in");
        }
        catch(java.io.FileNotFoundException ex){
            System.out.println("file_not_found\n");
        }

    }
}
