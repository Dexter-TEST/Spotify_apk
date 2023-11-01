package com.spotify.login5.v3.challenges.proto.CodeSolution;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.oh0;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class CodeSolution extends c implements u74	// class@0009cf from classes.dex
{
    private String code_;
    public static final int CODE_FIELD_NUMBER = 1;
    private static final CodeSolution DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       CodeSolution uCodeSolutio = new CodeSolution();
       CodeSolution.DEFAULT_INSTANCE = uCodeSolutio;
       c.registerDefaultInstance(CodeSolution.class, uCodeSolutio);
    }
    private void CodeSolution(){
       super();
       this.code_ = "";
    }
    public static CodeSolution e(){
       return CodeSolution.DEFAULT_INSTANCE;
    }
    public static void f(CodeSolution p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.code_ = p1;
    }
    public static oh0 g(){
       return CodeSolution.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return CodeSolution.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[b];
             objArray[0] = "code_";
             return c.newMessageInfo(CodeSolution.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02", objArray);
           case 3:
             return new CodeSolution();
           case 4:
             return new oh0();
           case 5:
             return CodeSolution.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = CodeSolution.PARSER) == null) {
                _monitor_enter(CodeSolution.class);
                if ((pARSER = CodeSolution.PARSER) == null) {
                   pARSER = new ii2(CodeSolution.DEFAULT_INSTANCE);
                   CodeSolution.PARSER = pARSER;
                }
                _monitor_exit(CodeSolution.class);
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
