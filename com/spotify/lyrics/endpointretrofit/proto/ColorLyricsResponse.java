package com.spotify.lyrics.endpointretrofit.proto.ColorLyricsResponse;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.lyrics.endpointretrofit.proto.a;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.lyrics.endpointretrofit.proto.ColorLyricsResponse$ColorData;
import com.spotify.lyrics.endpointretrofit.proto.LyricsResponse;
import p.r74;
import com.google.protobuf.b;

public final class ColorLyricsResponse extends c implements u74	// class@0009ea from classes.dex
{
    private ColorLyricsResponse$ColorData colors_;
    private boolean hasVocalRemoval_;
    private LyricsResponse lyrics_;
    private ColorLyricsResponse$ColorData vocalRemovalColors_;
    public static final int COLORS_FIELD_NUMBER = 2;
    private static final ColorLyricsResponse DEFAULT_INSTANCE;
    public static final int HAS_VOCAL_REMOVAL_FIELD_NUMBER;
    public static final int LYRICS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int VOCAL_REMOVAL_COLORS_FIELD_NUMBER;

    static {
       ColorLyricsResponse uColorLyrics = new ColorLyricsResponse();
       ColorLyricsResponse.DEFAULT_INSTANCE = uColorLyrics;
       c.registerDefaultInstance(ColorLyricsResponse.class, uColorLyrics);
    }
    private void ColorLyricsResponse(){
       super();
    }
    public static ColorLyricsResponse e(){
       return ColorLyricsResponse.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return ColorLyricsResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"lyrics_","colors_","hasVocalRemoval_","vocalRemovalColors_"};
             return c.newMessageInfo(ColorLyricsResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\t\x03\x07\x04\t", objArray);
           case 3:
             return new ColorLyricsResponse();
           case 4:
             return new a();
           case 5:
             return ColorLyricsResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ColorLyricsResponse.PARSER) == null) {
                _monitor_enter(ColorLyricsResponse.class);
                if ((pARSER = ColorLyricsResponse.PARSER) == null) {
                   pARSER = new ii2(ColorLyricsResponse.DEFAULT_INSTANCE);
                   ColorLyricsResponse.PARSER = pARSER;
                }
                _monitor_exit(ColorLyricsResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final ColorLyricsResponse$ColorData f(){
       ColorLyricsResponse tcolors_;
       if ((tcolors_ = this.colors_) == null) {
          tcolors_ = ColorLyricsResponse$ColorData.g();
       }
       return tcolors_;
    }
    public final boolean g(){
       return this.hasVocalRemoval_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final LyricsResponse h(){
       ColorLyricsResponse tlyrics_;
       if ((tlyrics_ = this.lyrics_) == null) {
          tlyrics_ = LyricsResponse.g();
       }
       return tlyrics_;
    }
    public final ColorLyricsResponse$ColorData i(){
       ColorLyricsResponse tvocalRemova;
       if ((tvocalRemova = this.vocalRemovalColors_) == null) {
          tvocalRemova = ColorLyricsResponse$ColorData.g();
       }
       return tvocalRemova;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
