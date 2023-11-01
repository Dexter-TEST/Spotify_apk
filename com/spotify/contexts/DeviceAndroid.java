package com.spotify.contexts.DeviceAndroid;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.y91;
import com.google.protobuf.b;
import p.i80;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class DeviceAndroid extends c implements u74	// class@000839 from classes.dex
{
    private String androidId_;
    private int bitField0_;
    private String manufacturer_;
    private String model_;
    private String release_;
    private int sdk_;
    public static final int ANDROID_ID_FIELD_NUMBER = 5;
    private static final DeviceAndroid DEFAULT_INSTANCE;
    public static final int MANUFACTURER_FIELD_NUMBER;
    public static final int MODEL_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int RELEASE_FIELD_NUMBER;
    public static final int SDK_FIELD_NUMBER;

    static {
       DeviceAndroid uDeviceAndro = new DeviceAndroid();
       DeviceAndroid.DEFAULT_INSTANCE = uDeviceAndro;
       c.registerDefaultInstance(DeviceAndroid.class, uDeviceAndro);
    }
    private void DeviceAndroid(){
       super();
       this.manufacturer_ = "";
       this.model_ = "";
       this.release_ = "";
       this.androidId_ = "";
    }
    public static DeviceAndroid e(){
       return DeviceAndroid.DEFAULT_INSTANCE;
    }
    public static void f(DeviceAndroid p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.manufacturer_ = p1;
    }
    public static void g(DeviceAndroid p0,int p1){
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.sdk_ = p1;
    }
    public static void h(DeviceAndroid p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x10;
       p0.androidId_ = p1;
    }
    public static void i(DeviceAndroid p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.model_ = p1;
    }
    public static void j(DeviceAndroid p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.release_ = p1;
    }
    public static y91 l(){
       return DeviceAndroid.DEFAULT_INSTANCE.createBuilder();
    }
    public static DeviceAndroid m(i80 p0){
       return c.parseFrom(DeviceAndroid.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return DeviceAndroid.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","manufacturer_","model_","release_","sdk_","androidId_"};
             return c.newMessageInfo(DeviceAndroid.DEFAULT_INSTANCE, "\x01\x05\xff\x02\xff\x02\x01\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03\x05\x10\x02\x04", objArray);
           case 3:
             return new DeviceAndroid();
           case 4:
             return new y91();
           case 5:
             return DeviceAndroid.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = DeviceAndroid.PARSER) == null) {
                _monitor_enter(DeviceAndroid.class);
                if ((pARSER = DeviceAndroid.PARSER) == null) {
                   pARSER = new ii2(DeviceAndroid.DEFAULT_INSTANCE);
                   DeviceAndroid.PARSER = pARSER;
                }
                _monitor_exit(DeviceAndroid.class);
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
    public final String k(){
       return this.androidId_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
