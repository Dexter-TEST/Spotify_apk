package com.spotify.offline_esperanto.proto.EsOffline$GetContextsRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import java.lang.String;
import java.lang.Object;
import p.f2;
import java.util.List;
import com.spotify.offline_esperanto.proto.EsOffline$ContextInfoPolicy;
import com.spotify.offline_esperanto.proto.a;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;

public final class EsOffline$GetContextsRequest extends c implements u74	// class@000abe from classes.dex
{
    private int bitField0_;
    private EsOffline$DeviceKey device_;
    private EsOffline$GetContextsRequest$Filtering filtering_;
    private EsOffline$ContextInfoPolicy policy_;
    private bc3 uris_;
    private static final EsOffline$GetContextsRequest DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER;
    public static final int FILTERING_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int POLICY_FIELD_NUMBER;
    public static final int URIS_FIELD_NUMBER;

    static {
       EsOffline$GetContextsRequest getContextsR = new EsOffline$GetContextsRequest();
       EsOffline$GetContextsRequest.DEFAULT_INSTANCE = getContextsR;
       c.registerDefaultInstance(EsOffline$GetContextsRequest.class, getContextsR);
    }
    private void EsOffline$GetContextsRequest(){
       super();
       this.uris_ = c.emptyProtobufList();
    }
    public static void e(EsOffline$GetContextsRequest p0,String p1){
       p0.getClass();
       EsOffline$GetContextsRequest uris_ = p0.uris_;
       if (uris_.a == null) {
          p0.uris_ = c.mutableCopy(uris_);
       }
       p0.uris_.add(p1);
       return;
    }
    public static void f(EsOffline$GetContextsRequest p0,EsOffline$ContextInfoPolicy p1){
       p0.getClass();
       p1.getClass();
       p0.policy_ = p1;
       p0.bitField0_ = p0.bitField0_ | 0x01;
    }
    public static EsOffline$GetContextsRequest g(){
       return EsOffline$GetContextsRequest.DEFAULT_INSTANCE;
    }
    public static a h(){
       return EsOffline$GetContextsRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsOffline$GetContextsRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","policy_","device_","uris_","filtering_"};
             return c.newMessageInfo(EsOffline$GetContextsRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\x01\x01\x04\x04\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x02\x02\x04\x10\x02\x02", objArray);
           case 3:
             return new EsOffline$GetContextsRequest();
           case 4:
             return new a();
           case 5:
             return EsOffline$GetContextsRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsOffline$GetContextsRequest.PARSER) == null) {
                _monitor_enter(EsOffline$GetContextsRequest.class);
                if ((pARSER = EsOffline$GetContextsRequest.PARSER) == null) {
                   pARSER = new ii2(EsOffline$GetContextsRequest.DEFAULT_INSTANCE);
                   EsOffline$GetContextsRequest.PARSER = pARSER;
                }
                _monitor_exit(EsOffline$GetContextsRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
