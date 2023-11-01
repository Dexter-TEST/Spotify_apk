package com.spotify.allboarding.model.v1.proto.SquircleShow;
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
import p.gk1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.allboarding.model.v1.proto.NullableString;
import p.r74;
import com.google.protobuf.b;

public final class SquircleShow extends c implements u74	// class@000522 from classes.dex
{
    private int expansionLimit_;
    private NullableString imageUrl_;
    private Logging logging_;
    private NullableString moreUrl_;
    private bc3 relatedItems_;
    private boolean selected_;
    private boolean shouldFollowUponSelection_;
    private NullableString subtitle_;
    private bc3 tagUris_;
    private String text_;
    private String uri_;
    private static final SquircleShow DEFAULT_INSTANCE;
    public static final int EXPANSION_LIMIT_FIELD_NUMBER;
    public static final int IMAGE_URL_FIELD_NUMBER;
    public static final int LOGGING_FIELD_NUMBER;
    public static final int MORE_URL_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int RELATED_ITEMS_FIELD_NUMBER;
    public static final int SELECTED_FIELD_NUMBER;
    public static final int SHOULD_FOLLOW_UPON_SELECTION_FIELD_NUMBER;
    public static final int SUBTITLE_FIELD_NUMBER;
    public static final int TAG_URIS_FIELD_NUMBER;
    public static final int TEXT_FIELD_NUMBER;
    public static final int URI_FIELD_NUMBER;

    static {
       SquircleShow squircleShow = new SquircleShow();
       SquircleShow.DEFAULT_INSTANCE = squircleShow;
       c.registerDefaultInstance(SquircleShow.class, squircleShow);
    }
    private void SquircleShow(){
       super();
       this.uri_ = "";
       this.text_ = "";
       this.relatedItems_ = c.emptyProtobufList();
       this.tagUris_ = c.emptyProtobufList();
    }
    public static SquircleShow e(){
       return SquircleShow.DEFAULT_INSTANCE;
    }
    public static SquircleShow f(){
       return SquircleShow.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return SquircleShow.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[12];
             objArray[0] = "uri_";
             objArray[b] = "text_";
             objArray[2] = "selected_";
             objArray[3] = "relatedItems_";
             objArray[4] = SquircleShow.class;
             objArray[5] = "moreUrl_";
             objArray[6] = "imageUrl_";
             objArray[7] = "logging_";
             objArray[8] = "expansionLimit_";
             objArray[9] = "tagUris_";
             objArray[10] = "subtitle_";
             objArray[11] = "shouldFollowUponSelection_";
             return c.newMessageInfo(SquircleShow.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x0b\xff\x02\xff\x02\xff\x02\xff\x02\x01\x0b\x0b\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x07\x04\x1b\x05\t\x06\t\x07\t\b\x04\t\x02\x02\n\t\x0b\x07", objArray);
           case 3:
             return new SquircleShow();
           case 4:
             return new cl1(p2);
           case 5:
             return SquircleShow.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = SquircleShow.PARSER) == null) {
                _monitor_enter(SquircleShow.class);
                if ((pARSER = SquircleShow.PARSER) == null) {
                   pARSER = new ii2(SquircleShow.DEFAULT_INSTANCE);
                   SquircleShow.PARSER = pARSER;
                }
                _monitor_exit(SquircleShow.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final int g(){
       return this.expansionLimit_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final NullableString h(){
       SquircleShow timageUrl_;
       if ((timageUrl_ = this.imageUrl_) == null) {
          timageUrl_ = NullableString.f();
       }
       return timageUrl_;
    }
    public final NullableString i(){
       SquircleShow tmoreUrl_;
       if ((tmoreUrl_ = this.moreUrl_) == null) {
          tmoreUrl_ = NullableString.f();
       }
       return tmoreUrl_;
    }
    public final bc3 j(){
       return this.relatedItems_;
    }
    public final boolean k(){
       return this.selected_;
    }
    public final boolean l(){
       return this.shouldFollowUponSelection_;
    }
    public final NullableString m(){
       SquircleShow tsubtitle_;
       if ((tsubtitle_ = this.subtitle_) == null) {
          tsubtitle_ = NullableString.f();
       }
       return tsubtitle_;
    }
    public final bc3 n(){
       return this.tagUris_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final String o(){
       return this.text_;
    }
    public final String p(){
       return this.uri_;
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
