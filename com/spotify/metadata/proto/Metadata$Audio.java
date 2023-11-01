package com.spotify.metadata.proto.Metadata$Audio;
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
import p.h40;
import p.a40;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class Metadata$Audio extends c implements u74	// class@000a65 from classes.dex
{
    private int bitField0_;
    private i80 uuid_;
    private static final Metadata$Audio DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int UUID_FIELD_NUMBER;

    static {
       Metadata$Audio uAudio = new Metadata$Audio();
       Metadata$Audio.DEFAULT_INSTANCE = uAudio;
       c.registerDefaultInstance(Metadata$Audio.class, uAudio);
    }
    private void Metadata$Audio(){
       super();
       this.uuid_ = i80.b;
    }
    public static Metadata$Audio e(){
       return Metadata$Audio.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$Audio.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","uuid_"};
             return c.newMessageInfo(Metadata$Audio.DEFAULT_INSTANCE, "\x01\x01\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new Metadata$Audio();
           case 4:
             return new h40(p2);
           case 5:
             return Metadata$Audio.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$Audio.PARSER) == null) {
                _monitor_enter(Metadata$Audio.class);
                if ((pARSER = Metadata$Audio.PARSER) == null) {
                   pARSER = new ii2(Metadata$Audio.DEFAULT_INSTANCE);
                   Metadata$Audio.PARSER = pARSER;
                }
                _monitor_exit(Metadata$Audio.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
