package com.spotify.player.esperanto.proto.EsContextPlayerState$ContextIndex;
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

public final class EsContextPlayerState$ContextIndex extends c implements u74	// class@000af3 from classes.dex
{
    private long page_;
    private long track_;
    private static final EsContextPlayerState$ContextIndex DEFAULT_INSTANCE;
    public static final int PAGE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int TRACK_FIELD_NUMBER;

    static {
       EsContextPlayerState$ContextIndex uContextInde = new EsContextPlayerState$ContextIndex();
       EsContextPlayerState$ContextIndex.DEFAULT_INSTANCE = uContextInde;
       c.registerDefaultInstance(EsContextPlayerState$ContextIndex.class, uContextInde);
    }
    private void EsContextPlayerState$ContextIndex(){
       super();
    }
    public static EsContextPlayerState$ContextIndex e(){
       return EsContextPlayerState$ContextIndex.DEFAULT_INSTANCE;
    }
    public static EsContextPlayerState$ContextIndex f(){
       return EsContextPlayerState$ContextIndex.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsContextPlayerState$ContextIndex.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"page_","track_"};
             return c.newMessageInfo(EsContextPlayerState$ContextIndex.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x02\x03", objArray);
           case 3:
             return new EsContextPlayerState$ContextIndex();
           case 4:
             return new sq1(27);
           case 5:
             return EsContextPlayerState$ContextIndex.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsContextPlayerState$ContextIndex.PARSER) == null) {
                _monitor_enter(EsContextPlayerState$ContextIndex.class);
                if ((pARSER = EsContextPlayerState$ContextIndex.PARSER) == null) {
                   pARSER = new ii2(EsContextPlayerState$ContextIndex.DEFAULT_INSTANCE);
                   EsContextPlayerState$ContextIndex.PARSER = pARSER;
                }
                _monitor_exit(EsContextPlayerState$ContextIndex.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final long g(){
       return this.page_;
    }
    public final long h(){
       return this.track_;
    }
}
