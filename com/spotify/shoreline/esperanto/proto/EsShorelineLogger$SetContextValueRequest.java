package com.spotify.shoreline.esperanto.proto.EsShorelineLogger$SetContextValueRequest;
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
import p.e04;
import com.spotify.shoreline.esperanto.proto.EsShorelineLogger$PlaybackIds;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsShorelineLogger$SetContextValueRequest extends c implements u74	// class@000c29 from classes.dex
{
    private int bitField0_;
    private int clientContextCase_;
    private Object clientContext_;
    private long reportedTimestamp_;
    private static final EsShorelineLogger$SetContextValueRequest DEFAULT_INSTANCE;
    public static final int DUMMY_CONTEXT_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PLAYBACK_IDS_FIELD_NUMBER;
    public static final int PLAYBACK_STATUS_FIELD_NUMBER;
    public static final int REPORTED_TIMESTAMP_FIELD_NUMBER;

    static {
       EsShorelineLogger$SetContextValueRequest setContextVa = new EsShorelineLogger$SetContextValueRequest();
       EsShorelineLogger$SetContextValueRequest.DEFAULT_INSTANCE = setContextVa;
       c.registerDefaultInstance(EsShorelineLogger$SetContextValueRequest.class, setContextVa);
    }
    private void EsShorelineLogger$SetContextValueRequest(){
       super();
       this.clientContextCase_ = 0;
    }
    public static EsShorelineLogger$SetContextValueRequest e(){
       return EsShorelineLogger$SetContextValueRequest.DEFAULT_INSTANCE;
    }
    public static EsShorelineLogger$SetContextValueRequest k(byte[] p0){
       return c.parseFrom(EsShorelineLogger$SetContextValueRequest.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return EsShorelineLogger$SetContextValueRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"clientContext_","clientContextCase_","bitField0_","reportedTimestamp_",EsShorelineLogger$PlaybackIds.class};
             return c.newMessageInfo(EsShorelineLogger$SetContextValueRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\x01\x01\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02<\xff\x02\xff\x02\x03\x02\x02\xff\x02\xff\x02\x04:\xff\x02\xff\x02", objArray);
           case 3:
             return new EsShorelineLogger$SetContextValueRequest();
           case 4:
             return new q04(p2);
           case 5:
             return EsShorelineLogger$SetContextValueRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsShorelineLogger$SetContextValueRequest.PARSER) == null) {
                _monitor_enter(EsShorelineLogger$SetContextValueRequest.class);
                if ((pARSER = EsShorelineLogger$SetContextValueRequest.PARSER) == null) {
                   pARSER = new ii2(EsShorelineLogger$SetContextValueRequest.DEFAULT_INSTANCE);
                   EsShorelineLogger$SetContextValueRequest.PARSER = pARSER;
                }
                _monitor_exit(EsShorelineLogger$SetContextValueRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final EsShorelineLogger$PlaybackIds f(){
       if (this.clientContextCase_ == 2) {
          return this.clientContext_;
       }
       return EsShorelineLogger$PlaybackIds.f();
    }
    public final String g(){
       EsShorelineLogger$SetContextValueRequest tclientConte = (this.clientContextCase_ == 3)? this.clientContext_: "";
       return tclientConte;
    }
    public final boolean h(){
       boolean b = (this.clientContextCase_ == 4)? true: false;
       return b;
    }
    public final boolean i(){
       boolean b = (this.clientContextCase_ == 2)? true: false;
       return b;
    }
    public final boolean j(){
       boolean b = (this.clientContextCase_ == 3)? true: false;
       return b;
    }
}
