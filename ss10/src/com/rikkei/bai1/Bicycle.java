package com.rikkei.bai1;

public class Bicycle {
    public Bicycle(String brand) {
        super(brand);
    }
    @Override
    public void move() {
        System.out.println(brand + ": Di chuyển bằng sức người");
    }
}
