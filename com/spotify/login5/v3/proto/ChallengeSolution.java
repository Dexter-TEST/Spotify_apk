package com.spotify.login5.v3.proto.ChallengeSolution;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.login5.v3.challenges.proto.HashcashSolution;
import java.lang.Object;
import com.spotify.login5.v3.challenges.proto.CodeSolution;
import p.od0;
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

public final class ChallengeSolution extends c implements u74	// class@0009dc from classes.dex
{
    private int solutionCase_;
    private Object solution_;
    public static final int CODE_FIELD_NUMBER = 2;
    private static final ChallengeSolution DEFAULT_INSTANCE;
    public static final int HASHCASH_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       ChallengeSolution uChallengeSo = new ChallengeSolution();
       ChallengeSolution.DEFAULT_INSTANCE = uChallengeSo;
       c.registerDefaultInstance(ChallengeSolution.class, uChallengeSo);
    }
    private void ChallengeSolution(){
       super();
       this.solutionCase_ = 0;
    }
    public static ChallengeSolution e(){
       return ChallengeSolution.DEFAULT_INSTANCE;
    }
    public static void f(ChallengeSolution p0,HashcashSolution p1){
       p0.getClass();
       p1.getClass();
       p0.solution_ = p1;
       p0.solutionCase_ = 1;
    }
    public static void g(ChallengeSolution p0,CodeSolution p1){
       p0.getClass();
       p1.getClass();
       p0.solution_ = p1;
       p0.solutionCase_ = 2;
    }
    public static od0 h(){
       return ChallengeSolution.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return ChallengeSolution.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"solution_","solutionCase_",HashcashSolution.class,CodeSolution.class};
             return c.newMessageInfo(ChallengeSolution.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\x01\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01<\xff\x02\xff\x02\x02<\xff\x02\xff\x02", objArray);
           case 3:
             return new ChallengeSolution();
           case 4:
             return new od0();
           case 5:
             return ChallengeSolution.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ChallengeSolution.PARSER) == null) {
                _monitor_enter(ChallengeSolution.class);
                if ((pARSER = ChallengeSolution.PARSER) == null) {
                   pARSER = new ii2(ChallengeSolution.DEFAULT_INSTANCE);
                   ChallengeSolution.PARSER = pARSER;
                }
                _monitor_exit(ChallengeSolution.class);
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
