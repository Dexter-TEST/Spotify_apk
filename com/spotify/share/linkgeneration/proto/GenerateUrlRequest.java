package com.spotify.share.linkgeneration.proto.GenerateUrlRequest;
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
import p.q04;
import p.o04;
import com.spotify.share.linkgeneration.proto.CustomData;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class GenerateUrlRequest extends c implements u74	// class@000c1f from classes.dex
{
    private int bitField0_;
    private bc3 customData_;
    private LinkPreview linkPreview_;
    private String spotifyUri_;
    private UtmParameters utmParameters_;
    public static final int CUSTOM_DATA_FIELD_NUMBER = 3;
    private static final GenerateUrlRequest DEFAULT_INSTANCE;
    public static final int LINK_PREVIEW_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SPOTIFY_URI_FIELD_NUMBER;
    public static final int UTM_PARAMETERS_FIELD_NUMBER;

    static {
       GenerateUrlRequest generateUrlR = new GenerateUrlRequest();
       GenerateUrlRequest.DEFAULT_INSTANCE = generateUrlR;
       c.registerDefaultInstance(GenerateUrlRequest.class, generateUrlR);
    }
    private void GenerateUrlRequest(){
       super();
       this.spotifyUri_ = "";
       this.customData_ = c.emptyProtobufList();
    }
    public static GenerateUrlRequest e(){
       return GenerateUrlRequest.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return GenerateUrlRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","spotifyUri_","utmParameters_","customData_",CustomData.class,"linkPreview_"};
             return c.newMessageInfo(GenerateUrlRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\x01\x01\x04\x04\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\t\x03\x1b\x04\x10\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new GenerateUrlRequest();
           case 4:
             return new q04(p2);
           case 5:
             return GenerateUrlRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = GenerateUrlRequest.PARSER) == null) {
                _monitor_enter(GenerateUrlRequest.class);
                if ((pARSER = GenerateUrlRequest.PARSER) == null) {
                   pARSER = new ii2(GenerateUrlRequest.DEFAULT_INSTANCE);
                   GenerateUrlRequest.PARSER = pARSER;
                }
                _monitor_exit(GenerateUrlRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
