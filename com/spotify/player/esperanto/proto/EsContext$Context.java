package com.spotify.player.esperanto.proto.EsContext$Context;
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
import com.spotify.player.esperanto.proto.EsRestrictions$Restrictions;
import java.lang.Object;
import java.lang.String;
import p.xo1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.player.esperanto.proto.EsContextPage$ContextPage;
import p.yo1;
import p.s74;
import java.lang.Byte;

public final class EsContext$Context extends c implements u74	// class@000aee from classes.dex
{
    private boolean isLoading_;
    private g14 metadata_;
    private bc3 pages_;
    private EsRestrictions$Restrictions restrictions_;
    private String uri_;
    private String url_;
    private static final EsContext$Context DEFAULT_INSTANCE;
    public static final int IS_LOADING_FIELD_NUMBER;
    public static final int METADATA_FIELD_NUMBER;
    public static final int PAGES_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int RESTRICTIONS_FIELD_NUMBER;
    public static final int URI_FIELD_NUMBER;
    public static final int URL_FIELD_NUMBER;

    static {
       EsContext$Context uContext = new EsContext$Context();
       EsContext$Context.DEFAULT_INSTANCE = uContext;
       c.registerDefaultInstance(EsContext$Context.class, uContext);
    }
    private void EsContext$Context(){
       super();
       this.metadata_ = g14.b;
       this.pages_ = c.emptyProtobufList();
       this.uri_ = "";
       this.url_ = "";
    }
    public static void e(EsContext$Context p0,ArrayList p1){
       EsContext$Context pages_ = p0.pages_;
       if (pages_.a == null) {
          p0.pages_ = c.mutableCopy(pages_);
       }
       a.addAll(p1, p0.pages_);
       return;
    }
    public static g14 f(EsContext$Context p0){
       EsContext$Context metadata_ = p0.metadata_;
       if (metadata_.a == null) {
          p0.metadata_ = metadata_.d();
       }
       return p0.metadata_;
    }
    public static void g(EsContext$Context p0,boolean p1){
       p0.isLoading_ = p1;
    }
    public static void h(EsContext$Context p0,EsRestrictions$Restrictions p1){
       p0.getClass();
       p0.restrictions_ = p1;
    }
    public static void i(EsContext$Context p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.uri_ = p1;
    }
    public static void j(EsContext$Context p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.url_ = p1;
    }
    public static EsContext$Context k(){
       return EsContext$Context.DEFAULT_INSTANCE;
    }
    public static xo1 l(){
       return EsContext$Context.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsContext$Context.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"pages_",EsContextPage$ContextPage.class,"metadata_",yo1.a,"uri_","url_","isLoading_","restrictions_"};
             return c.newMessageInfo(EsContext$Context.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\x01\x01\xff\x02\xff\x02\x01\x1b\x022\x03\x02\x02\x04\x02\x02\x05\x07\x06\t", objArray);
           case 3:
             return new EsContext$Context();
           case 4:
             return new xo1();
           case 5:
             return EsContext$Context.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsContext$Context.PARSER) == null) {
                _monitor_enter(EsContext$Context.class);
                if ((pARSER = EsContext$Context.PARSER) == null) {
                   pARSER = new ii2(EsContext$Context.DEFAULT_INSTANCE);
                   EsContext$Context.PARSER = pARSER;
                }
                _monitor_exit(EsContext$Context.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
