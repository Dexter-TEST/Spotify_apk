package com.spotify.connectivity.ConnectivityPolicy;
import java.lang.Enum;
import java.lang.String;
import com.spotify.connectivity.ConnectivityPolicy$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.ArrayList;
import java.lang.Integer;
import p.t65;
import java.lang.Object;
import java.util.Map;
import p.q14;
import java.lang.Class;

public final class ConnectivityPolicy extends Enum	// class@0005b2 from classes.dex
{
    private final int value;
    private static final ConnectivityPolicy[] $VALUES;
    public static final ConnectivityPolicy ALLOW_ALL;
    public static final ConnectivityPolicy ALLOW_NON_PERSISTENT_CONNECTIONS;
    private static final Map BY_VALUE;
    public static final ConnectivityPolicy$Companion Companion;
    public static final ConnectivityPolicy DISALLOW_ALL;

    private static final ConnectivityPolicy[] $values(){
       ConnectivityPolicy[] uConnectivit = new ConnectivityPolicy[]{ConnectivityPolicy.DISALLOW_ALL,ConnectivityPolicy.ALLOW_ALL,ConnectivityPolicy.ALLOW_NON_PERSISTENT_CONNECTIONS};
       return uConnectivit;
    }
    static {
       int i = 0;
       ConnectivityPolicy.DISALLOW_ALL = new ConnectivityPolicy("DISALLOW_ALL", i, i);
       ConnectivityPolicy.ALLOW_ALL = new ConnectivityPolicy("ALLOW_ALL", 1, 1);
       ConnectivityPolicy.ALLOW_NON_PERSISTENT_CONNECTIONS = new ConnectivityPolicy("ALLOW_NON_PERSISTENT_CONNECTIONS", 2, 2);
       ConnectivityPolicy.$VALUES = ConnectivityPolicy.$values();
       ConnectivityPolicy.Companion = new ConnectivityPolicy$Companion(null);
       ConnectivityPolicy[] uConnectivit = ConnectivityPolicy.values();
       ArrayList uArrayList = new ArrayList(uConnectivit.length);
       int len = uConnectivit.length;
       for (; i < len; i = i + 1) {
          object oobject = uConnectivit[i];
          uArrayList.add(new t65(Integer.valueOf(oobject.value), oobject));
       }
       ConnectivityPolicy.BY_VALUE = q14.q0(uArrayList);
    }
    private void ConnectivityPolicy(String p0,int p1,int p2){
       this.value = p2;
    }
    public static final Map access$getBY_VALUE$cp(){
       return ConnectivityPolicy.BY_VALUE;
    }
    public static final ConnectivityPolicy connectivityPolicyOfValue(int p0){
       return ConnectivityPolicy.Companion.connectivityPolicyOfValue(p0);
    }
    public static ConnectivityPolicy valueOf(String p0){
       return Enum.valueOf(ConnectivityPolicy.class, p0);
    }
    public static ConnectivityPolicy[] values(){
       return ConnectivityPolicy.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
}
