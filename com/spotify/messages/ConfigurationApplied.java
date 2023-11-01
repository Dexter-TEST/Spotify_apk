package com.spotify.messages.ConfigurationApplied;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import p.xb3;
import java.lang.String;
import java.lang.Object;
import java.util.Set;
import p.f2;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.a;
import p.co0;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.do0;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class ConfigurationApplied extends c implements u74	// class@0009f8 from classes.dex
{
    private int bitField0_;
    private String configurationAssignmentId_;
    private String fetchType_;
    private g14 identifiers_;
    private String installationId_;
    private long lastRcsFetchTime_;
    private String platform_;
    private xb3 policyGroupIds_;
    private String rcClientId_;
    private String rcClientVersion_;
    public static final int CONFIGURATION_ASSIGNMENT_ID_FIELD_NUMBER = 4;
    private static final ConfigurationApplied DEFAULT_INSTANCE;
    public static final int FETCH_TYPE_FIELD_NUMBER;
    public static final int IDENTIFIERS_FIELD_NUMBER;
    public static final int INSTALLATION_ID_FIELD_NUMBER;
    public static final int LAST_RCS_FETCH_TIME_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PLATFORM_FIELD_NUMBER;
    public static final int POLICY_GROUP_IDS_FIELD_NUMBER;
    public static final int RC_CLIENT_ID_FIELD_NUMBER;
    public static final int RC_CLIENT_VERSION_FIELD_NUMBER;

    static {
       ConfigurationApplied uConfigurati = new ConfigurationApplied();
       ConfigurationApplied.DEFAULT_INSTANCE = uConfigurati;
       c.registerDefaultInstance(ConfigurationApplied.class, uConfigurati);
    }
    private void ConfigurationApplied(){
       super();
       this.identifiers_ = g14.b;
       this.installationId_ = "";
       this.policyGroupIds_ = c.emptyIntList();
       this.configurationAssignmentId_ = "";
       this.rcClientId_ = "";
       this.rcClientVersion_ = "";
       this.platform_ = "";
       this.fetchType_ = "";
    }
    public static ConfigurationApplied e(){
       return ConfigurationApplied.DEFAULT_INSTANCE;
    }
    public static void f(ConfigurationApplied p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.lastRcsFetchTime_ = p1;
    }
    public static void g(ConfigurationApplied p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.configurationAssignmentId_ = p1;
    }
    public static void h(ConfigurationApplied p0){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.rcClientId_ = "com.spotify.lite";
    }
    public static void i(ConfigurationApplied p0){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x10;
       p0.rcClientVersion_ = "8.8.80.328";
    }
    public static void j(ConfigurationApplied p0){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x20;
       p0.platform_ = "ANDROID";
    }
    public static g14 k(ConfigurationApplied p0){
       ConfigurationApplied identifiers_ = p0.identifiers_;
       if (identifiers_.a == null) {
          p0.identifiers_ = identifiers_.d();
       }
       return p0.identifiers_;
    }
    public static void l(ConfigurationApplied p0,Set p1){
       ConfigurationApplied policyGroupI = p0.policyGroupIds_;
       if (policyGroupI.a == null) {
          p0.policyGroupIds_ = c.mutableCopy(policyGroupI);
       }
       a.addAll(p1, p0.policyGroupIds_);
       return;
    }
    public static co0 m(){
       return ConfigurationApplied.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return ConfigurationApplied.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[11];
             objArray[0] = "bitField0_";
             objArray[b] = "lastRcsFetchTime_";
             objArray[2] = "installationId_";
             objArray[3] = "policyGroupIds_";
             objArray[4] = "configurationAssignmentId_";
             objArray[5] = "rcClientId_";
             objArray[6] = "rcClientVersion_";
             objArray[7] = "platform_";
             objArray[8] = "fetchType_";
             objArray[9] = "identifiers_";
             objArray[10] = do0.a;
             return c.newMessageInfo(ConfigurationApplied.DEFAULT_INSTANCE, "\x01\t\xff\x02\xff\x02\x01\x01\t\t\x01\x01\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x16\x04\x10\x02\x02\x05\x10\x02\x03\x06\x10\x02\x04\x07\x10\x02\x05\b\x10\x02\x06\t2", objArray);
           case 3:
             return new ConfigurationApplied();
           case 4:
             return new co0();
           case 5:
             return ConfigurationApplied.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ConfigurationApplied.PARSER) == null) {
                _monitor_enter(ConfigurationApplied.class);
                if ((pARSER = ConfigurationApplied.PARSER) == null) {
                   pARSER = new ii2(ConfigurationApplied.DEFAULT_INSTANCE);
                   ConfigurationApplied.PARSER = pARSER;
                }
                _monitor_exit(ConfigurationApplied.class);
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
