package com.spotify.metadata.proto.Metadata$AudioFile;
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
import p.r30;
import p.h84;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class Metadata$AudioFile extends c implements u74	// class@000a66 from classes.dex
{
    private int bitField0_;
    private i80 fileId_;
    private int format_;
    private static final Metadata$AudioFile DEFAULT_INSTANCE;
    public static final int FILE_ID_FIELD_NUMBER;
    public static final int FORMAT_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       Metadata$AudioFile uAudioFile = new Metadata$AudioFile();
       Metadata$AudioFile.DEFAULT_INSTANCE = uAudioFile;
       c.registerDefaultInstance(Metadata$AudioFile.class, uAudioFile);
    }
    private void Metadata$AudioFile(){
       super();
       this.fileId_ = i80.b;
    }
    public static Metadata$AudioFile e(){
       return Metadata$AudioFile.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$AudioFile.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","fileId_","format_",h84.a};
             return c.newMessageInfo(Metadata$AudioFile.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01", objArray);
           case 3:
             return new Metadata$AudioFile();
           case 4:
             return new h40(p2);
           case 5:
             return Metadata$AudioFile.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$AudioFile.PARSER) == null) {
                _monitor_enter(Metadata$AudioFile.class);
                if ((pARSER = Metadata$AudioFile.PARSER) == null) {
                   pARSER = new ii2(Metadata$AudioFile.DEFAULT_INSTANCE);
                   Metadata$AudioFile.PARSER = pARSER;
                }
                _monitor_exit(Metadata$AudioFile.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final i80 f(){
       return this.fileId_;
    }
    public final boolean g(){
       int i = 1;
       if ((this.bitField0_ & i)) {
       }else {
          i = false;
       }
       return i;
    }
}
