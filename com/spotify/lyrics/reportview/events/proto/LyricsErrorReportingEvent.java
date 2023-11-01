package com.spotify.lyrics.reportview.events.proto.LyricsErrorReportingEvent;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.fx3;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class LyricsErrorReportingEvent extends c implements u74	// class@0009f5 from classes.dex
{
    private int bitField0_;
    private String flag_;
    private String providerLyricsId_;
    private String provider_;
    private String trackUri_;
    private static final LyricsErrorReportingEvent DEFAULT_INSTANCE;
    public static final int FLAG_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PROVIDER_FIELD_NUMBER;
    public static final int PROVIDER_LYRICS_ID_FIELD_NUMBER;
    public static final int TRACK_URI_FIELD_NUMBER;

    static {
       LyricsErrorReportingEvent lyricsErrorR = new LyricsErrorReportingEvent();
       LyricsErrorReportingEvent.DEFAULT_INSTANCE = lyricsErrorR;
       c.registerDefaultInstance(LyricsErrorReportingEvent.class, lyricsErrorR);
    }
    private void LyricsErrorReportingEvent(){
       super();
       this.trackUri_ = "";
       this.provider_ = "";
       this.providerLyricsId_ = "";
       this.flag_ = "";
    }
    public static LyricsErrorReportingEvent e(){
       return LyricsErrorReportingEvent.DEFAULT_INSTANCE;
    }
    public static void f(LyricsErrorReportingEvent p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.trackUri_ = p1;
    }
    public static void g(LyricsErrorReportingEvent p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.flag_ = p1;
    }
    public static void h(LyricsErrorReportingEvent p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.provider_ = p1;
    }
    public static void i(LyricsErrorReportingEvent p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.providerLyricsId_ = p1;
    }
    public static fx3 j(){
       return LyricsErrorReportingEvent.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return LyricsErrorReportingEvent.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","trackUri_","provider_","providerLyricsId_","flag_"};
             return c.newMessageInfo(LyricsErrorReportingEvent.DEFAULT_INSTANCE, "\x01\x04\xff\x02\xff\x02\x01\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03", objArray);
           case 3:
             return new LyricsErrorReportingEvent();
           case 4:
             return new fx3();
           case 5:
             return LyricsErrorReportingEvent.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LyricsErrorReportingEvent.PARSER) == null) {
                _monitor_enter(LyricsErrorReportingEvent.class);
                if ((pARSER = LyricsErrorReportingEvent.PARSER) == null) {
                   pARSER = new ii2(LyricsErrorReportingEvent.DEFAULT_INSTANCE);
                   LyricsErrorReportingEvent.PARSER = pARSER;
                }
                _monitor_exit(LyricsErrorReportingEvent.class);
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
