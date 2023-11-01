package com.spotify.clientoptinproxy.v1.SendClientActionRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.ga6;
import p.ha6;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class SendClientActionRequest extends c implements u74	// class@000595 from classes.dex
{
    private String featureType_;
    private g14 metadata_;
    private boolean optIn_;
    private static final SendClientActionRequest DEFAULT_INSTANCE;
    public static final int FEATURE_TYPE_FIELD_NUMBER;
    public static final int METADATA_FIELD_NUMBER;
    public static final int OPT_IN_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       SendClientActionRequest sendClientAc = new SendClientActionRequest();
       SendClientActionRequest.DEFAULT_INSTANCE = sendClientAc;
       c.registerDefaultInstance(SendClientActionRequest.class, sendClientAc);
    }
    private void SendClientActionRequest(){
       super();
       this.metadata_ = g14.b;
       this.featureType_ = "";
    }
    public static SendClientActionRequest e(){
       return SendClientActionRequest.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return SendClientActionRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"featureType_","optIn_","metadata_",ha6.a};
             return c.newMessageInfo(SendClientActionRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x07\x032", objArray);
           case 3:
             return new SendClientActionRequest();
           case 4:
             return new ga6();
           case 5:
             return SendClientActionRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = SendClientActionRequest.PARSER) == null) {
                _monitor_enter(SendClientActionRequest.class);
                if ((pARSER = SendClientActionRequest.PARSER) == null) {
                   pARSER = new ii2(SendClientActionRequest.DEFAULT_INSTANCE);
                   SendClientActionRequest.PARSER = pARSER;
                }
                _monitor_exit(SendClientActionRequest.class);
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
