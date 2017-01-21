package cw3.mediator;

import cw3.mediator.domain.GroupOfUsers;
import cw3.mediator.domain.User;
import org.apache.log4j.Logger;

public class ChatRoom {
    private final static Logger LOGGER = Logger.getLogger(ChatRoom.class);

    public static void showMessageUser(User user, String message){
        LOGGER.info(" [" + user.getName() + "] : " + message);
    }

    public static void showMessageGroup(User user, GroupOfUsers groupOfUsers, String message){
        if(groupOfUsers.getListOfUsers().contains(user)){
            for(User userInGroup : groupOfUsers.getListOfUsers()){
                showMessageUser(userInGroup, message);
            }
        }
    }
}
