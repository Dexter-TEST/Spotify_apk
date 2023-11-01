package com.spotify.searchview.proto.BannerContent;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.fq1;
import p.wp1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class BannerContent extends c implements u74	// class@000c09 from classes.dex
{
    private String buttonTitle_;
    private String description_;
    private String id_;
    private String navigationUrl_;
    private String title_;
    public static final int BUTTON_TITLE_FIELD_NUMBER = 4;
    private static final BannerContent DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER;
    public static final int ID_FIELD_NUMBER;
    public static final int NAVIGATION_URL_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int TITLE_FIELD_NUMBER;

    static {
       BannerContent uBannerConte = new BannerContent();
       BannerContent.DEFAULT_INSTANCE = uBannerConte;
       c.registerDefaultInstance(BannerContent.class, uBannerConte);
    }
    private void BannerContent(){
       super();
       this.id_ = "";
       this.title_ = "";
       this.description_ = "";
       this.buttonTitle_ = "";
       this.navigationUrl_ = "";
    }
    public static BannerContent e(){
       return BannerContent.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return BannerContent.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"id_","title_","description_","buttonTitle_","navigationUrl_"};
             return c.newMessageInfo(BannerContent.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x02\x02\x05\x02\x02", objArray);
           case 3:
             return new BannerContent();
           case 4:
             return new fq1(p2);
           case 5:
             return BannerContent.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = BannerContent.PARSER) == null) {
                _monitor_enter(BannerContent.class);
                if ((pARSER = BannerContent.PARSER) == null) {
                   pARSER = new ii2(BannerContent.DEFAULT_INSTANCE);
                   BannerContent.PARSER = pARSER;
                }
                _monitor_exit(BannerContent.class);
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
