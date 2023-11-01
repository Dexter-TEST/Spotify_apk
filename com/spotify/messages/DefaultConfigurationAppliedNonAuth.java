package com.spotify.messages.DefaultConfigurationAppliedNonAuth;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import java.lang.Object;
import java.lang.String;
import p.v61;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.w61;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class DefaultConfigurationAppliedNonAuth extends c implements u74	// class@0009fd from classes.dex
{
    private int bitField0_;
    private String configurationAssignmentId_;
    private g14 identifiers_;
    private String installationId_;
    private String platform_;
    private String rcClientId_;
    private String rcClientVersion_;
    private String reason_;
    public static final int CONFIGURATION_ASSIGNMENT_ID_FIELD_NUMBER = 2;
    private static final DefaultConfigurationAppliedNonAuth DEFAULT_INSTANCE;
    public static final int IDENTIFIERS_FIELD_NUMBER;
    public static final int INSTALLATION_ID_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PLATFORM_FIELD_NUMBER;
    public static final int RC_CLIENT_ID_FIELD_NUMBER;
    public static final int RC_CLIENT_VERSION_FIELD_NUMBER;
    public static final int REASON_FIELD_NUMBER;

    static {
       DefaultConfigurationAppliedNonAuth uDefaultConf = new DefaultConfigurationAppliedNonAuth();
       DefaultConfigurationAppliedNonAuth.DEFAULT_INSTANCE = uDefaultConf;
       c.registerDefaultInstance(DefaultConfigurationAppliedNonAuth.class, uDefaultConf);
    }
    private void DefaultConfigurationAppliedNonAuth(){
       super();
       this.identifiers_ = g14.b;
       this.installationId_ = "";
       this.configurationAssignmentId_ = "";
       this.rcClientId_ = "";
       this.rcClientVersion_ = "";
       this.platform_ = "";
       this.reason_ = "";
    }
    public static DefaultConfigurationAppliedNonAuth e(){
       return DefaultConfigurationAppliedNonAuth.DEFAULT_INSTANCE;
    }
    public static void f(DefaultConfigurationAppliedNonAuth p0){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.rcClientVersion_ = "8.8.80.328";
    }
    public static void g(DefaultConfigurationAppliedNonAuth p0){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x10;
       p0.platform_ = "ANDROID";
    }
    public static g14 h(DefaultConfigurationAppliedNonAuth p0){
       DefaultConfigurationAppliedNonAuth identifiers_ = p0.identifiers_;
       if (identifiers_.a == null) {
          p0.identifiers_ = identifiers_.d();
       }
       return p0.identifiers_;
    }
    public static void i(DefaultConfigurationAppliedNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.configurationAssignmentId_ = p1;
    }
    public static void j(DefaultConfigurationAppliedNonAuth p0){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.rcClientId_ = "com.spotify.lite";
    }
    public static v61 k(){
       return DefaultConfigurationAppliedNonAuth.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return DefaultConfigurationAppliedNonAuth.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[9];
             objArray[0] = "bitField0_";
             objArray[b] = "installationId_";
             objArray[2] = "configurationAssignmentId_";
             objArray[3] = "rcClientId_";
             objArray[4] = "rcClientVersion_";
             objArray[5] = "platform_";
             objArray[6] = "reason_";
             objArray[7] = "identifiers_";
             objArray[8] = w61.a;
             return c.newMessageInfo(DefaultConfigurationAppliedNonAuth.DEFAULT_INSTANCE, "\x01\x07\xff\x02\xff\x02\x01\x01\x07\x07\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03\x05\x10\x02\x04\x06\x10\x02\x05\x072", objArray);
           case 3:
             return new DefaultConfigurationAppliedNonAuth();
           case 4:
             return new v61();
           case 5:
             return DefaultConfigurationAppliedNonAuth.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = DefaultConfigurationAppliedNonAuth.PARSER) == null) {
                _monitor_enter(DefaultConfigurationAppliedNonAuth.class);
                if ((pARSER = DefaultConfigurationAppliedNonAuth.PARSER) == null) {
                   pARSER = new ii2(DefaultConfigurationAppliedNonAuth.DEFAULT_INSTANCE);
                   DefaultConfigurationAppliedNonAuth.PARSER = pARSER;
                }
                _monitor_exit(DefaultConfigurationAppliedNonAuth.class);
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
