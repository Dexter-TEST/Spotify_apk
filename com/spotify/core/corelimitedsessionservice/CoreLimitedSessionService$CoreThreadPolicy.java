package com.spotify.core.corelimitedsessionservice.CoreLimitedSessionService$CoreThreadPolicy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class CoreLimitedSessionService$CoreThreadPolicy extends Enum	// class@00084a from classes.dex
{
    private static final CoreLimitedSessionService$CoreThreadPolicy[] $VALUES;
    public static final CoreLimitedSessionService$CoreThreadPolicy DO_NOT_RUN_ON_CORE_THREAD;
    public static final CoreLimitedSessionService$CoreThreadPolicy RUN_ON_CORE_THREAD;

    private static final CoreLimitedSessionService$CoreThreadPolicy[] $values(){
       CoreLimitedSessionService$CoreThreadPolicy[] uCoreThreadP = new CoreLimitedSessionService$CoreThreadPolicy[]{CoreLimitedSessionService$CoreThreadPolicy.RUN_ON_CORE_THREAD,CoreLimitedSessionService$CoreThreadPolicy.DO_NOT_RUN_ON_CORE_THREAD};
       return uCoreThreadP;
    }
    static {
       CoreLimitedSessionService$CoreThreadPolicy.RUN_ON_CORE_THREAD = new CoreLimitedSessionService$CoreThreadPolicy("RUN_ON_CORE_THREAD", 0);
       CoreLimitedSessionService$CoreThreadPolicy.DO_NOT_RUN_ON_CORE_THREAD = new CoreLimitedSessionService$CoreThreadPolicy("DO_NOT_RUN_ON_CORE_THREAD", 1);
       CoreLimitedSessionService$CoreThreadPolicy.$VALUES = CoreLimitedSessionService$CoreThreadPolicy.$values();
    }
    private void CoreLimitedSessionService$CoreThreadPolicy(String p0,int p1){
       super(p0, p1);
    }
    public static CoreLimitedSessionService$CoreThreadPolicy valueOf(String p0){
       return Enum.valueOf(CoreLimitedSessionService$CoreThreadPolicy.class, p0);
    }
    public static CoreLimitedSessionService$CoreThreadPolicy[] values(){
       return CoreLimitedSessionService$CoreThreadPolicy.$VALUES.clone();
    }
}
