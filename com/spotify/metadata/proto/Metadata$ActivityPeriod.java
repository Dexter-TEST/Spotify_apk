package com.spotify.metadata.proto.Metadata$ActivityPeriod;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.h40;
import p.b40;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class Metadata$ActivityPeriod extends c implements u74	// class@000a60 from classes.dex
{
    private int bitField0_;
    private int decade_;
    private int endYear_;
    private int startYear_;
    public static final int DECADE_FIELD_NUMBER = 3;
    private static final Metadata$ActivityPeriod DEFAULT_INSTANCE;
    public static final int END_YEAR_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int START_YEAR_FIELD_NUMBER;

    static {
       Metadata$ActivityPeriod uActivityPer = new Metadata$ActivityPeriod();
       Metadata$ActivityPeriod.DEFAULT_INSTANCE = uActivityPer;
       c.registerDefaultInstance(Metadata$ActivityPeriod.class, uActivityPer);
    }
    private void Metadata$ActivityPeriod(){
       super();
    }
    public static Metadata$ActivityPeriod e(){
       return Metadata$ActivityPeriod.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$ActivityPeriod.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","startYear_","endYear_","decade_"};
             return c.newMessageInfo(Metadata$ActivityPeriod.DEFAULT_INSTANCE, "\x01\x03\xff\x02\xff\x02\x01\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02", objArray);
           case 3:
             return new Metadata$ActivityPeriod();
           case 4:
             return new h40(p2);
           case 5:
             return Metadata$ActivityPeriod.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$ActivityPeriod.PARSER) == null) {
                _monitor_enter(Metadata$ActivityPeriod.class);
                if ((pARSER = Metadata$ActivityPeriod.PARSER) == null) {
                   pARSER = new ii2(Metadata$ActivityPeriod.DEFAULT_INSTANCE);
                   Metadata$ActivityPeriod.PARSER = pARSER;
                }
                _monitor_exit(Metadata$ActivityPeriod.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
