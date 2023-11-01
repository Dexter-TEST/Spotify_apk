package com.spotify.player.esperanto.proto.EsContextPlayerError$ContextPlayerError;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.sq1;
import p.bp1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.cp1;
import java.util.Map;
import java.util.Collections;

public final class EsContextPlayerError$ContextPlayerError extends c implements u74	// class@000af0 from classes.dex
{
    private int code_;
    private g14 data_;
    private String message_;
    public static final int CODE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 3;
    private static final EsContextPlayerError$ContextPlayerError DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       EsContextPlayerError$ContextPlayerError uContextPlay = new EsContextPlayerError$ContextPlayerError();
       EsContextPlayerError$ContextPlayerError.DEFAULT_INSTANCE = uContextPlay;
       c.registerDefaultInstance(EsContextPlayerError$ContextPlayerError.class, uContextPlay);
    }
    private void EsContextPlayerError$ContextPlayerError(){
       super();
       this.data_ = g14.b;
       this.message_ = "";
    }
    public static EsContextPlayerError$ContextPlayerError e(){
       return EsContextPlayerError$ContextPlayerError.DEFAULT_INSTANCE;
    }
    public static EsContextPlayerError$ContextPlayerError h(byte[] p0){
       return c.parseFrom(EsContextPlayerError$ContextPlayerError.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return EsContextPlayerError$ContextPlayerError.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"code_","message_","data_",bp1.a};
             return c.newMessageInfo(EsContextPlayerError$ContextPlayerError.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\x02\x02\x032", objArray);
           case 3:
             return new EsContextPlayerError$ContextPlayerError();
           case 4:
             return new sq1(25);
           case 5:
             return EsContextPlayerError$ContextPlayerError.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsContextPlayerError$ContextPlayerError.PARSER) == null) {
                _monitor_enter(EsContextPlayerError$ContextPlayerError.class);
                if ((pARSER = EsContextPlayerError$ContextPlayerError.PARSER) == null) {
                   pARSER = new ii2(EsContextPlayerError$ContextPlayerError.DEFAULT_INSTANCE);
                   EsContextPlayerError$ContextPlayerError.PARSER = pARSER;
                }
                _monitor_exit(EsContextPlayerError$ContextPlayerError.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final cp1 f(){
       cp1 uocp1;
       if ((uocp1 = cp1.a(this.code_)) == null) {
          uocp1 = cp1.i0;
       }
       return uocp1;
    }
    public final Map g(){
       return Collections.unmodifiableMap(this.data_);
    }
}
