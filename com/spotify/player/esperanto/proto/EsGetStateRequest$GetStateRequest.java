package com.spotify.player.esperanto.proto.EsGetStateRequest$GetStateRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import java.lang.Object;
import p.gq1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsGetStateRequest$GetStateRequest extends c implements u74	// class@000af9 from classes.dex
{
    private EsOptional$OptionalInt64 nextTracksCap_;
    private EsOptional$OptionalInt64 prevTracksCap_;
    private static final EsGetStateRequest$GetStateRequest DEFAULT_INSTANCE;
    public static final int NEXT_TRACKS_CAP_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PREV_TRACKS_CAP_FIELD_NUMBER;

    static {
       EsGetStateRequest$GetStateRequest getStateRequ = new EsGetStateRequest$GetStateRequest();
       EsGetStateRequest$GetStateRequest.DEFAULT_INSTANCE = getStateRequ;
       c.registerDefaultInstance(EsGetStateRequest$GetStateRequest.class, getStateRequ);
    }
    private void EsGetStateRequest$GetStateRequest(){
       super();
    }
    public static void e(EsGetStateRequest$GetStateRequest p0,EsOptional$OptionalInt64 p1){
       p0.getClass();
       p1.getClass();
       p0.nextTracksCap_ = p1;
    }
    public static void f(EsGetStateRequest$GetStateRequest p0,EsOptional$OptionalInt64 p1){
       p0.getClass();
       p1.getClass();
       p0.prevTracksCap_ = p1;
    }
    public static EsGetStateRequest$GetStateRequest g(){
       return EsGetStateRequest$GetStateRequest.DEFAULT_INSTANCE;
    }
    public static gq1 h(){
       return EsGetStateRequest$GetStateRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsGetStateRequest$GetStateRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"prevTracksCap_","nextTracksCap_"};
             return c.newMessageInfo(EsGetStateRequest$GetStateRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\t", objArray);
           case 3:
             return new EsGetStateRequest$GetStateRequest();
           case 4:
             return new gq1();
           case 5:
             return EsGetStateRequest$GetStateRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsGetStateRequest$GetStateRequest.PARSER) == null) {
                _monitor_enter(EsGetStateRequest$GetStateRequest.class);
                if ((pARSER = EsGetStateRequest$GetStateRequest.PARSER) == null) {
                   pARSER = new ii2(EsGetStateRequest$GetStateRequest.DEFAULT_INSTANCE);
                   EsGetStateRequest$GetStateRequest.PARSER = pARSER;
                }
                _monitor_exit(EsGetStateRequest$GetStateRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
