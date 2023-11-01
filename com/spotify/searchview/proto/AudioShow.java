package com.spotify.searchview.proto.AudioShow;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.fq1;
import p.eq1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class AudioShow extends c implements u74	// class@000c05 from classes.dex
{
    private String category_;
    private boolean musicAndTalk_;
    private String publisherName_;
    public static final int CATEGORY_FIELD_NUMBER = 4;
    private static final AudioShow DEFAULT_INSTANCE;
    public static final int MUSIC_AND_TALK_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PUBLISHER_NAME_FIELD_NUMBER;

    static {
       AudioShow uAudioShow = new AudioShow();
       AudioShow.DEFAULT_INSTANCE = uAudioShow;
       c.registerDefaultInstance(AudioShow.class, uAudioShow);
    }
    private void AudioShow(){
       super();
       this.publisherName_ = "";
       this.category_ = "";
    }
    public static AudioShow e(){
       return AudioShow.DEFAULT_INSTANCE;
    }
    public static AudioShow f(){
       return AudioShow.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return AudioShow.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       p2 = null;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return p2;
           case 2:
             Object[] objArray = new Object[]{"publisherName_","musicAndTalk_","category_"};
             return c.newMessageInfo(AudioShow.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x03\x07\x04\x02\x02", objArray);
           case 3:
             return new AudioShow();
           case 4:
             return new fq1(p2);
           case 5:
             return AudioShow.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = AudioShow.PARSER) == null) {
                _monitor_enter(AudioShow.class);
                if ((pARSER = AudioShow.PARSER) == null) {
                   pARSER = new ii2(AudioShow.DEFAULT_INSTANCE);
                   AudioShow.PARSER = pARSER;
                }
                _monitor_exit(AudioShow.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String g(){
       return this.publisherName_;
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
