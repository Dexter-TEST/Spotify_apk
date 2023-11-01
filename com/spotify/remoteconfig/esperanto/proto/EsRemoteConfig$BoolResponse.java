package com.spotify.remoteconfig.esperanto.proto.EsRemoteConfig$BoolResponse;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.dr1;
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

public final class EsRemoteConfig$BoolResponse extends c implements u74	// class@000bf4 from classes.dex
{
    private int bitField0_;
    private boolean value_;
    private static final EsRemoteConfig$BoolResponse DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       EsRemoteConfig$BoolResponse uBoolRespons = new EsRemoteConfig$BoolResponse();
       EsRemoteConfig$BoolResponse.DEFAULT_INSTANCE = uBoolRespons;
       c.registerDefaultInstance(EsRemoteConfig$BoolResponse.class, uBoolRespons);
    }
    private void EsRemoteConfig$BoolResponse(){
       super();
    }
    public static void e(EsRemoteConfig$BoolResponse p0,boolean p1){
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.value_ = p1;
    }
    public static EsRemoteConfig$BoolResponse f(){
       return EsRemoteConfig$BoolResponse.DEFAULT_INSTANCE;
    }
    public static dr1 g(){
       return EsRemoteConfig$BoolResponse.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsRemoteConfig$BoolResponse.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(EsRemoteConfig$BoolResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new EsRemoteConfig$BoolResponse();
           case 4:
             return new dr1();
           case 5:
             return EsRemoteConfig$BoolResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsRemoteConfig$BoolResponse.PARSER) == null) {
                _monitor_enter(EsRemoteConfig$BoolResponse.class);
                if ((pARSER = EsRemoteConfig$BoolResponse.PARSER) == null) {
                   pARSER = new ii2(EsRemoteConfig$BoolResponse.DEFAULT_INSTANCE);
                   EsRemoteConfig$BoolResponse.PARSER = pARSER;
                }
                _monitor_exit(EsRemoteConfig$BoolResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
