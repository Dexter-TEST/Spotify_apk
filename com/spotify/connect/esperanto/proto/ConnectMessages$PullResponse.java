package com.spotify.connect.esperanto.proto.ConnectMessages$PullResponse;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.h40;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class ConnectMessages$PullResponse extends c implements u74	// class@00059d from classes.dex
{
    private int status_;
    private static final ConnectMessages$PullResponse DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int STATUS_FIELD_NUMBER;

    static {
       ConnectMessages$PullResponse pullResponse = new ConnectMessages$PullResponse();
       ConnectMessages$PullResponse.DEFAULT_INSTANCE = pullResponse;
       c.registerDefaultInstance(ConnectMessages$PullResponse.class, pullResponse);
    }
    private void ConnectMessages$PullResponse(){
       super();
    }
    public static ConnectMessages$PullResponse e(){
       return ConnectMessages$PullResponse.DEFAULT_INSTANCE;
    }
    public static ConnectMessages$PullResponse f(byte[] p0){
       return c.parseFrom(ConnectMessages$PullResponse.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return ConnectMessages$PullResponse.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       p2 = null;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return p2;
           case 2:
             Object[] objArray = new Object[b];
             objArray[0] = "status_";
             return c.newMessageInfo(ConnectMessages$PullResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f", objArray);
           case 3:
             return new ConnectMessages$PullResponse();
           case 4:
             return new h40(p2);
           case 5:
             return ConnectMessages$PullResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ConnectMessages$PullResponse.PARSER) == null) {
                _monitor_enter(ConnectMessages$PullResponse.class);
                if ((pARSER = ConnectMessages$PullResponse.PARSER) == null) {
                   pARSER = new ii2(ConnectMessages$PullResponse.DEFAULT_INSTANCE);
                   ConnectMessages$PullResponse.PARSER = pARSER;
                }
                _monitor_exit(ConnectMessages$PullResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
