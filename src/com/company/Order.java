package com.company;

import java.util.List;

/**
 * Created by Олександр on 06.01.2017.
 */
public class Order {
    Order(int _x, int _y, int[] _products){
        x = _x;
        y = _y;
        products = _products;
    }

    private int x;
    private int y;
    private int[] products;
}
