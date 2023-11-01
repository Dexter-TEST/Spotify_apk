package com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValueOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.rcs.model.a;
import java.lang.String;
import p.i80;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$BoolValue;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$IntValue;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$EnumValue;
import java.lang.Object;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$BoolValue$Builder;
import com.google.protobuf.b;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$EnumValue$Builder;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$IntValue$Builder;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$Builder;
import java.io.InputStream;
import p.yx1;
import java.nio.ByteBuffer;
import p.sh0;
import p.r75;
import com.google.protobuf.a;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import p.ii2;
import p.s74;
import com.spotify.rcs.model.GranularConfiguration$1;
import p.h80;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$StructuredValueCase;
import p.r74;

public final class GranularConfiguration$AssignedPropertyValue extends c implements GranularConfiguration$AssignedPropertyValueOrBuilder	// class@000bc3 from classes.dex
{
    private String clientId_;
    private String componentId_;
    private long groupId_;
    private String name_;
    private int platform_;
    private long policyId_;
    private int structuredValueCase_;
    private Object structuredValue_;
    public static final int BOOL_VALUE_FIELD_NUMBER = 1;
    public static final int CLIENT_ID_FIELD_NUMBER = 4;
    public static final int COMPONENT_ID_FIELD_NUMBER = 5;
    private static final GranularConfiguration$AssignedPropertyValue DEFAULT_INSTANCE;
    public static final int ENUM_VALUE_FIELD_NUMBER;
    public static final int GROUPID_FIELD_NUMBER;
    public static final int INT_VALUE_FIELD_NUMBER;
    public static final int NAME_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PLATFORM_FIELD_NUMBER;
    public static final int POLICYID_FIELD_NUMBER;

