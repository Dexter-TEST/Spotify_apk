package com.spotify.liteinstrumentation.instrumentation.events.proto.AndroidDeviceReport;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.r75;
import p.mc;
import com.google.protobuf.b;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class AndroidDeviceReport extends c implements u74	// class@00092c from classes.dex
{
    private int bitField0_;
    private String brand_;
    private long cpuFamily_;
    private long cpuFeatures_;
    private long fbYearclass_;
    private String firmware_;
    private String manufacturer_;
    private long maxFreq_;
    private long memory_;
    private String model_;
    private long numProcessors_;
    private long performanceClass_;
    private long screenHeight_;
    private float screenSize_;
    private long screenWidth_;
    public static final int BRAND_FIELD_NUMBER = 13;
    public static final int CPU_FAMILY_FIELD_NUMBER = 11;
    public static final int CPU_FEATURES_FIELD_NUMBER = 10;
    private static final AndroidDeviceReport DEFAULT_INSTANCE;
    public static final int FB_YEARCLASS_FIELD_NUMBER;
    public static final int FIRMWARE_FIELD_NUMBER;
    public static final int MANUFACTURER_FIELD_NUMBER;
    public static final int MAX_FREQ_FIELD_NUMBER;
    public static final int MEMORY_FIELD_NUMBER;
    public static final int MODEL_FIELD_NUMBER;
    public static final int NUM_PROCESSORS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PERFORMANCE_CLASS_FIELD_NUMBER;
    public static final int SCREEN_HEIGHT_FIELD_NUMBER;
    public static final int SCREEN_SIZE_FIELD_NUMBER;
    public static final int SCREEN_WIDTH_FIELD_NUMBER;

    static {
       AndroidDeviceReport uAndroidDevi = new AndroidDeviceReport();
       AndroidDeviceReport.DEFAULT_INSTANCE = uAndroidDevi;
       c.registerDefaultInstance(AndroidDeviceReport.class, uAndroidDevi);
    }
    private void AndroidDeviceReport(){
       super();
       this.manufacturer_ = "";
       this.firmware_ = "";
       this.model_ = "";
       this.brand_ = "";
    }
    public static AndroidDeviceReport e(){
       return AndroidDeviceReport.DEFAULT_INSTANCE;
    }
    public static void f(AndroidDeviceReport p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.manufacturer_ = p1;
    }
    public static void g(AndroidDeviceReport p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x10;
       p0.memory_ = p1;
    }
    public static void h(AndroidDeviceReport p0,float p1){
       p0.bitField0_ = p0.bitField0_ | 0x20;
       p0.screenSize_ = p1;
    }
    public static void i(AndroidDeviceReport p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x40;
       p0.screenWidth_ = p1;
    }
    public static void j(AndroidDeviceReport p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x0080;
       p0.screenHeight_ = p1;
    }
    public static void k(AndroidDeviceReport p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x0100;
       p0.fbYearclass_ = p1;
    }
    public static void l(AndroidDeviceReport p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x0200;
       p0.cpuFeatures_ = p1;
    }
    public static void m(AndroidDeviceReport p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x0400;
       p0.cpuFamily_ = p1;
    }
    public static void n(AndroidDeviceReport p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.firmware_ = p1;
    }
    public static void o(AndroidDeviceReport p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.numProcessors_ = p1;
    }
    public static void p(AndroidDeviceReport p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.maxFreq_ = p1;
    }
    public static r75 parser(){
       return AndroidDeviceReport.DEFAULT_INSTANCE.getParserForType();
    }
    public static mc q(){
       return AndroidDeviceReport.DEFAULT_INSTANCE.createBuilder();
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
             Object[] objArray = new Object[15];
             objArray[0] = "bitField0_";
             objArray[b] = "manufacturer_";
             objArray[2] = "firmware_";
             objArray[3] = "numProcessors_";
             objArray[4] = "maxFreq_";
             objArray[5] = "memory_";
             objArray[6] = "screenSize_";
             objArray[7] = "screenWidth_";
             objArray[8] = "screenHeight_";
             objArray[9] = "fbYearclass_";
             objArray[10] = "cpuFeatures_";
             objArray[11] = "cpuFamily_";
             objArray[12] = "model_";
             objArray[13] = "brand_";
             objArray[14] = "performanceClass_";
             return c.newMessageInfo(AndroidDeviceReport.DEFAULT_INSTANCE, "\x01\x0e\xff\x02\xff\x02\x01\x01\x0e\x0e\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03\x05\x10\x02\x04\x06\x10\x02\x05\x07\x10\x02\x06\b\x10\x02\x07\t\x10\x02\b\n\x10\x02\t\x0b\x10\x02\n\f\x10\x02\x0b\r\x10\x02\f\x0e\x10\x02\r", objArray);
           case 3:
             return new AndroidDeviceReport();
           case 4:
             return new mc();
           case 5:
             return AndroidDeviceReport.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = AndroidDeviceReport.PARSER) == null) {
                _monitor_enter(AndroidDeviceReport.class);
                if ((pARSER = AndroidDeviceReport.PARSER) == null) {
                   pARSER = new ii2(AndroidDeviceReport.DEFAULT_INSTANCE);
                   AndroidDeviceReport.PARSER = pARSER;
                }
                _monitor_exit(AndroidDeviceReport.class);
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
