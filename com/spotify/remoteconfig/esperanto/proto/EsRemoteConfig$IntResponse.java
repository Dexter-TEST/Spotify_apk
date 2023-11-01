package com.spotify.remoteconfig.esperanto.proto.EsRemoteConfig$IntResponse;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.fr1;
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

public final class EsRemoteConfig$IntResponse extends c implements u74	// class@000bf6 from classes.dex
{
    private int bitField0_;
    private int value_;
    private static final EsRemoteConfig$IntResponse DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       EsRemoteConfig$IntResponse intResponse = new EsRemoteConfig$IntResponse();
       EsRemoteConfig$IntResponse.DEFAULT_INSTANCE = intResponse;
       c.registerDefaultInstance(EsRemoteConfig$IntResponse.class, intResponse);
    }
    private void EsRemoteConfig$IntResponse(){
       super();
    }
    public static void e(EsRemoteConfig$IntResponse p0,int p1){
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.value_ = p1;
    }
    public static EsRemoteConfig$IntResponse f(){
       return EsRemoteConfig$IntResponse.DEFAULT_INSTANCE;
    }
    public static fr1 g(){
       return EsRemoteConfig$IntResponse.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsRemoteConfig$IntResponse.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(EsRemoteConfig$IntResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new EsRemoteConfig$IntResponse();
           case 4:
             return new fr1();
           case 5:
             return EsRemoteConfig$IntResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsRemoteConfig$IntResponse.PARSER) == null) {
                _monitor_enter(EsRemoteConfig$IntResponse.class);
                if ((pARSER = EsRemoteConfig$IntResponse.PARSER) == null) {
                   pARSER = new ii2(EsRemoteConfig$IntResponse.DEFAULT_INSTANCE);
                   EsRemoteConfig$IntResponse.PARSER = pARSER;
                }
                _monitor_exit(EsRemoteConfig$IntResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
