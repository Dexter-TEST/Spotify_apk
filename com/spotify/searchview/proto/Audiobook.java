package com.spotify.searchview.proto.Audiobook;
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
import com.spotify.searchview.proto.d;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Audiobook extends c implements u74	// class@000c07 from classes.dex
{
    private Audiobook$Access access_;
    private bc3 authorNames_;
    private String description_;
    private Duration duration_;
    private boolean explicit_;
    private bc3 narratorNames_;
    public static final int ACCESS_FIELD_NUMBER = 6;
    public static final int AUTHOR_NAMES_FIELD_NUMBER = 1;
    private static final Audiobook DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER;
    public static final int DURATION_FIELD_NUMBER;
    public static final int EXPLICIT_FIELD_NUMBER;
    public static final int NARRATOR_NAMES_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       Audiobook uAudiobook = new Audiobook();
       Audiobook.DEFAULT_INSTANCE = uAudiobook;
       c.registerDefaultInstance(Audiobook.class, uAudiobook);
    }
    private void Audiobook(){
       super();
       this.authorNames_ = c.emptyProtobufList();
       this.narratorNames_ = c.emptyProtobufList();
       this.description_ = "";
    }
    public static Audiobook e(){
       return Audiobook.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Audiobook.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"authorNames_","narratorNames_","explicit_","duration_","description_","access_"};
             return c.newMessageInfo(Audiobook.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x07\x04\t\x05\x02\x02\x06\t", objArray);
           case 3:
             return new Audiobook();
           case 4:
             return new d();
           case 5:
             return Audiobook.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Audiobook.PARSER) == null) {
                _monitor_enter(Audiobook.class);
                if ((pARSER = Audiobook.PARSER) == null) {
                   pARSER = new ii2(Audiobook.DEFAULT_INSTANCE);
                   Audiobook.PARSER = pARSER;
                }
                _monitor_exit(Audiobook.class);
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
