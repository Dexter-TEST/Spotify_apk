package com.spotify.messaging.criticalmessaging.criticalmessagingsdk.mobius.states.UserState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class UserState extends Enum	// class@000a18 from classes.dex
{
    private static final UserState[] $VALUES;
    public static final UserState LOGGED_IN;
    public static final UserState LOGGING_OUT;

    private static final UserState[] $values(){
       UserState[] userStateArr = new UserState[]{UserState.LOGGING_OUT,UserState.LOGGED_IN};
       return userStateArr;
    }
    static {
       UserState.LOGGING_OUT = new UserState("LOGGING_OUT", 0);
       UserState.LOGGED_IN = new UserState("LOGGED_IN", 1);
       UserState.$VALUES = UserState.$values();
    }
    private void UserState(String p0,int p1){
       super(p0, p1);
    }
    public static UserState valueOf(String p0){
       return Enum.valueOf(UserState.class, p0);
    }
    public static UserState[] values(){
       return UserState.$VALUES.clone();
    }
}
