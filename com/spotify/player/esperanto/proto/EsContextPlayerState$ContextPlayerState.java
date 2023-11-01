package com.spotify.player.esperanto.proto.EsContextPlayerState$ContextPlayerState;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import p.i80;
import p.bc3;
import p.r75;
import com.spotify.player.esperanto.proto.EsRestrictions$Restrictions;
import java.lang.String;
import java.util.List;
import com.spotify.player.esperanto.proto.EsProvidedTrack$ProvidedTrack;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.sq1;
import p.ep1;
import p.fp1;
import p.s74;
import java.lang.Byte;
import p.zq1;
import java.util.Map;
import java.util.Collections;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsContextPlayerState$ContextIndex;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsContextPlayerState$PlaybackQuality;
import com.spotify.player.esperanto.proto.EsOptional$OptionalDouble;

public final class EsContextPlayerState$ContextPlayerState extends c implements u74	// class@000af4 from classes.dex
{
    private int audioStream_;
    private g14 contextMetadata_;
    private EsRestrictions$Restrictions contextRestrictions_;
    private String contextUri_;
    private String contextUrl_;
    private EsOptional$OptionalInt64 duration_;
    private EsContextPlayerState$ContextIndex index_;
    private boolean isBuffering_;
    private boolean isPaused_;
    private boolean isPlaying_;
    private boolean isSystemInitiated_;
    private bc3 nextTracks_;
    private EsContextPlayerOptions$ContextPlayerOptions options_;
    private g14 pageMetadata_;
    private EsPlayOrigin$PlayOrigin playOrigin_;
    private i80 playbackId_;
    private EsContextPlayerState$PlaybackQuality playbackQuality_;
    private EsOptional$OptionalDouble playbackSpeed_;
    private EsOptional$OptionalInt64 positionAsOfTimestamp_;
    private bc3 prevTracks_;
    private long queueRevision_;
    private EsRestrictions$Restrictions restrictions_;
    private String sessionId_;
    private bc3 signals_;
    private bc3 suppressions_;
    private long timestamp_;
    private EsProvidedTrack$ProvidedTrack track_;
    public static final int AUDIO_STREAM_FIELD_NUMBER = 26;
    public static final int CONTEXT_METADATA_FIELD_NUMBER = 22;
    public static final int CONTEXT_RESTRICTIONS_FIELD_NUMBER = 4;
    public static final int CONTEXT_URI_FIELD_NUMBER = 2;
    public static final int CONTEXT_URL_FIELD_NUMBER = 3;
    private static final EsContextPlayerState$ContextPlayerState DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER;
    public static final int INDEX_FIELD_NUMBER;
    public static final int IS_BUFFERING_FIELD_NUMBER;
    public static final int IS_PAUSED_FIELD_NUMBER;
    public static final int IS_PLAYING_FIELD_NUMBER;
    public static final int IS_SYSTEM_INITIATED_FIELD_NUMBER;
    public static final int NEXT_TRACKS_FIELD_NUMBER;
    public static final int OPTIONS_FIELD_NUMBER;
    public static final int PAGE_METADATA_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PLAYBACK_ID_FIELD_NUMBER;
    public static final int PLAYBACK_QUALITY_FIELD_NUMBER;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER;
    public static final int PLAY_ORIGIN_FIELD_NUMBER;
    public static final int POSITION_AS_OF_TIMESTAMP_FIELD_NUMBER;
    public static final int PREV_TRACKS_FIELD_NUMBER;
    public static final int QUEUE_REVISION_FIELD_NUMBER;
    public static final int RESTRICTIONS_FIELD_NUMBER;
    public static final int SESSION_ID_FIELD_NUMBER;
    public static final int SIGNALS_FIELD_NUMBER;
    public static final int SUPPRESSIONS_FIELD_NUMBER;
    public static final int TIMESTAMP_FIELD_NUMBER;
    public static final int TRACK_FIELD_NUMBER;

