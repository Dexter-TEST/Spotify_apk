package com.spotify.liteinstrumentation.instrumentation.contexts.proto.ClientId;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
import p.h80;
import java.lang.Object;
import p.tg0;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class ClientId extends c implements u74	// class@00092a from classes.dex
{
    private int bitField0_;
    private i80 value_;
    private static final ClientId DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       ClientId uClientId = new ClientId();
       ClientId.DEFAULT_INSTANCE = uClientId;
       c.registerDefaultInstance(ClientId.class, uClientId);
    }
    private void ClientId(){
       super();
       this.value_ = i80.b;
    }
    public static ClientId e(){
       return ClientId.DEFAULT_INSTANCE;
    }
    public static void f(ClientId p0,h80 p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.value_ = p1;
    }
    public static tg0 g(){
       return ClientId.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return ClientId.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","value_"};
             return c.newMessageInfo(ClientId.DEFAULT_INSTANCE, "\x01\x01\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new ClientId();
           case 4:
             return new tg0();
           case 5:
             return ClientId.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ClientId.PARSER) == null) {
                _monitor_enter(ClientId.class);
                if ((pARSER = ClientId.PARSER) == null) {
                   pARSER = new ii2(ClientId.DEFAULT_INSTANCE);
                   ClientId.PARSER = pARSER;
                }
                _monitor_exit(ClientId.class);
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
