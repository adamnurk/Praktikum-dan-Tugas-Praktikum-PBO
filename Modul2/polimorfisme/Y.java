package com.adam.polimorfisme;

public class Y  extends  X{
    @Override
    public void getValue(String value) {
        super.getValue(value);
        System.out.println("value kelas Y :" + value);
    }
}
