package com.spotify.player.esperanto.proto.EsPlayOptions$PlayOptions;
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

public final class EsPlayOptions$PlayOptions extends c implements u74	// class@000b01 from classes.dex
{
    private int bitField0_;
    private int operation_;
    private float playbackSpeed_;
    private int reason_;
    private int trigger_;
    private static final EsPlayOptions$PlayOptions DEFAULT_INSTANCE;
    public static final int OPERATION_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER;
    public static final int REASON_FIELD_NUMBER;
    public static final int TRIGGER_FIELD_NUMBER;

    static {
       EsPlayOptions$PlayOptions playOptions = new EsPlayOptions$PlayOptions();
       EsPlayOptions$PlayOptions.DEFAULT_INSTANCE = playOptions;
       c.registerDefaultInstance(EsPlayOptions$PlayOptions.class, playOptions);
    }
    private void EsPlayOptions$PlayOptions(){
       super();
    }
    public static EsPlayOptions$PlayOptions e(){
       return EsPlayOptions$PlayOptions.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsPlayOptions$PlayOptions.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","reason_","operation_","trigger_","playbackSpeed_"};
             return c.newMessageInfo(EsPlayOptions$PlayOptions.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\x01\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\f\x03\f\x04\x10\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new EsPlayOptions$PlayOptions();
           case 4:
             return new sq1();
           case 5:
             return EsPlayOptions$PlayOptions.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsPlayOptions$PlayOptions.PARSER) == null) {
                _monitor_enter(EsPlayOptions$PlayOptions.class);
                if ((pARSER = EsPlayOptions$PlayOptions.PARSER) == null) {
                   pARSER = new ii2(EsPlayOptions$PlayOptions.DEFAULT_INSTANCE);
                   EsPlayOptions$PlayOptions.PARSER = pARSER;
                }
                _monitor_exit(EsPlayOptions$PlayOptions.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
