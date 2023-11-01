package com.spotify.offline_esperanto.proto.EsOffline$Error;
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
import p.lq1;

public final class EsOffline$Error extends c implements u74	// class@000abc from classes.dex
{
    private int code_;
    public static final int CODE_FIELD_NUMBER = 1;
    private static final EsOffline$Error DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       EsOffline$Error uError = new EsOffline$Error();
       EsOffline$Error.DEFAULT_INSTANCE = uError;
       c.registerDefaultInstance(EsOffline$Error.class, uError);
    }
    private void EsOffline$Error(){
       super();
    }
    public static EsOffline$Error e(){
       return EsOffline$Error.DEFAULT_INSTANCE;
    }
    public static EsOffline$Error g(byte[] p0){
       return c.parseFrom(EsOffline$Error.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return EsOffline$Error.DEFAULT_INSTANCE.getParserForType();
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
             objArray[0] = "code_";
             return c.newMessageInfo(EsOffline$Error.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f", objArray);
           case 3:
             return new EsOffline$Error();
           case 4:
             return new sq1(20);
           case 5:
             return EsOffline$Error.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsOffline$Error.PARSER) == null) {
                _monitor_enter(EsOffline$Error.class);
                if ((pARSER = EsOffline$Error.PARSER) == null) {
                   pARSER = new ii2(EsOffline$Error.DEFAULT_INSTANCE);
                   EsOffline$Error.PARSER = pARSER;
                }
                _monitor_exit(EsOffline$Error.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final lq1 f(){
       lq1 olq1;
       if ((olq1 = lq1.a(this.code_)) == null) {
          olq1 = lq1.A;
       }
       return olq1;
    }
}
