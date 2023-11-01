package com.spotify.lyrics.endpointretrofit.proto.LyricsResponse$LyricsLine$Syllable;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.lyrics.endpointretrofit.proto.f;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class LyricsResponse$LyricsLine$Syllable extends c implements u74	// class@0009ec from classes.dex
{
    private long numChars_;
    private long startTimeMs_;
    private static final LyricsResponse$LyricsLine$Syllable DEFAULT_INSTANCE;
    public static final int NUM_CHARS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int START_TIME_MS_FIELD_NUMBER;

    static {
       LyricsResponse$LyricsLine$Syllable lyricsLine$S = new LyricsResponse$LyricsLine$Syllable();
       LyricsResponse$LyricsLine$Syllable.DEFAULT_INSTANCE = lyricsLine$S;
       c.registerDefaultInstance(LyricsResponse$LyricsLine$Syllable.class, lyricsLine$S);
    }
    private void LyricsResponse$LyricsLine$Syllable(){
       super();
    }
    public static LyricsResponse$LyricsLine$Syllable e(){
       return LyricsResponse$LyricsLine$Syllable.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return LyricsResponse$LyricsLine$Syllable.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"startTimeMs_","numChars_"};
             return c.newMessageInfo(LyricsResponse$LyricsLine$Syllable.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02", objArray);
           case 3:
             return new LyricsResponse$LyricsLine$Syllable();
           case 4:
             return new f();
           case 5:
             return LyricsResponse$LyricsLine$Syllable.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LyricsResponse$LyricsLine$Syllable.PARSER) == null) {
                _monitor_enter(LyricsResponse$LyricsLine$Syllable.class);
                if ((pARSER = LyricsResponse$LyricsLine$Syllable.PARSER) == null) {
                   pARSER = new ii2(LyricsResponse$LyricsLine$Syllable.DEFAULT_INSTANCE);
                   LyricsResponse$LyricsLine$Syllable.PARSER = pARSER;
                }
                _monitor_exit(LyricsResponse$LyricsLine$Syllable.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final long f(){
       return this.numChars_;
    }
    public final long g(){
       return this.startTimeMs_;
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
