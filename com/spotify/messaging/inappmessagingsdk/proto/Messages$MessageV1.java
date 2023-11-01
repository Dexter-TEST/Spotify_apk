package com.spotify.messaging.inappmessagingsdk.proto.Messages$MessageV1;
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
import p.y74;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Collections;
import p.r74;
import com.google.protobuf.b;

public final class Messages$MessageV1 extends c implements u74	// class@000a54 from classes.dex
{
    private g14 clickActions_;
    private String creativeType_;
    private boolean fullscreen_;
    private String htmlContent_;
    private String id_;
    private String impressionUrl_;
    private String uuid_;
    public static final int CLICK_ACTIONS_FIELD_NUMBER = 7;
    public static final int CREATIVE_TYPE_FIELD_NUMBER = 1;
    private static final Messages$MessageV1 DEFAULT_INSTANCE;
    public static final int FULLSCREEN_FIELD_NUMBER;
    public static final int HTML_CONTENT_FIELD_NUMBER;
    public static final int ID_FIELD_NUMBER;
    public static final int IMPRESSION_URL_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int UUID_FIELD_NUMBER;

    static {
       Messages$MessageV1 messageV1 = new Messages$MessageV1();
       Messages$MessageV1.DEFAULT_INSTANCE = messageV1;
       c.registerDefaultInstance(Messages$MessageV1.class, messageV1);
    }
    private void Messages$MessageV1(){
       super();
       this.clickActions_ = g14.b;
       this.creativeType_ = "";
       this.id_ = "";
       this.uuid_ = "";
       this.impressionUrl_ = "";
       this.htmlContent_ = "";
    }
    public static Messages$MessageV1 e(){
       return Messages$MessageV1.DEFAULT_INSTANCE;
    }
    public static Messages$MessageV1 i(){
       return Messages$MessageV1.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Messages$MessageV1.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"creativeType_","id_","uuid_","impressionUrl_","fullscreen_","htmlContent_","clickActions_",y74.a};
             return c.newMessageInfo(Messages$MessageV1.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x07\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x07\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x02\x02\x05\x07\x06\x02\x02\x072", objArray);
           case 3:
             return new Messages$MessageV1();
           case 4:
             return new h40(17, p2);
           case 5:
             return Messages$MessageV1.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Messages$MessageV1.PARSER) == null) {
                _monitor_enter(Messages$MessageV1.class);
                if ((pARSER = Messages$MessageV1.PARSER) == null) {
                   pARSER = new ii2(Messages$MessageV1.DEFAULT_INSTANCE);
                   Messages$MessageV1.PARSER = pARSER;
                }
                _monitor_exit(Messages$MessageV1.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final int f(){
       return this.clickActions_.size();
    }
    public final Map g(){
       return Collections.unmodifiableMap(this.clickActions_);
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final String h(){
       return this.creativeType_;
    }
    public final boolean j(){
       return this.fullscreen_;
    }
    public final String k(){
       return this.htmlContent_;
    }
    public final String l(){
       return this.id_;
    }
    public final String m(){
       return this.impressionUrl_;
    }
    public final String n(){
       return this.uuid_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
