package com.spotify.share.loggingimpl.events.proto.Share;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.r75;
import p.de6;
import com.google.protobuf.b;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class Share extends c implements u74	// class@000c22 from classes.dex
{
    private boolean audioPreview_;
    private int bitField0_;
    private String capability_;
    private String creatorUri_;
    private String destinationId_;
    private String entityUri_;
    private String integration_;
    private String interactionId_;
    private String shareId_;
    private String shareUrl_;
    private String shareformatId_;
    private String sourcePageUri_;
    private String sourcePage_;
    private String systemDestination_;
    public static final int AUDIO_PREVIEW_FIELD_NUMBER = 11;
    public static final int CAPABILITY_FIELD_NUMBER = 8;
    public static final int CREATOR_URI_FIELD_NUMBER = 6;
    private static final Share DEFAULT_INSTANCE;
    public static final int DESTINATION_ID_FIELD_NUMBER;
    public static final int ENTITY_URI_FIELD_NUMBER;
    public static final int INTEGRATION_FIELD_NUMBER;
    public static final int INTERACTION_ID_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SHAREFORMAT_ID_FIELD_NUMBER;
    public static final int SHARE_ID_FIELD_NUMBER;
    public static final int SHARE_URL_FIELD_NUMBER;
    public static final int SOURCE_PAGE_FIELD_NUMBER;
    public static final int SOURCE_PAGE_URI_FIELD_NUMBER;
    public static final int SYSTEM_DESTINATION_FIELD_NUMBER;

    static {
       Share share = new Share();
       Share.DEFAULT_INSTANCE = share;
       c.registerDefaultInstance(Share.class, share);
    }
    private void Share(){
       super();
       this.entityUri_ = "";
       this.destinationId_ = "";
       this.shareId_ = "";
       this.sourcePageUri_ = "";
       this.sourcePage_ = "";
       this.creatorUri_ = "";
       this.systemDestination_ = "";
       this.capability_ = "";
       this.integration_ = "";
       this.shareUrl_ = "";
       this.interactionId_ = "";
       this.shareformatId_ = "";
    }
    public static Share e(){
       return Share.DEFAULT_INSTANCE;
    }
    public static void f(Share p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.entityUri_ = p1;
    }
    public static void g(Share p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.sourcePageUri_ = p1;
    }
    public static void h(Share p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x10;
       p0.sourcePage_ = p1;
    }
    public static void i(Share p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x20;
       p0.creatorUri_ = p1;
    }
    public static void j(Share p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x40;
       p0.systemDestination_ = p1;
    }
    public static void k(Share p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x0080;
       p0.capability_ = p1;
    }
    public static void l(Share p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x0100;
       p0.integration_ = p1;
    }
    public static void m(Share p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x0200;
       p0.shareUrl_ = p1;
    }
    public static void n(Share p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x0800;
       p0.interactionId_ = p1;
    }
    public static void o(Share p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x1000;
       p0.shareformatId_ = p1;
    }
    public static void p(Share p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.destinationId_ = p1;
    }
    public static r75 parser(){
       return Share.DEFAULT_INSTANCE.getParserForType();
    }
    public static void q(Share p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.shareId_ = p1;
    }
    public static de6 r(){
       return Share.DEFAULT_INSTANCE.createBuilder();
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
             Object[] objArray = new Object[14];
             objArray[0] = "bitField0_";
             objArray[b] = "entityUri_";
             objArray[2] = "destinationId_";
             objArray[3] = "shareId_";
             objArray[4] = "sourcePageUri_";
             objArray[5] = "sourcePage_";
             objArray[6] = "creatorUri_";
             objArray[7] = "systemDestination_";
             objArray[8] = "capability_";
             objArray[9] = "integration_";
             objArray[10] = "shareUrl_";
             objArray[11] = "audioPreview_";
             objArray[12] = "interactionId_";
             objArray[13] = "shareformatId_";
             return c.newMessageInfo(Share.DEFAULT_INSTANCE, "\x01\r\xff\x02\xff\x02\x01\x01\r\r\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03\x05\x10\x02\x04\x06\x10\x02\x05\x07\x10\x02\x06\b\x10\x02\x07\t\x10\x02\b\n\x10\x02\t\x0b\x10\x02\n\f\x10\x02\x0b\r\x10\x02\f", objArray);
           case 3:
             return new Share();
           case 4:
             return new de6();
           case 5:
             return Share.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Share.PARSER) == null) {
                _monitor_enter(Share.class);
                if ((pARSER = Share.PARSER) == null) {
                   pARSER = new ii2(Share.DEFAULT_INSTANCE);
                   Share.PARSER = pARSER;
                }
                _monitor_exit(Share.class);
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
