package com.paulofili;

public class Editor extends Staff{
    protected void printUserType() {
        System.out.println("I am an Editor");
    }

    protected void approveReview() {
        System.out.println("This review has been approved");
    }
}
