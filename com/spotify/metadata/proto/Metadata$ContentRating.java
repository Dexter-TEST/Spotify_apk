package com.spotify.metadata.proto.Metadata$ContentRating;
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
import p.sq1;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class Metadata$ContentRating extends c implements u74	// class@000a69 from classes.dex
{
    private int bitField0_;
    private String country_;
    private bc3 tag_;
    public static final int COUNTRY_FIELD_NUMBER = 1;
    private static final Metadata$ContentRating DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int TAG_FIELD_NUMBER;

    static {
       Metadata$ContentRating uContentRati = new Metadata$ContentRating();
       Metadata$ContentRating.DEFAULT_INSTANCE = uContentRati;
       c.registerDefaultInstance(Metadata$ContentRating.class, uContentRati);
    }
    private void Metadata$ContentRating(){
       super();
       this.country_ = "";
       this.tag_ = c.emptyProtobufList();
    }
    public static Metadata$ContentRating e(){
       return Metadata$ContentRating.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$ContentRating.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","country_","tag_"};
             return c.newMessageInfo(Metadata$ContentRating.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x1a", objArray);
           case 3:
             return new Metadata$ContentRating();
           case 4:
             return new sq1(b);
           case 5:
             return Metadata$ContentRating.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$ContentRating.PARSER) == null) {
                _monitor_enter(Metadata$ContentRating.class);
                if ((pARSER = Metadata$ContentRating.PARSER) == null) {
                   pARSER = new ii2(Metadata$ContentRating.DEFAULT_INSTANCE);
                   Metadata$ContentRating.PARSER = pARSER;
                }
                _monitor_exit(Metadata$ContentRating.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
