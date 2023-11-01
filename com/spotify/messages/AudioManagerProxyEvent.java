package com.spotify.messages.AudioManagerProxyEvent;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.fo;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class AudioManagerProxyEvent extends c implements u74	// class@0009f6 from classes.dex
{
    private boolean acceptsDelayedFocusGain_;
    private String audioUsage_;
    private int bitField0_;
    private String componentIdentifier_;
    private String contentType_;
    private String focusChange_;
    private String focusGain_;
    private String requestResult_;
    private String sendReason_;
    private String streamType_;
    public static final int ACCEPTS_DELAYED_FOCUS_GAIN_FIELD_NUMBER = 9;
    public static final int AUDIO_USAGE_FIELD_NUMBER = 8;
    public static final int COMPONENT_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 7;
    private static final AudioManagerProxyEvent DEFAULT_INSTANCE;
    public static final int FOCUS_CHANGE_FIELD_NUMBER;
    public static final int FOCUS_GAIN_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int REQUEST_RESULT_FIELD_NUMBER;
    public static final int SEND_REASON_FIELD_NUMBER;
    public static final int STREAM_TYPE_FIELD_NUMBER;

    static {
       AudioManagerProxyEvent uAudioManage = new AudioManagerProxyEvent();
       AudioManagerProxyEvent.DEFAULT_INSTANCE = uAudioManage;
       c.registerDefaultInstance(AudioManagerProxyEvent.class, uAudioManage);
    }
    private void AudioManagerProxyEvent(){
       super();
       this.componentIdentifier_ = "";
       this.sendReason_ = "";
       this.requestResult_ = "";
       this.focusGain_ = "";
       this.focusChange_ = "";
       this.streamType_ = "";
       this.contentType_ = "";
       this.audioUsage_ = "";
    }
    public static AudioManagerProxyEvent e(){
       return AudioManagerProxyEvent.DEFAULT_INSTANCE;
    }
    public static void f(AudioManagerProxyEvent p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.componentIdentifier_ = p1;
    }
    public static void g(AudioManagerProxyEvent p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.focusGain_ = p1;
    }
    public static void h(AudioManagerProxyEvent p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x10;
       p0.focusChange_ = p1;
    }
    public static void i(AudioManagerProxyEvent p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x20;
       p0.streamType_ = p1;
    }
    public static void j(AudioManagerProxyEvent p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x40;
       p0.contentType_ = p1;
    }
    public static void k(AudioManagerProxyEvent p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x0080;
       p0.audioUsage_ = p1;
    }
    public static void l(AudioManagerProxyEvent p0,boolean p1){
       p0.bitField0_ = p0.bitField0_ | 0x0100;
       p0.acceptsDelayedFocusGain_ = p1;
    }
    public static void m(AudioManagerProxyEvent p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.sendReason_ = p1;
    }
    public static void n(AudioManagerProxyEvent p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.requestResult_ = p1;
    }
    public static fo o(){
       return AudioManagerProxyEvent.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return AudioManagerProxyEvent.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[10];
             objArray[0] = "bitField0_";
             objArray[b] = "componentIdentifier_";
             objArray[2] = "sendReason_";
             objArray[3] = "requestResult_";
             objArray[4] = "focusGain_";
             objArray[5] = "focusChange_";
             objArray[6] = "streamType_";
             objArray[7] = "contentType_";
             objArray[8] = "audioUsage_";
             objArray[9] = "acceptsDelayedFocusGain_";
             return c.newMessageInfo(AudioManagerProxyEvent.DEFAULT_INSTANCE, "\x01\t\xff\x02\xff\x02\x01\x01\t\t\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03\x05\x10\x02\x04\x06\x10\x02\x05\x07\x10\x02\x06\b\x10\x02\x07\t\x10\x02\b", objArray);
           case 3:
             return new AudioManagerProxyEvent();
           case 4:
             return new fo();
           case 5:
             return AudioManagerProxyEvent.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = AudioManagerProxyEvent.PARSER) == null) {
                _monitor_enter(AudioManagerProxyEvent.class);
                if ((pARSER = AudioManagerProxyEvent.PARSER) == null) {
                   pARSER = new ii2(AudioManagerProxyEvent.DEFAULT_INSTANCE);
                   AudioManagerProxyEvent.PARSER = pARSER;
                }
                _monitor_exit(AudioManagerProxyEvent.class);
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
