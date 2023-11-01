package com.spotify.messaging.inappmessagingsdk.proto.Triggers$TriggerResponseV1;
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
import p.h40;
import p.en6;
import com.spotify.messaging.inappmessagingsdk.proto.Triggers$TriggerV1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import java.util.List;
import p.r74;
import com.google.protobuf.b;

public final class Triggers$TriggerResponseV1 extends c implements u74	// class@000a56 from classes.dex
{
    private bc3 triggers_;
    private static final Triggers$TriggerResponseV1 DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int TRIGGERS_FIELD_NUMBER;

    static {
       Triggers$TriggerResponseV1 triggerRespo = new Triggers$TriggerResponseV1();
       Triggers$TriggerResponseV1.DEFAULT_INSTANCE = triggerRespo;
       c.registerDefaultInstance(Triggers$TriggerResponseV1.class, triggerRespo);
    }
    private void Triggers$TriggerResponseV1(){
       super();
       this.triggers_ = c.emptyProtobufList();
    }
    public static Triggers$TriggerResponseV1 e(){
       return Triggers$TriggerResponseV1.DEFAULT_INSTANCE;
    }
    public static Triggers$TriggerResponseV1 h(byte[] p0){
       return c.parseFrom(Triggers$TriggerResponseV1.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return Triggers$TriggerResponseV1.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"triggers_",Triggers$TriggerV1.class};
             return c.newMessageInfo(Triggers$TriggerResponseV1.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b", objArray);
           case 3:
             return new Triggers$TriggerResponseV1();
           case 4:
             return new h40(19, p2);
           case 5:
             return Triggers$TriggerResponseV1.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Triggers$TriggerResponseV1.PARSER) == null) {
                _monitor_enter(Triggers$TriggerResponseV1.class);
                if ((pARSER = Triggers$TriggerResponseV1.PARSER) == null) {
                   pARSER = new ii2(Triggers$TriggerResponseV1.DEFAULT_INSTANCE);
                   Triggers$TriggerResponseV1.PARSER = pARSER;
                }
                _monitor_exit(Triggers$TriggerResponseV1.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final int f(){
       return this.triggers_.size();
    }
    public final bc3 g(){
       return this.triggers_;
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
