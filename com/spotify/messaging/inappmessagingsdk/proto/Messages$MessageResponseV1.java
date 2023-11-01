package com.spotify.messaging.inappmessagingsdk.proto.Messages$MessageResponseV1;
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
import p.h40;
import p.x74;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Collections;
import p.r74;
import com.google.protobuf.b;

public final class Messages$MessageResponseV1 extends c implements u74	// class@000a53 from classes.dex
{
    private g14 messages_;
    private static final Messages$MessageResponseV1 DEFAULT_INSTANCE;
    public static final int MESSAGES_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       Messages$MessageResponseV1 messageRespo = new Messages$MessageResponseV1();
       Messages$MessageResponseV1.DEFAULT_INSTANCE = messageRespo;
       c.registerDefaultInstance(Messages$MessageResponseV1.class, messageRespo);
    }
    private void Messages$MessageResponseV1(){
       super();
       this.messages_ = g14.b;
    }
    public static Messages$MessageResponseV1 e(){
       return Messages$MessageResponseV1.DEFAULT_INSTANCE;
    }
    public static Messages$MessageResponseV1 h(byte[] p0){
       return c.parseFrom(Messages$MessageResponseV1.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return Messages$MessageResponseV1.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"messages_",x74.a};
             return c.newMessageInfo(Messages$MessageResponseV1.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\x012", objArray);
           case 3:
             return new Messages$MessageResponseV1();
           case 4:
             return new h40(16, p2);
           case 5:
             return Messages$MessageResponseV1.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Messages$MessageResponseV1.PARSER) == null) {
                _monitor_enter(Messages$MessageResponseV1.class);
                if ((pARSER = Messages$MessageResponseV1.PARSER) == null) {
                   pARSER = new ii2(Messages$MessageResponseV1.DEFAULT_INSTANCE);
                   Messages$MessageResponseV1.PARSER = pARSER;
                }
                _monitor_exit(Messages$MessageResponseV1.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final boolean f(String p0){
       p0.getClass();
       return this.messages_.containsKey(p0);
    }
    public final Map g(){
       return Collections.unmodifiableMap(this.messages_);
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
