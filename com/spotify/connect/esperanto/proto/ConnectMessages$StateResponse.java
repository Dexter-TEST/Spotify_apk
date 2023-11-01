package com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.connect.esperanto.proto.a;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse$Device;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class ConnectMessages$StateResponse extends c implements u74	// class@0005a2 from classes.dex
{
    private bc3 devices_;
    private boolean isActiveOnSameDevice_;
    private boolean isActive_;
    private boolean isConnected_;
    private boolean isRunning_;
    private String localName_;
    private boolean shouldUseLocalPlayback_;
    private static final ConnectMessages$StateResponse DEFAULT_INSTANCE;
    public static final int DEVICES_FIELD_NUMBER;
    public static final int IS_ACTIVE_FIELD_NUMBER;
    public static final int IS_ACTIVE_ON_SAME_DEVICE_FIELD_NUMBER;
    public static final int IS_CONNECTED_FIELD_NUMBER;
    public static final int IS_RUNNING_FIELD_NUMBER;
    public static final int LOCAL_NAME_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SHOULD_USE_LOCAL_PLAYBACK_FIELD_NUMBER;

    static {
       ConnectMessages$StateResponse stateRespons = new ConnectMessages$StateResponse();
       ConnectMessages$StateResponse.DEFAULT_INSTANCE = stateRespons;
       c.registerDefaultInstance(ConnectMessages$StateResponse.class, stateRespons);
    }
    private void ConnectMessages$StateResponse(){
       super();
       this.localName_ = "";
       this.devices_ = c.emptyProtobufList();
    }
    public static ConnectMessages$StateResponse e(){
       return ConnectMessages$StateResponse.DEFAULT_INSTANCE;
    }
    public static ConnectMessages$StateResponse k(byte[] p0){
       return c.parseFrom(ConnectMessages$StateResponse.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return ConnectMessages$StateResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"isRunning_","isConnected_","localName_","shouldUseLocalPlayback_","devices_",ConnectMessages$StateResponse$Device.class,"isActive_","isActiveOnSameDevice_"};
             return c.newMessageInfo(ConnectMessages$StateResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x07\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x07\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x07\x02\x07\x03\x02\x02\x04\x07\x05\x1b\x06\x07\x07\x07", objArray);
           case 3:
             return new ConnectMessages$StateResponse();
           case 4:
             return new a();
           case 5:
             return ConnectMessages$StateResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ConnectMessages$StateResponse.PARSER) == null) {
                _monitor_enter(ConnectMessages$StateResponse.class);
                if ((pARSER = ConnectMessages$StateResponse.PARSER) == null) {
                   pARSER = new ii2(ConnectMessages$StateResponse.DEFAULT_INSTANCE);
                   ConnectMessages$StateResponse.PARSER = pARSER;
                }
                _monitor_exit(ConnectMessages$StateResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final bc3 f(){
       return this.devices_;
    }
    public final boolean g(){
       return this.isActive_;
    }
    public final boolean h(){
       return this.isActiveOnSameDevice_;
    }
    public final boolean i(){
       return this.isConnected_;
    }
    public final boolean j(){
       return this.shouldUseLocalPlayback_;
    }
}
