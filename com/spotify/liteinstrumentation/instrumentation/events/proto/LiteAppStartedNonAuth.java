package com.spotify.liteinstrumentation.instrumentation.events.proto.LiteAppStartedNonAuth;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.pm3;
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
import p.r74;

public final class LiteAppStartedNonAuth extends c implements u74	// class@00092e from classes.dex
{
    private int bitField0_;
    private boolean instantApp_;
    private static final LiteAppStartedNonAuth DEFAULT_INSTANCE;
    public static final int INSTANT_APP_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       LiteAppStartedNonAuth liteAppStart = new LiteAppStartedNonAuth();
       LiteAppStartedNonAuth.DEFAULT_INSTANCE = liteAppStart;
       c.registerDefaultInstance(LiteAppStartedNonAuth.class, liteAppStart);
    }
    private void LiteAppStartedNonAuth(){
       super();
    }
    public static LiteAppStartedNonAuth e(){
       return LiteAppStartedNonAuth.DEFAULT_INSTANCE;
    }
    public static void f(LiteAppStartedNonAuth p0){
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.instantApp_ = false;
    }
    public static pm3 g(){
       return LiteAppStartedNonAuth.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return LiteAppStartedNonAuth.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","instantApp_"};
             return c.newMessageInfo(LiteAppStartedNonAuth.DEFAULT_INSTANCE, "\x01\x01\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new LiteAppStartedNonAuth();
           case 4:
             return new pm3();
           case 5:
             return LiteAppStartedNonAuth.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LiteAppStartedNonAuth.PARSER) == null) {
                _monitor_enter(LiteAppStartedNonAuth.class);
                if ((pARSER = LiteAppStartedNonAuth.PARSER) == null) {
                   pARSER = new ii2(LiteAppStartedNonAuth.DEFAULT_INSTANCE);
                   LiteAppStartedNonAuth.PARSER = pARSER;
                }
                _monitor_exit(LiteAppStartedNonAuth.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
