package com.spotify.offline_esperanto.proto.EsOffline$GetContextsResponse;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.sq1;
import com.spotify.offline_esperanto.proto.EsOffline$ContextInfo;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsOffline$GetContextsResponse extends c implements u74	// class@000abf from classes.dex
{
    private bc3 contexts_;
    private long error_;
    public static final int CONTEXTS_FIELD_NUMBER = 1;
    private static final EsOffline$GetContextsResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       EsOffline$GetContextsResponse getContextsR = new EsOffline$GetContextsResponse();
       EsOffline$GetContextsResponse.DEFAULT_INSTANCE = getContextsR;
       c.registerDefaultInstance(EsOffline$GetContextsResponse.class, getContextsR);
    }
    private void EsOffline$GetContextsResponse(){
       super();
       this.contexts_ = c.emptyProtobufList();
    }
    public static EsOffline$GetContextsResponse e(){
       return EsOffline$GetContextsResponse.DEFAULT_INSTANCE;
    }
    public static EsOffline$GetContextsResponse h(byte[] p0){
       return c.parseFrom(EsOffline$GetContextsResponse.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return EsOffline$GetContextsResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"contexts_",EsOffline$ContextInfo.class,"error_"};
             return c.newMessageInfo(EsOffline$GetContextsResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x02\x02", objArray);
           case 3:
             return new EsOffline$GetContextsResponse();
           case 4:
             return new sq1(21);
           case 5:
             return EsOffline$GetContextsResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsOffline$GetContextsResponse.PARSER) == null) {
                _monitor_enter(EsOffline$GetContextsResponse.class);
                if ((pARSER = EsOffline$GetContextsResponse.PARSER) == null) {
                   pARSER = new ii2(EsOffline$GetContextsResponse.DEFAULT_INSTANCE);
                   EsOffline$GetContextsResponse.PARSER = pARSER;
                }
                _monitor_exit(EsOffline$GetContextsResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final bc3 f(){
       return this.contexts_;
    }
    public final long g(){
       return this.error_;
    }
}
