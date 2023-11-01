package com.spotify.messaging.inappmessagingsdk.proto.Preview$PreviewResponseV1;
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
import p.n30;
import com.spotify.messaging.inappmessagingsdk.proto.Messages$MessageV1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import java.util.List;
import p.r74;
import com.google.protobuf.b;

public final class Preview$PreviewResponseV1 extends c implements u74	// class@000a55 from classes.dex
{
    private bc3 messages_;
    private static final Preview$PreviewResponseV1 DEFAULT_INSTANCE;
    public static final int MESSAGES_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       Preview$PreviewResponseV1 previewRespo = new Preview$PreviewResponseV1();
       Preview$PreviewResponseV1.DEFAULT_INSTANCE = previewRespo;
       c.registerDefaultInstance(Preview$PreviewResponseV1.class, previewRespo);
    }
    private void Preview$PreviewResponseV1(){
       super();
       this.messages_ = c.emptyProtobufList();
    }
    public static Preview$PreviewResponseV1 e(){
       return Preview$PreviewResponseV1.DEFAULT_INSTANCE;
    }
    public static Preview$PreviewResponseV1 h(byte[] p0){
       return c.parseFrom(Preview$PreviewResponseV1.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return Preview$PreviewResponseV1.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"messages_",Messages$MessageV1.class};
             return c.newMessageInfo(Preview$PreviewResponseV1.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x04\x04\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x04\x1b", objArray);
           case 3:
             return new Preview$PreviewResponseV1();
           case 4:
             return new h40(p2);
           case 5:
             return Preview$PreviewResponseV1.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Preview$PreviewResponseV1.PARSER) == null) {
                _monitor_enter(Preview$PreviewResponseV1.class);
                if ((pARSER = Preview$PreviewResponseV1.PARSER) == null) {
                   pARSER = new ii2(Preview$PreviewResponseV1.DEFAULT_INSTANCE);
                   Preview$PreviewResponseV1.PARSER = pARSER;
                }
                _monitor_exit(Preview$PreviewResponseV1.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final Messages$MessageV1 f(){
       return this.messages_.get(0);
    }
    public final int g(){
       return this.messages_.size();
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
