package com.spotify.player.esperanto.proto.EsContextPlayerState$PlaybackQuality;
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
import p.gp1;
import p.ip1;
import p.hp1;

public final class EsContextPlayerState$PlaybackQuality extends c implements u74	// class@000af5 from classes.dex
{
    private int bitrateLevel_;
    private int hifiStatus_;
    private int strategy_;
    private boolean targetBitrateAvailable_;
    private int targetBitrateLevel_;
    public static final int BITRATE_LEVEL_FIELD_NUMBER = 1;
    private static final EsContextPlayerState$PlaybackQuality DEFAULT_INSTANCE;
    public static final int HIFI_STATUS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int STRATEGY_FIELD_NUMBER;
    public static final int TARGET_BITRATE_AVAILABLE_FIELD_NUMBER;
    public static final int TARGET_BITRATE_LEVEL_FIELD_NUMBER;

    static {
       EsContextPlayerState$PlaybackQuality playbackQual = new EsContextPlayerState$PlaybackQuality();
       EsContextPlayerState$PlaybackQuality.DEFAULT_INSTANCE = playbackQual;
       c.registerDefaultInstance(EsContextPlayerState$PlaybackQuality.class, playbackQual);
    }
    private void EsContextPlayerState$PlaybackQuality(){
       super();
    }
    public static EsContextPlayerState$PlaybackQuality e(){
       return EsContextPlayerState$PlaybackQuality.DEFAULT_INSTANCE;
    }
    public static EsContextPlayerState$PlaybackQuality g(){
       return EsContextPlayerState$PlaybackQuality.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsContextPlayerState$PlaybackQuality.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitrateLevel_","strategy_","targetBitrateLevel_","targetBitrateAvailable_","hifiStatus_"};
             return c.newMessageInfo(EsContextPlayerState$PlaybackQuality.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\f\x03\f\x04\x07\x05\f", objArray);
           case 3:
             return new EsContextPlayerState$PlaybackQuality();
           case 4:
             return new sq1(29);
           case 5:
             return EsContextPlayerState$PlaybackQuality.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsContextPlayerState$PlaybackQuality.PARSER) == null) {
                _monitor_enter(EsContextPlayerState$PlaybackQuality.class);
                if ((pARSER = EsContextPlayerState$PlaybackQuality.PARSER) == null) {
                   pARSER = new ii2(EsContextPlayerState$PlaybackQuality.DEFAULT_INSTANCE);
                   EsContextPlayerState$PlaybackQuality.PARSER = pARSER;
                }
                _monitor_exit(EsContextPlayerState$PlaybackQuality.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final gp1 f(){
       gp1 ogp1;
       if ((ogp1 = gp1.a(this.bitrateLevel_)) == null) {
          ogp1 = gp1.z;
       }
       return ogp1;
    }
    public final ip1 h(){
       EsContextPlayerState$PlaybackQuality thifiStatus_;
       ip1 oip1;
       if ((thifiStatus_ = this.hifiStatus_) != null) {
          if (thifiStatus_ != 1) {
             oip1 = (thifiStatus_ != 2)? null: ip1.t;
          }else {
             oip1 = ip1.c;
          }
       }else {
          oip1 = ip1.b;
       }
       if (oip1 == null) {
          oip1 = ip1.v;
       }
       return oip1;
    }
    public final hp1 i(){
       hp1 ohp1;
       if ((ohp1 = hp1.a(this.strategy_)) == null) {
          ohp1 = hp1.y;
       }
       return ohp1;
    }
    public final boolean j(){
       return this.targetBitrateAvailable_;
    }
    public final gp1 k(){
       gp1 ogp1;
       if ((ogp1 = gp1.a(this.targetBitrateLevel_)) == null) {
          ogp1 = gp1.z;
       }
       return ogp1;
    }
}
