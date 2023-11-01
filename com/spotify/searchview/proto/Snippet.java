package com.spotify.searchview.proto.Snippet;
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
import com.spotify.searchview.proto.e;
import com.spotify.searchview.proto.Snippet$Segment;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Snippet extends c implements u74	// class@000c15 from classes.dex
{
    private bc3 segments_;
    private static final Snippet DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int SEGMENTS_FIELD_NUMBER;

    static {
       Snippet snippet = new Snippet();
       Snippet.DEFAULT_INSTANCE = snippet;
       c.registerDefaultInstance(Snippet.class, snippet);
    }
    private void Snippet(){
       super();
       this.segments_ = c.emptyProtobufList();
    }
    public static Snippet e(){
       return Snippet.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Snippet.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"segments_",Snippet$Segment.class};
             return c.newMessageInfo(Snippet.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b", objArray);
           case 3:
             return new Snippet();
           case 4:
             return new e();
           case 5:
             return Snippet.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Snippet.PARSER) == null) {
                _monitor_enter(Snippet.class);
                if ((pARSER = Snippet.PARSER) == null) {
                   pARSER = new ii2(Snippet.DEFAULT_INSTANCE);
                   Snippet.PARSER = pARSER;
                }
                _monitor_exit(Snippet.class);
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
