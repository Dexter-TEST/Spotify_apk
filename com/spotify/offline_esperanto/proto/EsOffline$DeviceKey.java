package com.spotify.offline_esperanto.proto.EsOffline$DeviceKey;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.sq1;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsOffline$DeviceKey extends c implements u74	// class@000ab9 from classes.dex
{
    private String cacheId_;
    private String deviceId_;
    public static final int CACHE_ID_FIELD_NUMBER = 2;
    private static final EsOffline$DeviceKey DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       EsOffline$DeviceKey uDeviceKey = new EsOffline$DeviceKey();
       EsOffline$DeviceKey.DEFAULT_INSTANCE = uDeviceKey;
       c.registerDefaultInstance(EsOffline$DeviceKey.class, uDeviceKey);
    }
    private void EsOffline$DeviceKey(){
       super();
       this.deviceId_ = "";
       this.cacheId_ = "";
    }
    public static EsOffline$DeviceKey e(){
       return EsOffline$DeviceKey.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsOffline$DeviceKey.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"deviceId_","cacheId_"};
             return c.newMessageInfo(EsOffline$DeviceKey.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02", objArray);
           case 3:
             return new EsOffline$DeviceKey();
           case 4:
             return new sq1(18);
           case 5:
             return EsOffline$DeviceKey.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsOffline$DeviceKey.PARSER) == null) {
                _monitor_enter(EsOffline$DeviceKey.class);
                if ((pARSER = EsOffline$DeviceKey.PARSER) == null) {
                   pARSER = new ii2(EsOffline$DeviceKey.DEFAULT_INSTANCE);
                   EsOffline$DeviceKey.PARSER = pARSER;
                }
                _monitor_exit(EsOffline$DeviceKey.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
