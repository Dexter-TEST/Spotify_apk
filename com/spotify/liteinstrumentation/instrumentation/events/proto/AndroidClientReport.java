package com.spotify.liteinstrumentation.instrumentation.events.proto.AndroidClientReport;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import p.f2;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.a;
import p.hc;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class AndroidClientReport extends c implements u74	// class@00092b from classes.dex
{
    private int bitField0_;
    private bc3 certSignatures_;
    private String installerName_;
    private String packageName_;
    public static final int CERT_SIGNATURES_FIELD_NUMBER = 2;
    private static final AndroidClientReport DEFAULT_INSTANCE;
    public static final int INSTALLER_NAME_FIELD_NUMBER;
    public static final int PACKAGE_NAME_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       AndroidClientReport uAndroidClie = new AndroidClientReport();
       AndroidClientReport.DEFAULT_INSTANCE = uAndroidClie;
       c.registerDefaultInstance(AndroidClientReport.class, uAndroidClie);
    }
    private void AndroidClientReport(){
       super();
       this.packageName_ = "";
       this.certSignatures_ = c.emptyProtobufList();
       this.installerName_ = "";
    }
    public static AndroidClientReport e(){
       return AndroidClientReport.DEFAULT_INSTANCE;
    }
    public static void f(AndroidClientReport p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.packageName_ = p1;
    }
    public static void g(AndroidClientReport p0,ArrayList p1){
       AndroidClientReport certSignatur = p0.certSignatures_;
       if (certSignatur.a == null) {
          p0.certSignatures_ = c.mutableCopy(certSignatur);
       }
       a.addAll(p1, p0.certSignatures_);
       return;
    }
    public static void h(AndroidClientReport p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.installerName_ = p1;
    }
    public static hc i(){
       return AndroidClientReport.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return AndroidClientReport.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","packageName_","certSignatures_","installerName_"};
             return c.newMessageInfo(AndroidClientReport.DEFAULT_INSTANCE, "\x01\x03\xff\x02\xff\x02\x01\x01\x03\x03\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x1a\x03\x10\x02\x01", objArray);
           case 3:
             return new AndroidClientReport();
           case 4:
             return new hc();
           case 5:
             return AndroidClientReport.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = AndroidClientReport.PARSER) == null) {
                _monitor_enter(AndroidClientReport.class);
                if ((pARSER = AndroidClientReport.PARSER) == null) {
                   pARSER = new ii2(AndroidClientReport.DEFAULT_INSTANCE);
                   AndroidClientReport.PARSER = pARSER;
                }
                _monitor_exit(AndroidClientReport.class);
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
