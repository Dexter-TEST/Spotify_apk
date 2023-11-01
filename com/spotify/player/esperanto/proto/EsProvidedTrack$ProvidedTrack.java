package com.spotify.player.esperanto.proto.EsProvidedTrack$ProvidedTrack;
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
import p.fq1;
import p.rp1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack;

public final class EsProvidedTrack$ProvidedTrack extends c implements u74	// class@000b05 from classes.dex
{
    private bc3 blocked_;
    private EsContextTrack$ContextTrack contextTrack_;
    private String provider_;
    private bc3 removed_;
    public static final int BLOCKED_FIELD_NUMBER = 3;
    public static final int CONTEXT_TRACK_FIELD_NUMBER = 1;
    private static final EsProvidedTrack$ProvidedTrack DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int PROVIDER_FIELD_NUMBER;
    public static final int REMOVED_FIELD_NUMBER;

    static {
       EsProvidedTrack$ProvidedTrack providedTrac = new EsProvidedTrack$ProvidedTrack();
       EsProvidedTrack$ProvidedTrack.DEFAULT_INSTANCE = providedTrac;
       c.registerDefaultInstance(EsProvidedTrack$ProvidedTrack.class, providedTrac);
    }
    private void EsProvidedTrack$ProvidedTrack(){
       super();
       this.removed_ = c.emptyProtobufList();
       this.blocked_ = c.emptyProtobufList();
       this.provider_ = "";
    }
    public static EsProvidedTrack$ProvidedTrack e(){
       return EsProvidedTrack$ProvidedTrack.DEFAULT_INSTANCE;
    }
    public static EsProvidedTrack$ProvidedTrack g(){
       return EsProvidedTrack$ProvidedTrack.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsProvidedTrack$ProvidedTrack.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"contextTrack_","removed_","blocked_","provider_"};
             return c.newMessageInfo(EsProvidedTrack$ProvidedTrack.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\t\x02\x02\x02\x03\x02\x02\x04\x02\x02", objArray);
           case 3:
             return new EsProvidedTrack$ProvidedTrack();
           case 4:
             return new fq1(p2);
           case 5:
             return EsProvidedTrack$ProvidedTrack.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsProvidedTrack$ProvidedTrack.PARSER) == null) {
                _monitor_enter(EsProvidedTrack$ProvidedTrack.class);
                if ((pARSER = EsProvidedTrack$ProvidedTrack.PARSER) == null) {
                   pARSER = new ii2(EsProvidedTrack$ProvidedTrack.DEFAULT_INSTANCE);
                   EsProvidedTrack$ProvidedTrack.PARSER = pARSER;
                }
                _monitor_exit(EsProvidedTrack$ProvidedTrack.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final EsContextTrack$ContextTrack f(){
       EsProvidedTrack$ProvidedTrack tcontextTrac;
       if ((tcontextTrac = this.contextTrack_) == null) {
          tcontextTrac = EsContextTrack$ContextTrack.i();
       }
       return tcontextTrac;
    }
    public final String h(){
       return this.provider_;
    }
}
