package com.spotify.metadata.proto.Metadata$Biography;
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
import com.spotify.metadata.proto.Metadata$ImageGroup;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class Metadata$Biography extends c implements u74	// class@000a68 from classes.dex
{
    private int bitField0_;
    private bc3 portraitGroup_;
    private bc3 portrait_;
    private String text_;
    private static final Metadata$Biography DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int PORTRAIT_FIELD_NUMBER;
    public static final int PORTRAIT_GROUP_FIELD_NUMBER;
    public static final int TEXT_FIELD_NUMBER;

    static {
       Metadata$Biography uBiography = new Metadata$Biography();
       Metadata$Biography.DEFAULT_INSTANCE = uBiography;
       c.registerDefaultInstance(Metadata$Biography.class, uBiography);
    }
    private void Metadata$Biography(){
       super();
       this.text_ = "";
       this.portrait_ = c.emptyProtobufList();
       this.portraitGroup_ = c.emptyProtobufList();
    }
    public static Metadata$Biography e(){
       return Metadata$Biography.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$Biography.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       int i = 0;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[]{"bitField0_","text_","portrait_",Metadata$Image.class,"portraitGroup_",Metadata$ImageGroup.class};
             return c.newMessageInfo(Metadata$Biography.DEFAULT_INSTANCE, "\x01\x03\xff\x02\xff\x02\x01\x01\x03\x03\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x1b\x03\x1b", objArray);
           case 3:
             return new Metadata$Biography();
           case 4:
             return new sq1(i);
           case 5:
             return Metadata$Biography.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$Biography.PARSER) == null) {
                _monitor_enter(Metadata$Biography.class);
                if ((pARSER = Metadata$Biography.PARSER) == null) {
                   pARSER = new ii2(Metadata$Biography.DEFAULT_INSTANCE);
                   Metadata$Biography.PARSER = pARSER;
                }
                _monitor_exit(Metadata$Biography.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
