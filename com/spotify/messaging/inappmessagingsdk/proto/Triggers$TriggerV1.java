package com.spotify.messaging.inappmessagingsdk.proto.Triggers$TriggerV1;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.h40;
import p.en6;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Triggers$TriggerV1 extends c implements u74	// class@000a57 from classes.dex
{
    private boolean cache_;
    private String format_;
    private String pattern_;
    private String type_;
    public static final int CACHE_FIELD_NUMBER = 4;
    private static final Triggers$TriggerV1 DEFAULT_INSTANCE;
    public static final int FORMAT_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PATTERN_FIELD_NUMBER;
    public static final int TYPE_FIELD_NUMBER;

    static {
       Triggers$TriggerV1 triggerV1 = new Triggers$TriggerV1();
       Triggers$TriggerV1.DEFAULT_INSTANCE = triggerV1;
       c.registerDefaultInstance(Triggers$TriggerV1.class, triggerV1);
    }
    private void Triggers$TriggerV1(){
       super();
       this.type_ = "";
       this.pattern_ = "";
       this.format_ = "";
    }
    public static Triggers$TriggerV1 e(){
       return Triggers$TriggerV1.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Triggers$TriggerV1.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"type_","pattern_","format_","cache_"};
             return c.newMessageInfo(Triggers$TriggerV1.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x07", objArray);
           case 3:
             return new Triggers$TriggerV1();
           case 4:
             return new h40(20, p2);
           case 5:
             return Triggers$TriggerV1.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Triggers$TriggerV1.PARSER) == null) {
                _monitor_enter(Triggers$TriggerV1.class);
                if ((pARSER = Triggers$TriggerV1.PARSER) == null) {
                   pARSER = new ii2(Triggers$TriggerV1.DEFAULT_INSTANCE);
                   Triggers$TriggerV1.PARSER = pARSER;
                }
                _monitor_exit(Triggers$TriggerV1.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String f(){
       return this.format_;
    }
    public final String g(){
       return this.pattern_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final String h(){
       return this.type_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
