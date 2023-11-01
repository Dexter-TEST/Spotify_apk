package com.spotify.performance.viewloadtracking.events.proto.ViewLoadSequence;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import java.lang.String;
import java.lang.Object;
import p.qi7;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.si7;
import p.ri7;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class ViewLoadSequence extends c implements u74	// class@000ac5 from classes.dex
{
    private int bitField0_;
    private int deviceYearClass_;
    private String initialConnectionType_;
    private g14 metadata_;
    private String pageId_;
    private String sequenceId_;
    private g14 steps_;
    private String terminalConnectionType_;
    private String terminalState_;
    private String uri_;
    private static final ViewLoadSequence DEFAULT_INSTANCE;
    public static final int DEVICE_YEAR_CLASS_FIELD_NUMBER;
    public static final int INITIAL_CONNECTION_TYPE_FIELD_NUMBER;
    public static final int METADATA_FIELD_NUMBER;
    public static final int PAGE_ID_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SEQUENCE_ID_FIELD_NUMBER;
    public static final int STEPS_FIELD_NUMBER;
    public static final int TERMINAL_CONNECTION_TYPE_FIELD_NUMBER;
    public static final int TERMINAL_STATE_FIELD_NUMBER;
    public static final int URI_FIELD_NUMBER;

    static {
       ViewLoadSequence viewLoadSequ = new ViewLoadSequence();
       ViewLoadSequence.DEFAULT_INSTANCE = viewLoadSequ;
       c.registerDefaultInstance(ViewLoadSequence.class, viewLoadSequ);
    }
    private void ViewLoadSequence(){
       super();
       g14 b = g14.b;
       this.steps_ = b;
       this.metadata_ = b;
       this.pageId_ = "";
       this.uri_ = "";
       this.terminalState_ = "";
       this.sequenceId_ = "";
       this.initialConnectionType_ = "";
       this.terminalConnectionType_ = "";
    }
    public static ViewLoadSequence e(){
       return ViewLoadSequence.DEFAULT_INSTANCE;
    }
    public static void f(ViewLoadSequence p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.pageId_ = p1;
    }
    public static g14 g(ViewLoadSequence p0){
       ViewLoadSequence steps_ = p0.steps_;
       if (steps_.a == null) {
          p0.steps_ = steps_.d();
       }
       return p0.steps_;
    }
    public static g14 h(ViewLoadSequence p0){
       ViewLoadSequence metadata_ = p0.metadata_;
       if (metadata_.a == null) {
          p0.metadata_ = metadata_.d();
       }
       return p0.metadata_;
    }
    public static void i(ViewLoadSequence p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.sequenceId_ = p1;
    }
    public static void j(ViewLoadSequence p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x10;
       p0.initialConnectionType_ = p1;
    }
    public static void k(ViewLoadSequence p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x20;
       p0.terminalConnectionType_ = p1;
    }
    public static void l(ViewLoadSequence p0,int p1){
       p0.bitField0_ = p0.bitField0_ | 0x40;
       p0.deviceYearClass_ = p1;
    }
    public static void m(ViewLoadSequence p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.uri_ = p1;
    }
    public static void n(ViewLoadSequence p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.terminalState_ = p1;
    }
    public static qi7 o(){
       return ViewLoadSequence.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return ViewLoadSequence.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[12];
             objArray[0] = "bitField0_";
             objArray[b] = "pageId_";
             objArray[2] = "uri_";
             objArray[3] = "terminalState_";
             objArray[4] = "steps_";
             objArray[5] = si7.a;
             objArray[6] = "metadata_";
             objArray[7] = ri7.a;
             objArray[8] = "sequenceId_";
             objArray[9] = "initialConnectionType_";
             objArray[10] = "terminalConnectionType_";
             objArray[11] = "deviceYearClass_";
             return c.newMessageInfo(ViewLoadSequence.DEFAULT_INSTANCE, "\x01\t\xff\x02\xff\x02\x01\x01\t\t\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x042\x052\x06\x10\x02\x03\x07\x10\x02\x04\b\x10\x02\x05\t\x10\x02\x06", objArray);
           case 3:
             return new ViewLoadSequence();
           case 4:
             return new qi7();
           case 5:
             return ViewLoadSequence.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ViewLoadSequence.PARSER) == null) {
                _monitor_enter(ViewLoadSequence.class);
                if ((pARSER = ViewLoadSequence.PARSER) == null) {
                   pARSER = new ii2(ViewLoadSequence.DEFAULT_INSTANCE);
                   ViewLoadSequence.PARSER = pARSER;
                }
                _monitor_exit(ViewLoadSequence.class);
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
