package cw3.mediator;

import cw3.mediator.domain.GroupOfUsers;
import cw3.mediator.domain.User;

class Test2 {

    public static void main(String[] args) {
        GroupOfUsers grupa1 = new GroupOfUsers(1);

        User robert = new User("Robert");
        User john = new User("John");
        User kuba = new User("Kuba");
        User mateusz = new User("Mateusz");

        grupa1.addToGroup(kuba);
        grupa1.addToGroup(mateusz);
        grupa1.addToGroup(john);


        robert.sendMessageToUser("Hi! John!");
        john.sendMessageToUser("Hello! Robert!");

        mateusz.sendMessageToGroup("HEllo all");
    }
}
