package cw3.mediator.domain;

import java.util.ArrayList;
import java.util.List;

public class GroupOfUsers {
    private List<User> listOfUsers = new ArrayList<User>();

    public GroupOfUsers(int id) {
        int id1 = id;
    }

    public void addToGroup(User user){
        user.setGroupOfUsers(this);
        listOfUsers.add(user);
    }

    public List<User> getListOfUsers() {
        return listOfUsers;
    }




}
