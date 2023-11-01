package com.spotify.shoreline.esperanto.proto.EsShorelineLogger$SetContextValueResponse;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.or1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsShorelineLogger$SetContextValueResponse extends c implements u74	// class@000c2a from classes.dex
{
    private static final EsShorelineLogger$SetContextValueResponse DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       EsShorelineLogger$SetContextValueResponse setContextVa = new EsShorelineLogger$SetContextValueResponse();
       EsShorelineLogger$SetContextValueResponse.DEFAULT_INSTANCE = setContextVa;
       c.registerDefaultInstance(EsShorelineLogger$SetContextValueResponse.class, setContextVa);
    }
    private void EsShorelineLogger$SetContextValueResponse(){
       super();
    }
    public static EsShorelineLogger$SetContextValueResponse e(){
       return EsShorelineLogger$SetContextValueResponse.DEFAULT_INSTANCE;
    }
    public static or1 f(){
       return EsShorelineLogger$SetContextValueResponse.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsShorelineLogger$SetContextValueResponse.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       p1 = null;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(1);
           case 1:
             return p1;
           case 2:
             return c.newMessageInfo(EsShorelineLogger$SetContextValueResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02", p1);
           case 3:
             return new EsShorelineLogger$SetContextValueResponse();
           case 4:
             return new or1();
           case 5:
             return EsShorelineLogger$SetContextValueResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsShorelineLogger$SetContextValueResponse.PARSER) == null) {
                _monitor_enter(EsShorelineLogger$SetContextValueResponse.class);
                if ((pARSER = EsShorelineLogger$SetContextValueResponse.PARSER) == null) {
                   pARSER = new ii2(EsShorelineLogger$SetContextValueResponse.DEFAULT_INSTANCE);
                   EsShorelineLogger$SetContextValueResponse.PARSER = pARSER;
                }
                _monitor_exit(EsShorelineLogger$SetContextValueResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
