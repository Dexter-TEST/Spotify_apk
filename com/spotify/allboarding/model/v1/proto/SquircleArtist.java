package com.spotify.allboarding.model.v1.proto.SquircleArtist;
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
import p.mk1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.allboarding.model.v1.proto.NullableString;
import p.r74;
import com.google.protobuf.b;

public final class SquircleArtist extends c implements u74	// class@000520 from classes.dex
{
    private int expansionLimit_;
    private NullableString imageUrl_;
    private Logging logging_;
    private NullableString moreUrl_;
    private bc3 relatedItems_;
    private boolean selected_;
    private boolean shouldFollowUponSelection_;
    private bc3 tagUris_;
    private String text_;
    private String uri_;
    private static final SquircleArtist DEFAULT_INSTANCE;
    public static final int EXPANSION_LIMIT_FIELD_NUMBER;
    public static final int IMAGE_URL_FIELD_NUMBER;
    public static final int LOGGING_FIELD_NUMBER;
    public static final int MORE_URL_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int RELATED_ITEMS_FIELD_NUMBER;
    public static final int SELECTED_FIELD_NUMBER;
    public static final int SHOULD_FOLLOW_UPON_SELECTION_FIELD_NUMBER;
    public static final int TAG_URIS_FIELD_NUMBER;
    public static final int TEXT_FIELD_NUMBER;
    public static final int URI_FIELD_NUMBER;

    static {
       SquircleArtist squircleArti = new SquircleArtist();
       SquircleArtist.DEFAULT_INSTANCE = squircleArti;
       c.registerDefaultInstance(SquircleArtist.class, squircleArti);
    }
    private void SquircleArtist(){
       super();
       this.uri_ = "";
       this.text_ = "";
       this.relatedItems_ = c.emptyProtobufList();
       this.tagUris_ = c.emptyProtobufList();
    }
    public static SquircleArtist e(){
       return SquircleArtist.DEFAULT_INSTANCE;
    }
    public static SquircleArtist f(){
       return SquircleArtist.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return SquircleArtist.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[11];
             objArray[0] = "uri_";
             objArray[b] = "text_";
             objArray[2] = "selected_";
             objArray[3] = "relatedItems_";
             objArray[4] = SquircleArtist.class;
             objArray[5] = "moreUrl_";
             objArray[6] = "imageUrl_";
             objArray[7] = "logging_";
             objArray[8] = "expansionLimit_";
             objArray[9] = "tagUris_";
             objArray[10] = "shouldFollowUponSelection_";
             return c.newMessageInfo(SquircleArtist.DEFAULT_INSTANCE, "\xff\x02\xff\x02\n\xff\x02\xff\x02\xff\x02\xff\x02\x01\n\n\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x07\x04\x1b\x05\t\x06\t\x07\t\b\x04\t\x02\x02\n\x07", objArray);
           case 3:
             return new SquircleArtist();
           case 4:
             return new cl1(p2);
           case 5:
             return SquircleArtist.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = SquircleArtist.PARSER) == null) {
                _monitor_enter(SquircleArtist.class);
                if ((pARSER = SquircleArtist.PARSER) == null) {
                   pARSER = new ii2(SquircleArtist.DEFAULT_INSTANCE);
                   SquircleArtist.PARSER = pARSER;
                }
                _monitor_exit(SquircleArtist.class);
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
       SquircleArtist timageUrl_;
       if ((timageUrl_ = this.imageUrl_) == null) {
          timageUrl_ = NullableString.f();
       }
       return timageUrl_;
    }
    public final NullableString i(){
       SquircleArtist tmoreUrl_;
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
    public final bc3 m(){
       return this.tagUris_;
    }
    public final String n(){
       return this.text_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final String o(){
       return this.uri_;
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
