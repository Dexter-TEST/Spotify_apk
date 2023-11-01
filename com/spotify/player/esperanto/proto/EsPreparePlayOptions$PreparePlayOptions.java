package com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import p.i80;
import p.bc3;
import com.google.common.collect.d;
import p.f2;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.a;
import p.zq1;
import java.lang.Object;
import java.lang.String;
import p.h80;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptionOverrides;
import p.cr1;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsSkipToTrack$SkipToTrack;
import p.r75;
import p.ar1;
import com.google.protobuf.b;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.br1;
import p.s74;
import java.lang.Byte;

public final class EsPreparePlayOptions$PreparePlayOptions extends c implements u74	// class@000b04 from classes.dex
{
    private boolean alwaysPlaySomething_;
    private int audioStream_;
    private g14 configurationOverride_;
    private boolean initiallyPaused_;
    private String license_;
    private i80 playbackId_;
    private EsContextPlayerOptions$ContextPlayerOptionOverrides playerOptionsOverride_;
    private int prefetchLevel_;
    private EsOptional$OptionalInt64 seekTo_;
    private String sessionId_;
    private EsSkipToTrack$SkipToTrack skipTo_;
    private bc3 suppressions_;
    private boolean systemInitiated_;
    public static final int ALWAYS_PLAY_SOMETHING_FIELD_NUMBER = 2;
    public static final int AUDIO_STREAM_FIELD_NUMBER = 10;
    public static final int CONFIGURATION_OVERRIDE_FIELD_NUMBER = 13;
    private static final EsPreparePlayOptions$PreparePlayOptions DEFAULT_INSTANCE;
    public static final int INITIALLY_PAUSED_FIELD_NUMBER;
    public static final int LICENSE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PLAYBACK_ID_FIELD_NUMBER;
    public static final int PLAYER_OPTIONS_OVERRIDE_FIELD_NUMBER;
    public static final int PREFETCH_LEVEL_FIELD_NUMBER;
    public static final int SEEK_TO_FIELD_NUMBER;
    public static final int SESSION_ID_FIELD_NUMBER;
    public static final int SKIP_TO_FIELD_NUMBER;
    public static final int SUPPRESSIONS_FIELD_NUMBER;
    public static final int SYSTEM_INITIATED_FIELD_NUMBER;

