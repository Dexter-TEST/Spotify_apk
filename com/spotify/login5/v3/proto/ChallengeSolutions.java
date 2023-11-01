package com.spotify.login5.v3.proto.ChallengeSolutions;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import com.spotify.login5.v3.proto.ChallengeSolution;
import java.lang.Object;
import p.f2;
import java.util.List;
import p.pd0;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class ChallengeSolutions extends c implements u74	// class@0009dd from classes.dex
{
    private bc3 solutions_;
    private static final ChallengeSolutions DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int SOLUTIONS_FIELD_NUMBER;

    static {
       ChallengeSolutions uChallengeSo = new ChallengeSolutions();
       ChallengeSolutions.DEFAULT_INSTANCE = uChallengeSo;
       c.registerDefaultInstance(ChallengeSolutions.class, uChallengeSo);
    }
    private void ChallengeSolutions(){
       super();
       this.solutions_ = c.emptyProtobufList();
    }
    public static ChallengeSolutions e(){
       return ChallengeSolutions.DEFAULT_INSTANCE;
    }
    public static void f(ChallengeSolutions p0,ChallengeSolution p1){
       p0.getClass();
       p1.getClass();
       ChallengeSolutions solutions_ = p0.solutions_;
       if (solutions_.a == null) {
          p0.solutions_ = c.mutableCopy(solutions_);
       }
       p0.solutions_.add(p1);
       return;
    }
    public static pd0 g(){
       return ChallengeSolutions.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return ChallengeSolutions.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"solutions_",ChallengeSolution.class};
             return c.newMessageInfo(ChallengeSolutions.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b", objArray);
           case 3:
             return new ChallengeSolutions();
           case 4:
             return new pd0();
           case 5:
             return ChallengeSolutions.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ChallengeSolutions.PARSER) == null) {
                _monitor_enter(ChallengeSolutions.class);
                if ((pARSER = ChallengeSolutions.PARSER) == null) {
                   pARSER = new ii2(ChallengeSolutions.DEFAULT_INSTANCE);
                   ChallengeSolutions.PARSER = pARSER;
                }
                _monitor_exit(ChallengeSolutions.class);
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
