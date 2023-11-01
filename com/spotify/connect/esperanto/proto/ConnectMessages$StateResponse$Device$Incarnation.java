package com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse$Device$Incarnation;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.connect.esperanto.proto.d;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class ConnectMessages$StateResponse$Device$Incarnation extends c implements u74	// class@0005a0 from classes.dex
{
    private String identifier_;
    private int loginType_;
    private boolean preferred_;
    private static final ConnectMessages$StateResponse$Device$Incarnation DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER;
    public static final int LOGIN_TYPE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PREFERRED_FIELD_NUMBER;

    static {
       ConnectMessages$StateResponse$Device$Incarnation stateRespons = new ConnectMessages$StateResponse$Device$Incarnation();
       ConnectMessages$StateResponse$Device$Incarnation.DEFAULT_INSTANCE = stateRespons;
       c.registerDefaultInstance(ConnectMessages$StateResponse$Device$Incarnation.class, stateRespons);
    }
    private void ConnectMessages$StateResponse$Device$Incarnation(){
       super();
       this.identifier_ = "";
    }
    public static ConnectMessages$StateResponse$Device$Incarnation e(){
       return ConnectMessages$StateResponse$Device$Incarnation.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return ConnectMessages$StateResponse$Device$Incarnation.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"loginType_","identifier_","preferred_"};
             return c.newMessageInfo(ConnectMessages$StateResponse$Device$Incarnation.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\x02\x02\x03\x07", objArray);
           case 3:
             return new ConnectMessages$StateResponse$Device$Incarnation();
           case 4:
             return new d();
           case 5:
             return ConnectMessages$StateResponse$Device$Incarnation.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ConnectMessages$StateResponse$Device$Incarnation.PARSER) == null) {
                _monitor_enter(ConnectMessages$StateResponse$Device$Incarnation.class);
                if ((pARSER = ConnectMessages$StateResponse$Device$Incarnation.PARSER) == null) {
                   pARSER = new ii2(ConnectMessages$StateResponse$Device$Incarnation.DEFAULT_INSTANCE);
                   ConnectMessages$StateResponse$Device$Incarnation.PARSER = pARSER;
                }
                _monitor_exit(ConnectMessages$StateResponse$Device$Incarnation.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
