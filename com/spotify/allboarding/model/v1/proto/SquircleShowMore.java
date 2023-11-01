package com.spotify.allboarding.model.v1.proto.SquircleShowMore;
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
import p.hk1;
import com.spotify.allboarding.model.v1.proto.SquircleShow;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.allboarding.model.v1.proto.NullableString;
import p.r74;
import com.google.protobuf.b;

public final class SquircleShowMore extends c implements u74	// class@000523 from classes.dex
{
    private String color_;
    private int expansionLimit_;
    private Logging logging_;
    private NullableString moreUrl_;
    private bc3 relatedItems_;
    private bc3 tagUris_;
    private String text_;
    private String uri_;
    public static final int COLOR_FIELD_NUMBER = 5;
    private static final SquircleShowMore DEFAULT_INSTANCE;
    public static final int EXPANSION_LIMIT_FIELD_NUMBER;
    public static final int LOGGING_FIELD_NUMBER;
    public static final int MORE_URL_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int RELATED_ITEMS_FIELD_NUMBER;
    public static final int TAG_URIS_FIELD_NUMBER;
    public static final int TEXT_FIELD_NUMBER;
    public static final int URI_FIELD_NUMBER;

    static {
       SquircleShowMore squircleShow = new SquircleShowMore();
       SquircleShowMore.DEFAULT_INSTANCE = squircleShow;
       c.registerDefaultInstance(SquircleShowMore.class, squircleShow);
    }
    private void SquircleShowMore(){
       super();
       this.uri_ = "";
       this.text_ = "";
       this.relatedItems_ = c.emptyProtobufList();
       this.color_ = "";
       this.tagUris_ = c.emptyProtobufList();
    }
    public static SquircleShowMore e(){
       return SquircleShowMore.DEFAULT_INSTANCE;
    }
    public static SquircleShowMore g(){
       return SquircleShowMore.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return SquircleShowMore.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[9];
             objArray[0] = "uri_";
             objArray[b] = "text_";
             objArray[2] = "relatedItems_";
             objArray[3] = SquircleShow.class;
             objArray[4] = "moreUrl_";
             objArray[5] = "color_";
             objArray[6] = "logging_";
             objArray[7] = "expansionLimit_";
             objArray[8] = "tagUris_";
             return c.newMessageInfo(SquircleShowMore.DEFAULT_INSTANCE, "\xff\x02\xff\x02\b\xff\x02\xff\x02\xff\x02\xff\x02\x01\b\b\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x1b\x04\t\x05\x02\x02\x06\t\x07\x04\b\x02\x02", objArray);
           case 3:
             return new SquircleShowMore();
           case 4:
             return new cl1(p2);
           case 5:
             return SquircleShowMore.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = SquircleShowMore.PARSER) == null) {
                _monitor_enter(SquircleShowMore.class);
                if ((pARSER = SquircleShowMore.PARSER) == null) {
                   pARSER = new ii2(SquircleShowMore.DEFAULT_INSTANCE);
                   SquircleShowMore.PARSER = pARSER;
                }
                _monitor_exit(SquircleShowMore.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String f(){
       return this.color_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final int h(){
       return this.expansionLimit_;
    }
    public final NullableString i(){
       SquircleShowMore tmoreUrl_;
       if ((tmoreUrl_ = this.moreUrl_) == null) {
          tmoreUrl_ = NullableString.f();
       }
       return tmoreUrl_;
    }
    public final bc3 j(){
       return this.relatedItems_;
    }
    public final bc3 k(){
       return this.tagUris_;
    }
    public final String l(){
       return this.text_;
    }
    public final String m(){
       return this.uri_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
