package com.spotify.contexts.ApplicationAndroid;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.zj;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class ApplicationAndroid extends c implements u74	// class@000837 from classes.dex
{
    private int bitField0_;
    private long versionCode_;
    private String versionName_;
    private static final ApplicationAndroid DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VERSION_CODE_FIELD_NUMBER;
    public static final int VERSION_NAME_FIELD_NUMBER;

    static {
       ApplicationAndroid uApplication = new ApplicationAndroid();
       ApplicationAndroid.DEFAULT_INSTANCE = uApplication;
       c.registerDefaultInstance(ApplicationAndroid.class, uApplication);
    }
    private void ApplicationAndroid(){
       super();
       this.versionName_ = "";
    }
    public static ApplicationAndroid e(){
       return ApplicationAndroid.DEFAULT_INSTANCE;
    }
    public static void f(ApplicationAndroid p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.versionName_ = p1;
    }
    public static void g(ApplicationAndroid p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.versionCode_ = p1;
    }
    public static zj h(){
       return ApplicationAndroid.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return ApplicationAndroid.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","versionName_","versionCode_"};
             return c.newMessageInfo(ApplicationAndroid.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01", objArray);
           case 3:
             return new ApplicationAndroid();
           case 4:
             return new zj();
           case 5:
             return ApplicationAndroid.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ApplicationAndroid.PARSER) == null) {
                _monitor_enter(ApplicationAndroid.class);
                if ((pARSER = ApplicationAndroid.PARSER) == null) {
                   pARSER = new ii2(ApplicationAndroid.DEFAULT_INSTANCE);
                   ApplicationAndroid.PARSER = pARSER;
                }
                _monitor_exit(ApplicationAndroid.class);
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
