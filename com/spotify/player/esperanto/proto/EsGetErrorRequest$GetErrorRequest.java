package com.spotify.player.esperanto.proto.EsGetErrorRequest$GetErrorRequest;
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
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsGetErrorRequest$GetErrorRequest extends c implements u74	// class@000af7 from classes.dex
{
    private static final EsGetErrorRequest$GetErrorRequest DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       EsGetErrorRequest$GetErrorRequest getErrorRequ = new EsGetErrorRequest$GetErrorRequest();
       EsGetErrorRequest$GetErrorRequest.DEFAULT_INSTANCE = getErrorRequ;
       c.registerDefaultInstance(EsGetErrorRequest$GetErrorRequest.class, getErrorRequ);
    }
    private void EsGetErrorRequest$GetErrorRequest(){
       super();
    }
    public static EsGetErrorRequest$GetErrorRequest e(){
       return EsGetErrorRequest$GetErrorRequest.DEFAULT_INSTANCE;
    }
    public static EsGetErrorRequest$GetErrorRequest f(){
       return EsGetErrorRequest$GetErrorRequest.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsGetErrorRequest$GetErrorRequest.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(EsGetErrorRequest$GetErrorRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02", p1);
           case 3:
             return new EsGetErrorRequest$GetErrorRequest();
           case 4:
             return new fq1();
           case 5:
             return EsGetErrorRequest$GetErrorRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsGetErrorRequest$GetErrorRequest.PARSER) == null) {
                _monitor_enter(EsGetErrorRequest$GetErrorRequest.class);
                if ((pARSER = EsGetErrorRequest$GetErrorRequest.PARSER) == null) {
                   pARSER = new ii2(EsGetErrorRequest$GetErrorRequest.DEFAULT_INSTANCE);
                   EsGetErrorRequest$GetErrorRequest.PARSER = pARSER;
                }
                _monitor_exit(EsGetErrorRequest$GetErrorRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
