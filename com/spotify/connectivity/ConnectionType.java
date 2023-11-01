package com.spotify.connectivity.ConnectionType;
import java.lang.Enum;
import java.lang.String;
import com.spotify.connectivity.ConnectionType$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.ArrayList;
import java.lang.Integer;
import p.t65;
import java.lang.Object;
import java.util.Map;
import p.q14;
import java.lang.Class;

public final class ConnectionType extends Enum	// class@0005ad from classes.dex
{
    private final int value;
    private static final ConnectionType[] $VALUES;
    private static final Map BY_VALUE;
    public static final ConnectionType$Companion Companion;
    public static final ConnectionType ETHERNET;
    public static final ConnectionType MOBILE_3G;
    public static final ConnectionType MOBILE_4G;
    public static final ConnectionType MOBILE_EDGE;
    public static final ConnectionType MOBILE_GPRS;
    public static final ConnectionType NONE;
    public static final ConnectionType UNKNOWN;
    public static final ConnectionType WLAN;

    private static final ConnectionType[] $values(){
       ConnectionType[] uConnectionT = new ConnectionType[]{ConnectionType.UNKNOWN,ConnectionType.NONE,ConnectionType.MOBILE_GPRS,ConnectionType.MOBILE_EDGE,ConnectionType.MOBILE_3G,ConnectionType.MOBILE_4G,ConnectionType.WLAN,ConnectionType.ETHERNET};
       return uConnectionT;
    }
    static {
       int i = 0;
       ConnectionType.UNKNOWN = new ConnectionType("UNKNOWN", i, -1);
       ConnectionType.NONE = new ConnectionType("NONE", 1, i);
       ConnectionType.MOBILE_GPRS = new ConnectionType("MOBILE_GPRS", 2, 1);
       ConnectionType.MOBILE_EDGE = new ConnectionType("MOBILE_EDGE", 3, 2);
       ConnectionType.MOBILE_3G = new ConnectionType("MOBILE_3G", 4, 3);
       ConnectionType.MOBILE_4G = new ConnectionType("MOBILE_4G", 5, 4);
       int i1 = 6;
       ConnectionType.WLAN = new ConnectionType("WLAN", i1, 5);
       ConnectionType.ETHERNET = new ConnectionType("ETHERNET", 7, i1);
       ConnectionType.$VALUES = ConnectionType.$values();
       ConnectionType.Companion = new ConnectionType$Companion(null);
       ConnectionType[] uConnectionT = ConnectionType.values();
       ArrayList uArrayList = new ArrayList(uConnectionT.length);
       int len = uConnectionT.length;
       for (; i < len; i = i + 1) {
          object oobject = uConnectionT[i];
          uArrayList.add(new t65(Integer.valueOf(oobject.value), oobject));
       }
       ConnectionType.BY_VALUE = q14.q0(uArrayList);
    }
    private void ConnectionType(String p0,int p1,int p2){
       this.value = p2;
    }
    public static final Map access$getBY_VALUE$cp(){
       return ConnectionType.BY_VALUE;
    }
    public static final ConnectionType connectionTypeOfValue(int p0){
       return ConnectionType.Companion.connectionTypeOfValue(p0);
    }
    public static ConnectionType valueOf(String p0){
       return Enum.valueOf(ConnectionType.class, p0);
    }
    public static ConnectionType[] values(){
       return ConnectionType.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
}
