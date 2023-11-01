package com.spotify.remoteconfig.esperanto.proto.EsRemoteConfig$LookupRequest;
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
import p.lp1;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsRemoteConfig$LookupRequest extends c implements u74	// class@000bf7 from classes.dex
{
    private String name_;
    private String scope_;
    private static final EsRemoteConfig$LookupRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SCOPE_FIELD_NUMBER;

    static {
       EsRemoteConfig$LookupRequest lookupReques = new EsRemoteConfig$LookupRequest();
       EsRemoteConfig$LookupRequest.DEFAULT_INSTANCE = lookupReques;
       c.registerDefaultInstance(EsRemoteConfig$LookupRequest.class, lookupReques);
    }
    private void EsRemoteConfig$LookupRequest(){
       super();
       this.scope_ = "";
       this.name_ = "";
    }
    public static EsRemoteConfig$LookupRequest e(){
       return EsRemoteConfig$LookupRequest.DEFAULT_INSTANCE;
    }
    public static EsRemoteConfig$LookupRequest g(byte[] p0){
       return c.parseFrom(EsRemoteConfig$LookupRequest.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return EsRemoteConfig$LookupRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"scope_","name_"};
             return c.newMessageInfo(EsRemoteConfig$LookupRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02", objArray);
           case 3:
             return new EsRemoteConfig$LookupRequest();
           case 4:
             return new fq1(p2);
           case 5:
             return EsRemoteConfig$LookupRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsRemoteConfig$LookupRequest.PARSER) == null) {
                _monitor_enter(EsRemoteConfig$LookupRequest.class);
                if ((pARSER = EsRemoteConfig$LookupRequest.PARSER) == null) {
                   pARSER = new ii2(EsRemoteConfig$LookupRequest.DEFAULT_INSTANCE);
                   EsRemoteConfig$LookupRequest.PARSER = pARSER;
                }
                _monitor_exit(EsRemoteConfig$LookupRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String f(){
       return this.scope_;
    }
    public final String getName(){
       return this.name_;
    }
}
