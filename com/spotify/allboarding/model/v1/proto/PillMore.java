package com.spotify.allboarding.model.v1.proto.PillMore;
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
import p.cl1;
import p.kk1;
import com.spotify.allboarding.model.v1.proto.Pill;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class PillMore extends c implements u74	// class@00051c from classes.dex
{
    private String color_;
    private int expansionLimit_;
    private Logging logging_;
    private bc3 relatedItems_;
    private String text_;
    private String uri_;
    public static final int COLOR_FIELD_NUMBER = 4;
    private static final PillMore DEFAULT_INSTANCE;
    public static final int EXPANSION_LIMIT_FIELD_NUMBER;
    public static final int LOGGING_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int RELATED_ITEMS_FIELD_NUMBER;
    public static final int TEXT_FIELD_NUMBER;
    public static final int URI_FIELD_NUMBER;

    static {
       PillMore pillMore = new PillMore();
       PillMore.DEFAULT_INSTANCE = pillMore;
       c.registerDefaultInstance(PillMore.class, pillMore);
    }
    private void PillMore(){
       super();
       this.uri_ = "";
       this.text_ = "";
       this.color_ = "";
       this.relatedItems_ = c.emptyProtobufList();
    }
    public static PillMore e(){
       return PillMore.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return PillMore.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"uri_","text_","color_","relatedItems_",Pill.class,"expansionLimit_","logging_"};
             return c.newMessageInfo(PillMore.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x06\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x04\x02\x02\x05\x1b\x06\x04\x07\t", objArray);
           case 3:
             return new PillMore();
           case 4:
             return new cl1(p2);
           case 5:
             return PillMore.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = PillMore.PARSER) == null) {
                _monitor_enter(PillMore.class);
                if ((pARSER = PillMore.PARSER) == null) {
                   pARSER = new ii2(PillMore.DEFAULT_INSTANCE);
                   PillMore.PARSER = pARSER;
                }
                _monitor_exit(PillMore.class);
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
