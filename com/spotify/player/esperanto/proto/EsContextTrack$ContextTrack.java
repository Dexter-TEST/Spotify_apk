package com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import java.lang.String;
import java.lang.Object;
import p.jp1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.kp1;
import p.s74;
import java.lang.Byte;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Collections;

public final class EsContextTrack$ContextTrack extends c implements u74	// class@000af6 from classes.dex
{
    private g14 metadata_;
    private String uid_;
    private String uri_;
    private static final EsContextTrack$ContextTrack DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int UID_FIELD_NUMBER;
    public static final int URI_FIELD_NUMBER;

    static {
       EsContextTrack$ContextTrack uContextTrac = new EsContextTrack$ContextTrack();
       EsContextTrack$ContextTrack.DEFAULT_INSTANCE = uContextTrac;
       c.registerDefaultInstance(EsContextTrack$ContextTrack.class, uContextTrac);
    }
    private void EsContextTrack$ContextTrack(){
       super();
       this.metadata_ = g14.b;
       this.uri_ = "";
       this.uid_ = "";
    }
    public static g14 e(EsContextTrack$ContextTrack p0){
       EsContextTrack$ContextTrack metadata_ = p0.metadata_;
       if (metadata_.a == null) {
          p0.metadata_ = metadata_.d();
       }
       return p0.metadata_;
    }
    public static void f(EsContextTrack$ContextTrack p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.uid_ = p1;
    }
    public static void g(EsContextTrack$ContextTrack p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.uri_ = p1;
    }
    public static EsContextTrack$ContextTrack h(){
       return EsContextTrack$ContextTrack.DEFAULT_INSTANCE;
    }
    public static EsContextTrack$ContextTrack i(){
       return EsContextTrack$ContextTrack.DEFAULT_INSTANCE;
    }
    public static jp1 n(){
       return EsContextTrack$ContextTrack.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsContextTrack$ContextTrack.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"uri_","uid_","metadata_",kp1.a};
             return c.newMessageInfo(EsContextTrack$ContextTrack.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x032", objArray);
           case 3:
             return new EsContextTrack$ContextTrack();
           case 4:
             return new jp1();
           case 5:
             return EsContextTrack$ContextTrack.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsContextTrack$ContextTrack.PARSER) == null) {
                _monitor_enter(EsContextTrack$ContextTrack.class);
                if ((pARSER = EsContextTrack$ContextTrack.PARSER) == null) {
                   pARSER = new ii2(EsContextTrack$ContextTrack.DEFAULT_INSTANCE);
                   EsContextTrack$ContextTrack.PARSER = pARSER;
                }
                _monitor_exit(EsContextTrack$ContextTrack.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final int j(){
       return this.metadata_.size();
    }
    public final Map k(){
       return Collections.unmodifiableMap(this.metadata_);
    }
    public final String l(){
       return this.uid_;
    }
    public final String m(){
       return this.uri_;
    }
}
