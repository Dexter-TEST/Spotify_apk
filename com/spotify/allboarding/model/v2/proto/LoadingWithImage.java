package com.spotify.allboarding.model.v2.proto.LoadingWithImage;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.cl1;
import p.ek1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class LoadingWithImage extends c implements u74	// class@00052b from classes.dex
{
    private String imageUrl_;
    private String subtitle_;
    private String title_;
    private static final LoadingWithImage DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SUBTITLE_FIELD_NUMBER;
    public static final int TITLE_FIELD_NUMBER;

    static {
       LoadingWithImage loadingWithI = new LoadingWithImage();
       LoadingWithImage.DEFAULT_INSTANCE = loadingWithI;
       c.registerDefaultInstance(LoadingWithImage.class, loadingWithI);
    }
    private void LoadingWithImage(){
       super();
       this.title_ = "";
       this.subtitle_ = "";
       this.imageUrl_ = "";
    }
    public static LoadingWithImage e(){
       return LoadingWithImage.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return LoadingWithImage.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"title_","subtitle_","imageUrl_"};
             return c.newMessageInfo(LoadingWithImage.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02", objArray);
           case 3:
             return new LoadingWithImage();
           case 4:
             return new cl1(p2);
           case 5:
             return LoadingWithImage.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LoadingWithImage.PARSER) == null) {
                _monitor_enter(LoadingWithImage.class);
                if ((pARSER = LoadingWithImage.PARSER) == null) {
                   pARSER = new ii2(LoadingWithImage.DEFAULT_INSTANCE);
                   LoadingWithImage.PARSER = pARSER;
                }
                _monitor_exit(LoadingWithImage.class);
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
