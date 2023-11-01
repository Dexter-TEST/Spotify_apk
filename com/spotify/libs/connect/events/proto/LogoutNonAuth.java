package com.spotify.libs.connect.events.proto.LogoutNonAuth;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.iv3;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class LogoutNonAuth extends c implements u74	// class@000909 from classes.dex
{
    private int bitField0_;
    private String logoutReason_;
    private boolean offlineUserRemoved_;
    private String protocolVersion_;
    private boolean storedCredentialsRemoved_;
    private static final LogoutNonAuth DEFAULT_INSTANCE;
    public static final int LOGOUT_REASON_FIELD_NUMBER;
    public static final int OFFLINE_USER_REMOVED_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PROTOCOL_VERSION_FIELD_NUMBER;
    public static final int STORED_CREDENTIALS_REMOVED_FIELD_NUMBER;

    static {
       LogoutNonAuth logoutNonAut = new LogoutNonAuth();
       LogoutNonAuth.DEFAULT_INSTANCE = logoutNonAut;
       c.registerDefaultInstance(LogoutNonAuth.class, logoutNonAut);
    }
    private void LogoutNonAuth(){
       super();
       this.protocolVersion_ = "";
       this.logoutReason_ = "";
    }
    public static LogoutNonAuth e(){
       return LogoutNonAuth.DEFAULT_INSTANCE;
    }
    public static void f(LogoutNonAuth p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.protocolVersion_ = p1;
    }
    public static void g(LogoutNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.logoutReason_ = p1;
    }
    public static void h(LogoutNonAuth p0,boolean p1){
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.storedCredentialsRemoved_ = p1;
    }
    public static void i(LogoutNonAuth p0,boolean p1){
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.offlineUserRemoved_ = p1;
    }
    public static iv3 j(){
       return LogoutNonAuth.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return LogoutNonAuth.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","protocolVersion_","logoutReason_","storedCredentialsRemoved_","offlineUserRemoved_"};
             return c.newMessageInfo(LogoutNonAuth.DEFAULT_INSTANCE, "\x01\x04\xff\x02\xff\x02\x01\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03", objArray);
           case 3:
             return new LogoutNonAuth();
           case 4:
             return new iv3();
           case 5:
             return LogoutNonAuth.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LogoutNonAuth.PARSER) == null) {
                _monitor_enter(LogoutNonAuth.class);
                if ((pARSER = LogoutNonAuth.PARSER) == null) {
                   pARSER = new ii2(LogoutNonAuth.DEFAULT_INSTANCE);
                   LogoutNonAuth.PARSER = pARSER;
                }
                _monitor_exit(LogoutNonAuth.class);
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
