package com.spotify.connectivity.connectivitysessionservice.ConnectivitySessionService$WhenMappings;
import com.spotify.connectivity.connectivitysessionservice.ConnectivitySessionService$CoreThreadPolicy;
import java.lang.Enum;

public final class ConnectivitySessionService$WhenMappings	// class@0006ed from classes.dex
{
    public static final int[] $EnumSwitchMapping$0;

    static {
       int len = ConnectivitySessionService$CoreThreadPolicy.values().length;
       try{
          int[] ointArray = new int[len];
          ointArray[ConnectivitySessionService$CoreThreadPolicy.RUN_ON_CORE_THREAD.ordinal()] = 1;
          try{
             e0[ConnectivitySessionService$CoreThreadPolicy.DO_NOT_RUN_ON_CORE_THREAD.ordinal()] = 2;
             ConnectivitySessionService$WhenMappings.$EnumSwitchMapping$0 = e0;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
