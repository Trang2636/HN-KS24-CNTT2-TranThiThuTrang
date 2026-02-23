package com.rikkei.bai4;

public class RemoteControl {
    void powerOn();
    default void checkBattery() {
        System.out.println("Pin ổn định");
    }
}
