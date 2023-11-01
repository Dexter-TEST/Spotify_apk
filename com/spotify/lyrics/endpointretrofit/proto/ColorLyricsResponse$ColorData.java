package com.spotify.lyrics.endpointretrofit.proto.ColorLyricsResponse$ColorData;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.lyrics.endpointretrofit.proto.b;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class ColorLyricsResponse$ColorData extends c implements u74	// class@0009e9 from classes.dex
{
    private int background_;
    private int highlightText_;
    private int text_;
    public static final int BACKGROUND_FIELD_NUMBER = 1;
    private static final ColorLyricsResponse$ColorData DEFAULT_INSTANCE;
    public static final int HIGHLIGHT_TEXT_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int TEXT_FIELD_NUMBER;

    static {
       ColorLyricsResponse$ColorData uColorData = new ColorLyricsResponse$ColorData();
       ColorLyricsResponse$ColorData.DEFAULT_INSTANCE = uColorData;
       c.registerDefaultInstance(ColorLyricsResponse$ColorData.class, uColorData);
    }
    private void ColorLyricsResponse$ColorData(){
       super();
    }
    public static ColorLyricsResponse$ColorData e(){
       return ColorLyricsResponse$ColorData.DEFAULT_INSTANCE;
    }
    public static ColorLyricsResponse$ColorData g(){
       return ColorLyricsResponse$ColorData.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return ColorLyricsResponse$ColorData.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"background_","text_","highlightText_"};
             return c.newMessageInfo(ColorLyricsResponse$ColorData.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x04\x03\x04", objArray);
           case 3:
             return new ColorLyricsResponse$ColorData();
           case 4:
             return new b();
           case 5:
             return ColorLyricsResponse$ColorData.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ColorLyricsResponse$ColorData.PARSER) == null) {
                _monitor_enter(ColorLyricsResponse$ColorData.class);
                if ((pARSER = ColorLyricsResponse$ColorData.PARSER) == null) {
                   pARSER = new ii2(ColorLyricsResponse$ColorData.DEFAULT_INSTANCE);
                   ColorLyricsResponse$ColorData.PARSER = pARSER;
                }
                _monitor_exit(ColorLyricsResponse$ColorData.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final int f(){
       return this.background_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final int h(){
       return this.highlightText_;
    }
    public final int i(){
       return this.text_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
