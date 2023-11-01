package com.spotify.share.linkgeneration.proto.LinkPreview;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.q04;
import p.h04;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class LinkPreview extends c implements u74	// class@000c20 from classes.dex
{
    private int bitField0_;
    private String description_;
    private String imageUrl_;
    private String title_;
    private static final LinkPreview DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER;
    public static final int IMAGE_URL_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int TITLE_FIELD_NUMBER;

    static {
       LinkPreview linkPreview = new LinkPreview();
       LinkPreview.DEFAULT_INSTANCE = linkPreview;
       c.registerDefaultInstance(LinkPreview.class, linkPreview);
    }
    private void LinkPreview(){
       super();
       this.title_ = "";
       this.description_ = "";
       this.imageUrl_ = "";
    }
    public static LinkPreview e(){
       return LinkPreview.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return LinkPreview.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","title_","description_","imageUrl_"};
             return c.newMessageInfo(LinkPreview.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\x01\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x12\x02\xff\x02\xff\x02\x02\x12\x02\x01\x03\x12\x02\x02", objArray);
           case 3:
             return new LinkPreview();
           case 4:
             return new q04(p2);
           case 5:
             return LinkPreview.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LinkPreview.PARSER) == null) {
                _monitor_enter(LinkPreview.class);
                if ((pARSER = LinkPreview.PARSER) == null) {
                   pARSER = new ii2(LinkPreview.DEFAULT_INSTANCE);
                   LinkPreview.PARSER = pARSER;
                }
                _monitor_exit(LinkPreview.class);
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
