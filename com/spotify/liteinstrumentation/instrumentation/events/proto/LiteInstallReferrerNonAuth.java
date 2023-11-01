package com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInstallReferrerNonAuth;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.vo3;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class LiteInstallReferrerNonAuth extends c implements u74	// class@00092f from classes.dex
{
    private int bitField0_;
    private String installReferrer_;
    private boolean wasInstantApp_;
    private static final LiteInstallReferrerNonAuth DEFAULT_INSTANCE;
    public static final int INSTALL_REFERRER_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int WAS_INSTANT_APP_FIELD_NUMBER;

    static {
       LiteInstallReferrerNonAuth liteInstallR = new LiteInstallReferrerNonAuth();
       LiteInstallReferrerNonAuth.DEFAULT_INSTANCE = liteInstallR;
       c.registerDefaultInstance(LiteInstallReferrerNonAuth.class, liteInstallR);
    }
    private void LiteInstallReferrerNonAuth(){
       super();
       this.installReferrer_ = "";
    }
    public static LiteInstallReferrerNonAuth e(){
       return LiteInstallReferrerNonAuth.DEFAULT_INSTANCE;
    }
    public static void f(LiteInstallReferrerNonAuth p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.installReferrer_ = p1;
    }
    public static void g(LiteInstallReferrerNonAuth p0){
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.wasInstantApp_ = false;
    }
    public static vo3 h(){
       return LiteInstallReferrerNonAuth.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return LiteInstallReferrerNonAuth.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","installReferrer_","wasInstantApp_"};
             return c.newMessageInfo(LiteInstallReferrerNonAuth.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01", objArray);
           case 3:
             return new LiteInstallReferrerNonAuth();
           case 4:
             return new vo3();
           case 5:
             return LiteInstallReferrerNonAuth.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LiteInstallReferrerNonAuth.PARSER) == null) {
                _monitor_enter(LiteInstallReferrerNonAuth.class);
                if ((pARSER = LiteInstallReferrerNonAuth.PARSER) == null) {
                   pARSER = new ii2(LiteInstallReferrerNonAuth.DEFAULT_INSTANCE);
                   LiteInstallReferrerNonAuth.PARSER = pARSER;
                }
                _monitor_exit(LiteInstallReferrerNonAuth.class);
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
