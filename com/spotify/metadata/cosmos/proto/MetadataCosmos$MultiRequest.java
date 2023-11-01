package com.spotify.metadata.cosmos.proto.MetadataCosmos$MultiRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import java.lang.String;
import java.lang.Object;
import p.f2;
import java.util.List;
import p.d94;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;

public final class MetadataCosmos$MultiRequest extends c implements u74	// class@000a5e from classes.dex
{
    private bc3 uris_;
    private static final MetadataCosmos$MultiRequest DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int URIS_FIELD_NUMBER;

    static {
       MetadataCosmos$MultiRequest multiRequest = new MetadataCosmos$MultiRequest();
       MetadataCosmos$MultiRequest.DEFAULT_INSTANCE = multiRequest;
       c.registerDefaultInstance(MetadataCosmos$MultiRequest.class, multiRequest);
    }
    private void MetadataCosmos$MultiRequest(){
       super();
       this.uris_ = c.emptyProtobufList();
    }
    public static void e(MetadataCosmos$MultiRequest p0,String p1){
       p0.getClass();
       p1.getClass();
       MetadataCosmos$MultiRequest uris_ = p0.uris_;
       if (uris_.a == null) {
          p0.uris_ = c.mutableCopy(uris_);
       }
       p0.uris_.add(p1);
       return;
    }
    public static MetadataCosmos$MultiRequest f(){
       return MetadataCosmos$MultiRequest.DEFAULT_INSTANCE;
    }
    public static d94 g(){
       return MetadataCosmos$MultiRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return MetadataCosmos$MultiRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[b];
             objArray[0] = "uris_";
             return c.newMessageInfo(MetadataCosmos$MultiRequest.DEFAULT_INSTANCE, "\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1a", objArray);
           case 3:
             return new MetadataCosmos$MultiRequest();
           case 4:
             return new d94();
           case 5:
             return MetadataCosmos$MultiRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = MetadataCosmos$MultiRequest.PARSER) == null) {
                _monitor_enter(MetadataCosmos$MultiRequest.class);
                if ((pARSER = MetadataCosmos$MultiRequest.PARSER) == null) {
                   pARSER = new ii2(MetadataCosmos$MultiRequest.DEFAULT_INSTANCE);
                   MetadataCosmos$MultiRequest.PARSER = pARSER;
                }
                _monitor_exit(MetadataCosmos$MultiRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
