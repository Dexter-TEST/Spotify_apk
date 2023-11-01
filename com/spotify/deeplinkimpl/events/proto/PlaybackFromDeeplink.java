package com.spotify.deeplinkimpl.events.proto.PlaybackFromDeeplink;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.mf5;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class PlaybackFromDeeplink extends c implements u74	// class@000892 from classes.dex
{
    private int bitField0_;
    private String deeplinkSessionId_;
    private String playbackId_;
    private String playingContextUri_;
    private String playingEntityUri_;
    public static final int DEEPLINK_SESSION_ID_FIELD_NUMBER = 2;
    private static final PlaybackFromDeeplink DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int PLAYBACK_ID_FIELD_NUMBER;
    public static final int PLAYING_CONTEXT_URI_FIELD_NUMBER;
    public static final int PLAYING_ENTITY_URI_FIELD_NUMBER;

    static {
       PlaybackFromDeeplink playbackFrom = new PlaybackFromDeeplink();
       PlaybackFromDeeplink.DEFAULT_INSTANCE = playbackFrom;
       c.registerDefaultInstance(PlaybackFromDeeplink.class, playbackFrom);
    }
    private void PlaybackFromDeeplink(){
       super();
       this.playbackId_ = "";
       this.deeplinkSessionId_ = "";
       this.playingEntityUri_ = "";
       this.playingContextUri_ = "";
    }
    public static PlaybackFromDeeplink e(){
       return PlaybackFromDeeplink.DEFAULT_INSTANCE;
    }
    public static void f(PlaybackFromDeeplink p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.playbackId_ = p1;
    }
    public static void g(PlaybackFromDeeplink p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.playingContextUri_ = p1;
    }
    public static void h(PlaybackFromDeeplink p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.deeplinkSessionId_ = p1;
    }
    public static void i(PlaybackFromDeeplink p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.playingEntityUri_ = p1;
    }
    public static mf5 j(){
       return PlaybackFromDeeplink.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return PlaybackFromDeeplink.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","playbackId_","deeplinkSessionId_","playingEntityUri_","playingContextUri_"};
             return c.newMessageInfo(PlaybackFromDeeplink.DEFAULT_INSTANCE, "\x01\x04\xff\x02\xff\x02\x01\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03", objArray);
           case 3:
             return new PlaybackFromDeeplink();
           case 4:
             return new mf5();
           case 5:
             return PlaybackFromDeeplink.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = PlaybackFromDeeplink.PARSER) == null) {
                _monitor_enter(PlaybackFromDeeplink.class);
                if ((pARSER = PlaybackFromDeeplink.PARSER) == null) {
                   pARSER = new ii2(PlaybackFromDeeplink.DEFAULT_INSTANCE);
                   PlaybackFromDeeplink.PARSER = pARSER;
                }
                _monitor_exit(PlaybackFromDeeplink.class);
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
