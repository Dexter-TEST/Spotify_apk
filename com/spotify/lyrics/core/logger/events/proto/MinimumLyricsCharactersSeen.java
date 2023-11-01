package com.spotify.lyrics.core.logger.events.proto.MinimumLyricsCharactersSeen;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.va4;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class MinimumLyricsCharactersSeen extends c implements u74	// class@0009e4 from classes.dex
{
    private int bitField0_;
    private String lyricsFormat_;
    private String playbackId_;
    private String providerLyricsId_;
    private String provider_;
    private String syncType_;
    private String trackUri_;
    private static final MinimumLyricsCharactersSeen DEFAULT_INSTANCE;
    public static final int LYRICS_FORMAT_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PLAYBACK_ID_FIELD_NUMBER;
    public static final int PROVIDER_FIELD_NUMBER;
    public static final int PROVIDER_LYRICS_ID_FIELD_NUMBER;
    public static final int SYNC_TYPE_FIELD_NUMBER;
    public static final int TRACK_URI_FIELD_NUMBER;

    static {
       MinimumLyricsCharactersSeen minimumLyric = new MinimumLyricsCharactersSeen();
       MinimumLyricsCharactersSeen.DEFAULT_INSTANCE = minimumLyric;
       c.registerDefaultInstance(MinimumLyricsCharactersSeen.class, minimumLyric);
    }
    private void MinimumLyricsCharactersSeen(){
       super();
       this.trackUri_ = "";
       this.lyricsFormat_ = "";
       this.playbackId_ = "";
       this.provider_ = "";
       this.providerLyricsId_ = "";
       this.syncType_ = "";
    }
    public static MinimumLyricsCharactersSeen e(){
       return MinimumLyricsCharactersSeen.DEFAULT_INSTANCE;
    }
    public static void f(MinimumLyricsCharactersSeen p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.trackUri_ = p1;
    }
    public static void g(MinimumLyricsCharactersSeen p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.provider_ = p1;
    }
    public static void h(MinimumLyricsCharactersSeen p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x10;
       p0.providerLyricsId_ = p1;
    }
    public static void i(MinimumLyricsCharactersSeen p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x20;
       p0.syncType_ = p1;
    }
    public static void j(MinimumLyricsCharactersSeen p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.lyricsFormat_ = p1;
    }
    public static void k(MinimumLyricsCharactersSeen p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.playbackId_ = p1;
    }
    public static va4 l(){
       return MinimumLyricsCharactersSeen.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return MinimumLyricsCharactersSeen.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","trackUri_","lyricsFormat_","playbackId_","provider_","providerLyricsId_","syncType_"};
             return c.newMessageInfo(MinimumLyricsCharactersSeen.DEFAULT_INSTANCE, "\x01\x06\xff\x02\xff\x02\x01\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03\x05\x10\x02\x04\x06\x10\x02\x05", objArray);
           case 3:
             return new MinimumLyricsCharactersSeen();
           case 4:
             return new va4();
           case 5:
             return MinimumLyricsCharactersSeen.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = MinimumLyricsCharactersSeen.PARSER) == null) {
                _monitor_enter(MinimumLyricsCharactersSeen.class);
                if ((pARSER = MinimumLyricsCharactersSeen.PARSER) == null) {
                   pARSER = new ii2(MinimumLyricsCharactersSeen.DEFAULT_INSTANCE);
                   MinimumLyricsCharactersSeen.PARSER = pARSER;
                }
                _monitor_exit(MinimumLyricsCharactersSeen.class);
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
