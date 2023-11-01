package com.spotify.allboarding.model.v2.proto.OnboardingResponse;
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
import p.cl1;
import p.qk1;
import com.spotify.allboarding.model.v2.proto.ExperimentProperty;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.allboarding.model.v2.proto.Step;
import com.spotify.allboarding.model.v2.proto.Screen;
import p.r74;
import com.google.protobuf.b;

public final class OnboardingResponse extends c implements u74	// class@00052c from classes.dex
{
    private bc3 experimentProperties_;
    private Step nextSecondary_;
    private Step next_;
    private Screen screen_;
    private String step_;
    private static final OnboardingResponse DEFAULT_INSTANCE;
    public static final int EXPERIMENT_PROPERTIES_FIELD_NUMBER;
    public static final int NEXT_FIELD_NUMBER;
    public static final int NEXT_SECONDARY_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SCREEN_FIELD_NUMBER;
    public static final int STEP_FIELD_NUMBER;

    static {
       OnboardingResponse onboardingRe = new OnboardingResponse();
       OnboardingResponse.DEFAULT_INSTANCE = onboardingRe;
       c.registerDefaultInstance(OnboardingResponse.class, onboardingRe);
    }
    private void OnboardingResponse(){
       super();
       this.step_ = "";
       this.experimentProperties_ = c.emptyProtobufList();
    }
    public static OnboardingResponse e(){
       return OnboardingResponse.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return OnboardingResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"step_","screen_","next_","nextSecondary_","experimentProperties_",ExperimentProperty.class};
             return c.newMessageInfo(OnboardingResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\t\x03\t\x04\t\x05\x1b", objArray);
           case 3:
             return new OnboardingResponse();
           case 4:
             return new cl1(p2);
           case 5:
             return OnboardingResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = OnboardingResponse.PARSER) == null) {
                _monitor_enter(OnboardingResponse.class);
                if ((pARSER = OnboardingResponse.PARSER) == null) {
                   pARSER = new ii2(OnboardingResponse.DEFAULT_INSTANCE);
                   OnboardingResponse.PARSER = pARSER;
                }
                _monitor_exit(OnboardingResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final bc3 f(){
       return this.experimentProperties_;
    }
    public final Step g(){
       OnboardingResponse tnext_;
       if ((tnext_ = this.next_) == null) {
          tnext_ = Step.g();
       }
       return tnext_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final Step h(){
       OnboardingResponse tnextSeconda;
       if ((tnextSeconda = this.nextSecondary_) == null) {
          tnextSeconda = Step.g();
       }
       return tnextSeconda;
    }
    public final Screen i(){
       OnboardingResponse tscreen_;
       if ((tscreen_ = this.screen_) == null) {
          tscreen_ = Screen.h();
       }
       return tscreen_;
    }
    public final String j(){
       return this.step_;
    }
    public final boolean k(){
       boolean b = (this.next_ != null)? true: false;
       return b;
    }
    public final boolean l(){
       boolean b = (this.nextSecondary_ != null)? true: false;
       return b;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
