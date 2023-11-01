package com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$IntValue;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$IntValueOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$IntValue$Builder;
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
import java.lang.Byte;
import p.ii2;
import p.s74;
import java.lang.String;
import com.spotify.rcs.model.GranularConfiguration$1;
import p.r74;

public final class GranularConfiguration$AssignedPropertyValue$IntValue extends c implements GranularConfiguration$AssignedPropertyValue$IntValueOrBuilder	// class@000bc0 from classes.dex
{
    private int value_;
    private static final GranularConfiguration$AssignedPropertyValue$IntValue DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       GranularConfiguration$AssignedPropertyValue$IntValue uAssignedPro = new GranularConfiguration$AssignedPropertyValue$IntValue();
       GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE = uAssignedPro;
       c.registerDefaultInstance(GranularConfiguration$AssignedPropertyValue$IntValue.class, uAssignedPro);
    }
    private void GranularConfiguration$AssignedPropertyValue$IntValue(){
       super();
    }
    public static GranularConfiguration$AssignedPropertyValue$IntValue access$400(){
       return GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE;
    }
    public static void access$500(GranularConfiguration$AssignedPropertyValue$IntValue p0,int p1){
       p0.setValue(p1);
    }
    public static void access$600(GranularConfiguration$AssignedPropertyValue$IntValue p0){
       p0.clearValue();
    }
    private void clearValue(){
       this.value_ = 0;
    }
    public static GranularConfiguration$AssignedPropertyValue$IntValue getDefaultInstance(){
       return GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE;
    }
    public static GranularConfiguration$AssignedPropertyValue$IntValue$Builder newBuilder(){
       return GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE.createBuilder();
    }
    public static GranularConfiguration$AssignedPropertyValue$IntValue$Builder newBuilder(GranularConfiguration$AssignedPropertyValue$IntValue p0){
       return GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$IntValue parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$IntValue parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue$IntValue parseFrom(InputStream p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$IntValue parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue$IntValue parseFrom(ByteBuffer p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$IntValue parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue$IntValue parseFrom(i80 p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$IntValue parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue$IntValue parseFrom(sh0 p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$IntValue parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue$IntValue parseFrom(byte[] p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$IntValue parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE.getParserForType();
    }
    private void setValue(int p0){
       this.value_ = p0;
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
             return c.newMessageInfo(GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04", objArray);
           case 3:
             return new GranularConfiguration$AssignedPropertyValue$IntValue();
           case 4:
             return new GranularConfiguration$AssignedPropertyValue$IntValue$Builder(p2);
           case 5:
             return GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = GranularConfiguration$AssignedPropertyValue$IntValue.PARSER) == null) {
                _monitor_enter(GranularConfiguration$AssignedPropertyValue$IntValue.class);
                if ((pARSER = GranularConfiguration$AssignedPropertyValue$IntValue.PARSER) == null) {
                   pARSER = new ii2(GranularConfiguration$AssignedPropertyValue$IntValue.DEFAULT_INSTANCE);
                   GranularConfiguration$AssignedPropertyValue$IntValue.PARSER = pARSER;
                }
                _monitor_exit(GranularConfiguration$AssignedPropertyValue$IntValue.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public int getValue(){
       return this.value_;
    }
    public r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public r74 toBuilder(){
       return super.toBuilder();
    }
}
