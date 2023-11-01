package com.spotify.allboarding.model.v2.proto.Step;
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
import p.xk1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.allboarding.model.v2.proto.Action;
import com.spotify.allboarding.model.v2.proto.Screen;
import p.r74;
import com.google.protobuf.b;

public final class Step extends c implements u74	// class@000532 from classes.dex
{
    private Action action_;
    private Step next_;
    private Screen screen_;
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final Step DEFAULT_INSTANCE;
    public static final int NEXT_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SCREEN_FIELD_NUMBER;

    static {
       Step step = new Step();
       Step.DEFAULT_INSTANCE = step;
       c.registerDefaultInstance(Step.class, step);
    }
    private void Step(){
       super();
    }
    public static Step e(){
       return Step.DEFAULT_INSTANCE;
    }
    public static Step g(){
       return Step.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Step.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"action_","screen_","next_"};
             return c.newMessageInfo(Step.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\t\x03\t", objArray);
           case 3:
             return new Step();
           case 4:
             return new cl1(p2);
           case 5:
             return Step.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Step.PARSER) == null) {
                _monitor_enter(Step.class);
                if ((pARSER = Step.PARSER) == null) {
                   pARSER = new ii2(Step.DEFAULT_INSTANCE);
                   Step.PARSER = pARSER;
                }
                _monitor_exit(Step.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final Action f(){
       Step taction_;
       if ((taction_ = this.action_) == null) {
          taction_ = Action.f();
       }
       return taction_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final Step h(){
       Step tnext_;
       if ((tnext_ = this.next_) == null) {
          tnext_ = Step.DEFAULT_INSTANCE;
       }
       return tnext_;
    }
    public final Screen i(){
       Step tscreen_;
       if ((tscreen_ = this.screen_) == null) {
          tscreen_ = Screen.h();
       }
       return tscreen_;
    }
    public final boolean j(){
       boolean b = (this.next_ != null)? true: false;
       return b;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
