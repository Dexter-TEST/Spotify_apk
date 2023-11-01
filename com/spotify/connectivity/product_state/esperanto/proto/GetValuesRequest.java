package com.spotify.connectivity.product_state.esperanto.proto.GetValuesRequest;
import com.spotify.connectivity.product_state.esperanto.proto.GetValuesRequestOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.connectivity.product_state.esperanto.proto.GetValuesRequest$Builder;
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

public final class GetValuesRequest extends c implements GetValuesRequestOrBuilder	// class@0007ae from classes.dex
{
    private static final GetValuesRequest DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       GetValuesRequest getValuesReq = new GetValuesRequest();
       GetValuesRequest.DEFAULT_INSTANCE = getValuesReq;
       c.registerDefaultInstance(GetValuesRequest.class, getValuesReq);
    }
    private void GetValuesRequest(){
       super();
    }
    public static GetValuesRequest e(){
       return GetValuesRequest.DEFAULT_INSTANCE;
    }
    public static GetValuesRequest getDefaultInstance(){
       return GetValuesRequest.DEFAULT_INSTANCE;
    }
    public static GetValuesRequest$Builder newBuilder(){
       return GetValuesRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static GetValuesRequest$Builder newBuilder(GetValuesRequest p0){
       return GetValuesRequest.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static GetValuesRequest parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(GetValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static GetValuesRequest parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(GetValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static GetValuesRequest parseFrom(InputStream p0){
       return c.parseFrom(GetValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static GetValuesRequest parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(GetValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static GetValuesRequest parseFrom(ByteBuffer p0){
       return c.parseFrom(GetValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static GetValuesRequest parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(GetValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static GetValuesRequest parseFrom(i80 p0){
       return c.parseFrom(GetValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static GetValuesRequest parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(GetValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static GetValuesRequest parseFrom(sh0 p0){
       return c.parseFrom(GetValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static GetValuesRequest parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(GetValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static GetValuesRequest parseFrom(byte[] p0){
       return c.parseFrom(GetValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static GetValuesRequest parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(GetValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return GetValuesRequest.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(GetValuesRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02", p1);
           case 3:
             return new GetValuesRequest();
           case 4:
             return new GetValuesRequest$Builder(0);
           case 5:
             return GetValuesRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = GetValuesRequest.PARSER) == null) {
                _monitor_enter(GetValuesRequest.class);
                if ((pARSER = GetValuesRequest.PARSER) == null) {
                   pARSER = new ii2(GetValuesRequest.DEFAULT_INSTANCE);
                   GetValuesRequest.PARSER = pARSER;
                }
                _monitor_exit(GetValuesRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
