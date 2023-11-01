package com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse$Device;
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
import com.spotify.connect.esperanto.proto.b;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse$Device$Incarnation;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class ConnectMessages$StateResponse$Device extends c implements u74	// class@0005a1 from classes.dex
{
    private int aliasId_;
    private String audioOutputDeviceName_;
    private String audioOutputDeviceType_;
    private int bitField0_;
    private String brandDisplayName_;
    private String capabilities_;
    private String connectStateIdentifier_;
    private long creationTimeMs_;
    private String deduplicationId_;
    private ConnectMessages$StateResponse$Device$Hifi hifi_;
    private bc3 incarnations_;
    private boolean isActive_;
    private boolean isBeingActivated_;
    private boolean isConnect_;
    private boolean isDisabled_;
    private boolean isGroup_;
    private boolean isLocal_;
    private boolean isNewlyDiscovered_;
    private boolean isOffline_;
    private boolean isSelf_;
    private boolean isSocialConnect_;
    private boolean isVoiceEnabled_;
    private boolean isWebapp_;
    private boolean isZeroconf_;
    private String libraryVersion_;
    private String license_;
    private String localIdentifier_;
    private String modelDisplayName_;
    private String name_;
    private String state_;
    private bc3 supportedMediaTypes_;
    private boolean supportsAlarm_;
    private boolean supportsDj_;
    private boolean supportsLogout_;
    private boolean supportsOnDemand_;
    private boolean supportsRename_;
    private boolean supportsVolume_;
    private String type_;
    private int volumeSteps_;
    private int volume_;
    public static final int ALIAS_ID_FIELD_NUMBER = 35;
    public static final int AUDIO_OUTPUT_DEVICE_NAME_FIELD_NUMBER = 38;
    public static final int AUDIO_OUTPUT_DEVICE_TYPE_FIELD_NUMBER = 39;
    public static final int BRAND_DISPLAY_NAME_FIELD_NUMBER = 30;
    public static final int CAPABILITIES_FIELD_NUMBER = 33;
    public static final int CONNECT_STATE_IDENTIFIER_FIELD_NUMBER = 4;
    public static final int CREATION_TIME_MS_FIELD_NUMBER = 18;
    public static final int DEDUPLICATION_ID_FIELD_NUMBER = 3;
    private static final ConnectMessages$StateResponse$Device DEFAULT_INSTANCE;
    public static final int HIFI_FIELD_NUMBER;
    public static final int INCARNATIONS_FIELD_NUMBER;
    public static final int IS_ACTIVE_FIELD_NUMBER;
    public static final int IS_BEING_ACTIVATED_FIELD_NUMBER;
    public static final int IS_CONNECT_FIELD_NUMBER;
    public static final int IS_DISABLED_FIELD_NUMBER;
    public static final int IS_GROUP_FIELD_NUMBER;
    public static final int IS_LOCAL_FIELD_NUMBER;
    public static final int IS_NEWLY_DISCOVERED_FIELD_NUMBER;
    public static final int IS_OFFLINE_FIELD_NUMBER;
    public static final int IS_SELF_FIELD_NUMBER;
    public static final int IS_SOCIAL_CONNECT_FIELD_NUMBER;
    public static final int IS_VOICE_ENABLED_FIELD_NUMBER;
    public static final int IS_WEBAPP_FIELD_NUMBER;
    public static final int IS_ZEROCONF_FIELD_NUMBER;
    public static final int LIBRARY_VERSION_FIELD_NUMBER;
    public static final int LICENSE_FIELD_NUMBER;
    public static final int LOCAL_IDENTIFIER_FIELD_NUMBER;
    public static final int MODEL_DISPLAY_NAME_FIELD_NUMBER;
    public static final int NAME_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int STATE_FIELD_NUMBER;
    public static final int SUPPORTED_MEDIA_TYPES_FIELD_NUMBER;
    public static final int SUPPORTS_ALARM_FIELD_NUMBER;
    public static final int SUPPORTS_DJ_FIELD_NUMBER;
    public static final int SUPPORTS_LOGOUT_FIELD_NUMBER;
    public static final int SUPPORTS_ON_DEMAND_FIELD_NUMBER;
    public static final int SUPPORTS_RENAME_FIELD_NUMBER;
    public static final int SUPPORTS_VOLUME_FIELD_NUMBER;
    public static final int TYPE_FIELD_NUMBER;
    public static final int VOLUME_FIELD_NUMBER;
    public static final int VOLUME_STEPS_FIELD_NUMBER;

    static {
       ConnectMessages$StateResponse$Device stateRespons = new ConnectMessages$StateResponse$Device();
       ConnectMessages$StateResponse$Device.DEFAULT_INSTANCE = stateRespons;
       c.registerDefaultInstance(ConnectMessages$StateResponse$Device.class, stateRespons);
    }
    private void ConnectMessages$StateResponse$Device(){
       super();
       this.localIdentifier_ = "";
       this.deduplicationId_ = "";
       this.connectStateIdentifier_ = "";
       this.name_ = "";
       this.type_ = "";
       this.state_ = "";
       this.license_ = "";
       this.supportedMediaTypes_ = c.emptyProtobufList();
       this.brandDisplayName_ = "";
       this.modelDisplayName_ = "";
       this.capabilities_ = "";
       this.incarnations_ = c.emptyProtobufList();
       this.libraryVersion_ = "";
       this.audioOutputDeviceName_ = "";
       this.audioOutputDeviceType_ = "";
    }
    public static ConnectMessages$StateResponse$Device e(){
       return ConnectMessages$StateResponse$Device.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return ConnectMessages$StateResponse$Device.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[41];
             objArray[0] = "bitField0_";
             objArray[b] = "isSelf_";
             objArray[2] = "localIdentifier_";
             objArray[3] = "deduplicationId_";
             objArray[4] = "connectStateIdentifier_";
             objArray[5] = "name_";
             objArray[6] = "type_";
             objArray[7] = "state_";
             objArray[8] = "isDisabled_";
             objArray[9] = "isActive_";
             objArray[10] = "isBeingActivated_";
             objArray[11] = "isZeroconf_";
             objArray[12] = "isWebapp_";
             objArray[13] = "isConnect_";
             objArray[14] = "isLocal_";
             objArray[15] = "isGroup_";
             objArray[16] = "isOffline_";
             objArray[17] = "isSocialConnect_";
             objArray[18] = "creationTimeMs_";
             objArray[19] = "volume_";
             objArray[20] = "hifi_";
             objArray[21] = "license_";
             objArray[22] = "supportsOnDemand_";
             objArray[23] = "supportsVolume_";
             objArray[24] = "supportsLogout_";
             objArray[25] = "supportsRename_";
             objArray[26] = "supportsAlarm_";
             objArray[27] = "isVoiceEnabled_";
             objArray[28] = "isNewlyDiscovered_";
             objArray[29] = "supportedMediaTypes_";
             objArray[30] = "brandDisplayName_";
             objArray[31] = "modelDisplayName_";
             objArray[32] = "volumeSteps_";
             objArray[33] = "capabilities_";
             objArray[34] = "incarnations_";
             objArray[35] = ConnectMessages$StateResponse$Device$Incarnation.class;
             objArray[36] = "aliasId_";
             objArray[37] = "supportsDj_";
             objArray[38] = "libraryVersion_";
             objArray[39] = "audioOutputDeviceName_";
             objArray[40] = "audioOutputDeviceType_";
             return c.newMessageInfo(ConnectMessages$StateResponse$Device.DEFAULT_INSTANCE, "\xff\x02\xff\x02\'\xff\x02\xff\x02\x01\x01\'\'\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\x07\x02\x02\x02\x03\x02\x02\x04\x02\x02\x05\x02\x02\x06\x02\x02\x07\x02\x02\b\x07\t\x07\n\x07\x0b\x07\f\x07\r\x07\x0e\x07\x0f\x07\x10\x07\x11\x07\x12\x03\x13\x0b\x14\t\x15\x02\x02\x16\x07\x17\x07\x18\x07\x19\x07\x1a\x07\x1b\x07\x1c\x07\x1d\x02\x02\x1e\x02\x02\x1f\x02\x02 \x10\x02\xff\x02\xff\x02!\x12\x02\x01\"\x1b#\x10\x02\x02$\x10\x02\x03%\x02\x02&\x12\x02\x04\'\x12\x02\x05", objArray);
           case 3:
             return new ConnectMessages$StateResponse$Device();
           case 4:
             return new b();
           case 5:
             return ConnectMessages$StateResponse$Device.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ConnectMessages$StateResponse$Device.PARSER) == null) {
                _monitor_enter(ConnectMessages$StateResponse$Device.class);
                if ((pARSER = ConnectMessages$StateResponse$Device.PARSER) == null) {
                   pARSER = new ii2(ConnectMessages$StateResponse$Device.DEFAULT_INSTANCE);
                   ConnectMessages$StateResponse$Device.PARSER = pARSER;
                }
                _monitor_exit(ConnectMessages$StateResponse$Device.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String f(){
       return this.connectStateIdentifier_;
    }
    public final boolean g(){
       return this.isActive_;
    }
    public final String getName(){
       return this.name_;
    }
    public final boolean h(){
       return this.isSelf_;
    }
    public final String i(){
       return this.localIdentifier_;
    }
}
