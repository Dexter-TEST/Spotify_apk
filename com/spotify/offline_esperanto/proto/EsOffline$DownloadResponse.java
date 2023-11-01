package com.spotify.offline_esperanto.proto.EsOffline$DownloadResponse;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.sq1;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsOffline$DownloadResponse extends c implements u74	// class@000abb from classes.dex
{
    private long error_;
    private static final EsOffline$DownloadResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       EsOffline$DownloadResponse uDownloadRes = new EsOffline$DownloadResponse();
       EsOffline$DownloadResponse.DEFAULT_INSTANCE = uDownloadRes;
       c.registerDefaultInstance(EsOffline$DownloadResponse.class, uDownloadRes);
    }
    private void EsOffline$DownloadResponse(){
       super();
    }
    public static EsOffline$DownloadResponse e(){
       return EsOffline$DownloadResponse.DEFAULT_INSTANCE;
    }
    public static EsOffline$DownloadResponse f(byte[] p0){
       return c.parseFrom(EsOffline$DownloadResponse.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return EsOffline$DownloadResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[b];
             objArray[0] = "error_";
             return c.newMessageInfo(EsOffline$DownloadResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02", objArray);
           case 3:
             return new EsOffline$DownloadResponse();
           case 4:
             return new sq1(19);
           case 5:
             return EsOffline$DownloadResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsOffline$DownloadResponse.PARSER) == null) {
                _monitor_enter(EsOffline$DownloadResponse.class);
                if ((pARSER = EsOffline$DownloadResponse.PARSER) == null) {
                   pARSER = new ii2(EsOffline$DownloadResponse.DEFAULT_INSTANCE);
                   EsOffline$DownloadResponse.PARSER = pARSER;
                }
                _monitor_exit(EsOffline$DownloadResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
