package com.spotify.connect.esperanto.proto.ConnectMessages$StateRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.vo0;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class ConnectMessages$StateRequest extends c implements u74	// class@00059e from classes.dex
{
    private boolean excludeNonLocalDevices_;
    private boolean includeLocalDevice_;
    private boolean showOfflineAmazonDevicesAsOnline_;
    private boolean showOfflineDevicesInCore_;
    private static final ConnectMessages$StateRequest DEFAULT_INSTANCE;
    public static final int EXCLUDE_NON_LOCAL_DEVICES_FIELD_NUMBER;
    public static final int INCLUDE_LOCAL_DEVICE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SHOW_OFFLINE_AMAZON_DEVICES_AS_ONLINE_FIELD_NUMBER;
    public static final int SHOW_OFFLINE_DEVICES_IN_CORE_FIELD_NUMBER;

    static {
       ConnectMessages$StateRequest stateRequest = new ConnectMessages$StateRequest();
       ConnectMessages$StateRequest.DEFAULT_INSTANCE = stateRequest;
       c.registerDefaultInstance(ConnectMessages$StateRequest.class, stateRequest);
    }
    private void ConnectMessages$StateRequest(){
       super();
    }
    public static void e(ConnectMessages$StateRequest p0){
       p0.excludeNonLocalDevices_ = true;
    }
    public static void f(ConnectMessages$StateRequest p0){
       p0.includeLocalDevice_ = true;
    }
    public static ConnectMessages$StateRequest g(){
       return ConnectMessages$StateRequest.DEFAULT_INSTANCE;
    }
    public static vo0 h(){
       return ConnectMessages$StateRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return ConnectMessages$StateRequest.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[]{"showOfflineDevicesInCore_","showOfflineAmazonDevicesAsOnline_","includeLocalDevice_","excludeNonLocalDevices_"};
             return c.newMessageInfo(ConnectMessages$StateRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x07\x03\x07\x04\x07", objArray);
           case 3:
             return new ConnectMessages$StateRequest();
           case 4:
             return new vo0();
           case 5:
             return ConnectMessages$StateRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ConnectMessages$StateRequest.PARSER) == null) {
                _monitor_enter(ConnectMessages$StateRequest.class);
                if ((pARSER = ConnectMessages$StateRequest.PARSER) == null) {
                   pARSER = new ii2(ConnectMessages$StateRequest.DEFAULT_INSTANCE);
                   ConnectMessages$StateRequest.PARSER = pARSER;
                }
                _monitor_exit(ConnectMessages$StateRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
