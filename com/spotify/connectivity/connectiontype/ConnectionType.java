package com.spotify.connectivity.connectiontype.ConnectionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ConnectionType extends Enum	// class@000692 from classes.dex
{
    private final boolean mCellular;
    private final boolean mIsOffline;
    private final boolean mIsp;
    private final String mName;
    private final int mNativeConstant;
    private static final ConnectionType[] $VALUES;
    public static final ConnectionType CONNECTION_TYPE_3G;
    public static final ConnectionType CONNECTION_TYPE_4G;
    public static final ConnectionType CONNECTION_TYPE_COMPANION_PROXY;
    public static final ConnectionType CONNECTION_TYPE_EDGE;
    public static final ConnectionType CONNECTION_TYPE_ETHERNET;
    public static final ConnectionType CONNECTION_TYPE_GPRS;
    public static final ConnectionType CONNECTION_TYPE_NONE;
    public static final ConnectionType CONNECTION_TYPE_UNKNOWN;
    public static final ConnectionType CONNECTION_TYPE_WLAN;

    static {
       ConnectionType v8 = new ConnectionType("CONNECTION_TYPE_UNKNOWN", 0, -1, false, false, true, "unknown");
       ConnectionType.CONNECTION_TYPE_UNKNOWN = v8;
       v8 = new ConnectionType("CONNECTION_TYPE_NONE", 1, 0, false, false, true, "none");
       ConnectionType.CONNECTION_TYPE_NONE = v8;
       ConnectionType v1 = new ConnectionType("CONNECTION_TYPE_GPRS", 2, 1, true, false, false, "gprs");
       ConnectionType.CONNECTION_TYPE_GPRS = v1;
       ConnectionType v2 = new ConnectionType("CONNECTION_TYPE_EDGE", 3, 2, true, false, false, "edge");
       ConnectionType.CONNECTION_TYPE_EDGE = v2;
       v1 = new ConnectionType("CONNECTION_TYPE_3G", 4, 3, true, false, false, "3g");
       ConnectionType.CONNECTION_TYPE_3G = v3;
       v2 = new ConnectionType("CONNECTION_TYPE_4G", 5, 4, true, false, false, "4g");
       ConnectionType.CONNECTION_TYPE_4G = v4;
       v1 = new ConnectionType("CONNECTION_TYPE_WLAN", 6, 5, false, true, false, "wlan");
       ConnectionType.CONNECTION_TYPE_WLAN = v5;
       v2 = new ConnectionType("CONNECTION_TYPE_ETHERNET", 7, 6, false, true, false, "ethernet");
       ConnectionType.CONNECTION_TYPE_ETHERNET = v6;
       v1 = new ConnectionType("CONNECTION_TYPE_COMPANION_PROXY", 8, 7, true, false, false, "companion_proxy");
       ConnectionType.CONNECTION_TYPE_COMPANION_PROXY = v7;
       ConnectionType[] uConnectionT = new ConnectionType[9];
       uConnectionT[0] = v8;
       uConnectionT[1] = v8;
       uConnectionT[2] = v1;
       uConnectionT[3] = v2;
       uConnectionT[4] = v3;
       uConnectionT[5] = v4;
       uConnectionT[6] = v5;
       uConnectionT[7] = v6;
       uConnectionT[8] = v7;
       ConnectionType.$VALUES = uConnectionT;
    }
    private void ConnectionType(String p0,int p1,int p2,boolean p3,boolean p4,boolean p5,String p6){
       super(p0, p1);
       this.mNativeConstant = p2;
       this.mCellular = p3;
       this.mIsp = p4;
       this.mIsOffline = p5;
       this.mName = p6;
    }
    public static ConnectionType valueOf(String p0){
       return Enum.valueOf(ConnectionType.class, p0);
    }
    public static ConnectionType[] values(){
       return ConnectionType.$VALUES.clone();
    }
    public int getNativeConstant(){
       return this.mNativeConstant;
    }
    public boolean isCellularNetwork(){
       return this.mCellular;
    }
    public boolean isIspNetwork(){
       return this.mIsp;
    }
    public boolean isOffline(){
       return this.mIsOffline;
    }
    public String toString(){
       return this.mName;
    }
}
