package com.spotify.messaging.inappmessagingsdk.proto.ClickActions$ClickActionV1;
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
import p.q30;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class ClickActions$ClickActionV1 extends c implements u74	// class@000a52 from classes.dex
{
    private String action_;
    private String trackingUrl_;
    private String url_;
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final ClickActions$ClickActionV1 DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int TRACKING_URL_FIELD_NUMBER;
    public static final int URL_FIELD_NUMBER;

    static {
       ClickActions$ClickActionV1 uClickAction = new ClickActions$ClickActionV1();
       ClickActions$ClickActionV1.DEFAULT_INSTANCE = uClickAction;
       c.registerDefaultInstance(ClickActions$ClickActionV1.class, uClickAction);
    }
    private void ClickActions$ClickActionV1(){
       super();
       this.action_ = "";
       this.url_ = "";
       this.trackingUrl_ = "";
    }
    public static ClickActions$ClickActionV1 e(){
       return ClickActions$ClickActionV1.DEFAULT_INSTANCE;
    }
    public static ClickActions$ClickActionV1 g(){
       return ClickActions$ClickActionV1.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return ClickActions$ClickActionV1.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"action_","url_","trackingUrl_"};
             return c.newMessageInfo(ClickActions$ClickActionV1.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02", objArray);
           case 3:
             return new ClickActions$ClickActionV1();
           case 4:
             return new h40(p2);
           case 5:
             return ClickActions$ClickActionV1.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ClickActions$ClickActionV1.PARSER) == null) {
                _monitor_enter(ClickActions$ClickActionV1.class);
                if ((pARSER = ClickActions$ClickActionV1.PARSER) == null) {
                   pARSER = new ii2(ClickActions$ClickActionV1.DEFAULT_INSTANCE);
                   ClickActions$ClickActionV1.PARSER = pARSER;
                }
                _monitor_exit(ClickActions$ClickActionV1.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String f(){
       return this.action_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final String h(){
       return this.trackingUrl_;
    }
    public final String i(){
       return this.url_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
