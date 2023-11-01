package com.spotify.remoteconfig.esperanto.proto.EsRemoteConfigDummy$ResolveDummyRequest;
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
import p.mp1;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsRemoteConfigDummy$ResolveDummyRequest extends c implements u74	// class@000bf8 from classes.dex
{
    private static final EsRemoteConfigDummy$ResolveDummyRequest DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       EsRemoteConfigDummy$ResolveDummyRequest resolveDummy = new EsRemoteConfigDummy$ResolveDummyRequest();
       EsRemoteConfigDummy$ResolveDummyRequest.DEFAULT_INSTANCE = resolveDummy;
       c.registerDefaultInstance(EsRemoteConfigDummy$ResolveDummyRequest.class, resolveDummy);
    }
    private void EsRemoteConfigDummy$ResolveDummyRequest(){
       super();
    }
    public static EsRemoteConfigDummy$ResolveDummyRequest e(){
       return EsRemoteConfigDummy$ResolveDummyRequest.DEFAULT_INSTANCE;
    }
    public static EsRemoteConfigDummy$ResolveDummyRequest f(){
       return EsRemoteConfigDummy$ResolveDummyRequest.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsRemoteConfigDummy$ResolveDummyRequest.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(EsRemoteConfigDummy$ResolveDummyRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02", p1);
           case 3:
             return new EsRemoteConfigDummy$ResolveDummyRequest();
           case 4:
             return new fq1(p1);
           case 5:
             return EsRemoteConfigDummy$ResolveDummyRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsRemoteConfigDummy$ResolveDummyRequest.PARSER) == null) {
                _monitor_enter(EsRemoteConfigDummy$ResolveDummyRequest.class);
                if ((pARSER = EsRemoteConfigDummy$ResolveDummyRequest.PARSER) == null) {
                   pARSER = new ii2(EsRemoteConfigDummy$ResolveDummyRequest.DEFAULT_INSTANCE);
                   EsRemoteConfigDummy$ResolveDummyRequest.PARSER = pARSER;
                }
                _monitor_exit(EsRemoteConfigDummy$ResolveDummyRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
