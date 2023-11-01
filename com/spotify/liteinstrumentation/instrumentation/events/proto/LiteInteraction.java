package com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInteraction;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.wo3;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class LiteInteraction extends c implements u74	// class@000930 from classes.dex
{
    private String actionIntent_;
    private String actionType_;
    private int bitField0_;
    private String itemId_;
    private String pageId_;
    private String targetUri_;
    private String viewUri_;
    public static final int ACTION_INTENT_FIELD_NUMBER = 6;
    public static final int ACTION_TYPE_FIELD_NUMBER = 5;
    private static final LiteInteraction DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER;
    public static final int PAGE_ID_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int TARGET_URI_FIELD_NUMBER;
    public static final int VIEW_URI_FIELD_NUMBER;

    static {
       LiteInteraction liteInteract = new LiteInteraction();
       LiteInteraction.DEFAULT_INSTANCE = liteInteract;
       c.registerDefaultInstance(LiteInteraction.class, liteInteract);
    }
    private void LiteInteraction(){
       super();
       this.pageId_ = "";
       this.viewUri_ = "";
       this.targetUri_ = "";
       this.itemId_ = "";
       this.actionType_ = "";
       this.actionIntent_ = "";
    }
    public static LiteInteraction e(){
       return LiteInteraction.DEFAULT_INSTANCE;
    }
    public static void f(LiteInteraction p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.pageId_ = p1;
    }
    public static void g(LiteInteraction p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.itemId_ = p1;
    }
    public static void h(LiteInteraction p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x10;
       p0.actionType_ = p1;
    }
    public static void i(LiteInteraction p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x20;
       p0.actionIntent_ = p1;
    }
    public static void j(LiteInteraction p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.viewUri_ = p1;
    }
    public static void k(LiteInteraction p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.targetUri_ = p1;
    }
    public static wo3 l(){
       return LiteInteraction.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return LiteInteraction.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","pageId_","viewUri_","targetUri_","itemId_","actionType_","actionIntent_"};
             return c.newMessageInfo(LiteInteraction.DEFAULT_INSTANCE, "\x01\x06\xff\x02\xff\x02\x01\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03\x05\x10\x02\x04\x06\x10\x02\x05", objArray);
           case 3:
             return new LiteInteraction();
           case 4:
             return new wo3();
           case 5:
             return LiteInteraction.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LiteInteraction.PARSER) == null) {
                _monitor_enter(LiteInteraction.class);
                if ((pARSER = LiteInteraction.PARSER) == null) {
                   pARSER = new ii2(LiteInteraction.DEFAULT_INSTANCE);
                   LiteInteraction.PARSER = pARSER;
                }
                _monitor_exit(LiteInteraction.class);
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