    static {
       EsContextPlayerState$ContextPlayerState uContextPlay = new EsContextPlayerState$ContextPlayerState();
       EsContextPlayerState$ContextPlayerState.DEFAULT_INSTANCE = uContextPlay;
       c.registerDefaultInstance(EsContextPlayerState$ContextPlayerState.class, uContextPlay);
    }
    private void EsContextPlayerState$ContextPlayerState(){
       super();
       g14 b = g14.b;
       this.contextMetadata_ = b;
       this.pageMetadata_ = b;
       this.contextUri_ = "";
       this.contextUrl_ = "";
       this.playbackId_ = i80.b;
       this.suppressions_ = c.emptyProtobufList();
       this.prevTracks_ = c.emptyProtobufList();
       this.nextTracks_ = c.emptyProtobufList();
       this.sessionId_ = "";
       this.signals_ = c.emptyProtobufList();
    }
    public static EsContextPlayerState$ContextPlayerState Q(byte[] p0){
       return c.parseFrom(EsContextPlayerState$ContextPlayerState.DEFAULT_INSTANCE, p0);
    }
    public static EsContextPlayerState$ContextPlayerState e(){
       return EsContextPlayerState$ContextPlayerState.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsContextPlayerState$ContextPlayerState.DEFAULT_INSTANCE.getParserForType();
    }
    public final bc3 A(){
       return this.prevTracks_;
    }
    public final long B(){
       return this.queueRevision_;
    }
    public final EsRestrictions$Restrictions C(){
       EsContextPlayerState$ContextPlayerState trestriction;
       if ((trestriction = this.restrictions_) == null) {
          trestriction = EsRestrictions$Restrictions.B();
       }
       return trestriction;
    }
    public final String D(){
       return this.sessionId_;
    }
    public final int E(){
       return this.signals_.size();
    }
    public final bc3 F(){
       return this.signals_;
    }
    public final int G(){
       return this.suppressions_.size();
    }
    public final bc3 H(){
       return this.suppressions_;
    }
    public final long I(){
       return this.timestamp_;
    }
    public final EsProvidedTrack$ProvidedTrack J(){
       EsContextPlayerState$ContextPlayerState ttrack_;
       if ((ttrack_ = this.track_) == null) {
          ttrack_ = EsProvidedTrack$ProvidedTrack.g();
       }
       return ttrack_;
    }
    public final boolean K(){
       boolean b = (this.duration_ != null)? true: false;
       return b;
    }
    public final boolean L(){
       boolean b = (this.index_ != null)? true: false;
       return b;
    }
    public final boolean M(){
       boolean b = (this.playbackQuality_ != null)? true: false;
       return b;
    }
    public final boolean N(){
       boolean b = (this.playbackSpeed_ != null)? true: false;
       return b;
    }
    public final boolean O(){
       boolean b = (this.positionAsOfTimestamp_ != null)? true: false;
       return b;
    }
    public final boolean P(){
       boolean b = (this.track_ != null)? true: false;
       return b;
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       int i = 28;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[31];
             objArray[0] = "timestamp_";
             objArray[b] = "contextUri_";
             objArray[2] = "contextUrl_";
             objArray[3] = "contextRestrictions_";
             objArray[4] = "playOrigin_";
             objArray[5] = "index_";
             objArray[6] = "track_";
             objArray[7] = "playbackId_";
             objArray[8] = "playbackQuality_";
             objArray[9] = "playbackSpeed_";
             objArray[10] = "positionAsOfTimestamp_";
             objArray[11] = "duration_";
             objArray[12] = "isPlaying_";
             objArray[13] = "isPaused_";
             objArray[14] = "isBuffering_";
             objArray[15] = "isSystemInitiated_";
             objArray[16] = "options_";
             objArray[17] = "restrictions_";
             objArray[18] = "suppressions_";
             objArray[19] = "prevTracks_";
             objArray[20] = EsProvidedTrack$ProvidedTrack.class;
             objArray[21] = "nextTracks_";
             objArray[22] = EsProvidedTrack$ProvidedTrack.class;
             objArray[23] = "contextMetadata_";
             objArray[24] = ep1.a;
             objArray[25] = "pageMetadata_";
             objArray[26] = fp1.a;
             objArray[27] = "sessionId_";
             objArray[i] = "queueRevision_";
             objArray[29] = "audioStream_";
             objArray[30] = "signals_";
             return c.newMessageInfo(EsContextPlayerState$ContextPlayerState.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x1b\xff\x02\xff\x02\xff\x02\xff\x02\x01\x1b\x1b\x02\x04\xff\x02\xff\x02\x01\x03\x02\x02\x02\x03\x02\x02\x04\t\x05\t\x06\t\x07\t\b\n\t\t\n\t\x0b\t\f\t\r\x07\x0e\x07\x0f\x07\x10\x07\x11\t\x12\t\x13\x02\x02\x14\x1b\x15\x1b\x162\x172\x18\x02\x02\x19\x03\x1a\f\x1b\x02\x02", objArray);
           case 3:
             return new EsContextPlayerState$ContextPlayerState();
           case 4:
             return new sq1(i);
           case 5:
             return EsContextPlayerState$ContextPlayerState.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsContextPlayerState$ContextPlayerState.PARSER) == null) {
                _monitor_enter(EsContextPlayerState$ContextPlayerState.class);
                if ((pARSER = EsContextPlayerState$ContextPlayerState.PARSER) == null) {
                   pARSER = new ii2(EsContextPlayerState$ContextPlayerState.DEFAULT_INSTANCE);
                   EsContextPlayerState$ContextPlayerState.PARSER = pARSER;
                }
                _monitor_exit(EsContextPlayerState$ContextPlayerState.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final zq1 f(){
       EsContextPlayerState$ContextPlayerState taudioStream;
       zq1 ozq1;
       if ((taudioStream = this.audioStream_) != null) {
          ozq1 = (taudioStream != 1)? null: zq1.c;
       }else {
          ozq1 = zq1.b;
       }
       if (ozq1 == null) {
          ozq1 = zq1.t;
       }
       return ozq1;
    }
    public final Map g(){
       return Collections.unmodifiableMap(this.contextMetadata_);
    }
    public final EsRestrictions$Restrictions h(){
       EsContextPlayerState$ContextPlayerState tcontextRest;
       if ((tcontextRest = this.contextRestrictions_) == null) {
          tcontextRest = EsRestrictions$Restrictions.B();
       }
       return tcontextRest;
    }
    public final String i(){
       return this.contextUri_;
    }
    public final String j(){
       return this.contextUrl_;
    }
    public final EsOptional$OptionalInt64 k(){
       EsContextPlayerState$ContextPlayerState tduration_;
       if ((tduration_ = this.duration_) == null) {
          tduration_ = EsOptional$OptionalInt64.g();
       }
       return tduration_;
    }
    public final EsContextPlayerState$ContextIndex l(){
       EsContextPlayerState$ContextPlayerState tindex_;
       if ((tindex_ = this.index_) == null) {
          tindex_ = EsContextPlayerState$ContextIndex.f();
       }
       return tindex_;
    }
    public final boolean m(){
       return this.isBuffering_;
    }
    public final boolean n(){
       return this.isPaused_;
    }
    public final boolean o(){
       return this.isPlaying_;
    }
    public final boolean p(){
       return this.isSystemInitiated_;
    }
    public final int q(){
       return this.nextTracks_.size();
    }
    public final bc3 r(){
       return this.nextTracks_;
    }
    public final EsContextPlayerOptions$ContextPlayerOptions s(){
       EsContextPlayerState$ContextPlayerState toptions_;
       if ((toptions_ = this.options_) == null) {
          toptions_ = EsContextPlayerOptions$ContextPlayerOptions.f();
       }
       return toptions_;
    }
    public final Map t(){
       return Collections.unmodifiableMap(this.pageMetadata_);
    }
    public final EsPlayOrigin$PlayOrigin u(){
       EsContextPlayerState$ContextPlayerState tplayOrigin_;
       if ((tplayOrigin_ = this.playOrigin_) == null) {
          tplayOrigin_ = EsPlayOrigin$PlayOrigin.n();
       }
       return tplayOrigin_;
    }
    public final i80 v(){
       return this.playbackId_;
    }
    public final EsContextPlayerState$PlaybackQuality w(){
       EsContextPlayerState$ContextPlayerState tplaybackQua;
       if ((tplaybackQua = this.playbackQuality_) == null) {
          tplaybackQua = EsContextPlayerState$PlaybackQuality.g();
       }
       return tplaybackQua;
    }
    public final EsOptional$OptionalDouble x(){
       EsContextPlayerState$ContextPlayerState tplaybackSpe;
       if ((tplaybackSpe = this.playbackSpeed_) == null) {
          tplaybackSpe = EsOptional$OptionalDouble.f();
       }
       return tplaybackSpe;
    }
    public final EsOptional$OptionalInt64 y(){
       EsContextPlayerState$ContextPlayerState tpositionAsO;
       if ((tpositionAsO = this.positionAsOfTimestamp_) == null) {
          tpositionAsO = EsOptional$OptionalInt64.g();
       }
       return tpositionAsO;
    }
    public final int z(){
       return this.prevTracks_.size();
    }
}
