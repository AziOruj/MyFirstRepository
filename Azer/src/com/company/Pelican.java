package com.company;

import static com.company.First.method;
 class Bunny implements First{

    public static void main(String[] args) {
        System.out.println(First.method());
        method();
    }
    @Override
    public void khatai() {

    }
}
 interface First {
    void khatai();

    static String method() {
        return "Sallaam";
    }
}











