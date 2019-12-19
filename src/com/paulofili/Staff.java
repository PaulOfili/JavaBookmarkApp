package com.paulofili;

public class Staff extends User{
    protected void printUserType() {
        System.out.println("I am a Staff");
    }

    protected void postReview() {
        System.out.println("Staff called postReview");
    }
}
