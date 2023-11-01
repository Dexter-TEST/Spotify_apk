package com.spotify.metadata.proto.Metadata$SalePeriod;
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
import com.spotify.metadata.proto.Metadata$Restriction;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class Metadata$SalePeriod extends c implements u74	// class@000a73 from classes.dex
{
    private int bitField0_;
    private Metadata$Date end_;
    private bc3 restriction_;
    private Metadata$Date start_;
    private static final Metadata$SalePeriod DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int RESTRICTION_FIELD_NUMBER;
    public static final int START_FIELD_NUMBER;

    static {
       Metadata$SalePeriod salePeriod = new Metadata$SalePeriod();
       Metadata$SalePeriod.DEFAULT_INSTANCE = salePeriod;
       c.registerDefaultInstance(Metadata$SalePeriod.class, salePeriod);
    }
    private void Metadata$SalePeriod(){
       super();
       this.restriction_ = c.emptyProtobufList();
    }
    public static Metadata$SalePeriod e(){
       return Metadata$SalePeriod.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$SalePeriod.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","restriction_",Metadata$Restriction.class,"start_","end_"};
             return c.newMessageInfo(Metadata$SalePeriod.DEFAULT_INSTANCE, "\x01\x03\xff\x02\xff\x02\x01\x01\x03\x03\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x02\x10\x02\xff\x02\xff\x02\x03\x10\x02\x01", objArray);
           case 3:
             return new Metadata$SalePeriod();
           case 4:
             return new sq1(11);
           case 5:
             return Metadata$SalePeriod.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$SalePeriod.PARSER) == null) {
                _monitor_enter(Metadata$SalePeriod.class);
                if ((pARSER = Metadata$SalePeriod.PARSER) == null) {
                   pARSER = new ii2(Metadata$SalePeriod.DEFAULT_INSTANCE);
                   Metadata$SalePeriod.PARSER = pARSER;
                }
                _monitor_exit(Metadata$SalePeriod.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
