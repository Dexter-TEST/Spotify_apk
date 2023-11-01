package com.spotify.player.esperanto.proto.EsContextPage$ContextPage;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import p.bc3;
import java.util.ArrayList;
import p.f2;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.a;
import java.lang.String;
import java.lang.Object;
import p.zo1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack;
import p.ap1;
import p.s74;
import java.lang.Byte;

public final class EsContextPage$ContextPage extends c implements u74	// class@000aef from classes.dex
{
    private boolean isLoading_;
    private g14 metadata_;
    private String nextPageUrl_;
    private String pageUrl_;
    private bc3 tracks_;
    private static final EsContextPage$ContextPage DEFAULT_INSTANCE;
    public static final int IS_LOADING_FIELD_NUMBER;
    public static final int METADATA_FIELD_NUMBER;
    public static final int NEXT_PAGE_URL_FIELD_NUMBER;
    public static final int PAGE_URL_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int TRACKS_FIELD_NUMBER;

    static {
       EsContextPage$ContextPage uContextPage = new EsContextPage$ContextPage();
       EsContextPage$ContextPage.DEFAULT_INSTANCE = uContextPage;
       c.registerDefaultInstance(EsContextPage$ContextPage.class, uContextPage);
    }
    private void EsContextPage$ContextPage(){
       super();
       this.metadata_ = g14.b;
       this.tracks_ = c.emptyProtobufList();
       this.pageUrl_ = "";
       this.nextPageUrl_ = "";
    }
    public static void e(EsContextPage$ContextPage p0,ArrayList p1){
       EsContextPage$ContextPage tracks_ = p0.tracks_;
       if (tracks_.a == null) {
          p0.tracks_ = c.mutableCopy(tracks_);
       }
       a.addAll(p1, p0.tracks_);
       return;
    }
    public static g14 f(EsContextPage$ContextPage p0){
       EsContextPage$ContextPage metadata_ = p0.metadata_;
       if (metadata_.a == null) {
          p0.metadata_ = metadata_.d();
       }
       return p0.metadata_;
    }
    public static void g(EsContextPage$ContextPage p0,boolean p1){
       p0.isLoading_ = p1;
    }
    public static void h(EsContextPage$ContextPage p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.nextPageUrl_ = p1;
    }
    public static void i(EsContextPage$ContextPage p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.pageUrl_ = p1;
    }
    public static EsContextPage$ContextPage j(){
       return EsContextPage$ContextPage.DEFAULT_INSTANCE;
    }
    public static zo1 k(){
       return EsContextPage$ContextPage.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsContextPage$ContextPage.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"tracks_",EsContextTrack$ContextTrack.class,"metadata_",ap1.a,"pageUrl_","nextPageUrl_","isLoading_"};
             return c.newMessageInfo(EsContextPage$ContextPage.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\x01\x01\xff\x02\xff\x02\x01\x1b\x022\x03\x02\x02\x04\x02\x02\x05\x07", objArray);
           case 3:
             return new EsContextPage$ContextPage();
           case 4:
             return new zo1();
           case 5:
             return EsContextPage$ContextPage.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsContextPage$ContextPage.PARSER) == null) {
                _monitor_enter(EsContextPage$ContextPage.class);
                if ((pARSER = EsContextPage$ContextPage.PARSER) == null) {
                   pARSER = new ii2(EsContextPage$ContextPage.DEFAULT_INSTANCE);
                   EsContextPage$ContextPage.PARSER = pARSER;
                }
                _monitor_exit(EsContextPage$ContextPage.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
