package com.spotify.connectivity.connectivitysessionservice.ConnectivitySessionService$CoreThreadPolicy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ConnectivitySessionService$CoreThreadPolicy extends Enum	// class@0006eb from classes.dex
{
    private static final ConnectivitySessionService$CoreThreadPolicy[] $VALUES;
    public static final ConnectivitySessionService$CoreThreadPolicy DO_NOT_RUN_ON_CORE_THREAD;
    public static final ConnectivitySessionService$CoreThreadPolicy RUN_ON_CORE_THREAD;

    private static final ConnectivitySessionService$CoreThreadPolicy[] $values(){
       ConnectivitySessionService$CoreThreadPolicy[] uCoreThreadP = new ConnectivitySessionService$CoreThreadPolicy[]{ConnectivitySessionService$CoreThreadPolicy.RUN_ON_CORE_THREAD,ConnectivitySessionService$CoreThreadPolicy.DO_NOT_RUN_ON_CORE_THREAD};
       return uCoreThreadP;
    }
    static {
       ConnectivitySessionService$CoreThreadPolicy.RUN_ON_CORE_THREAD = new ConnectivitySessionService$CoreThreadPolicy("RUN_ON_CORE_THREAD", 0);
       ConnectivitySessionService$CoreThreadPolicy.DO_NOT_RUN_ON_CORE_THREAD = new ConnectivitySessionService$CoreThreadPolicy("DO_NOT_RUN_ON_CORE_THREAD", 1);
       ConnectivitySessionService$CoreThreadPolicy.$VALUES = ConnectivitySessionService$CoreThreadPolicy.$values();
    }
    private void ConnectivitySessionService$CoreThreadPolicy(String p0,int p1){
       super(p0, p1);
    }
    public static ConnectivitySessionService$CoreThreadPolicy valueOf(String p0){
       return Enum.valueOf(ConnectivitySessionService$CoreThreadPolicy.class, p0);
    }
    public static ConnectivitySessionService$CoreThreadPolicy[] values(){
       return ConnectivitySessionService$CoreThreadPolicy.$VALUES.clone();
    }
}
