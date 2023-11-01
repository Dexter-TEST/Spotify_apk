package com.spotify.searchview.proto.AudioEpisode$PlayedState;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.searchview.proto.b;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class AudioEpisode$PlayedState extends c implements u74	// class@000c03 from classes.dex
{
    private int playPosition_;
    private boolean played_;
    private static final AudioEpisode$PlayedState DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int PLAYED_FIELD_NUMBER;
    public static final int PLAY_POSITION_FIELD_NUMBER;

    static {
       AudioEpisode$PlayedState playedState = new AudioEpisode$PlayedState();
       AudioEpisode$PlayedState.DEFAULT_INSTANCE = playedState;
       c.registerDefaultInstance(AudioEpisode$PlayedState.class, playedState);
    }
    private void AudioEpisode$PlayedState(){
       super();
    }
    public static AudioEpisode$PlayedState e(){
       return AudioEpisode$PlayedState.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return AudioEpisode$PlayedState.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"playPosition_","played_"};
             return c.newMessageInfo(AudioEpisode$PlayedState.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x07", objArray);
           case 3:
             return new AudioEpisode$PlayedState();
           case 4:
             return new b();
           case 5:
             return AudioEpisode$PlayedState.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = AudioEpisode$PlayedState.PARSER) == null) {
                _monitor_enter(AudioEpisode$PlayedState.class);
                if ((pARSER = AudioEpisode$PlayedState.PARSER) == null) {
                   pARSER = new ii2(AudioEpisode$PlayedState.DEFAULT_INSTANCE);
                   AudioEpisode$PlayedState.PARSER = pARSER;
                }
                _monitor_exit(AudioEpisode$PlayedState.class);
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
