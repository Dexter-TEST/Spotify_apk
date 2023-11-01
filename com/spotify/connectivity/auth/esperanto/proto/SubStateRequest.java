package com.spotify.connectivity.auth.esperanto.proto.SubStateRequest;
import com.spotify.connectivity.auth.esperanto.proto.SubStateRequestOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.connectivity.auth.esperanto.proto.SubStateRequest$Builder;
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

public final class SubStateRequest extends c implements SubStateRequestOrBuilder	// class@000643 from classes.dex
{
    private static final SubStateRequest DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       SubStateRequest subStateRequ = new SubStateRequest();
       SubStateRequest.DEFAULT_INSTANCE = subStateRequ;
       c.registerDefaultInstance(SubStateRequest.class, subStateRequ);
    }
    private void SubStateRequest(){
       super();
    }
    public static SubStateRequest e(){
       return SubStateRequest.DEFAULT_INSTANCE;
    }
    public static SubStateRequest getDefaultInstance(){
       return SubStateRequest.DEFAULT_INSTANCE;
    }
    public static SubStateRequest$Builder newBuilder(){
       return SubStateRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static SubStateRequest$Builder newBuilder(SubStateRequest p0){
       return SubStateRequest.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static SubStateRequest parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(SubStateRequest.DEFAULT_INSTANCE, p0);
    }
    public static SubStateRequest parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(SubStateRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubStateRequest parseFrom(InputStream p0){
       return c.parseFrom(SubStateRequest.DEFAULT_INSTANCE, p0);
    }
    public static SubStateRequest parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(SubStateRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubStateRequest parseFrom(ByteBuffer p0){
       return c.parseFrom(SubStateRequest.DEFAULT_INSTANCE, p0);
    }
    public static SubStateRequest parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(SubStateRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubStateRequest parseFrom(i80 p0){
       return c.parseFrom(SubStateRequest.DEFAULT_INSTANCE, p0);
    }
    public static SubStateRequest parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(SubStateRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubStateRequest parseFrom(sh0 p0){
       return c.parseFrom(SubStateRequest.DEFAULT_INSTANCE, p0);
    }
    public static SubStateRequest parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(SubStateRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static SubStateRequest parseFrom(byte[] p0){
       return c.parseFrom(SubStateRequest.DEFAULT_INSTANCE, p0);
    }
    public static SubStateRequest parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(SubStateRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return SubStateRequest.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(SubStateRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02", p1);
           case 3:
             return new SubStateRequest();
           case 4:
             return new SubStateRequest$Builder(0);
           case 5:
             return SubStateRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = SubStateRequest.PARSER) == null) {
                _monitor_enter(SubStateRequest.class);
                if ((pARSER = SubStateRequest.PARSER) == null) {
                   pARSER = new ii2(SubStateRequest.DEFAULT_INSTANCE);
                   SubStateRequest.PARSER = pARSER;
                }
                _monitor_exit(SubStateRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
