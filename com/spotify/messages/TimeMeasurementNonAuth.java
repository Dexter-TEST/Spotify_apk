package com.spotify.messages.TimeMeasurementNonAuth;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import java.lang.String;
import java.lang.Object;
import p.m47;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.n47;
import p.r47;
import p.p47;
import p.q47;
import p.o47;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class TimeMeasurementNonAuth extends c implements u74	// class@000a0b from classes.dex
{
    private int bitField0_;
    private String category_;
    private g14 dimensions_;
    private String featureId_;
    private String measurementId_;
    private g14 metadata_;
    private long parentEpochOffset_;
    private String parentMeasurementId_;
    private g14 pointDurations_;
    private g14 pointFeatureIds_;
    private g14 pointTimestamps_;
    public static final int CATEGORY_FIELD_NUMBER = 1;
    private static final TimeMeasurementNonAuth DEFAULT_INSTANCE;
    public static final int DIMENSIONS_FIELD_NUMBER;
    public static final int FEATURE_ID_FIELD_NUMBER;
    public static final int MEASUREMENT_ID_FIELD_NUMBER;
    public static final int METADATA_FIELD_NUMBER;
    public static final int PARENT_EPOCH_OFFSET_FIELD_NUMBER;
    public static final int PARENT_MEASUREMENT_ID_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int POINT_DURATIONS_FIELD_NUMBER;
    public static final int POINT_FEATURE_IDS_FIELD_NUMBER;
    public static final int POINT_TIMESTAMPS_FIELD_NUMBER;

    static {
       TimeMeasurementNonAuth timeMeasurem = new TimeMeasurementNonAuth();
       TimeMeasurementNonAuth.DEFAULT_INSTANCE = timeMeasurem;
       c.registerDefaultInstance(TimeMeasurementNonAuth.class, timeMeasurem);
    }
    private void TimeMeasurementNonAuth(){
       super();
       g14 b = g14.b;
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
    public static TimeMeasurementNonAuth e(){
       return TimeMeasurementNonAuth.DEFAULT_INSTANCE;
    }
    public static void f(TimeMeasurementNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.category_ = p1;
    }
    public static void g(TimeMeasurementNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.measurementId_ = p1;
    }
    public static g14 h(TimeMeasurementNonAuth p0){
       TimeMeasurementNonAuth metadata_ = p0.metadata_;
       if (metadata_.a == null) {
          p0.metadata_ = metadata_.d();
       }
       return p0.metadata_;
    }
    public static g14 i(TimeMeasurementNonAuth p0){
       TimeMeasurementNonAuth dimensions_ = p0.dimensions_;
       if (dimensions_.a == null) {
          p0.dimensions_ = dimensions_.d();
       }
       return p0.dimensions_;
    }
    public static g14 j(TimeMeasurementNonAuth p0){
       TimeMeasurementNonAuth pointTimesta = p0.pointTimestamps_;
       if (pointTimesta.a == null) {
          p0.pointTimestamps_ = pointTimesta.d();
       }
       return p0.pointTimestamps_;
    }
    public static g14 k(TimeMeasurementNonAuth p0){
       TimeMeasurementNonAuth pointDuratio = p0.pointDurations_;
       if (pointDuratio.a == null) {
          p0.pointDurations_ = pointDuratio.d();
       }
       return p0.pointDurations_;
    }
    public static g14 l(TimeMeasurementNonAuth p0){
       TimeMeasurementNonAuth pointFeature = p0.pointFeatureIds_;
       if (pointFeature.a == null) {
          p0.pointFeatureIds_ = pointFeature.d();
       }
       return p0.pointFeatureIds_;
    }
    public static void m(TimeMeasurementNonAuth p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.featureId_ = p1;
    }
    public static m47 n(){
       return TimeMeasurementNonAuth.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return TimeMeasurementNonAuth.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[16];
             objArray[0] = "bitField0_";
             objArray[b] = "category_";
             objArray[2] = "dimensions_";
             objArray[3] = n47.a;
             objArray[4] = "pointTimestamps_";
             objArray[5] = r47.a;
             objArray[6] = "pointDurations_";
             objArray[7] = p47.a;
             objArray[8] = "pointFeatureIds_";
             objArray[9] = q47.a;
             objArray[10] = "featureId_";
             objArray[11] = "measurementId_";
             objArray[12] = "parentMeasurementId_";
             objArray[13] = "parentEpochOffset_";
             objArray[14] = "metadata_";
             objArray[15] = o47.a;
             return c.newMessageInfo(TimeMeasurementNonAuth.DEFAULT_INSTANCE, "\x01\n\xff\x02\xff\x02\x01\x01\n\n\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x022\x032\x042\x052\x06\x10\x02\x01\x07\x10\x02\x02\b\x10\x02\x03\t\x10\x02\x04\n2", objArray);
           case 3:
             return new TimeMeasurementNonAuth();
           case 4:
             return new m47();
           case 5:
             return TimeMeasurementNonAuth.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = TimeMeasurementNonAuth.PARSER) == null) {
                _monitor_enter(TimeMeasurementNonAuth.class);
                if ((pARSER = TimeMeasurementNonAuth.PARSER) == null) {
                   pARSER = new ii2(TimeMeasurementNonAuth.DEFAULT_INSTANCE);
                   TimeMeasurementNonAuth.PARSER = pARSER;
                }
                _monitor_exit(TimeMeasurementNonAuth.class);
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
