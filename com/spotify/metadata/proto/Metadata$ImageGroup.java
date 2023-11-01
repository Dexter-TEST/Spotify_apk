package com.spotify.metadata.proto.Metadata$ImageGroup;
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
import com.spotify.metadata.proto.Metadata$Image;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import java.util.List;

public final class Metadata$ImageGroup extends c implements u74	// class@000a70 from classes.dex
{
    private bc3 image_;
    private static final Metadata$ImageGroup DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       Metadata$ImageGroup imageGroup = new Metadata$ImageGroup();
       Metadata$ImageGroup.DEFAULT_INSTANCE = imageGroup;
       c.registerDefaultInstance(Metadata$ImageGroup.class, imageGroup);
    }
    private void Metadata$ImageGroup(){
       super();
       this.image_ = c.emptyProtobufList();
    }
    public static Metadata$ImageGroup e(){
       return Metadata$ImageGroup.DEFAULT_INSTANCE;
    }
    public static Metadata$ImageGroup f(){
       return Metadata$ImageGroup.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$ImageGroup.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"image_",Metadata$Image.class};
             return c.newMessageInfo(Metadata$ImageGroup.DEFAULT_INSTANCE, "\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b", objArray);
           case 3:
             return new Metadata$ImageGroup();
           case 4:
             return new sq1(8);
           case 5:
             return Metadata$ImageGroup.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$ImageGroup.PARSER) == null) {
                _monitor_enter(Metadata$ImageGroup.class);
                if ((pARSER = Metadata$ImageGroup.PARSER) == null) {
                   pARSER = new ii2(Metadata$ImageGroup.DEFAULT_INSTANCE);
                   Metadata$ImageGroup.PARSER = pARSER;
                }
                _monitor_exit(Metadata$ImageGroup.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final Metadata$Image g(){
       return this.image_.get(0);
    }
    public final int h(){
       return this.image_.size();
    }
    public final bc3 i(){
       return this.image_;
    }
}
