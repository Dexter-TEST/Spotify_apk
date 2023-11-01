package com.spotify.metadata.cosmos.proto.MetadataCosmos$MultiResponse;
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
import p.h40;
import p.y30;
import com.spotify.metadata.cosmos.proto.MetadataCosmos$MetadataItem;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import java.util.List;

public final class MetadataCosmos$MultiResponse extends c implements u74	// class@000a5f from classes.dex
{
    private bc3 items_;
    private static final MetadataCosmos$MultiResponse DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       MetadataCosmos$MultiResponse multiRespons = new MetadataCosmos$MultiResponse();
       MetadataCosmos$MultiResponse.DEFAULT_INSTANCE = multiRespons;
       c.registerDefaultInstance(MetadataCosmos$MultiResponse.class, multiRespons);
    }
    private void MetadataCosmos$MultiResponse(){
       super();
       this.items_ = c.emptyProtobufList();
    }
    public static MetadataCosmos$MultiResponse e(){
       return MetadataCosmos$MultiResponse.DEFAULT_INSTANCE;
    }
    public static MetadataCosmos$MultiResponse h(byte[] p0){
       return c.parseFrom(MetadataCosmos$MultiResponse.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return MetadataCosmos$MultiResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"items_",MetadataCosmos$MetadataItem.class};
             return c.newMessageInfo(MetadataCosmos$MultiResponse.DEFAULT_INSTANCE, "\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b", objArray);
           case 3:
             return new MetadataCosmos$MultiResponse();
           case 4:
             return new h40(p2);
           case 5:
             return MetadataCosmos$MultiResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = MetadataCosmos$MultiResponse.PARSER) == null) {
                _monitor_enter(MetadataCosmos$MultiResponse.class);
                if ((pARSER = MetadataCosmos$MultiResponse.PARSER) == null) {
                   pARSER = new ii2(MetadataCosmos$MultiResponse.DEFAULT_INSTANCE);
                   MetadataCosmos$MultiResponse.PARSER = pARSER;
                }
                _monitor_exit(MetadataCosmos$MultiResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final int f(){
       return this.items_.size();
    }
    public final bc3 g(){
       return this.items_;
    }
}
