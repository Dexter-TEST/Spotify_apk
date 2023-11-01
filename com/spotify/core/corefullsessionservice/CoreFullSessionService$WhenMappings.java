package com.spotify.core.corefullsessionservice.CoreFullSessionService$WhenMappings;
import com.spotify.core.corefullsessionservice.CoreFullSessionService$CoreThreadPolicy;
import java.lang.Enum;

public final class CoreFullSessionService$WhenMappings	// class@000842 from classes.dex
{
    public static final int[] $EnumSwitchMapping$0;

    static {
       int len = CoreFullSessionService$CoreThreadPolicy.values().length;
       try{
          int[] ointArray = new int[len];
          ointArray[CoreFullSessionService$CoreThreadPolicy.RUN_ON_CORE_THREAD.ordinal()] = 1;
          try{
             e0[CoreFullSessionService$CoreThreadPolicy.DO_NOT_RUN_ON_CORE_THREAD.ordinal()] = 2;
             CoreFullSessionService$WhenMappings.$EnumSwitchMapping$0 = e0;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
