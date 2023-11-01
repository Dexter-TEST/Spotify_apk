package com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$EnumValue;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$EnumValueOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
import java.lang.String;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$EnumValue$Builder;
import com.google.protobuf.b;
import java.io.InputStream;
import p.yx1;
import java.nio.ByteBuffer;
import p.sh0;
import p.r75;
import java.lang.Object;
import com.google.protobuf.a;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import p.ii2;
import p.s74;
import com.spotify.rcs.model.GranularConfiguration$1;
import p.h80;
import p.r74;

public final class GranularConfiguration$AssignedPropertyValue$EnumValue extends c implements GranularConfiguration$AssignedPropertyValue$EnumValueOrBuilder	// class@000bbd from classes.dex
{
    private String value_;
    private static final GranularConfiguration$AssignedPropertyValue$EnumValue DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       GranularConfiguration$AssignedPropertyValue$EnumValue uAssignedPro = new GranularConfiguration$AssignedPropertyValue$EnumValue();
       GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE = uAssignedPro;
       c.registerDefaultInstance(GranularConfiguration$AssignedPropertyValue$EnumValue.class, uAssignedPro);
    }
    private void GranularConfiguration$AssignedPropertyValue$EnumValue(){
       super();
       this.value_ = "";
    }
    public static void access$1000(GranularConfiguration$AssignedPropertyValue$EnumValue p0){
       p0.clearValue();
    }
    public static void access$1100(GranularConfiguration$AssignedPropertyValue$EnumValue p0,i80 p1){
       p0.setValueBytes(p1);
    }
    public static GranularConfiguration$AssignedPropertyValue$EnumValue access$800(){
       return GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE;
    }
    public static void access$900(GranularConfiguration$AssignedPropertyValue$EnumValue p0,String p1){
       p0.setValue(p1);
    }
    private void clearValue(){
       this.value_ = GranularConfiguration$AssignedPropertyValue$EnumValue.getDefaultInstance().getValue();
    }
    public static GranularConfiguration$AssignedPropertyValue$EnumValue getDefaultInstance(){
       return GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE;
    }
    public static GranularConfiguration$AssignedPropertyValue$EnumValue$Builder newBuilder(){
       return GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE.createBuilder();
    }
    public static GranularConfiguration$AssignedPropertyValue$EnumValue$Builder newBuilder(GranularConfiguration$AssignedPropertyValue$EnumValue p0){
       return GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$EnumValue parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$EnumValue parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue$EnumValue parseFrom(InputStream p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$EnumValue parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue$EnumValue parseFrom(ByteBuffer p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$EnumValue parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue$EnumValue parseFrom(i80 p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$EnumValue parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue$EnumValue parseFrom(sh0 p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$EnumValue parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue$EnumValue parseFrom(byte[] p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue$EnumValue parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE.getParserForType();
    }
    private void setValue(String p0){
       p0.getClass();
       this.value_ = p0;
    }
    private void setValueBytes(i80 p0){
       a.checkByteStringIsUtf8(p0);
       this.value_ = p0.r();
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
             return c.newMessageInfo(GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02", objArray);
           case 3:
             return new GranularConfiguration$AssignedPropertyValue$EnumValue();
           case 4:
             return new GranularConfiguration$AssignedPropertyValue$EnumValue$Builder(p2);
           case 5:
             return GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = GranularConfiguration$AssignedPropertyValue$EnumValue.PARSER) == null) {
                _monitor_enter(GranularConfiguration$AssignedPropertyValue$EnumValue.class);
                if ((pARSER = GranularConfiguration$AssignedPropertyValue$EnumValue.PARSER) == null) {
                   pARSER = new ii2(GranularConfiguration$AssignedPropertyValue$EnumValue.DEFAULT_INSTANCE);
                   GranularConfiguration$AssignedPropertyValue$EnumValue.PARSER = pARSER;
                }
                _monitor_exit(GranularConfiguration$AssignedPropertyValue$EnumValue.class);
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
    public String getValue(){
       return this.value_;
    }
    public i80 getValueBytes(){
       return i80.d(this.value_);
    }
    public r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public r74 toBuilder(){
       return super.toBuilder();
    }
}
