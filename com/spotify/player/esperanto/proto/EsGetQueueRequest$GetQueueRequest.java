package com.spotify.player.esperanto.proto.EsGetQueueRequest$GetQueueRequest;
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

public final class EsGetQueueRequest$GetQueueRequest extends c implements u74	// class@000af8 from classes.dex
{
    private static final EsGetQueueRequest$GetQueueRequest DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       EsGetQueueRequest$GetQueueRequest getQueueRequ = new EsGetQueueRequest$GetQueueRequest();
       EsGetQueueRequest$GetQueueRequest.DEFAULT_INSTANCE = getQueueRequ;
       c.registerDefaultInstance(EsGetQueueRequest$GetQueueRequest.class, getQueueRequ);
    }
    private void EsGetQueueRequest$GetQueueRequest(){
       super();
    }
    public static EsGetQueueRequest$GetQueueRequest e(){
       return EsGetQueueRequest$GetQueueRequest.DEFAULT_INSTANCE;
    }
    public static EsGetQueueRequest$GetQueueRequest f(){
       return EsGetQueueRequest$GetQueueRequest.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsGetQueueRequest$GetQueueRequest.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(EsGetQueueRequest$GetQueueRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02", p1);
           case 3:
             return new EsGetQueueRequest$GetQueueRequest();
           case 4:
             return new fq1(p1);
           case 5:
             return EsGetQueueRequest$GetQueueRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsGetQueueRequest$GetQueueRequest.PARSER) == null) {
                _monitor_enter(EsGetQueueRequest$GetQueueRequest.class);
                if ((pARSER = EsGetQueueRequest$GetQueueRequest.PARSER) == null) {
                   pARSER = new ii2(EsGetQueueRequest$GetQueueRequest.DEFAULT_INSTANCE);
                   EsGetQueueRequest$GetQueueRequest.PARSER = pARSER;
                }
                _monitor_exit(EsGetQueueRequest$GetQueueRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
