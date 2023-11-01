package com.spotify.remoteconfig.esperanto.proto.EsRemoteConfig$EnumResponse;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.er1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;

public final class EsRemoteConfig$EnumResponse extends c implements u74	// class@000bf5 from classes.dex
{
    private int bitField0_;
    private String value_;
    private static final EsRemoteConfig$EnumResponse DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       EsRemoteConfig$EnumResponse uEnumRespons = new EsRemoteConfig$EnumResponse();
       EsRemoteConfig$EnumResponse.DEFAULT_INSTANCE = uEnumRespons;
       c.registerDefaultInstance(EsRemoteConfig$EnumResponse.class, uEnumRespons);
    }
    private void EsRemoteConfig$EnumResponse(){
       super();
       this.value_ = "";
    }
    public static void e(EsRemoteConfig$EnumResponse p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.value_ = p1;
    }
    public static EsRemoteConfig$EnumResponse f(){
       return EsRemoteConfig$EnumResponse.DEFAULT_INSTANCE;
    }
    public static er1 g(){
       return EsRemoteConfig$EnumResponse.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsRemoteConfig$EnumResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","value_"};
             return c.newMessageInfo(EsRemoteConfig$EnumResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x12\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new EsRemoteConfig$EnumResponse();
           case 4:
             return new er1();
           case 5:
             return EsRemoteConfig$EnumResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsRemoteConfig$EnumResponse.PARSER) == null) {
                _monitor_enter(EsRemoteConfig$EnumResponse.class);
                if ((pARSER = EsRemoteConfig$EnumResponse.PARSER) == null) {
                   pARSER = new ii2(EsRemoteConfig$EnumResponse.DEFAULT_INSTANCE);
                   EsRemoteConfig$EnumResponse.PARSER = pARSER;
                }
                _monitor_exit(EsRemoteConfig$EnumResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
