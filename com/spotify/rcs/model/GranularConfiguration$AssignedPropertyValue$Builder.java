package com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$Builder;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValueOrBuilder;
import com.google.protobuf.b;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue;
import com.google.protobuf.c;
import com.spotify.rcs.model.GranularConfiguration$1;
import p.s74;
import p.r74;
import java.lang.Object;
import p.v1;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$BoolValue;
import java.lang.String;
import p.i80;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$EnumValue;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$IntValue;
import com.spotify.rcs.model.a;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$StructuredValueCase;
import com.google.protobuf.a;
import java.io.InputStream;
import p.yx1;
import p.sh0;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$BoolValue$Builder;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$EnumValue$Builder;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$IntValue$Builder;

public final class GranularConfiguration$AssignedPropertyValue$Builder extends b implements GranularConfiguration$AssignedPropertyValueOrBuilder	// class@000bbb from classes.dex
{

    private void GranularConfiguration$AssignedPropertyValue$Builder(){
       super(GranularConfiguration$AssignedPropertyValue.access$1300());
    }
    public void GranularConfiguration$AssignedPropertyValue$Builder(GranularConfiguration$1 p0){
       super();
    }
    public s74 build(){
       return super.build();
    }
    public s74 buildPartial(){
       return super.buildPartial();
    }
    public r74 clear(){
       return super.clear();
    }
    public GranularConfiguration$AssignedPropertyValue$Builder clearBoolValue(){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$3300(this.instance);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder clearClientId(){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$1900(this.instance);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder clearComponentId(){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$2200(this.instance);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder clearEnumValue(){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$3900(this.instance);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder clearGroupId(){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$2500(this.instance);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder clearIntValue(){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$3600(this.instance);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder clearName(){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$2900(this.instance);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder clearPlatform(){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$1700(this.instance);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder clearPolicyId(){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$2700(this.instance);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder clearStructuredValue(){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$1400(this.instance);
       return this;
    }
    public Object clone(){
       return super.clone();
    }
    public r74 clone(){
       return super.clone();
    }
    public v1 clone(){
       return super.clone();
    }
    public GranularConfiguration$AssignedPropertyValue$BoolValue getBoolValue(){
       return this.instance.getBoolValue();
    }
    public String getClientId(){
       return this.instance.getClientId();
    }
    public i80 getClientIdBytes(){
       return this.instance.getClientIdBytes();
    }
    public String getComponentId(){
       return this.instance.getComponentId();
    }
    public i80 getComponentIdBytes(){
       return this.instance.getComponentIdBytes();
    }
    public s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public GranularConfiguration$AssignedPropertyValue$EnumValue getEnumValue(){
       return this.instance.getEnumValue();
    }
    public long getGroupId(){
       return this.instance.getGroupId();
    }
    public GranularConfiguration$AssignedPropertyValue$IntValue getIntValue(){
       return this.instance.getIntValue();
    }
    public String getName(){
       return this.instance.getName();
    }
    public i80 getNameBytes(){
       return this.instance.getNameBytes();
    }
    public a getPlatform(){
       return this.instance.getPlatform();
    }
    public int getPlatformValue(){
       return this.instance.getPlatformValue();
    }
    public long getPolicyId(){
       return this.instance.getPolicyId();
    }
    public GranularConfiguration$AssignedPropertyValue$StructuredValueCase getStructuredValueCase(){
       return this.instance.getStructuredValueCase();
    }
    public boolean hasBoolValue(){
       return this.instance.hasBoolValue();
    }
    public boolean hasEnumValue(){
       return this.instance.hasEnumValue();
    }
    public boolean hasIntValue(){
       return this.instance.hasIntValue();
    }
    public v1 internalMergeFrom(a p0){
       return super.internalMergeFrom(p0);
    }
    public GranularConfiguration$AssignedPropertyValue$Builder mergeBoolValue(GranularConfiguration$AssignedPropertyValue$BoolValue p0){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$3200(this.instance, p0);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder mergeEnumValue(GranularConfiguration$AssignedPropertyValue$EnumValue p0){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$3800(this.instance, p0);
       return this;
    }
    public r74 mergeFrom(InputStream p0){
       return super.mergeFrom(p0);
    }
    public r74 mergeFrom(InputStream p0,yx1 p1){
       return super.mergeFrom(p0, p1);
    }
    public r74 mergeFrom(i80 p0){
       return super.mergeFrom(p0);
    }
    public r74 mergeFrom(i80 p0,yx1 p1){
       return super.mergeFrom(p0, p1);
    }
    public r74 mergeFrom(s74 p0){
       return super.mergeFrom(p0);
    }
    public r74 mergeFrom(sh0 p0){
       return super.mergeFrom(p0);
    }
    public r74 mergeFrom(sh0 p0,yx1 p1){
       return super.mergeFrom(p0, p1);
    }
    public r74 mergeFrom(byte[] p0){
       return super.mergeFrom(p0);
    }
    public r74 mergeFrom(byte[] p0,int p1,int p2){
       return super.mergeFrom(p0, p1, p2);
    }
    public r74 mergeFrom(byte[] p0,int p1,int p2,yx1 p3){
       return super.mergeFrom(p0, p1, p2, p3);
    }
    public r74 mergeFrom(byte[] p0,yx1 p1){
       return super.mergeFrom(p0, p1);
    }
    public v1 mergeFrom(sh0 p0,yx1 p1){
       return super.mergeFrom(p0, p1);
    }
    public v1 mergeFrom(byte[] p0,int p1,int p2){
       return super.mergeFrom(p0, p1, p2);
    }
    public v1 mergeFrom(byte[] p0,int p1,int p2,yx1 p3){
       return super.mergeFrom(p0, p1, p2, p3);
    }
    public GranularConfiguration$AssignedPropertyValue$Builder mergeIntValue(GranularConfiguration$AssignedPropertyValue$IntValue p0){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$3500(this.instance, p0);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder setBoolValue(GranularConfiguration$AssignedPropertyValue$BoolValue$Builder p0){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$3100(this.instance, p0.build());
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder setBoolValue(GranularConfiguration$AssignedPropertyValue$BoolValue p0){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$3100(this.instance, p0);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder setClientId(String p0){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$1800(this.instance, p0);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder setClientIdBytes(i80 p0){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$2000(this.instance, p0);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder setComponentId(String p0){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$2100(this.instance, p0);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder setComponentIdBytes(i80 p0){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$2300(this.instance, p0);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder setEnumValue(GranularConfiguration$AssignedPropertyValue$EnumValue$Builder p0){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$3700(this.instance, p0.build());
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder setEnumValue(GranularConfiguration$AssignedPropertyValue$EnumValue p0){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$3700(this.instance, p0);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder setGroupId(long p0){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$2400(this.instance, p0);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder setIntValue(GranularConfiguration$AssignedPropertyValue$IntValue$Builder p0){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$3400(this.instance, p0.build());
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder setIntValue(GranularConfiguration$AssignedPropertyValue$IntValue p0){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$3400(this.instance, p0);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder setName(String p0){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$2800(this.instance, p0);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder setNameBytes(i80 p0){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$3000(this.instance, p0);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder setPlatform(a p0){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$1600(this.instance, p0);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder setPlatformValue(int p0){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$1500(this.instance, p0);
       return this;
    }
    public GranularConfiguration$AssignedPropertyValue$Builder setPolicyId(long p0){
       this.copyOnWrite();
       GranularConfiguration$AssignedPropertyValue.access$2600(this.instance, p0);
       return this;
    }
}
