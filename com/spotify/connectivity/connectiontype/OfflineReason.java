package com.spotify.connectivity.connectiontype.OfflineReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class OfflineReason extends Enum	// class@0006a5 from classes.dex
{
    private static final OfflineReason[] $VALUES;
    public static final OfflineReason AP_CONNECTION_PROBLEM;
    public static final OfflineReason FORCED_OFFLINE;
    public static final OfflineReason NO_INTERNET;

    static {
       OfflineReason offlineReaso = new OfflineReason("AP_CONNECTION_PROBLEM", 0);
       OfflineReason.AP_CONNECTION_PROBLEM = offlineReaso;
       OfflineReason offlineReaso1 = new OfflineReason("FORCED_OFFLINE", 1);
       OfflineReason.FORCED_OFFLINE = offlineReaso1;
       OfflineReason offlineReaso2 = new OfflineReason("NO_INTERNET", 2);
       OfflineReason.NO_INTERNET = offlineReaso2;
       OfflineReason[] offlineReaso3 = new OfflineReason[]{offlineReaso,offlineReaso1,offlineReaso2};
       OfflineReason.$VALUES = offlineReaso3;
    }
    private void OfflineReason(String p0,int p1){
       super(p0, p1);
    }
    public static OfflineReason valueOf(String p0){
       return Enum.valueOf(OfflineReason.class, p0);
    }
    public static OfflineReason[] values(){
       return OfflineReason.$VALUES.clone();
    }
}
