package com.spotify.metadata.proto.Metadata$Image;
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
import p.n84;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class Metadata$Image extends c implements u74	// class@000a6f from classes.dex
{
    private int bitField0_;
    private i80 fileId_;
    private int height_;
    private int size_;
    private int width_;
    private static final Metadata$Image DEFAULT_INSTANCE;
    public static final int FILE_ID_FIELD_NUMBER;
    public static final int HEIGHT_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SIZE_FIELD_NUMBER;
    public static final int WIDTH_FIELD_NUMBER;

    static {
       Metadata$Image image = new Metadata$Image();
       Metadata$Image.DEFAULT_INSTANCE = image;
       c.registerDefaultInstance(Metadata$Image.class, image);
    }
    private void Metadata$Image(){
       super();
       this.fileId_ = i80.b;
    }
    public static Metadata$Image e(){
       return Metadata$Image.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$Image.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","fileId_","size_",n84.a,"width_","height_"};
             return c.newMessageInfo(Metadata$Image.DEFAULT_INSTANCE, "\x01\x04\xff\x02\xff\x02\x01\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03", objArray);
           case 3:
             return new Metadata$Image();
           case 4:
             return new sq1(7);
           case 5:
             return Metadata$Image.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$Image.PARSER) == null) {
                _monitor_enter(Metadata$Image.class);
                if ((pARSER = Metadata$Image.PARSER) == null) {
                   pARSER = new ii2(Metadata$Image.DEFAULT_INSTANCE);
                   Metadata$Image.PARSER = pARSER;
                }
                _monitor_exit(Metadata$Image.class);
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
    public final int g(){
       return this.height_;
    }
    public final int h(){
       return this.width_;
    }
    public final boolean i(){
       int i = 1;
       if ((this.bitField0_ & i)) {
       }else {
          i = false;
       }
       return i;
    }
}
