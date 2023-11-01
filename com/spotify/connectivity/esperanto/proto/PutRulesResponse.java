package com.spotify.connectivity.esperanto.proto.PutRulesResponse;
import com.spotify.connectivity.esperanto.proto.PutRulesResponseOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.connectivity.esperanto.proto.PutRulesResponse$Builder;
import com.google.protobuf.b;
import java.io.InputStream;
import p.yx1;
import java.nio.ByteBuffer;
import p.i80;
import p.sh0;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class PutRulesResponse extends c implements PutRulesResponseOrBuilder	// class@000701 from classes.dex
{
    private static final PutRulesResponse DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       PutRulesResponse putRulesResp = new PutRulesResponse();
       PutRulesResponse.DEFAULT_INSTANCE = putRulesResp;
       c.registerDefaultInstance(PutRulesResponse.class, putRulesResp);
    }
    private void PutRulesResponse(){
       super();
    }
    public static PutRulesResponse e(){
       return PutRulesResponse.DEFAULT_INSTANCE;
    }
    public static PutRulesResponse getDefaultInstance(){
       return PutRulesResponse.DEFAULT_INSTANCE;
    }
    public static PutRulesResponse$Builder newBuilder(){
       return PutRulesResponse.DEFAULT_INSTANCE.createBuilder();
    }
    public static PutRulesResponse$Builder newBuilder(PutRulesResponse p0){
       return PutRulesResponse.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PutRulesResponse parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(PutRulesResponse.DEFAULT_INSTANCE, p0);
    }
    public static PutRulesResponse parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(PutRulesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutRulesResponse parseFrom(InputStream p0){
       return c.parseFrom(PutRulesResponse.DEFAULT_INSTANCE, p0);
    }
    public static PutRulesResponse parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(PutRulesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutRulesResponse parseFrom(ByteBuffer p0){
       return c.parseFrom(PutRulesResponse.DEFAULT_INSTANCE, p0);
    }
    public static PutRulesResponse parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(PutRulesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutRulesResponse parseFrom(i80 p0){
       return c.parseFrom(PutRulesResponse.DEFAULT_INSTANCE, p0);
    }
    public static PutRulesResponse parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(PutRulesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutRulesResponse parseFrom(sh0 p0){
       return c.parseFrom(PutRulesResponse.DEFAULT_INSTANCE, p0);
    }
    public static PutRulesResponse parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(PutRulesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutRulesResponse parseFrom(byte[] p0){
       return c.parseFrom(PutRulesResponse.DEFAULT_INSTANCE, p0);
    }
    public static PutRulesResponse parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(PutRulesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return PutRulesResponse.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(PutRulesResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02", p1);
           case 3:
             return new PutRulesResponse();
           case 4:
             return new PutRulesResponse$Builder(0);
           case 5:
             return PutRulesResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = PutRulesResponse.PARSER) == null) {
                _monitor_enter(PutRulesResponse.class);
                if ((pARSER = PutRulesResponse.PARSER) == null) {
                   pARSER = new ii2(PutRulesResponse.DEFAULT_INSTANCE);
                   PutRulesResponse.PARSER = pARSER;
                }
                _monitor_exit(PutRulesResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