    static {
       EsPreparePlayOptions$PreparePlayOptions preparePlayO = new EsPreparePlayOptions$PreparePlayOptions();
       EsPreparePlayOptions$PreparePlayOptions.DEFAULT_INSTANCE = preparePlayO;
       c.registerDefaultInstance(EsPreparePlayOptions$PreparePlayOptions.class, preparePlayO);
    }
    private void EsPreparePlayOptions$PreparePlayOptions(){
       super();
       this.configurationOverride_ = g14.b;
       this.playbackId_ = i80.b;
       this.suppressions_ = c.emptyProtobufList();
       this.sessionId_ = "";
       this.license_ = "";
    }
    public static void e(EsPreparePlayOptions$PreparePlayOptions p0,d p1){
       EsPreparePlayOptions$PreparePlayOptions suppressions = p0.suppressions_;
       if (suppressions.a == null) {
          p0.suppressions_ = c.mutableCopy(suppressions);
       }
       a.addAll(p1, p0.suppressions_);
       return;
    }
    public static g14 f(EsPreparePlayOptions$PreparePlayOptions p0){
       EsPreparePlayOptions$PreparePlayOptions configuratio = p0.configurationOverride_;
       if (configuratio.a == null) {
          p0.configurationOverride_ = configuratio.d();
       }
       return p0.configurationOverride_;
    }
    public static void g(EsPreparePlayOptions$PreparePlayOptions p0,boolean p1){
       p0.alwaysPlaySomething_ = p1;
    }
    public static void h(EsPreparePlayOptions$PreparePlayOptions p0,zq1 p1){
       p0.getClass();
       p0.audioStream_ = p1.getNumber();
    }
    public static void i(EsPreparePlayOptions$PreparePlayOptions p0,boolean p1){
       p0.initiallyPaused_ = p1;
    }
    public static void j(EsPreparePlayOptions$PreparePlayOptions p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.license_ = p1;
    }
    public static void k(EsPreparePlayOptions$PreparePlayOptions p0,h80 p1){
       p0.getClass();
       p0.playbackId_ = p1;
    }
    public static void l(EsPreparePlayOptions$PreparePlayOptions p0,EsContextPlayerOptions$ContextPlayerOptionOverrides p1){
       p0.getClass();
       p0.playerOptionsOverride_ = p1;
    }
    public static void m(EsPreparePlayOptions$PreparePlayOptions p0,cr1 p1){
       p0.getClass();
       p0.prefetchLevel_ = p1.getNumber();
    }
    public static void n(EsPreparePlayOptions$PreparePlayOptions p0,EsOptional$OptionalInt64 p1){
       p0.getClass();
       p1.getClass();
       p0.seekTo_ = p1;
    }
    public static void o(EsPreparePlayOptions$PreparePlayOptions p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.sessionId_ = p1;
    }
    public static void p(EsPreparePlayOptions$PreparePlayOptions p0,EsSkipToTrack$SkipToTrack p1){
       p0.getClass();
       p0.skipTo_ = p1;
    }
    public static r75 parser(){
       return EsPreparePlayOptions$PreparePlayOptions.DEFAULT_INSTANCE.getParserForType();
    }
    public static void q(EsPreparePlayOptions$PreparePlayOptions p0,boolean p1){
       p0.systemInitiated_ = p1;
    }
    public static EsPreparePlayOptions$PreparePlayOptions r(){
       return EsPreparePlayOptions$PreparePlayOptions.DEFAULT_INSTANCE;
    }
    public static ar1 s(){
       return EsPreparePlayOptions$PreparePlayOptions.DEFAULT_INSTANCE.createBuilder();
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
             objArray[0] = "playbackId_";
             objArray[b] = "alwaysPlaySomething_";
             objArray[2] = "skipTo_";
             objArray[3] = "seekTo_";
             objArray[4] = "initiallyPaused_";
             objArray[5] = "systemInitiated_";
             objArray[6] = "playerOptionsOverride_";
             objArray[7] = "suppressions_";
             objArray[8] = "prefetchLevel_";
             objArray[9] = "audioStream_";
             objArray[10] = "sessionId_";
             objArray[11] = "license_";
             objArray[12] = "configurationOverride_";
             objArray[13] = br1.a;
             return c.newMessageInfo(EsPreparePlayOptions$PreparePlayOptions.DEFAULT_INSTANCE, "\xff\x02\xff\x02\r\xff\x02\xff\x02\xff\x02\xff\x02\x01\r\r\x01\x01\xff\x02\xff\x02\x01\n\x02\x07\x03\t\x04\t\x05\x07\x06\x07\x07\t\b\x02\x02\t\f\n\f\x0b\x02\x02\f\x02\x02\r2", objArray);
           case 3:
             return new EsPreparePlayOptions$PreparePlayOptions();
           case 4:
             return new ar1();
           case 5:
             return EsPreparePlayOptions$PreparePlayOptions.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsPreparePlayOptions$PreparePlayOptions.PARSER) == null) {
                _monitor_enter(EsPreparePlayOptions$PreparePlayOptions.class);
                if ((pARSER = EsPreparePlayOptions$PreparePlayOptions.PARSER) == null) {
                   pARSER = new ii2(EsPreparePlayOptions$PreparePlayOptions.DEFAULT_INSTANCE);
                   EsPreparePlayOptions$PreparePlayOptions.PARSER = pARSER;
                }
                _monitor_exit(EsPreparePlayOptions$PreparePlayOptions.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
