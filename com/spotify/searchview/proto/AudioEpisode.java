package com.spotify.searchview.proto.AudioEpisode;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.searchview.proto.a;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class AudioEpisode extends c implements u74	// class@000c04 from classes.dex
{
    private String description_;
    private Duration duration_;
    private boolean explicit_;
    private boolean mogef19_;
    private boolean musicAndTalk_;
    private AudioEpisode$PlayedState playedState_;
    private Timestamp publicationTime_;
    private String showName_;
    private String showUri_;
    private Snippet snippet_;
    private boolean videoFormat_;
    private static final AudioEpisode DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER;
    public static final int DURATION_FIELD_NUMBER;
    public static final int EXPLICIT_FIELD_NUMBER;
    public static final int MOGEF19_FIELD_NUMBER;
    public static final int MUSIC_AND_TALK_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PLAYED_STATE_FIELD_NUMBER;
    public static final int PUBLICATION_TIME_FIELD_NUMBER;
    public static final int SHOW_NAME_FIELD_NUMBER;
    public static final int SHOW_URI_FIELD_NUMBER;
    public static final int SNIPPET_FIELD_NUMBER;
    public static final int VIDEO_FORMAT_FIELD_NUMBER;

    static {
       AudioEpisode uAudioEpisod = new AudioEpisode();
       AudioEpisode.DEFAULT_INSTANCE = uAudioEpisod;
       c.registerDefaultInstance(AudioEpisode.class, uAudioEpisod);
    }
    private void AudioEpisode(){
       super();
       this.showName_ = "";
       this.description_ = "";
       this.showUri_ = "";
    }
    public static AudioEpisode e(){
       return AudioEpisode.DEFAULT_INSTANCE;
    }
    public static AudioEpisode f(){
       return AudioEpisode.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return AudioEpisode.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[11];
             objArray[0] = "showName_";
             objArray[b] = "explicit_";
             objArray[2] = "duration_";
             objArray[3] = "musicAndTalk_";
             objArray[4] = "description_";
             objArray[5] = "publicationTime_";
             objArray[6] = "mogef19_";
             objArray[7] = "snippet_";
             objArray[8] = "showUri_";
             objArray[9] = "playedState_";
             objArray[10] = "videoFormat_";
             return c.newMessageInfo(AudioEpisode.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x0b\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x0b\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x07\x03\t\x06\x07\x07\x02\x02\b\t\t\x07\n\t\x07\x02\x02\x02\x07\x02\t\x07\x02\x07", objArray);
           case 3:
             return new AudioEpisode();
           case 4:
             return new a();
           case 5:
             return AudioEpisode.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = AudioEpisode.PARSER) == null) {
                _monitor_enter(AudioEpisode.class);
                if ((pARSER = AudioEpisode.PARSER) == null) {
                   pARSER = new ii2(AudioEpisode.DEFAULT_INSTANCE);
                   AudioEpisode.PARSER = pARSER;
                }
                _monitor_exit(AudioEpisode.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String g(){
       return this.showName_;
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
