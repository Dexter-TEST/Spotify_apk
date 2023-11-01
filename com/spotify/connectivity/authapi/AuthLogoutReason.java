package com.spotify.connectivity.authapi.AuthLogoutReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AuthLogoutReason extends Enum	// class@000663 from classes.dex
{
    private static final AuthLogoutReason[] $VALUES;
    public static final AuthLogoutReason APP_SHUTDOWN;
    public static final AuthLogoutReason ATTEMPTING_AUTOLOGIN;
    public static final AuthLogoutReason BOOTSTRAP_FAILURE;
    public static final AuthLogoutReason FORCED_LOGOUT;
    public static final AuthLogoutReason NOT_LOGGED_IN;
    public static final AuthLogoutReason REMOTE_LOGOUT;
    public static final AuthLogoutReason UNDEFINED;
    public static final AuthLogoutReason USER_INITIATED;

    private static final AuthLogoutReason[] $values(){
       AuthLogoutReason[] uAuthLogoutR = new AuthLogoutReason[]{AuthLogoutReason.UNDEFINED,AuthLogoutReason.ATTEMPTING_AUTOLOGIN,AuthLogoutReason.NOT_LOGGED_IN,AuthLogoutReason.USER_INITIATED,AuthLogoutReason.FORCED_LOGOUT,AuthLogoutReason.REMOTE_LOGOUT,AuthLogoutReason.BOOTSTRAP_FAILURE,AuthLogoutReason.APP_SHUTDOWN};
       return uAuthLogoutR;
    }
    static {
       AuthLogoutReason.UNDEFINED = new AuthLogoutReason("UNDEFINED", 0);
       AuthLogoutReason.ATTEMPTING_AUTOLOGIN = new AuthLogoutReason("ATTEMPTING_AUTOLOGIN", 1);
       AuthLogoutReason.NOT_LOGGED_IN = new AuthLogoutReason("NOT_LOGGED_IN", 2);
       AuthLogoutReason.USER_INITIATED = new AuthLogoutReason("USER_INITIATED", 3);
       AuthLogoutReason.FORCED_LOGOUT = new AuthLogoutReason("FORCED_LOGOUT", 4);
       AuthLogoutReason.REMOTE_LOGOUT = new AuthLogoutReason("REMOTE_LOGOUT", 5);
       AuthLogoutReason.BOOTSTRAP_FAILURE = new AuthLogoutReason("BOOTSTRAP_FAILURE", 6);
       AuthLogoutReason.APP_SHUTDOWN = new AuthLogoutReason("APP_SHUTDOWN", 7);
       AuthLogoutReason.$VALUES = AuthLogoutReason.$values();
    }
    private void AuthLogoutReason(String p0,int p1){
       super(p0, p1);
    }
    public static AuthLogoutReason valueOf(String p0){
       return Enum.valueOf(AuthLogoutReason.class, p0);
    }
    public static AuthLogoutReason[] values(){
       return AuthLogoutReason.$VALUES.clone();
    }
}
