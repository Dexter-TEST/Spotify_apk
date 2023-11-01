package com.spotify.rcs.model.GranularConfiguration;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import com.spotify.rcs.model.GranularConfiguration$Builder;
import com.google.protobuf.b;
import com.spotify.rcs.model.GranularConfiguration$AssignedPropertyValue;
import java.lang.Object;
import java.util.List;
import java.lang.Iterable;
import com.google.protobuf.a;
import java.lang.String;
import p.i80;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.rcs.model.GranularConfiguration$1;
import p.s74;
import java.lang.Byte;
import p.r74;
import p.f2;
import p.h80;

public final class GranularConfiguration extends c implements u74	// class@000bc6 from classes.dex
{
    private String configurationAssignmentId_;
    private long policySnapshotId_;
    private bc3 properties_;
    private long rcsFetchTime_;
    public static final int CONFIGURATION_ASSIGNMENT_ID_FIELD_NUMBER = 3;
    private static final GranularConfiguration DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int POLICY_SNAPSHOT_ID_FIELD_NUMBER;
    public static final int PROPERTIES_FIELD_NUMBER;
    public static final int RCS_FETCH_TIME_FIELD_NUMBER;

    static {
       GranularConfiguration granularConf = new GranularConfiguration();
       GranularConfiguration.DEFAULT_INSTANCE = granularConf;
       c.registerDefaultInstance(GranularConfiguration.class, granularConf);
    }
    private void GranularConfiguration(){
       super();
       this.properties_ = c.emptyProtobufList();
       this.configurationAssignmentId_ = "";
    }
    public static GranularConfiguration$Builder A(){
       return GranularConfiguration.DEFAULT_INSTANCE.createBuilder();
    }
    public static GranularConfiguration B(byte[] p0){
       return c.parseFrom(GranularConfiguration.DEFAULT_INSTANCE, p0);
    }
    public static GranularConfiguration e(){
       return GranularConfiguration.DEFAULT_INSTANCE;
    }
    public static void f(GranularConfiguration p0,int p1,GranularConfiguration$AssignedPropertyValue p2){
       p0.getClass();
       p2.getClass();
       p0.s();
       p0.properties_.set(p1, p2);
    }
    public static void g(GranularConfiguration p0,GranularConfiguration$AssignedPropertyValue p1){
       p0.getClass();
       p1.getClass();
       p0.s();
       p0.properties_.add(p1);
    }
    public static void h(GranularConfiguration p0,int p1,GranularConfiguration$AssignedPropertyValue p2){
       p0.getClass();
       p2.getClass();
       p0.s();
       p0.properties_.add(p1, p2);
    }
    public static void i(GranularConfiguration p0,Iterable p1){
       p0.s();
       a.addAll(p1, p0.properties_);
    }
    public static void j(GranularConfiguration p0){
       p0.getClass();
       p0.properties_ = c.emptyProtobufList();
    }
    public static void k(GranularConfiguration p0,int p1){
       p0.s();
       p0.properties_.remove(p1);
    }
    public static void l(GranularConfiguration p0,long p1){
       p0.rcsFetchTime_ = p1;
    }
    public static void m(GranularConfiguration p0){
       p0.rcsFetchTime_ = 0;
    }
    public static void n(GranularConfiguration p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.configurationAssignmentId_ = p1;
    }
    public static void o(GranularConfiguration p0){
       p0.getClass();
       p0.configurationAssignmentId_ = GranularConfiguration.DEFAULT_INSTANCE.configurationAssignmentId_;
    }
    public static void p(GranularConfiguration p0,i80 p1){
       p0.getClass();
       a.checkByteStringIsUtf8(p1);
       p0.configurationAssignmentId_ = p1.r();
    }
    public static r75 parser(){
       return GranularConfiguration.DEFAULT_INSTANCE.getParserForType();
    }
    public static void q(GranularConfiguration p0,long p1){
       p0.policySnapshotId_ = p1;
    }
    public static void r(GranularConfiguration p0){
       p0.policySnapshotId_ = 0;
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
             Object[] objArray = new Object[]{"properties_",GranularConfiguration$AssignedPropertyValue.class,"rcsFetchTime_","configurationAssignmentId_","policySnapshotId_"};
             return c.newMessageInfo(GranularConfiguration.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x02\x02\x03\x02\x02\x04\x02", objArray);
           case 3:
             return new GranularConfiguration();
           case 4:
             return new GranularConfiguration$Builder(p2);
           case 5:
             return GranularConfiguration.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = GranularConfiguration.PARSER) == null) {
                _monitor_enter(GranularConfiguration.class);
                if ((pARSER = GranularConfiguration.PARSER) == null) {
                   pARSER = new ii2(GranularConfiguration.DEFAULT_INSTANCE);
                   GranularConfiguration.PARSER = pARSER;
                }
                _monitor_exit(GranularConfiguration.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final void s(){
       GranularConfiguration tproperties_ = this.properties_;
       if (tproperties_.a == null) {
          this.properties_ = c.mutableCopy(tproperties_);
       }
       return;
    }
    public final String t(){
       return this.configurationAssignmentId_;
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
    public final i80 u(){
       return i80.d(this.configurationAssignmentId_);
    }
    public final long v(){
       return this.policySnapshotId_;
    }
    public final GranularConfiguration$AssignedPropertyValue w(int p0){
       return this.properties_.get(p0);
    }
    public final int x(){
       return this.properties_.size();
    }
    public final List y(){
       return this.properties_;
    }
    public final long z(){
       return this.rcsFetchTime_;
    }
}
