package com.spotify.metadata.proto.Metadata$Availability;
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
import p.h40;
import p.e40;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class Metadata$Availability extends c implements u74	// class@000a67 from classes.dex
{
    private int bitField0_;
    private bc3 catalogueStr_;
    private Metadata$Date start_;
    public static final int CATALOGUE_STR_FIELD_NUMBER = 1;
    private static final Metadata$Availability DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int START_FIELD_NUMBER;

    static {
       Metadata$Availability uAvailabilit = new Metadata$Availability();
       Metadata$Availability.DEFAULT_INSTANCE = uAvailabilit;
       c.registerDefaultInstance(Metadata$Availability.class, uAvailabilit);
    }
    private void Metadata$Availability(){
       super();
       this.catalogueStr_ = c.emptyProtobufList();
    }
    public static Metadata$Availability e(){
       return Metadata$Availability.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$Availability.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","catalogueStr_","start_"};
             return c.newMessageInfo(Metadata$Availability.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1a\x02\x10\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new Metadata$Availability();
           case 4:
             return new h40(p2);
           case 5:
             return Metadata$Availability.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$Availability.PARSER) == null) {
                _monitor_enter(Metadata$Availability.class);
                if ((pARSER = Metadata$Availability.PARSER) == null) {
                   pARSER = new ii2(Metadata$Availability.DEFAULT_INSTANCE);
                   Metadata$Availability.PARSER = pARSER;
                }
                _monitor_exit(Metadata$Availability.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