    static {
       GranularConfiguration$AssignedPropertyValue uAssignedPro = new GranularConfiguration$AssignedPropertyValue();
       GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE = uAssignedPro;
       c.registerDefaultInstance(GranularConfiguration$AssignedPropertyValue.class, uAssignedPro);
    }
    private void GranularConfiguration$AssignedPropertyValue(){
       super();
       this.structuredValueCase_ = 0;
       this.clientId_ = "";
       this.componentId_ = "";
       this.name_ = "";
    }
    public static GranularConfiguration$AssignedPropertyValue access$1300(){
       return GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE;
    }
    public static void access$1400(GranularConfiguration$AssignedPropertyValue p0){
       p0.clearStructuredValue();
    }
    public static void access$1500(GranularConfiguration$AssignedPropertyValue p0,int p1){
       p0.setPlatformValue(p1);
    }
    public static void access$1600(GranularConfiguration$AssignedPropertyValue p0,a p1){
       p0.setPlatform(p1);
    }
    public static void access$1700(GranularConfiguration$AssignedPropertyValue p0){
       p0.clearPlatform();
    }
    public static void access$1800(GranularConfiguration$AssignedPropertyValue p0,String p1){
       p0.setClientId(p1);
    }
    public static void access$1900(GranularConfiguration$AssignedPropertyValue p0){
       p0.clearClientId();
    }
    public static void access$2000(GranularConfiguration$AssignedPropertyValue p0,i80 p1){
       p0.setClientIdBytes(p1);
    }
    public static void access$2100(GranularConfiguration$AssignedPropertyValue p0,String p1){
       p0.setComponentId(p1);
    }
    public static void access$2200(GranularConfiguration$AssignedPropertyValue p0){
       p0.clearComponentId();
    }
    public static void access$2300(GranularConfiguration$AssignedPropertyValue p0,i80 p1){
       p0.setComponentIdBytes(p1);
    }
    public static void access$2400(GranularConfiguration$AssignedPropertyValue p0,long p1){
       p0.setGroupId(p1);
    }
    public static void access$2500(GranularConfiguration$AssignedPropertyValue p0){
       p0.clearGroupId();
    }
    public static void access$2600(GranularConfiguration$AssignedPropertyValue p0,long p1){
       p0.setPolicyId(p1);
    }
    public static void access$2700(GranularConfiguration$AssignedPropertyValue p0){
       p0.clearPolicyId();
    }
    public static void access$2800(GranularConfiguration$AssignedPropertyValue p0,String p1){
       p0.setName(p1);
    }
    public static void access$2900(GranularConfiguration$AssignedPropertyValue p0){
       p0.clearName();
    }
    public static void access$3000(GranularConfiguration$AssignedPropertyValue p0,i80 p1){
       p0.setNameBytes(p1);
    }
    public static void access$3100(GranularConfiguration$AssignedPropertyValue p0,GranularConfiguration$AssignedPropertyValue$BoolValue p1){
       p0.setBoolValue(p1);
    }
    public static void access$3200(GranularConfiguration$AssignedPropertyValue p0,GranularConfiguration$AssignedPropertyValue$BoolValue p1){
       p0.mergeBoolValue(p1);
    }
    public static void access$3300(GranularConfiguration$AssignedPropertyValue p0){
       p0.clearBoolValue();
    }
    public static void access$3400(GranularConfiguration$AssignedPropertyValue p0,GranularConfiguration$AssignedPropertyValue$IntValue p1){
       p0.setIntValue(p1);
    }
    public static void access$3500(GranularConfiguration$AssignedPropertyValue p0,GranularConfiguration$AssignedPropertyValue$IntValue p1){
       p0.mergeIntValue(p1);
    }
    public static void access$3600(GranularConfiguration$AssignedPropertyValue p0){
       p0.clearIntValue();
    }
    public static void access$3700(GranularConfiguration$AssignedPropertyValue p0,GranularConfiguration$AssignedPropertyValue$EnumValue p1){
       p0.setEnumValue(p1);
    }
    public static void access$3800(GranularConfiguration$AssignedPropertyValue p0,GranularConfiguration$AssignedPropertyValue$EnumValue p1){
       p0.mergeEnumValue(p1);
    }
    public static void access$3900(GranularConfiguration$AssignedPropertyValue p0){
       p0.clearEnumValue();
    }
    private void clearBoolValue(){
       if (this.structuredValueCase_ == 1) {
          this.structuredValueCase_ = 0;
          this.structuredValue_ = null;
       }
       return;
    }
    private void clearClientId(){
       this.clientId_ = GranularConfiguration$AssignedPropertyValue.getDefaultInstance().getClientId();
    }
    private void clearComponentId(){
       this.componentId_ = GranularConfiguration$AssignedPropertyValue.getDefaultInstance().getComponentId();
    }
    private void clearEnumValue(){
       if (this.structuredValueCase_ == 3) {
          this.structuredValueCase_ = 0;
          this.structuredValue_ = null;
       }
       return;
    }
    private void clearGroupId(){
       this.groupId_ = 0;
    }
    private void clearIntValue(){
       if (this.structuredValueCase_ == 2) {
          this.structuredValueCase_ = 0;
          this.structuredValue_ = null;
       }
       return;
    }
    private void clearName(){
       this.name_ = GranularConfiguration$AssignedPropertyValue.getDefaultInstance().getName();
    }
    private void clearPlatform(){
       this.platform_ = 0;
    }
    private void clearPolicyId(){
       this.policyId_ = 0;
    }
    private void clearStructuredValue(){
       this.structuredValueCase_ = 0;
       this.structuredValue_ = null;
    }
    public static GranularConfiguration$AssignedPropertyValue getDefaultInstance(){
       return GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE;
    }
    private void mergeBoolValue(GranularConfiguration$AssignedPropertyValue$BoolValue p0){
       p0.getClass();
       this.structuredValue_ = (this.structuredValueCase_ == 1 && this.structuredValue_ != GranularConfiguration$AssignedPropertyValue$BoolValue.getDefaultInstance())? GranularConfiguration$AssignedPropertyValue$BoolValue.newBuilder(this.structuredValue_).mergeFrom(p0).buildPartial(): p0;
       this.structuredValueCase_ = 1;
       return;
    }
    private void mergeEnumValue(GranularConfiguration$AssignedPropertyValue$EnumValue p0){
       p0.getClass();
       this.structuredValue_ = (this.structuredValueCase_ == 3 && this.structuredValue_ != GranularConfiguration$AssignedPropertyValue$EnumValue.getDefaultInstance())? GranularConfiguration$AssignedPropertyValue$EnumValue.newBuilder(this.structuredValue_).mergeFrom(p0).buildPartial(): p0;
       this.structuredValueCase_ = 3;
       return;
    }
    private void mergeIntValue(GranularConfiguration$AssignedPropertyValue$IntValue p0){
       p0.getClass();
       this.structuredValue_ = (this.structuredValueCase_ == 2 && this.structuredValue_ != GranularConfiguration$AssignedPropertyValue$IntValue.getDefaultInstance())? GranularConfiguration$AssignedPropertyValue$IntValue.newBuilder(this.structuredValue_).mergeFrom(p0).buildPartial(): p0;
       this.structuredValueCase_ = 2;
       return;
    }
    public static GranularConfiguration$AssignedPropertyValue$Builder newBuilder(){
       return GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE.createBuilder();
    }
    public static GranularConfiguration$AssignedPropertyValue$Builder newBuilder(GranularConfiguration$AssignedPropertyValue p0){
       return GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static GranularConfiguration$AssignedPropertyValue parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue parseFrom(InputStream p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue parseFrom(ByteBuffer p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue parseFrom(i80 p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue parseFrom(sh0 p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static GranularConfiguration$AssignedPropertyValue parseFrom(byte[] p0){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration$AssignedPropertyValue parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE.getParserForType();
    }
    private void setBoolValue(GranularConfiguration$AssignedPropertyValue$BoolValue p0){
       p0.getClass();
       this.structuredValue_ = p0;
       this.structuredValueCase_ = 1;
    }
    private void setClientId(String p0){
       p0.getClass();
       this.clientId_ = p0;
    }
    private void setClientIdBytes(i80 p0){
       a.checkByteStringIsUtf8(p0);
       this.clientId_ = p0.r();
    }
    private void setComponentId(String p0){
       p0.getClass();
       this.componentId_ = p0;
    }
    private void setComponentIdBytes(i80 p0){
       a.checkByteStringIsUtf8(p0);
       this.componentId_ = p0.r();
    }
    private void setEnumValue(GranularConfiguration$AssignedPropertyValue$EnumValue p0){
       p0.getClass();
       this.structuredValue_ = p0;
       this.structuredValueCase_ = 3;
    }
    private void setGroupId(long p0){
       this.groupId_ = p0;
    }
    private void setIntValue(GranularConfiguration$AssignedPropertyValue$IntValue p0){
       p0.getClass();
       this.structuredValue_ = p0;
       this.structuredValueCase_ = 2;
    }
    private void setName(String p0){
       p0.getClass();
       this.name_ = p0;
    }
    private void setNameBytes(i80 p0){
       a.checkByteStringIsUtf8(p0);
       this.name_ = p0.r();
    }
    private void setPlatform(a p0){
       this.platform_ = p0.getNumber();
    }
    private void setPlatformValue(int p0){
       this.platform_ = p0;
    }
    private void setPolicyId(long p0){
       this.policyId_ = p0;
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
             Object[] objArray = new Object[11];
             objArray[0] = "structuredValue_";
             objArray[b] = "structuredValueCase_";
             objArray[2] = GranularConfiguration$AssignedPropertyValue$BoolValue.class;
             objArray[3] = GranularConfiguration$AssignedPropertyValue$IntValue.class;
             objArray[4] = GranularConfiguration$AssignedPropertyValue$EnumValue.class;
             objArray[5] = "clientId_";
             objArray[6] = "componentId_";
             objArray[7] = "name_";
             objArray[8] = "platform_";
             objArray[9] = "groupId_";
             objArray[10] = "policyId_";
             return c.newMessageInfo(GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE, "\xff\x02\xff\x02\t\x01\xff\x02\xff\x02\x01\t\t\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01<\xff\x02\xff\x02\x02<\xff\x02\xff\x02\x03<\xff\x02\xff\x02\x04\x02\x02\x05\x02\x02\x06\x02\x02\x07\f\b\x02\t\x02", objArray);
           case 3:
             return new GranularConfiguration$AssignedPropertyValue();
           case 4:
             return new GranularConfiguration$AssignedPropertyValue$Builder(p2);
           case 5:
             return GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = GranularConfiguration$AssignedPropertyValue.PARSER) == null) {
                _monitor_enter(GranularConfiguration$AssignedPropertyValue.class);
                if ((pARSER = GranularConfiguration$AssignedPropertyValue.PARSER) == null) {
                   pARSER = new ii2(GranularConfiguration$AssignedPropertyValue.DEFAULT_INSTANCE);
                   GranularConfiguration$AssignedPropertyValue.PARSER = pARSER;
                }
                _monitor_exit(GranularConfiguration$AssignedPropertyValue.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public GranularConfiguration$AssignedPropertyValue$BoolValue getBoolValue(){
       if (this.structuredValueCase_ == 1) {
          return this.structuredValue_;
       }
       return GranularConfiguration$AssignedPropertyValue$BoolValue.getDefaultInstance();
    }
    public String getClientId(){
       return this.clientId_;
    }
    public i80 getClientIdBytes(){
       return i80.d(this.clientId_);
    }
    public String getComponentId(){
       return this.componentId_;
    }
    public i80 getComponentIdBytes(){
       return i80.d(this.componentId_);
    }
    public s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public GranularConfiguration$AssignedPropertyValue$EnumValue getEnumValue(){
       if (this.structuredValueCase_ == 3) {
          return this.structuredValue_;
       }
       return GranularConfiguration$AssignedPropertyValue$EnumValue.getDefaultInstance();
    }
    public long getGroupId(){
       return this.groupId_;
    }
    public GranularConfiguration$AssignedPropertyValue$IntValue getIntValue(){
       if (this.structuredValueCase_ == 2) {
          return this.structuredValue_;
       }
       return GranularConfiguration$AssignedPropertyValue$IntValue.getDefaultInstance();
    }
    public String getName(){
       return this.name_;
    }
    public i80 getNameBytes(){
       return i80.d(this.name_);
    }
    public a getPlatform(){
       a uoa;
       if ((uoa = a.a(this.platform_)) == null) {
          uoa = a.w;
       }
       return uoa;
    }
    public int getPlatformValue(){
       return this.platform_;
    }
    public long getPolicyId(){
       return this.policyId_;
    }
    public GranularConfiguration$AssignedPropertyValue$StructuredValueCase getStructuredValueCase(){
       return GranularConfiguration$AssignedPropertyValue$StructuredValueCase.forNumber(this.structuredValueCase_);
    }
    public boolean hasBoolValue(){
       boolean b = true;
       if (this.structuredValueCase_ == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean hasEnumValue(){
       boolean b = (this.structuredValueCase_ == 3)? true: false;
       return b;
    }
    public boolean hasIntValue(){
       boolean b = (this.structuredValueCase_ == 2)? true: false;
       return b;
    }
    public r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public r74 toBuilder(){
       return super.toBuilder();
    }
}
