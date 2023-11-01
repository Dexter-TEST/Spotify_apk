package com.spotify.contexts.ClientContextId;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.pg0;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class ClientContextId extends c implements u74	// class@000838 from classes.dex
{
    private int bitField0_;
    private String value_;
    private static final ClientContextId DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       ClientContextId uClientConte = new ClientContextId();
       ClientContextId.DEFAULT_INSTANCE = uClientConte;
       c.registerDefaultInstance(ClientContextId.class, uClientConte);
    }
    private void ClientContextId(){
       super();
       this.value_ = "";
    }
    public static ClientContextId e(){
       return ClientContextId.DEFAULT_INSTANCE;
    }
    public static void f(ClientContextId p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.value_ = p1;
    }
    public static pg0 g(){
       return ClientContextId.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return ClientContextId.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(ClientContextId.DEFAULT_INSTANCE, "\x01\x01\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new ClientContextId();
           case 4:
             return new pg0();
           case 5:
             return ClientContextId.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ClientContextId.PARSER) == null) {
                _monitor_enter(ClientContextId.class);
                if ((pARSER = ClientContextId.PARSER) == null) {
                   pARSER = new ii2(ClientContextId.DEFAULT_INSTANCE);
                   ClientContextId.PARSER = pARSER;
                }
                _monitor_exit(ClientContextId.class);
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
