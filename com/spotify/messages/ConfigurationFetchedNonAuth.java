package com.spotify.messages.ConfigurationFetchedNonAuth;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import java.lang.Object;
import java.lang.String;
import p.r75;
import p.lo0;
import com.google.protobuf.b;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.mo0;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class ConfigurationFetchedNonAuth extends c implements u74	// class@0009fb from classes.dex
{
    private String attributesSetId_;
    private int bitField0_;
    private String configurationAssignmentId_;
    private int errorCodeAccountAttributes_;
    private int errorCodeConfigurationResolve_;
    private String errorMessageAccountAttributes_;
    private String errorMessageConfigurationResolve_;
    private String errorMessage_;
    private String errorReasonAccountAttributes_;
    private String errorReasonConfigurationResolve_;
    private String errorReason_;
    private String fetchType_;
    private g14 identifiers_;
    private String installationId_;
    private long lastRcsFetchTime_;
    private long latency_;
    private long payloadSize_;
    private String platform_;
    private String propertySetId_;
    private String rcClientId_;
    private String rcClientVersion_;
    private String rcSdkVersion_;
    private int statusCode_;
    public static final int ATTRIBUTES_SET_ID_FIELD_NUMBER = 5;
    public static final int CONFIGURATION_ASSIGNMENT_ID_FIELD_NUMBER = 3;
    private static final ConfigurationFetchedNonAuth DEFAULT_INSTANCE;
    public static final int ERROR_CODE_ACCOUNT_ATTRIBUTES_FIELD_NUMBER;
    public static final int ERROR_CODE_CONFIGURATION_RESOLVE_FIELD_NUMBER;
    public static final int ERROR_MESSAGE_ACCOUNT_ATTRIBUTES_FIELD_NUMBER;
    public static final int ERROR_MESSAGE_CONFIGURATION_RESOLVE_FIELD_NUMBER;
    public static final int ERROR_MESSAGE_FIELD_NUMBER;
    public static final int ERROR_REASON_ACCOUNT_ATTRIBUTES_FIELD_NUMBER;
    public static final int ERROR_REASON_CONFIGURATION_RESOLVE_FIELD_NUMBER;
    public static final int ERROR_REASON_FIELD_NUMBER;
    public static final int FETCH_TYPE_FIELD_NUMBER;
    public static final int IDENTIFIERS_FIELD_NUMBER;
    public static final int INSTALLATION_ID_FIELD_NUMBER;
    public static final int LAST_RCS_FETCH_TIME_FIELD_NUMBER;
    public static final int LATENCY_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PAYLOAD_SIZE_FIELD_NUMBER;
    public static final int PLATFORM_FIELD_NUMBER;
    public static final int PROPERTY_SET_ID_FIELD_NUMBER;
    public static final int RC_CLIENT_ID_FIELD_NUMBER;
    public static final int RC_CLIENT_VERSION_FIELD_NUMBER;
    public static final int RC_SDK_VERSION_FIELD_NUMBER;
    public static final int STATUS_CODE_FIELD_NUMBER;

    static {
       ConfigurationFetchedNonAuth uConfigurati = new ConfigurationFetchedNonAuth();
       ConfigurationFetchedNonAuth.DEFAULT_INSTANCE = uConfigurati;
       c.registerDefaultInstance(ConfigurationFetchedNonAuth.class, uConfigurati);
    }
    private void ConfigurationFetchedNonAuth(){
       super();
       this.identifiers_ = g14.b;
       this.installationId_ = "";
       this.configurationAssignmentId_ = "";
       this.propertySetId_ = "";
       this.attributesSetId_ = "";
       this.rcClientId_ = "";
       this.rcClientVersion_ = "";
       this.rcSdkVersion_ = "";
       this.platform_ = "";
       this.fetchType_ = "";
       this.errorReason_ = "";
       this.errorMessage_ = "";
       this.errorReasonConfigurationResolve_ = "";
       this.errorMessageConfigurationResolve_ = "";
       this.errorReasonAccountAttributes_ = "";
       this.errorMessageAccountAttributes_ = "";
    }
    public static ConfigurationFetchedNonAuth e(){
       return ConfigurationFetchedNonAuth.DEFAULT_INSTANCE;
    }
    public static void f(ConfigurationFetchedNonAuth p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.lastRcsFetchTime_ = p1;
    }
    public static void g(ConfigurationFetchedNonAuth p0){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x20;
       p0.rcClientId_ = "com.spotify.lite";
    }
    public static void h(ConfigurationFetchedNonAuth p0){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x40;
       p0.rcClientVersion_ = "8.8.80.328";
    }
    public static void i(ConfigurationFetchedNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x0080;
       p0.rcSdkVersion_ = p1;
    }
    public static void j(ConfigurationFetchedNonAuth p0){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x0100;
       p0.platform_ = "ANDROID";
    }
    public static void k(ConfigurationFetchedNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x0200;
       p0.fetchType_ = p1;
    }
    public static void l(ConfigurationFetchedNonAuth p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x0400;
       p0.latency_ = p1;
    }
    public static void m(ConfigurationFetchedNonAuth p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x0800;
       p0.payloadSize_ = p1;
    }
    public static void n(ConfigurationFetchedNonAuth p0,int p1){
       p0.bitField0_ = p0.bitField0_ | 0x1000;
       p0.statusCode_ = p1;
    }
    public static void o(ConfigurationFetchedNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x2000;
       p0.errorReason_ = p1;
    }
    public static void p(ConfigurationFetchedNonAuth p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x4000;
       p0.errorMessage_ = p1;
    }
    public static r75 parser(){
       return ConfigurationFetchedNonAuth.DEFAULT_INSTANCE.getParserForType();
    }
    public static void q(ConfigurationFetchedNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x8000;
       p0.errorReasonConfigurationResolve_ = p1;
    }
    public static void r(ConfigurationFetchedNonAuth p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x10000;
       p0.errorMessageConfigurationResolve_ = p1;
    }
    public static void s(ConfigurationFetchedNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x20000;
       p0.errorReasonAccountAttributes_ = p1;
    }
    public static void t(ConfigurationFetchedNonAuth p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x40000;
       p0.errorMessageAccountAttributes_ = p1;
    }
    public static void u(ConfigurationFetchedNonAuth p0,int p1){
       p0.bitField0_ = p0.bitField0_ | 0x80000;
       p0.errorCodeAccountAttributes_ = p1;
    }
    public static void v(ConfigurationFetchedNonAuth p0,int p1){
       p0.bitField0_ = p0.bitField0_ | 0x100000;
       p0.errorCodeConfigurationResolve_ = p1;
    }
    public static g14 w(ConfigurationFetchedNonAuth p0){
       ConfigurationFetchedNonAuth identifiers_ = p0.identifiers_;
       if (identifiers_.a == null) {
          p0.identifiers_ = identifiers_.d();
       }
       return p0.identifiers_;
    }
    public static void x(ConfigurationFetchedNonAuth p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.configurationAssignmentId_ = p1;
    }
    public static void y(ConfigurationFetchedNonAuth p0){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.propertySetId_ = "35ce984288e048b77569527ac392fb22820c4fa8bffb9500d0c8995981d9533e";
    }
    public static lo0 z(){
       return ConfigurationFetchedNonAuth.DEFAULT_INSTANCE.createBuilder();
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
             Object[] objArray = new Object[24];
             objArray[0] = "bitField0_";
             objArray[b] = "lastRcsFetchTime_";
             objArray[2] = "installationId_";
             objArray[3] = "configurationAssignmentId_";
             objArray[4] = "propertySetId_";
             objArray[5] = "attributesSetId_";
             objArray[6] = "rcClientId_";
             objArray[7] = "rcClientVersion_";
             objArray[8] = "rcSdkVersion_";
             objArray[9] = "platform_";
             objArray[10] = "fetchType_";
             objArray[11] = "latency_";
             objArray[12] = "payloadSize_";
             objArray[13] = "statusCode_";
             objArray[14] = "errorReason_";
             objArray[15] = "errorMessage_";
             objArray[16] = "errorReasonConfigurationResolve_";
             objArray[17] = "errorMessageConfigurationResolve_";
             objArray[18] = "errorReasonAccountAttributes_";
             objArray[19] = "errorMessageAccountAttributes_";
             objArray[20] = "errorCodeAccountAttributes_";
             objArray[21] = "errorCodeConfigurationResolve_";
             objArray[22] = "identifiers_";
             objArray[23] = mo0.a;
             return c.newMessageInfo(ConfigurationFetchedNonAuth.DEFAULT_INSTANCE, "\x01\x16\xff\x02\xff\x02\x01\x01\x16\x16\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03\x05\x10\x02\x04\x06\x10\x02\x05\x07\x10\x02\x06\b\x10\x02\x07\t\x10\x02\b\n\x10\x02\t\x0b\x10\x02\n\f\x10\x02\x0b\r\x10\x02\f\x0e\x10\x02\r\x0f\x10\x02\x0e\x10\x10\x02\x0f\x11\x10\x02\x10\x12\x10\x02\x11\x13\x10\x02\x12\x14\x10\x02\x13\x15\x10\x02\x14\x162", objArray);
           case 3:
             return new ConfigurationFetchedNonAuth();
           case 4:
             return new lo0();
           case 5:
             return ConfigurationFetchedNonAuth.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ConfigurationFetchedNonAuth.PARSER) == null) {
                _monitor_enter(ConfigurationFetchedNonAuth.class);
                if ((pARSER = ConfigurationFetchedNonAuth.PARSER) == null) {
                   pARSER = new ii2(ConfigurationFetchedNonAuth.DEFAULT_INSTANCE);
                   ConfigurationFetchedNonAuth.PARSER = pARSER;
                }
                _monitor_exit(ConfigurationFetchedNonAuth.class);
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
