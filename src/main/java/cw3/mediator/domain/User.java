package cw3.mediator.domain;

import cw3.mediator.ChatRoom;

public class User {
    private String name;
    private GroupOfUsers groupOfUsers;


    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupOfUsers getGroupOfUsers() {
        return groupOfUsers;
    }

    public void setGroupOfUsers(GroupOfUsers groupOfUsers) {
        this.groupOfUsers = groupOfUsers;
    }

    public void sendMessageToUser(String message){
        ChatRoom.showMessageUser(this,message);
    }

    public void sendMessageToGroup(String message){
        ChatRoom.showMessageGroup(this, groupOfUsers, message);
    }

}
