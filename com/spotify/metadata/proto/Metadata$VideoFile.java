package com.spotify.metadata.proto.Metadata$VideoFile;
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

public final class Metadata$VideoFile extends c implements u74	// class@000a77 from classes.dex
{
    private int bitField0_;
    private i80 fileId_;
    private static final Metadata$VideoFile DEFAULT_INSTANCE;
    public static final int FILE_ID_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       Metadata$VideoFile videoFile = new Metadata$VideoFile();
       Metadata$VideoFile.DEFAULT_INSTANCE = videoFile;
       c.registerDefaultInstance(Metadata$VideoFile.class, videoFile);
    }
    private void Metadata$VideoFile(){
       super();
       this.fileId_ = i80.b;
    }
    public static Metadata$VideoFile e(){
       return Metadata$VideoFile.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$VideoFile.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","fileId_"};
             return c.newMessageInfo(Metadata$VideoFile.DEFAULT_INSTANCE, "\x01\x01\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new Metadata$VideoFile();
           case 4:
             return new sq1(15);
           case 5:
             return Metadata$VideoFile.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$VideoFile.PARSER) == null) {
                _monitor_enter(Metadata$VideoFile.class);
                if ((pARSER = Metadata$VideoFile.PARSER) == null) {
                   pARSER = new ii2(Metadata$VideoFile.DEFAULT_INSTANCE);
                   Metadata$VideoFile.PARSER = pARSER;
                }
                _monitor_exit(Metadata$VideoFile.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
