package com.spotify.metadata.proto.Metadata$ExternalId;
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

public final class Metadata$ExternalId extends c implements u74	// class@000a6e from classes.dex
{
    private int bitField0_;
    private String id_;
    private String type_;
    private static final Metadata$ExternalId DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int TYPE_FIELD_NUMBER;

    static {
       Metadata$ExternalId uExternalId = new Metadata$ExternalId();
       Metadata$ExternalId.DEFAULT_INSTANCE = uExternalId;
       c.registerDefaultInstance(Metadata$ExternalId.class, uExternalId);
    }
    private void Metadata$ExternalId(){
       super();
       this.type_ = "";
       this.id_ = "";
    }
    public static Metadata$ExternalId e(){
       return Metadata$ExternalId.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$ExternalId.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","type_","id_"};
             return c.newMessageInfo(Metadata$ExternalId.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01", objArray);
           case 3:
             return new Metadata$ExternalId();
           case 4:
             return new sq1(6);
           case 5:
             return Metadata$ExternalId.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$ExternalId.PARSER) == null) {
                _monitor_enter(Metadata$ExternalId.class);
                if ((pARSER = Metadata$ExternalId.PARSER) == null) {
                   pARSER = new ii2(Metadata$ExternalId.DEFAULT_INSTANCE);
                   Metadata$ExternalId.PARSER = pARSER;
                }
                _monitor_exit(Metadata$ExternalId.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
