package com.spotify.liteinstrumentation.instrumentation.events.proto.LitePageViewNonAuth;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.kp3;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class LitePageViewNonAuth extends c implements u74	// class@000932 from classes.dex
{
    private int bitField0_;
    private String pageId_;
    private String type_;
    private String viewUri_;
    private static final LitePageViewNonAuth DEFAULT_INSTANCE;
    public static final int PAGE_ID_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int TYPE_FIELD_NUMBER;
    public static final int VIEW_URI_FIELD_NUMBER;

    static {
       LitePageViewNonAuth litePageView = new LitePageViewNonAuth();
       LitePageViewNonAuth.DEFAULT_INSTANCE = litePageView;
       c.registerDefaultInstance(LitePageViewNonAuth.class, litePageView);
    }
    private void LitePageViewNonAuth(){
       super();
       this.type_ = "";
       this.pageId_ = "";
       this.viewUri_ = "";
    }
    public static LitePageViewNonAuth e(){
       return LitePageViewNonAuth.DEFAULT_INSTANCE;
    }
    public static void f(LitePageViewNonAuth p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.type_ = p1;
    }
    public static void g(LitePageViewNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.pageId_ = p1;
    }
    public static void h(LitePageViewNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.viewUri_ = p1;
    }
    public static kp3 i(){
       return LitePageViewNonAuth.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return LitePageViewNonAuth.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","type_","pageId_","viewUri_"};
             return c.newMessageInfo(LitePageViewNonAuth.DEFAULT_INSTANCE, "\x01\x03\xff\x02\xff\x02\x01\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02", objArray);
           case 3:
             return new LitePageViewNonAuth();
           case 4:
             return new kp3();
           case 5:
             return LitePageViewNonAuth.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LitePageViewNonAuth.PARSER) == null) {
                _monitor_enter(LitePageViewNonAuth.class);
                if ((pARSER = LitePageViewNonAuth.PARSER) == null) {
                   pARSER = new ii2(LitePageViewNonAuth.DEFAULT_INSTANCE);
                   LitePageViewNonAuth.PARSER = pARSER;
                }
                _monitor_exit(LitePageViewNonAuth.class);
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
