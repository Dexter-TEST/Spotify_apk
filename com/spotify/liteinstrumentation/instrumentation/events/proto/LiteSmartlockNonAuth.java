package com.spotify.liteinstrumentation.instrumentation.events.proto.LiteSmartlockNonAuth;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.yp3;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class LiteSmartlockNonAuth extends c implements u74	// class@000933 from classes.dex
{
    private String action_;
    private int bitField0_;
    private String state_;
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final LiteSmartlockNonAuth DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int STATE_FIELD_NUMBER;

    static {
       LiteSmartlockNonAuth liteSmartloc = new LiteSmartlockNonAuth();
       LiteSmartlockNonAuth.DEFAULT_INSTANCE = liteSmartloc;
       c.registerDefaultInstance(LiteSmartlockNonAuth.class, liteSmartloc);
    }
    private void LiteSmartlockNonAuth(){
       super();
       this.action_ = "";
       this.state_ = "";
    }
    public static LiteSmartlockNonAuth e(){
       return LiteSmartlockNonAuth.DEFAULT_INSTANCE;
    }
    public static void f(LiteSmartlockNonAuth p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.action_ = p1;
    }
    public static void g(LiteSmartlockNonAuth p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.state_ = p1;
    }
    public static yp3 h(){
       return LiteSmartlockNonAuth.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return LiteSmartlockNonAuth.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","action_","state_"};
             return c.newMessageInfo(LiteSmartlockNonAuth.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01", objArray);
           case 3:
             return new LiteSmartlockNonAuth();
           case 4:
             return new yp3();
           case 5:
             return LiteSmartlockNonAuth.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LiteSmartlockNonAuth.PARSER) == null) {
                _monitor_enter(LiteSmartlockNonAuth.class);
                if ((pARSER = LiteSmartlockNonAuth.PARSER) == null) {
                   pARSER = new ii2(LiteSmartlockNonAuth.DEFAULT_INSTANCE);
                   LiteSmartlockNonAuth.PARSER = pARSER;
                }
                _monitor_exit(LiteSmartlockNonAuth.class);
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
