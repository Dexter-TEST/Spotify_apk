package com.spotify.liteinstrumentation.instrumentation.events.proto.LitePageView;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.jp3;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class LitePageView extends c implements u74	// class@000931 from classes.dex
{
    private int bitField0_;
    private String pageId_;
    private String type_;
    private String viewUri_;
    private static final LitePageView DEFAULT_INSTANCE;
    public static final int PAGE_ID_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int TYPE_FIELD_NUMBER;
    public static final int VIEW_URI_FIELD_NUMBER;

    static {
       LitePageView litePageView = new LitePageView();
       LitePageView.DEFAULT_INSTANCE = litePageView;
       c.registerDefaultInstance(LitePageView.class, litePageView);
    }
    private void LitePageView(){
       super();
       this.type_ = "";
       this.pageId_ = "";
       this.viewUri_ = "";
    }
    public static LitePageView e(){
       return LitePageView.DEFAULT_INSTANCE;
    }
    public static void f(LitePageView p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.type_ = p1;
    }
    public static void g(LitePageView p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.pageId_ = p1;
    }
    public static void h(LitePageView p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.viewUri_ = p1;
    }
    public static jp3 i(){
       return LitePageView.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return LitePageView.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(LitePageView.DEFAULT_INSTANCE, "\x01\x03\xff\x02\xff\x02\x01\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02", objArray);
           case 3:
             return new LitePageView();
           case 4:
             return new jp3();
           case 5:
             return LitePageView.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LitePageView.PARSER) == null) {
                _monitor_enter(LitePageView.class);
                if ((pARSER = LitePageView.PARSER) == null) {
                   pARSER = new ii2(LitePageView.DEFAULT_INSTANCE);
                   LitePageView.PARSER = pARSER;
                }
                _monitor_exit(LitePageView.class);
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
