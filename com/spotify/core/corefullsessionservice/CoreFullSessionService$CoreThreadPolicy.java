package com.spotify.core.corefullsessionservice.CoreFullSessionService$CoreThreadPolicy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class CoreFullSessionService$CoreThreadPolicy extends Enum	// class@000841 from classes.dex
{
    private static final CoreFullSessionService$CoreThreadPolicy[] $VALUES;
    public static final CoreFullSessionService$CoreThreadPolicy DO_NOT_RUN_ON_CORE_THREAD;
    public static final CoreFullSessionService$CoreThreadPolicy RUN_ON_CORE_THREAD;

    private static final CoreFullSessionService$CoreThreadPolicy[] $values(){
       CoreFullSessionService$CoreThreadPolicy[] uCoreThreadP = new CoreFullSessionService$CoreThreadPolicy[]{CoreFullSessionService$CoreThreadPolicy.RUN_ON_CORE_THREAD,CoreFullSessionService$CoreThreadPolicy.DO_NOT_RUN_ON_CORE_THREAD};
       return uCoreThreadP;
    }
    static {
       CoreFullSessionService$CoreThreadPolicy.RUN_ON_CORE_THREAD = new CoreFullSessionService$CoreThreadPolicy("RUN_ON_CORE_THREAD", 0);
       CoreFullSessionService$CoreThreadPolicy.DO_NOT_RUN_ON_CORE_THREAD = new CoreFullSessionService$CoreThreadPolicy("DO_NOT_RUN_ON_CORE_THREAD", 1);
       CoreFullSessionService$CoreThreadPolicy.$VALUES = CoreFullSessionService$CoreThreadPolicy.$values();
    }
    private void CoreFullSessionService$CoreThreadPolicy(String p0,int p1){
       super(p0, p1);
    }
    public static CoreFullSessionService$CoreThreadPolicy valueOf(String p0){
       return Enum.valueOf(CoreFullSessionService$CoreThreadPolicy.class, p0);
    }
    public static CoreFullSessionService$CoreThreadPolicy[] values(){
       return CoreFullSessionService$CoreThreadPolicy.$VALUES.clone();
    }
}
