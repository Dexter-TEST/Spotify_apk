package com.spotify.player.esperanto.proto.EsPreparePlay$PreparePlayRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.player.esperanto.proto.EsContext$Context;
import java.lang.Object;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import p.yq1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsPreparePlay$PreparePlayRequest extends c implements u74	// class@000b03 from classes.dex
{
    private EsContext$Context context_;
    private EsPreparePlayOptions$PreparePlayOptions options_;
    private EsPlayOrigin$PlayOrigin playOrigin_;
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final EsPreparePlay$PreparePlayRequest DEFAULT_INSTANCE;
    public static final int OPTIONS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PLAY_ORIGIN_FIELD_NUMBER;

    static {
       EsPreparePlay$PreparePlayRequest preparePlayR = new EsPreparePlay$PreparePlayRequest();
       EsPreparePlay$PreparePlayRequest.DEFAULT_INSTANCE = preparePlayR;
       c.registerDefaultInstance(EsPreparePlay$PreparePlayRequest.class, preparePlayR);
    }
    private void EsPreparePlay$PreparePlayRequest(){
       super();
    }
    public static void e(EsPreparePlay$PreparePlayRequest p0,EsContext$Context p1){
       p0.getClass();
       p0.context_ = p1;
    }
    public static void f(EsPreparePlay$PreparePlayRequest p0,EsPreparePlayOptions$PreparePlayOptions p1){
       p0.getClass();
       p0.options_ = p1;
    }
    public static void g(EsPreparePlay$PreparePlayRequest p0,EsPlayOrigin$PlayOrigin p1){
       p0.getClass();
       p0.playOrigin_ = p1;
    }
    public static EsPreparePlay$PreparePlayRequest h(){
       return EsPreparePlay$PreparePlayRequest.DEFAULT_INSTANCE;
    }
    public static yq1 i(){
       return EsPreparePlay$PreparePlayRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsPreparePlay$PreparePlayRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"context_","options_","playOrigin_"};
             return c.newMessageInfo(EsPreparePlay$PreparePlayRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\t\x03\t", objArray);
           case 3:
             return new EsPreparePlay$PreparePlayRequest();
           case 4:
             return new yq1();
           case 5:
             return EsPreparePlay$PreparePlayRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsPreparePlay$PreparePlayRequest.PARSER) == null) {
                _monitor_enter(EsPreparePlay$PreparePlayRequest.class);
                if ((pARSER = EsPreparePlay$PreparePlayRequest.PARSER) == null) {
                   pARSER = new ii2(EsPreparePlay$PreparePlayRequest.DEFAULT_INSTANCE);
                   EsPreparePlay$PreparePlayRequest.PARSER = pARSER;
                }
                _monitor_exit(EsPreparePlay$PreparePlayRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
