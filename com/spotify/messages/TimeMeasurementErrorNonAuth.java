package com.spotify.messages.TimeMeasurementErrorNonAuth;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import java.lang.String;
import java.lang.Object;
import p.r75;
import p.d47;
import com.google.protobuf.b;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.f47;
import p.i47;
import p.h47;
import p.e47;
import p.l47;
import p.j47;
import p.k47;
import p.g47;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class TimeMeasurementErrorNonAuth extends c implements u74	// class@000a0a from classes.dex
{
    private int bitField0_;
    private String category_;
    private g14 dimensions_;
    private int errorCode_;
    private g14 errorData_;
    private String featureId_;
    private String measurementId_;
    private g14 metadata_;
    private g14 ongoingPointFeatureIds_;
    private g14 ongoingPointTimestamps_;
    private long parentEpochOffset_;
    private String parentMeasurementId_;
    private g14 pointDurations_;
    private g14 pointFeatureIds_;
    private g14 pointTimestamps_;
    public static final int CATEGORY_FIELD_NUMBER = 5;
    private static final TimeMeasurementErrorNonAuth DEFAULT_INSTANCE;
    public static final int DIMENSIONS_FIELD_NUMBER;
    public static final int ERROR_CODE_FIELD_NUMBER;
    public static final int ERROR_DATA_FIELD_NUMBER;
    public static final int FEATURE_ID_FIELD_NUMBER;
    public static final int MEASUREMENT_ID_FIELD_NUMBER;
    public static final int METADATA_FIELD_NUMBER;
    public static final int ONGOING_POINT_FEATURE_IDS_FIELD_NUMBER;
    public static final int ONGOING_POINT_TIMESTAMPS_FIELD_NUMBER;
    public static final int PARENT_EPOCH_OFFSET_FIELD_NUMBER;
    public static final int PARENT_MEASUREMENT_ID_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int POINT_DURATIONS_FIELD_NUMBER;
    public static final int POINT_FEATURE_IDS_FIELD_NUMBER;
    public static final int POINT_TIMESTAMPS_FIELD_NUMBER;

    static {
       TimeMeasurementErrorNonAuth timeMeasurem = new TimeMeasurementErrorNonAuth();
       TimeMeasurementErrorNonAuth.DEFAULT_INSTANCE = timeMeasurem;
       c.registerDefaultInstance(TimeMeasurementErrorNonAuth.class, timeMeasurem);
    }
    private void TimeMeasurementErrorNonAuth(){
       super();
       g14 b = g14.b;
       this.errorData_ = b;
       this.ongoingPointTimestamps_ = b;
       this.ongoingPointFeatureIds_ = b;
       this.dimensions_ = b;
       this.pointTimestamps_ = b;
       this.pointDurations_ = b;
       this.pointFeatureIds_ = b;
       this.metadata_ = b;
       this.category_ = "";
       this.featureId_ = "";
       this.measurementId_ = "";
       this.parentMeasurementId_ = "";
    }
    public static TimeMeasurementErrorNonAuth e(){
       return TimeMeasurementErrorNonAuth.DEFAULT_INSTANCE;
    }
    public static void f(TimeMeasurementErrorNonAuth p0,int p1){
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.errorCode_ = p1;
    }
    public static g14 g(TimeMeasurementErrorNonAuth p0){
       TimeMeasurementErrorNonAuth pointTimesta = p0.pointTimestamps_;
       if (pointTimesta.a == null) {
          p0.pointTimestamps_ = pointTimesta.d();
       }
       return p0.pointTimestamps_;
    }
    public static g14 h(TimeMeasurementErrorNonAuth p0){
       TimeMeasurementErrorNonAuth pointDuratio = p0.pointDurations_;
       if (pointDuratio.a == null) {
          p0.pointDurations_ = pointDuratio.d();
       }
       return p0.pointDurations_;
    }
    public static g14 i(TimeMeasurementErrorNonAuth p0){
       TimeMeasurementErrorNonAuth pointFeature = p0.pointFeatureIds_;
       if (pointFeature.a == null) {
          p0.pointFeatureIds_ = pointFeature.d();
       }
       return p0.pointFeatureIds_;
    }
    public static void j(TimeMeasurementErrorNonAuth p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.featureId_ = p1;
    }
    public static void k(TimeMeasurementErrorNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.measurementId_ = p1;
    }
    public static void l(TimeMeasurementErrorNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x10;
       p0.parentMeasurementId_ = p1;
    }
    public static void m(TimeMeasurementErrorNonAuth p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x20;
       p0.parentEpochOffset_ = p1;
    }
    public static g14 n(TimeMeasurementErrorNonAuth p0){
       TimeMeasurementErrorNonAuth metadata_ = p0.metadata_;
       if (metadata_.a == null) {
          p0.metadata_ = metadata_.d();
       }
       return p0.metadata_;
    }
    public static g14 o(TimeMeasurementErrorNonAuth p0){
       TimeMeasurementErrorNonAuth errorData_ = p0.errorData_;
       if (errorData_.a == null) {
          p0.errorData_ = errorData_.d();
       }
       return p0.errorData_;
    }
    public static g14 p(TimeMeasurementErrorNonAuth p0){
       TimeMeasurementErrorNonAuth ongoingPoint = p0.ongoingPointTimestamps_;
       if (ongoingPoint.a == null) {
          p0.ongoingPointTimestamps_ = ongoingPoint.d();
       }
       return p0.ongoingPointTimestamps_;
    }
    public static r75 parser(){
       return TimeMeasurementErrorNonAuth.DEFAULT_INSTANCE.getParserForType();
    }
    public static g14 q(TimeMeasurementErrorNonAuth p0){
       TimeMeasurementErrorNonAuth ongoingPoint = p0.ongoingPointFeatureIds_;
       if (ongoingPoint.a == null) {
          p0.ongoingPointFeatureIds_ = ongoingPoint.d();
       }
       return p0.ongoingPointFeatureIds_;
    }
    public static void r(TimeMeasurementErrorNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.category_ = p1;
    }
    public static g14 s(TimeMeasurementErrorNonAuth p0){
       TimeMeasurementErrorNonAuth dimensions_ = p0.dimensions_;
       if (dimensions_.a == null) {
          p0.dimensions_ = dimensions_.d();
       }
       return p0.dimensions_;
    }
    public static d47 t(){
       return TimeMeasurementErrorNonAuth.DEFAULT_INSTANCE.createBuilder();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[23];
             objArray[0] = "bitField0_";
             objArray[b] = "errorCode_";
             objArray[2] = "errorData_";
             objArray[3] = f47.a;
             objArray[4] = "ongoingPointTimestamps_";
             objArray[5] = i47.a;
             objArray[6] = "ongoingPointFeatureIds_";
             objArray[7] = h47.a;
             objArray[8] = "category_";
             objArray[9] = "dimensions_";
             objArray[10] = e47.a;
             objArray[11] = "pointTimestamps_";
             objArray[12] = l47.a;
             objArray[13] = "pointDurations_";
             objArray[14] = j47.a;
             objArray[15] = "pointFeatureIds_";
             objArray[16] = k47.a;
             objArray[17] = "featureId_";
             objArray[18] = "measurementId_";
             objArray[19] = "parentMeasurementId_";
             objArray[20] = "parentEpochOffset_";
             objArray[21] = "metadata_";
             objArray[22] = g47.a;
             return c.newMessageInfo(TimeMeasurementErrorNonAuth.DEFAULT_INSTANCE, "\x01\x0e\xff\x02\xff\x02\x01\x01\x0e\x0e\b\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x022\x032\x042\x05\x10\x02\x01\x062\x072\b2\t2\n\x10\x02\x02\x0b\x10\x02\x03\f\x10\x02\x04\r\x10\x02\x05\x0e2", objArray);
           case 3:
             return new TimeMeasurementErrorNonAuth();
           case 4:
             return new d47();
           case 5:
             return TimeMeasurementErrorNonAuth.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = TimeMeasurementErrorNonAuth.PARSER) == null) {
                _monitor_enter(TimeMeasurementErrorNonAuth.class);
                if ((pARSER = TimeMeasurementErrorNonAuth.PARSER) == null) {
                   pARSER = new ii2(TimeMeasurementErrorNonAuth.DEFAULT_INSTANCE);
                   TimeMeasurementErrorNonAuth.PARSER = pARSER;
                }
                _monitor_exit(TimeMeasurementErrorNonAuth.class);
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
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
