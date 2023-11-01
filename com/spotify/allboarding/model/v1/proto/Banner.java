package com.spotify.allboarding.model.v1.proto.Banner;
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
import p.cl1;
import p.et0;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Banner extends c implements u74	// class@000515 from classes.dex
{
    private String imageUrl_;
    private Logging logging_;
    private boolean selected_;
    private bc3 tagUris_;
    private String text_;
    private String uri_;
    private static final Banner DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER;
    public static final int LOGGING_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SELECTED_FIELD_NUMBER;
    public static final int TAG_URIS_FIELD_NUMBER;
    public static final int TEXT_FIELD_NUMBER;
    public static final int URI_FIELD_NUMBER;

    static {
       Banner uBanner = new Banner();
       Banner.DEFAULT_INSTANCE = uBanner;
       c.registerDefaultInstance(Banner.class, uBanner);
    }
    private void Banner(){
       super();
       this.uri_ = "";
       this.text_ = "";
       this.imageUrl_ = "";
       this.tagUris_ = c.emptyProtobufList();
    }
    public static Banner e(){
       return Banner.DEFAULT_INSTANCE;
    }
    public static Banner f(){
       return Banner.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Banner.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"uri_","text_","selected_","imageUrl_","logging_","tagUris_"};
             return c.newMessageInfo(Banner.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x07\x04\x02\x02\x05\t\x06\x02\x02", objArray);
           case 3:
             return new Banner();
           case 4:
             return new cl1(p2);
           case 5:
             return Banner.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Banner.PARSER) == null) {
                _monitor_enter(Banner.class);
                if ((pARSER = Banner.PARSER) == null) {
                   pARSER = new ii2(Banner.DEFAULT_INSTANCE);
                   Banner.PARSER = pARSER;
                }
                _monitor_exit(Banner.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String g(){
       return this.imageUrl_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final boolean h(){
       return this.selected_;
    }
    public final bc3 i(){
       return this.tagUris_;
    }
    public final String j(){
       return this.text_;
    }
    public final String k(){
       return this.uri_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
