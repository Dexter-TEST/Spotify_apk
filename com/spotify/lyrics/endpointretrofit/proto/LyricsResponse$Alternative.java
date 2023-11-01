package com.spotify.lyrics.endpointretrofit.proto.LyricsResponse$Alternative;
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
import com.spotify.lyrics.endpointretrofit.proto.c;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class LyricsResponse$Alternative extends c implements u74	// class@0009eb from classes.dex
{
    private boolean isRtlLanguage_;
    private String language_;
    private bc3 lines_;
    private static final LyricsResponse$Alternative DEFAULT_INSTANCE;
    public static final int IS_RTL_LANGUAGE_FIELD_NUMBER;
    public static final int LANGUAGE_FIELD_NUMBER;
    public static final int LINES_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       LyricsResponse$Alternative uAlternative = new LyricsResponse$Alternative();
       LyricsResponse$Alternative.DEFAULT_INSTANCE = uAlternative;
       c.registerDefaultInstance(LyricsResponse$Alternative.class, uAlternative);
    }
    private void LyricsResponse$Alternative(){
       super();
       this.language_ = "";
       this.lines_ = c.emptyProtobufList();
    }
    public static LyricsResponse$Alternative e(){
       return LyricsResponse$Alternative.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return LyricsResponse$Alternative.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"language_","lines_","isRtlLanguage_"};
             return c.newMessageInfo(LyricsResponse$Alternative.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x07", objArray);
           case 3:
             return new LyricsResponse$Alternative();
           case 4:
             return new c();
           case 5:
             return LyricsResponse$Alternative.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LyricsResponse$Alternative.PARSER) == null) {
                _monitor_enter(LyricsResponse$Alternative.class);
                if ((pARSER = LyricsResponse$Alternative.PARSER) == null) {
                   pARSER = new ii2(LyricsResponse$Alternative.DEFAULT_INSTANCE);
                   LyricsResponse$Alternative.PARSER = pARSER;
                }
                _monitor_exit(LyricsResponse$Alternative.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final boolean f(){
       return this.isRtlLanguage_;
    }
    public final String g(){
       return this.language_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final bc3 h(){
       return this.lines_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
