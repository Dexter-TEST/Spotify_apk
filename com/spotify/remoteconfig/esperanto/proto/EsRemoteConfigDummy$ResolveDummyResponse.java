package com.spotify.remoteconfig.esperanto.proto.EsRemoteConfigDummy$ResolveDummyResponse;
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
import p.sp1;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsRemoteConfigDummy$ResolveDummyResponse extends c implements u74	// class@000bf9 from classes.dex
{
    private String value_;
    private static final EsRemoteConfigDummy$ResolveDummyResponse DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       EsRemoteConfigDummy$ResolveDummyResponse resolveDummy = new EsRemoteConfigDummy$ResolveDummyResponse();
       EsRemoteConfigDummy$ResolveDummyResponse.DEFAULT_INSTANCE = resolveDummy;
       c.registerDefaultInstance(EsRemoteConfigDummy$ResolveDummyResponse.class, resolveDummy);
    }
    private void EsRemoteConfigDummy$ResolveDummyResponse(){
       super();
       this.value_ = "";
    }
    public static EsRemoteConfigDummy$ResolveDummyResponse e(){
       return EsRemoteConfigDummy$ResolveDummyResponse.DEFAULT_INSTANCE;
    }
    public static EsRemoteConfigDummy$ResolveDummyResponse f(byte[] p0){
       return c.parseFrom(EsRemoteConfigDummy$ResolveDummyResponse.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return EsRemoteConfigDummy$ResolveDummyResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[b];
             objArray[0] = "value_";
             return c.newMessageInfo(EsRemoteConfigDummy$ResolveDummyResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02", objArray);
           case 3:
             return new EsRemoteConfigDummy$ResolveDummyResponse();
           case 4:
             return new fq1(p2);
           case 5:
             return EsRemoteConfigDummy$ResolveDummyResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsRemoteConfigDummy$ResolveDummyResponse.PARSER) == null) {
                _monitor_enter(EsRemoteConfigDummy$ResolveDummyResponse.class);
                if ((pARSER = EsRemoteConfigDummy$ResolveDummyResponse.PARSER) == null) {
                   pARSER = new ii2(EsRemoteConfigDummy$ResolveDummyResponse.DEFAULT_INSTANCE);
                   EsRemoteConfigDummy$ResolveDummyResponse.PARSER = pARSER;
                }
                _monitor_exit(EsRemoteConfigDummy$ResolveDummyResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
