package com.paulofili;

public class UserTest {
    private void testUserType(User user) {
        user.printUserType();
    }

    private void testApproveReview(Staff staff) {
        if (staff instanceof Editor) {
            ((Editor)staff).approveReview();
        } else {
            System.out.println("Invalid object passed");
        }
    }
    public static void main(String[] args) {
        User user = new User();
        User staff = new Staff();
        User editor = new Editor();

        UserTest ut = new UserTest();
        ut.testUserType(user);
        ut.testUserType(staff);
        ut.testUserType(editor);
        editor.saveWebLink();

        ut.testApproveReview(new Editor());
        ut.testApproveReview(new Staff());
    }
}
