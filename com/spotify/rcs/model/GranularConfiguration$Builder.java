package com.spotify.rcs.model.GranularConfiguration$Builder;
import p.u74;
import com.google.protobuf.b;
import com.spotify.rcs.model.GranularConfiguration;
import com.google.protobuf.c;
import com.spotify.rcs.model.GranularConfiguration$1;
import java.lang.Iterable;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue$Builder;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue;
import p.s74;
import p.r74;
import java.lang.Object;
import p.v1;
import java.lang.String;
import p.i80;
import java.util.List;
import java.util.Collections;
import com.google.protobuf.a;
import java.io.InputStream;
import p.yx1;
import p.sh0;

public final class GranularConfiguration$Builder extends b implements u74	// class@000bc5 from classes.dex
{

    private void GranularConfiguration$Builder(){
       super(GranularConfiguration.e());
    }
    public void GranularConfiguration$Builder(GranularConfiguration$1 p0){
       super();
    }
    public GranularConfiguration$Builder addAllProperties(Iterable p0){
       this.copyOnWrite();
       GranularConfiguration.i(this.instance, p0);
       return this;
    }
    public GranularConfiguration$Builder addProperties(int p0,GranularConfiguration$AssignedPropertyValue$Builder p1){
       this.copyOnWrite();
       GranularConfiguration.h(this.instance, p0, p1.build());
       return this;
    }
    public GranularConfiguration$Builder addProperties(int p0,GranularConfiguration$AssignedPropertyValue p1){
       this.copyOnWrite();
       GranularConfiguration.h(this.instance, p0, p1);
       return this;
    }
    public GranularConfiguration$Builder addProperties(GranularConfiguration$AssignedPropertyValue$Builder p0){
       this.copyOnWrite();
       GranularConfiguration.g(this.instance, p0.build());
       return this;
    }
    public GranularConfiguration$Builder addProperties(GranularConfiguration$AssignedPropertyValue p0){
       this.copyOnWrite();
       GranularConfiguration.g(this.instance, p0);
       return this;
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
    public GranularConfiguration$Builder clearConfigurationAssignmentId(){
       this.copyOnWrite();
       GranularConfiguration.o(this.instance);
       return this;
    }
    public GranularConfiguration$Builder clearPolicySnapshotId(){
       this.copyOnWrite();
       GranularConfiguration.r(this.instance);
       return this;
    }
    public GranularConfiguration$Builder clearProperties(){
       this.copyOnWrite();
       GranularConfiguration.j(this.instance);
       return this;
    }
    public GranularConfiguration$Builder clearRcsFetchTime(){
       this.copyOnWrite();
       GranularConfiguration.m(this.instance);
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
    public String getConfigurationAssignmentId(){
       return this.instance.t();
    }
    public i80 getConfigurationAssignmentIdBytes(){
       return this.instance.u();
    }
    public s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public long getPolicySnapshotId(){
       return this.instance.v();
    }
    public GranularConfiguration$AssignedPropertyValue getProperties(int p0){
       return this.instance.w(p0);
    }
    public int getPropertiesCount(){
       return this.instance.x();
    }
    public List getPropertiesList(){
       return Collections.unmodifiableList(this.instance.y());
    }
    public long getRcsFetchTime(){
       return this.instance.z();
    }
    public v1 internalMergeFrom(a p0){
       return super.internalMergeFrom(p0);
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
    public GranularConfiguration$Builder removeProperties(int p0){
       this.copyOnWrite();
       GranularConfiguration.k(this.instance, p0);
       return this;
    }
    public GranularConfiguration$Builder setConfigurationAssignmentId(String p0){
       this.copyOnWrite();
       GranularConfiguration.n(this.instance, p0);
       return this;
    }
    public GranularConfiguration$Builder setConfigurationAssignmentIdBytes(i80 p0){
       this.copyOnWrite();
       GranularConfiguration.p(this.instance, p0);
       return this;
    }
    public GranularConfiguration$Builder setPolicySnapshotId(long p0){
       this.copyOnWrite();
       GranularConfiguration.q(this.instance, p0);
       return this;
    }
    public GranularConfiguration$Builder setProperties(int p0,GranularConfiguration$AssignedPropertyValue$Builder p1){
       this.copyOnWrite();
       GranularConfiguration.f(this.instance, p0, p1.build());
       return this;
    }
    public GranularConfiguration$Builder setProperties(int p0,GranularConfiguration$AssignedPropertyValue p1){
       this.copyOnWrite();
       GranularConfiguration.f(this.instance, p0, p1);
       return this;
    }
    public GranularConfiguration$Builder setRcsFetchTime(long p0){
       this.copyOnWrite();
       GranularConfiguration.l(this.instance, p0);
       return this;
    }
}
