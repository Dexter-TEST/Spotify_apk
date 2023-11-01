package com.spotify.metadata.proto.Metadata$Disc;
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
import com.spotify.metadata.proto.Metadata$Track;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class Metadata$Disc extends c implements u74	// class@000a6c from classes.dex
{
    private int bitField0_;
    private String name_;
    private int number_;
    private bc3 track_;
    private static final Metadata$Disc DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER;
    public static final int NUMBER_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int TRACK_FIELD_NUMBER;

    static {
       Metadata$Disc uDisc = new Metadata$Disc();
       Metadata$Disc.DEFAULT_INSTANCE = uDisc;
       c.registerDefaultInstance(Metadata$Disc.class, uDisc);
    }
    private void Metadata$Disc(){
       super();
       this.name_ = "";
       this.track_ = c.emptyProtobufList();
    }
    public static Metadata$Disc e(){
       return Metadata$Disc.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$Disc.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       int i = 4;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[]{"bitField0_","number_","name_","track_",Metadata$Track.class};
             return c.newMessageInfo(Metadata$Disc.DEFAULT_INSTANCE, "\x01\x03\xff\x02\xff\x02\x01\x01\x03\x03\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x1b", objArray);
           case 3:
             return new Metadata$Disc();
           case 4:
             return new sq1(i);
           case 5:
             return Metadata$Disc.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$Disc.PARSER) == null) {
                _monitor_enter(Metadata$Disc.class);
                if ((pARSER = Metadata$Disc.PARSER) == null) {
                   pARSER = new ii2(Metadata$Disc.DEFAULT_INSTANCE);
                   Metadata$Disc.PARSER = pARSER;
                }
                _monitor_exit(Metadata$Disc.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
