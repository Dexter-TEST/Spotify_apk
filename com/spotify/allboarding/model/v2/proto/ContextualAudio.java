package com.spotify.allboarding.model.v2.proto.ContextualAudio;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.cl1;
import p.uk1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class ContextualAudio extends c implements u74	// class@000528 from classes.dex
{
    private String playlistUri_;
    private static final ContextualAudio DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int PLAYLIST_URI_FIELD_NUMBER;

    static {
       ContextualAudio uContextualA = new ContextualAudio();
       ContextualAudio.DEFAULT_INSTANCE = uContextualA;
       c.registerDefaultInstance(ContextualAudio.class, uContextualA);
    }
    private void ContextualAudio(){
       super();
       this.playlistUri_ = "";
    }
    public static ContextualAudio e(){
       return ContextualAudio.DEFAULT_INSTANCE;
    }
    public static ContextualAudio f(){
       return ContextualAudio.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return ContextualAudio.DEFAULT_INSTANCE.getParserForType();
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
             objArray[0] = "playlistUri_";
             return c.newMessageInfo(ContextualAudio.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02", objArray);
           case 3:
             return new ContextualAudio();
           case 4:
             return new cl1(p2);
           case 5:
             return ContextualAudio.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ContextualAudio.PARSER) == null) {
                _monitor_enter(ContextualAudio.class);
                if ((pARSER = ContextualAudio.PARSER) == null) {
                   pARSER = new ii2(ContextualAudio.DEFAULT_INSTANCE);
                   ContextualAudio.PARSER = pARSER;
                }
                _monitor_exit(ContextualAudio.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String g(){
       return this.playlistUri_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
