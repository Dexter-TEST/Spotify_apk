package com.spotify.metadata.proto.Metadata$Licensor;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
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

public final class Metadata$Licensor extends c implements u74	// class@000a71 from classes.dex
{
    private int bitField0_;
    private i80 uuid_;
    private static final Metadata$Licensor DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int UUID_FIELD_NUMBER;

    static {
       Metadata$Licensor licensor = new Metadata$Licensor();
       Metadata$Licensor.DEFAULT_INSTANCE = licensor;
       c.registerDefaultInstance(Metadata$Licensor.class, licensor);
    }
    private void Metadata$Licensor(){
       super();
       this.uuid_ = i80.b;
    }
    public static Metadata$Licensor e(){
       return Metadata$Licensor.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$Licensor.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","uuid_"};
             return c.newMessageInfo(Metadata$Licensor.DEFAULT_INSTANCE, "\x01\x01\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new Metadata$Licensor();
           case 4:
             return new sq1(9);
           case 5:
             return Metadata$Licensor.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$Licensor.PARSER) == null) {
                _monitor_enter(Metadata$Licensor.class);
                if ((pARSER = Metadata$Licensor.PARSER) == null) {
                   pARSER = new ii2(Metadata$Licensor.DEFAULT_INSTANCE);
                   Metadata$Licensor.PARSER = pARSER;
                }
                _monitor_exit(Metadata$Licensor.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
