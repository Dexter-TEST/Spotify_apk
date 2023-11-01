package com.spotify.metadata.proto.Metadata$Copyright;
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
import p.j84;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class Metadata$Copyright extends c implements u74	// class@000a6a from classes.dex
{
    private int bitField0_;
    private String text_;
    private int type_;
    private static final Metadata$Copyright DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int TEXT_FIELD_NUMBER;
    public static final int TYPE_FIELD_NUMBER;

    static {
       Metadata$Copyright uCopyright = new Metadata$Copyright();
       Metadata$Copyright.DEFAULT_INSTANCE = uCopyright;
       c.registerDefaultInstance(Metadata$Copyright.class, uCopyright);
    }
    private void Metadata$Copyright(){
       super();
       this.text_ = "";
    }
    public static Metadata$Copyright e(){
       return Metadata$Copyright.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$Copyright.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       int i = 2;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[]{"bitField0_","type_",j84.a,"text_"};
             return c.newMessageInfo(Metadata$Copyright.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01", objArray);
           case 3:
             return new Metadata$Copyright();
           case 4:
             return new sq1(i);
           case 5:
             return Metadata$Copyright.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$Copyright.PARSER) == null) {
                _monitor_enter(Metadata$Copyright.class);
                if ((pARSER = Metadata$Copyright.PARSER) == null) {
                   pARSER = new ii2(Metadata$Copyright.DEFAULT_INSTANCE);
                   Metadata$Copyright.PARSER = pARSER;
                }
                _monitor_exit(Metadata$Copyright.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
