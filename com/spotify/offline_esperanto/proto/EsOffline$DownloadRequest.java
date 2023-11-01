package com.spotify.offline_esperanto.proto.EsOffline$DownloadRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.kq1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;

public final class EsOffline$DownloadRequest extends c implements u74	// class@000aba from classes.dex
{
    private int bitField0_;
    private EsOffline$DeviceKey device_;
    private String uri_;
    private static final EsOffline$DownloadRequest DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int URI_FIELD_NUMBER;

    static {
       EsOffline$DownloadRequest uDownloadReq = new EsOffline$DownloadRequest();
       EsOffline$DownloadRequest.DEFAULT_INSTANCE = uDownloadReq;
       c.registerDefaultInstance(EsOffline$DownloadRequest.class, uDownloadReq);
    }
    private void EsOffline$DownloadRequest(){
       super();
       this.uri_ = "";
    }
    public static void e(EsOffline$DownloadRequest p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.uri_ = p1;
    }
    public static EsOffline$DownloadRequest f(){
       return EsOffline$DownloadRequest.DEFAULT_INSTANCE;
    }
    public static kq1 g(){
       return EsOffline$DownloadRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsOffline$DownloadRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","device_","uri_"};
             return c.newMessageInfo(EsOffline$DownloadRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x02\x02", objArray);
           case 3:
             return new EsOffline$DownloadRequest();
           case 4:
             return new kq1();
           case 5:
             return EsOffline$DownloadRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsOffline$DownloadRequest.PARSER) == null) {
                _monitor_enter(EsOffline$DownloadRequest.class);
                if ((pARSER = EsOffline$DownloadRequest.PARSER) == null) {
                   pARSER = new ii2(EsOffline$DownloadRequest.DEFAULT_INSTANCE);
                   EsOffline$DownloadRequest.PARSER = pARSER;
                }
                _monitor_exit(EsOffline$DownloadRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
