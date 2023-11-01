package com.spotify.messages.RejectedClientEventNonAuth;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.et5;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class RejectedClientEventNonAuth extends c implements u74	// class@000a07 from classes.dex
{
    private int bitField0_;
    private String eventName_;
    private String rejectReason_;
    private static final RejectedClientEventNonAuth DEFAULT_INSTANCE;
    public static final int EVENT_NAME_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int REJECT_REASON_FIELD_NUMBER;

    static {
       RejectedClientEventNonAuth rejectedClie = new RejectedClientEventNonAuth();
       RejectedClientEventNonAuth.DEFAULT_INSTANCE = rejectedClie;
       c.registerDefaultInstance(RejectedClientEventNonAuth.class, rejectedClie);
    }
    private void RejectedClientEventNonAuth(){
       super();
       this.rejectReason_ = "";
       this.eventName_ = "";
    }
    public static RejectedClientEventNonAuth e(){
       return RejectedClientEventNonAuth.DEFAULT_INSTANCE;
    }
    public static void f(RejectedClientEventNonAuth p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.rejectReason_ = p1;
    }
    public static void g(RejectedClientEventNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.eventName_ = p1;
    }
    public static et5 h(){
       return RejectedClientEventNonAuth.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return RejectedClientEventNonAuth.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","rejectReason_","eventName_"};
             return c.newMessageInfo(RejectedClientEventNonAuth.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01", objArray);
           case 3:
             return new RejectedClientEventNonAuth();
           case 4:
             return new et5();
           case 5:
             return RejectedClientEventNonAuth.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = RejectedClientEventNonAuth.PARSER) == null) {
                _monitor_enter(RejectedClientEventNonAuth.class);
                if ((pARSER = RejectedClientEventNonAuth.PARSER) == null) {
                   pARSER = new ii2(RejectedClientEventNonAuth.DEFAULT_INSTANCE);
                   RejectedClientEventNonAuth.PARSER = pARSER;
                }
                _monitor_exit(RejectedClientEventNonAuth.class);
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
