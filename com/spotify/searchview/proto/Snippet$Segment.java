package com.spotify.searchview.proto.Snippet$Segment;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.searchview.proto.f;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Snippet$Segment extends c implements u74	// class@000c14 from classes.dex
{
    private boolean matched_;
    private String value_;
    private static final Snippet$Segment DEFAULT_INSTANCE;
    public static final int MATCHED_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       Snippet$Segment segment = new Snippet$Segment();
       Snippet$Segment.DEFAULT_INSTANCE = segment;
       c.registerDefaultInstance(Snippet$Segment.class, segment);
    }
    private void Snippet$Segment(){
       super();
       this.value_ = "";
    }
    public static Snippet$Segment e(){
       return Snippet$Segment.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Snippet$Segment.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"value_","matched_"};
             return c.newMessageInfo(Snippet$Segment.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x07", objArray);
           case 3:
             return new Snippet$Segment();
           case 4:
             return new f();
           case 5:
             return Snippet$Segment.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Snippet$Segment.PARSER) == null) {
                _monitor_enter(Snippet$Segment.class);
                if ((pARSER = Snippet$Segment.PARSER) == null) {
                   pARSER = new ii2(Snippet$Segment.DEFAULT_INSTANCE);
                   Snippet$Segment.PARSER = pARSER;
                }
                _monitor_exit(Snippet$Segment.class);
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
