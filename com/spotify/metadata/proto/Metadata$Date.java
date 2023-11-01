package com.spotify.metadata.proto.Metadata$Date;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
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

public final class Metadata$Date extends c implements u74	// class@000a6b from classes.dex
{
    private int bitField0_;
    private int day_;
    private int hour_;
    private int minute_;
    private int month_;
    private int year_;
    public static final int DAY_FIELD_NUMBER = 3;
    private static final Metadata$Date DEFAULT_INSTANCE;
    public static final int HOUR_FIELD_NUMBER;
    public static final int MINUTE_FIELD_NUMBER;
    public static final int MONTH_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int YEAR_FIELD_NUMBER;

    static {
       Metadata$Date uDate = new Metadata$Date();
       Metadata$Date.DEFAULT_INSTANCE = uDate;
       c.registerDefaultInstance(Metadata$Date.class, uDate);
    }
    private void Metadata$Date(){
       super();
    }
    public static Metadata$Date e(){
       return Metadata$Date.DEFAULT_INSTANCE;
    }
    public static Metadata$Date g(){
       return Metadata$Date.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$Date.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       int i = 3;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[]{"bitField0_","year_","month_","day_","hour_","minute_"};
             return c.newMessageInfo(Metadata$Date.DEFAULT_INSTANCE, "\x01\x05\xff\x02\xff\x02\x01\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03\x05\x10\x02\x04", objArray);
           case 3:
             return new Metadata$Date();
           case 4:
             return new sq1(i);
           case 5:
             return Metadata$Date.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$Date.PARSER) == null) {
                _monitor_enter(Metadata$Date.class);
                if ((pARSER = Metadata$Date.PARSER) == null) {
                   pARSER = new ii2(Metadata$Date.DEFAULT_INSTANCE);
                   Metadata$Date.PARSER = pARSER;
                }
                _monitor_exit(Metadata$Date.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final int f(){
       return this.day_;
    }
    public final int h(){
       return this.hour_;
    }
    public final int i(){
       return this.minute_;
    }
    public final int j(){
       return this.month_;
    }
    public final int k(){
       return this.year_;
    }
    public final boolean l(){
       boolean b = ((this.bitField0_ & 0x04))? true: false;
       return b;
    }
    public final boolean m(){
       boolean b = ((this.bitField0_ & 0x08))? true: false;
       return b;
    }
    public final boolean n(){
       boolean b = ((this.bitField0_ & 0x10))? true: false;
       return b;
    }
    public final boolean o(){
       boolean b = ((this.bitField0_ & 0x02))? true: false;
       return b;
    }
    public final boolean p(){
       int i = 1;
       if ((this.bitField0_ & i)) {
       }else {
          i = false;
       }
       return i;
    }
}
