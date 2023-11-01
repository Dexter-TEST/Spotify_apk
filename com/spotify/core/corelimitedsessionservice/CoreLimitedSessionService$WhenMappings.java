package com.spotify.core.corelimitedsessionservice.CoreLimitedSessionService$WhenMappings;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionService$CoreThreadPolicy;
import java.lang.Enum;

public final class CoreLimitedSessionService$WhenMappings	// class@00084b from classes.dex
{
    public static final int[] $EnumSwitchMapping$0;

    static {
       int len = CoreLimitedSessionService$CoreThreadPolicy.values().length;
       try{
          int[] ointArray = new int[len];
          ointArray[CoreLimitedSessionService$CoreThreadPolicy.RUN_ON_CORE_THREAD.ordinal()] = 1;
          try{
             e0[CoreLimitedSessionService$CoreThreadPolicy.DO_NOT_RUN_ON_CORE_THREAD.ordinal()] = 2;
             CoreLimitedSessionService$WhenMappings.$EnumSwitchMapping$0 = e0;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
