package com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse$Device$Hifi;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.connect.esperanto.proto.c;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class ConnectMessages$StateResponse$Device$Hifi extends c implements u74	// class@00059f from classes.dex
{
    private boolean deviceSupported_;
    private boolean fullySupported_;
    private boolean userEligible_;
    private static final ConnectMessages$StateResponse$Device$Hifi DEFAULT_INSTANCE;
    public static final int DEVICE_SUPPORTED_FIELD_NUMBER;
    public static final int FULLY_SUPPORTED_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int USER_ELIGIBLE_FIELD_NUMBER;

    static {
       ConnectMessages$StateResponse$Device$Hifi stateRespons = new ConnectMessages$StateResponse$Device$Hifi();
       ConnectMessages$StateResponse$Device$Hifi.DEFAULT_INSTANCE = stateRespons;
       c.registerDefaultInstance(ConnectMessages$StateResponse$Device$Hifi.class, stateRespons);
    }
    private void ConnectMessages$StateResponse$Device$Hifi(){
       super();
    }
    public static ConnectMessages$StateResponse$Device$Hifi e(){
       return ConnectMessages$StateResponse$Device$Hifi.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return ConnectMessages$StateResponse$Device$Hifi.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"fullySupported_","userEligible_","deviceSupported_"};
             return c.newMessageInfo(ConnectMessages$StateResponse$Device$Hifi.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x07\x03\x07", objArray);
           case 3:
             return new ConnectMessages$StateResponse$Device$Hifi();
           case 4:
             return new c();
           case 5:
             return ConnectMessages$StateResponse$Device$Hifi.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ConnectMessages$StateResponse$Device$Hifi.PARSER) == null) {
                _monitor_enter(ConnectMessages$StateResponse$Device$Hifi.class);
                if ((pARSER = ConnectMessages$StateResponse$Device$Hifi.PARSER) == null) {
                   pARSER = new ii2(ConnectMessages$StateResponse$Device$Hifi.DEFAULT_INSTANCE);
                   ConnectMessages$StateResponse$Device$Hifi.PARSER = pARSER;
                }
                _monitor_exit(ConnectMessages$StateResponse$Device$Hifi.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
