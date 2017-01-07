package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Олександр on 06.01.2017.
 */
public class DroneWorld {
    private int rows;
    private int columns;
    private int numDrones;
    private int turns;
    private int payload;
    private int productNum;

    private int[] prWeight;
    private ArrayList<Warehouse> warehouses;
    private ArrayList<Drone> drones;
    private ArrayList<Order> orders;

    public static DroneWorld fromFile(String fileName)
            throws java.io.FileNotFoundException
    {
        Scanner scanner = new Scanner(new File(fileName));
        DroneWorld world = new DroneWorld();
        world.rows = scanner.nextInt();
        world.columns = scanner.nextInt();
        world.numDrones = scanner.nextInt();
        world.turns = scanner.nextInt();
        world.payload = scanner.nextInt();
        world.productNum = scanner.nextInt();

        world.drones = new ArrayList<Drone>(world.numDrones);
        for(int i = 0; i < world.numDrones; ++i)
            world.drones.add(new Drone());

        world.prWeight = new int[world.productNum];
        for(int i = 0; i < world.productNum; ++i)
            world.prWeight[i] = scanner.nextInt();

        int numWarehouse = scanner.nextInt();
        world.warehouses = new ArrayList<Warehouse>(numWarehouse);
        for(int i = 0; i < numWarehouse; ++i){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] prodCount = new int[world.productNum];
            for(int j = 0; j < world.productNum; ++j)
                prodCount[j] = scanner.nextInt();

            world.warehouses.add(new Warehouse(x,y,prodCount));
        }

        int numOrders = scanner.nextInt();
        world.orders = new ArrayList<Order>(numOrders);
        for(int i = 0; i < numOrders; ++i){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int numProduct = scanner.nextInt();
            int[] products = new int[numProduct];
            for(int j = 0; j < numProduct; ++j)
                products[j] = scanner.nextInt();

            world.orders.add(new Order(x,y,products));
        }

        return world;
    }

    public List<DroneCommand> DeliverProduct(){
        ArrayList<DroneCommand> commands = new ArrayList<DroneCommand>();
        return commands;
    }
}
