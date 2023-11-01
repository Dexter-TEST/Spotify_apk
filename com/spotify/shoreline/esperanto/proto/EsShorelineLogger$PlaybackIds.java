package com.spotify.shoreline.esperanto.proto.EsShorelineLogger$PlaybackIds;
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
import p.q04;
import p.f04;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsShorelineLogger$PlaybackIds extends c implements u74	// class@000c28 from classes.dex
{
    private bc3 playbackId_;
    private static final EsShorelineLogger$PlaybackIds DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int PLAYBACK_ID_FIELD_NUMBER;

    static {
       EsShorelineLogger$PlaybackIds playbackIds = new EsShorelineLogger$PlaybackIds();
       EsShorelineLogger$PlaybackIds.DEFAULT_INSTANCE = playbackIds;
       c.registerDefaultInstance(EsShorelineLogger$PlaybackIds.class, playbackIds);
    }
    private void EsShorelineLogger$PlaybackIds(){
       super();
       this.playbackId_ = c.emptyProtobufList();
    }
    public static EsShorelineLogger$PlaybackIds e(){
       return EsShorelineLogger$PlaybackIds.DEFAULT_INSTANCE;
    }
    public static EsShorelineLogger$PlaybackIds f(){
       return EsShorelineLogger$PlaybackIds.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsShorelineLogger$PlaybackIds.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       p2 = null;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return p2;
           case 2:
             Object[] objArray = new Object[b];
             objArray[0] = "playbackId_";
             return c.newMessageInfo(EsShorelineLogger$PlaybackIds.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1c", objArray);
           case 3:
             return new EsShorelineLogger$PlaybackIds();
           case 4:
             return new q04(p2);
           case 5:
             return EsShorelineLogger$PlaybackIds.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsShorelineLogger$PlaybackIds.PARSER) == null) {
                _monitor_enter(EsShorelineLogger$PlaybackIds.class);
                if ((pARSER = EsShorelineLogger$PlaybackIds.PARSER) == null) {
                   pARSER = new ii2(EsShorelineLogger$PlaybackIds.DEFAULT_INSTANCE);
                   EsShorelineLogger$PlaybackIds.PARSER = pARSER;
                }
                _monitor_exit(EsShorelineLogger$PlaybackIds.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final bc3 g(){
       return this.playbackId_;
    }
}
