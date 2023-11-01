package com.spotify.lyrics.endpointretrofit.proto.LyricsResponse$LyricsLine;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.lyrics.endpointretrofit.proto.e;
import com.spotify.lyrics.endpointretrofit.proto.LyricsResponse$LyricsLine$Syllable;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class LyricsResponse$LyricsLine extends c implements u74	// class@0009ed from classes.dex
{
    private long startTimeMs_;
    private bc3 syllables_;
    private String words_;
    private static final LyricsResponse$LyricsLine DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int START_TIME_MS_FIELD_NUMBER;
    public static final int SYLLABLES_FIELD_NUMBER;
    public static final int WORDS_FIELD_NUMBER;

    static {
       LyricsResponse$LyricsLine lyricsLine = new LyricsResponse$LyricsLine();
       LyricsResponse$LyricsLine.DEFAULT_INSTANCE = lyricsLine;
       c.registerDefaultInstance(LyricsResponse$LyricsLine.class, lyricsLine);
    }
    private void LyricsResponse$LyricsLine(){
       super();
       this.words_ = "";
       this.syllables_ = c.emptyProtobufList();
    }
    public static LyricsResponse$LyricsLine e(){
       return LyricsResponse$LyricsLine.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return LyricsResponse$LyricsLine.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"startTimeMs_","words_","syllables_",LyricsResponse$LyricsLine$Syllable.class};
             return c.newMessageInfo(LyricsResponse$LyricsLine.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x02\x03\x1b", objArray);
           case 3:
             return new LyricsResponse$LyricsLine();
           case 4:
             return new e();
           case 5:
             return LyricsResponse$LyricsLine.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LyricsResponse$LyricsLine.PARSER) == null) {
                _monitor_enter(LyricsResponse$LyricsLine.class);
                if ((pARSER = LyricsResponse$LyricsLine.PARSER) == null) {
                   pARSER = new ii2(LyricsResponse$LyricsLine.DEFAULT_INSTANCE);
                   LyricsResponse$LyricsLine.PARSER = pARSER;
                }
                _monitor_exit(LyricsResponse$LyricsLine.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final long f(){
       return this.startTimeMs_;
    }
    public final bc3 g(){
       return this.syllables_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final String h(){
       return this.words_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
