package com.spotify.searchview.proto.OnDemand;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.q04;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class OnDemand extends c implements u74	// class@000c0e from classes.dex
{
    private String playlistUri_;
    private String trackUri_;
    private static final OnDemand DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int PLAYLIST_URI_FIELD_NUMBER;
    public static final int TRACK_URI_FIELD_NUMBER;

    static {
       OnDemand onDemand = new OnDemand();
       OnDemand.DEFAULT_INSTANCE = onDemand;
       c.registerDefaultInstance(OnDemand.class, onDemand);
    }
    private void OnDemand(){
       super();
       this.trackUri_ = "";
       this.playlistUri_ = "";
    }
    public static OnDemand e(){
       return OnDemand.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return OnDemand.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"trackUri_","playlistUri_"};
             return c.newMessageInfo(OnDemand.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02", objArray);
           case 3:
             return new OnDemand();
           case 4:
             return new q04(p2);
           case 5:
             return OnDemand.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = OnDemand.PARSER) == null) {
                _monitor_enter(OnDemand.class);
                if ((pARSER = OnDemand.PARSER) == null) {
                   pARSER = new ii2(OnDemand.DEFAULT_INSTANCE);
                   OnDemand.PARSER = pARSER;
                }
                _monitor_exit(OnDemand.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
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
