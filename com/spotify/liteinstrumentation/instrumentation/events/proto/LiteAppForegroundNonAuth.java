package com.spotify.liteinstrumentation.instrumentation.events.proto.LiteAppForegroundNonAuth;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.om3;
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

public final class LiteAppForegroundNonAuth extends c implements u74	// class@00092d from classes.dex
{
    private int bitField0_;
    private boolean foreground_;
    private boolean instantApp_;
    private static final LiteAppForegroundNonAuth DEFAULT_INSTANCE;
    public static final int FOREGROUND_FIELD_NUMBER;
    public static final int INSTANT_APP_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       LiteAppForegroundNonAuth liteAppForeg = new LiteAppForegroundNonAuth();
       LiteAppForegroundNonAuth.DEFAULT_INSTANCE = liteAppForeg;
       c.registerDefaultInstance(LiteAppForegroundNonAuth.class, liteAppForeg);
    }
    private void LiteAppForegroundNonAuth(){
       super();
    }
    public static LiteAppForegroundNonAuth e(){
       return LiteAppForegroundNonAuth.DEFAULT_INSTANCE;
    }
    public static void f(LiteAppForegroundNonAuth p0,boolean p1){
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.foreground_ = p1;
    }
    public static void g(LiteAppForegroundNonAuth p0){
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.instantApp_ = false;
    }
    public static om3 h(){
       return LiteAppForegroundNonAuth.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return LiteAppForegroundNonAuth.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","foreground_","instantApp_"};
             return c.newMessageInfo(LiteAppForegroundNonAuth.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01", objArray);
           case 3:
             return new LiteAppForegroundNonAuth();
           case 4:
             return new om3();
           case 5:
             return LiteAppForegroundNonAuth.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LiteAppForegroundNonAuth.PARSER) == null) {
                _monitor_enter(LiteAppForegroundNonAuth.class);
                if ((pARSER = LiteAppForegroundNonAuth.PARSER) == null) {
                   pARSER = new ii2(LiteAppForegroundNonAuth.DEFAULT_INSTANCE);
                   LiteAppForegroundNonAuth.PARSER = pARSER;
                }
                _monitor_exit(LiteAppForegroundNonAuth.class);
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
