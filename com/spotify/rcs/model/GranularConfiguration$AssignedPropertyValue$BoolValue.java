package com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$BoolValue;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$BoolValueOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$BoolValue$Builder;
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

public final class GranularConfiguration$AssignedPropertyValue$BoolValue extends c implements GranularConfiguration$AssignedPropertyValue$BoolValueOrBuilder	// class@000bb9 from classes.dex
{
    private boolean value_;
    private static final GranularConfiguration$AssignedPropertyValue$BoolValue DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       GranularConfiguration$AssignedPropertyValue$BoolValue uAssignedPro = new GranularConfiguration$AssignedPropertyValue$BoolValue();
       GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE = uAssignedPro;
       c.registerDefaultInstance(GranularConfiguration$AssignedPropertyValue$BoolValue.class, uAssignedPro);
    }
    private void GranularConfiguration$AssignedPropertyValue$BoolValue(){
       super();
    }
    public static GranularConfiguration$AssignedPropertyValue$BoolValue access$000(){
       return GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE;
    }
    public static void access$100(GranularConfiguration$AssignedPropertyValue$BoolValue p0,boolean p1){
       p0.setValue(p1);
    }
    public static void access$200(GranularConfiguration$AssignedPropertyValue$BoolValue p0){
       p0.clearValue();
    }
    private void clearValue(){
       this.value_ = false;
    }
    public static GranularConfiguration$AssignedPropertyValue$BoolValue getDefaultInstance(){
       return GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE;
    }
    public static GranularConfiguration$AssignedPropertyValue$BoolValue$Builder newBuilder(){
       return GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE.createBuilder();
    }
    public static GranularConfiguration$AssignedPropertyValue$BoolValue$Builder newBuilder(GranularConfiguration$AssignedPropertyValue$BoolValue p0){
       return GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$BoolValue parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$BoolValue parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue$BoolValue parseFrom(InputStream p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$BoolValue parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue$BoolValue parseFrom(ByteBuffer p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$BoolValue parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue$BoolValue parseFrom(i80 p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$BoolValue parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue$BoolValue parseFrom(sh0 p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$BoolValue parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue$BoolValue parseFrom(byte[] p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$BoolValue parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE.getParserForType();
    }
    private void setValue(boolean p0){
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
             return c.newMessageInfo(GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07", objArray);
           case 3:
             return new GranularConfiguration$AssignedPropertyValue$BoolValue();
           case 4:
             return new GranularConfiguration$AssignedPropertyValue$BoolValue$Builder(p2);
           case 5:
             return GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = GranularConfiguration$AssignedPropertyValue$BoolValue.PARSER) == null) {
                _monitor_enter(GranularConfiguration$AssignedPropertyValue$BoolValue.class);
                if ((pARSER = GranularConfiguration$AssignedPropertyValue$BoolValue.PARSER) == null) {
                   pARSER = new ii2(GranularConfiguration$AssignedPropertyValue$BoolValue.DEFAULT_INSTANCE);
                   GranularConfiguration$AssignedPropertyValue$BoolValue.PARSER = pARSER;
                }
                _monitor_exit(GranularConfiguration$AssignedPropertyValue$BoolValue.class);
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
    public boolean getValue(){
       return this.value_;
    }
    public r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public r74 toBuilder(){
       return super.toBuilder();
    }
}
