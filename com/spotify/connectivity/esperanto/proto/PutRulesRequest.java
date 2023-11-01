package com.spotify.connectivity.esperanto.proto.PutRulesRequest;
import com.spotify.connectivity.esperanto.proto.PutRulesRequestOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.connectivity.esperanto.proto.PutRulesRequest$Builder;
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

public final class PutRulesRequest extends c implements PutRulesRequestOrBuilder	// class@0006fd from classes.dex
{
    private boolean allowSyncOverCellular_;
    private int bitField0_;
    public static final int ALLOW_SYNC_OVER_CELLULAR_FIELD_NUMBER = 1;
    private static final PutRulesRequest DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       PutRulesRequest putRulesRequ = new PutRulesRequest();
       PutRulesRequest.DEFAULT_INSTANCE = putRulesRequ;
       c.registerDefaultInstance(PutRulesRequest.class, putRulesRequ);
    }
    private void PutRulesRequest(){
       super();
    }
    private void clearAllowSyncOverCellular(){
       this.bitField0_ = this.bitField0_ & 0xfe;
       this.allowSyncOverCellular_ = false;
    }
    public static void e(PutRulesRequest p0){
       p0.clearAllowSyncOverCellular();
    }
    public static void f(PutRulesRequest p0,boolean p1){
       p0.setAllowSyncOverCellular(p1);
    }
    public static PutRulesRequest g(){
       return PutRulesRequest.DEFAULT_INSTANCE;
    }
    public static PutRulesRequest getDefaultInstance(){
       return PutRulesRequest.DEFAULT_INSTANCE;
    }
    public static PutRulesRequest$Builder newBuilder(){
       return PutRulesRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static PutRulesRequest$Builder newBuilder(PutRulesRequest p0){
       return PutRulesRequest.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PutRulesRequest parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(PutRulesRequest.DEFAULT_INSTANCE, p0);
    }
    public static PutRulesRequest parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(PutRulesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutRulesRequest parseFrom(InputStream p0){
       return c.parseFrom(PutRulesRequest.DEFAULT_INSTANCE, p0);
    }
    public static PutRulesRequest parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(PutRulesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutRulesRequest parseFrom(ByteBuffer p0){
       return c.parseFrom(PutRulesRequest.DEFAULT_INSTANCE, p0);
    }
    public static PutRulesRequest parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(PutRulesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutRulesRequest parseFrom(i80 p0){
       return c.parseFrom(PutRulesRequest.DEFAULT_INSTANCE, p0);
    }
    public static PutRulesRequest parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(PutRulesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutRulesRequest parseFrom(sh0 p0){
       return c.parseFrom(PutRulesRequest.DEFAULT_INSTANCE, p0);
    }
    public static PutRulesRequest parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(PutRulesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutRulesRequest parseFrom(byte[] p0){
       return c.parseFrom(PutRulesRequest.DEFAULT_INSTANCE, p0);
    }
    public static PutRulesRequest parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(PutRulesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return PutRulesRequest.DEFAULT_INSTANCE.getParserForType();
    }
    private void setAllowSyncOverCellular(boolean p0){
       this.bitField0_ = this.bitField0_ | 0x01;
       this.allowSyncOverCellular_ = p0;
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       int i = 0;
       byte b = 1;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[]{"bitField0_","allowSyncOverCellular_"};
             return c.newMessageInfo(PutRulesRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new PutRulesRequest();
           case 4:
             return new PutRulesRequest$Builder(i);
           case 5:
             return PutRulesRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = PutRulesRequest.PARSER) == null) {
                _monitor_enter(PutRulesRequest.class);
                if ((pARSER = PutRulesRequest.PARSER) == null) {
                   pARSER = new ii2(PutRulesRequest.DEFAULT_INSTANCE);
                   PutRulesRequest.PARSER = pARSER;
                }
                _monitor_exit(PutRulesRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public boolean getAllowSyncOverCellular(){
       return this.allowSyncOverCellular_;
    }
    public boolean hasAllowSyncOverCellular(){
       int i = 1;
       if ((this.bitField0_ & i)) {
       }else {
          i = false;
       }
       return i;
    }
}
