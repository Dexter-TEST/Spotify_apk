package com.spotify.allboarding.model.v2.proto.Screen;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.cl1;
import p.ck1;
import com.spotify.allboarding.model.v2.proto.Loading;
import com.spotify.allboarding.model.v2.proto.ContentPicker;
import com.spotify.allboarding.model.v2.proto.PushOptIn;
import com.spotify.allboarding.model.v2.proto.ContextualAudio;
import com.spotify.allboarding.model.v2.proto.LoadingWithImage;
import com.spotify.allboarding.model.v2.proto.SingleItemPicker;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Screen extends c implements u74	// class@00052e from classes.dex
{
    private int screenCase_;
    private Object screen_;
    public static final int CONTENT_PICKER_FIELD_NUMBER = 2;
    public static final int CONTEXTUAL_AUDIO_FIELD_NUMBER = 4;
    private static final Screen DEFAULT_INSTANCE;
    public static final int LOADING_FIELD_NUMBER;
    public static final int LOADING_WITH_IMAGE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PUSH_OPT_IN_FIELD_NUMBER;
    public static final int SINGLE_ITEM_PICKER_FIELD_NUMBER;

    static {
       Screen screen = new Screen();
       Screen.DEFAULT_INSTANCE = screen;
       c.registerDefaultInstance(Screen.class, screen);
    }
    private void Screen(){
       super();
       this.screenCase_ = 0;
    }
    public static Screen e(){
       return Screen.DEFAULT_INSTANCE;
    }
    public static Screen h(){
       return Screen.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Screen.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"screen_","screenCase_",Loading.class,ContentPicker.class,PushOptIn.class,ContextualAudio.class,LoadingWithImage.class,SingleItemPicker.class};
             return c.newMessageInfo(Screen.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\x01\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01<\xff\x02\xff\x02\x02<\xff\x02\xff\x02\x03<\xff\x02\xff\x02\x04<\xff\x02\xff\x02\x05<\xff\x02\xff\x02\x06<\xff\x02\xff\x02", objArray);
           case 3:
             return new Screen();
           case 4:
             return new cl1(p2);
           case 5:
             return Screen.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Screen.PARSER) == null) {
                _monitor_enter(Screen.class);
                if ((pARSER = Screen.PARSER) == null) {
                   pARSER = new ii2(Screen.DEFAULT_INSTANCE);
                   Screen.PARSER = pARSER;
                }
                _monitor_exit(Screen.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final ContentPicker f(){
       if (this.screenCase_ == 2) {
          return this.screen_;
       }
       return ContentPicker.f();
    }
    public final ContextualAudio g(){
       if (this.screenCase_ == 4) {
          return this.screen_;
       }
       return ContextualAudio.f();
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final Loading i(){
       if (this.screenCase_ == 1) {
          return this.screen_;
       }
       return Loading.f();
    }
    public final int j(){
       int i;
       switch (this.screenCase_){
           case 0:
             i = 7;
             break;
           case 1:
             i = 1;
             break;
           case 2:
             i = 2;
             break;
           case 3:
             i = 3;
             break;
           case 4:
             i = 4;
             break;
           case 5:
             i = 5;
             break;
           case 6:
             i = 6;
             break;
           default:
             i = 0;
       }
       return i;
    }
    public final SingleItemPicker k(){
       if (this.screenCase_ == 6) {
          return this.screen_;
       }
       return SingleItemPicker.f();
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
