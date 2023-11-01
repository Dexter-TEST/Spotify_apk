package com.spotify.login5.v3.proto.ClientInfo;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import p.ug0;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class ClientInfo extends c implements u74	// class@0009df from classes.dex
{
    private String clientId_;
    private String deviceId_;
    public static final int CLIENT_ID_FIELD_NUMBER = 1;
    private static final ClientInfo DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       ClientInfo uClientInfo = new ClientInfo();
       ClientInfo.DEFAULT_INSTANCE = uClientInfo;
       c.registerDefaultInstance(ClientInfo.class, uClientInfo);
    }
    private void ClientInfo(){
       super();
       this.clientId_ = "";
       this.deviceId_ = "";
    }
    public static ClientInfo e(){
       return ClientInfo.DEFAULT_INSTANCE;
    }
    public static void f(ClientInfo p0){
       p0.getClass();
       p0.clientId_ = "7e7cf598605d47caba394c628e2735a2";
    }
    public static void g(ClientInfo p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.deviceId_ = p1;
    }
    public static ug0 h(){
       return ClientInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return ClientInfo.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"clientId_","deviceId_"};
             return c.newMessageInfo(ClientInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02", objArray);
           case 3:
             return new ClientInfo();
           case 4:
             return new ug0();
           case 5:
             return ClientInfo.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ClientInfo.PARSER) == null) {
                _monitor_enter(ClientInfo.class);
                if ((pARSER = ClientInfo.PARSER) == null) {
                   pARSER = new ii2(ClientInfo.DEFAULT_INSTANCE);
                   ClientInfo.PARSER = pARSER;
                }
                _monitor_exit(ClientInfo.class);
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
