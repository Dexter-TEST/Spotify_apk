package com.spotify.connectivity.product_state.esperanto.proto.SubValuesRequest;
import com.spotify.connectivity.product_state.esperanto.proto.SubValuesRequestOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.connectivity.product_state.esperanto.proto.SubValuesRequest$Builder;
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

public final class SubValuesRequest extends c implements SubValuesRequestOrBuilder	// class@0007d1 from classes.dex
{
    private static final SubValuesRequest DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       SubValuesRequest subValuesReq = new SubValuesRequest();
       SubValuesRequest.DEFAULT_INSTANCE = subValuesReq;
       c.registerDefaultInstance(SubValuesRequest.class, subValuesReq);
    }
    private void SubValuesRequest(){
       super();
    }
    public static SubValuesRequest e(){
       return SubValuesRequest.DEFAULT_INSTANCE;
    }
    public static SubValuesRequest getDefaultInstance(){
       return SubValuesRequest.DEFAULT_INSTANCE;
    }
    public static SubValuesRequest$Builder newBuilder(){
       return SubValuesRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static SubValuesRequest$Builder newBuilder(SubValuesRequest p0){
       return SubValuesRequest.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static SubValuesRequest parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(SubValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static SubValuesRequest parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(SubValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubValuesRequest parseFrom(InputStream p0){
       return c.parseFrom(SubValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static SubValuesRequest parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(SubValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubValuesRequest parseFrom(ByteBuffer p0){
       return c.parseFrom(SubValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static SubValuesRequest parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(SubValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubValuesRequest parseFrom(i80 p0){
       return c.parseFrom(SubValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static SubValuesRequest parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(SubValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubValuesRequest parseFrom(sh0 p0){
       return c.parseFrom(SubValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static SubValuesRequest parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(SubValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubValuesRequest parseFrom(byte[] p0){
       return c.parseFrom(SubValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static SubValuesRequest parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(SubValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return SubValuesRequest.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(SubValuesRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02", p1);
           case 3:
             return new SubValuesRequest();
           case 4:
             return new SubValuesRequest$Builder(0);
           case 5:
             return SubValuesRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = SubValuesRequest.PARSER) == null) {
                _monitor_enter(SubValuesRequest.class);
                if ((pARSER = SubValuesRequest.PARSER) == null) {
                   pARSER = new ii2(SubValuesRequest.DEFAULT_INSTANCE);
                   SubValuesRequest.PARSER = pARSER;
                }
                _monitor_exit(SubValuesRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
