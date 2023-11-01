package com.spotify.login5.v3.challenges.proto.CodeChallenge;
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
import p.m30;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class CodeChallenge extends c implements u74	// class@0009ce from classes.dex
{
    private String canonicalPhoneNumber_;
    private int codeLength_;
    private int expiresIn_;
    private int method_;
    public static final int CANONICAL_PHONE_NUMBER_FIELD_NUMBER = 4;
    public static final int CODE_LENGTH_FIELD_NUMBER = 2;
    private static final CodeChallenge DEFAULT_INSTANCE;
    public static final int EXPIRES_IN_FIELD_NUMBER;
    public static final int METHOD_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       CodeChallenge uCodeChallen = new CodeChallenge();
       CodeChallenge.DEFAULT_INSTANCE = uCodeChallen;
       c.registerDefaultInstance(CodeChallenge.class, uCodeChallen);
    }
    private void CodeChallenge(){
       super();
       this.canonicalPhoneNumber_ = "";
    }
    public static CodeChallenge e(){
       return CodeChallenge.DEFAULT_INSTANCE;
    }
    public static CodeChallenge h(){
       return CodeChallenge.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return CodeChallenge.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"method_","codeLength_","expiresIn_","canonicalPhoneNumber_"};
             return c.newMessageInfo(CodeChallenge.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\x04\x03\x04\x04\x02\x02", objArray);
           case 3:
             return new CodeChallenge();
           case 4:
             return new h40(p2);
           case 5:
             return CodeChallenge.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = CodeChallenge.PARSER) == null) {
                _monitor_enter(CodeChallenge.class);
                if ((pARSER = CodeChallenge.PARSER) == null) {
                   pARSER = new ii2(CodeChallenge.DEFAULT_INSTANCE);
                   CodeChallenge.PARSER = pARSER;
                }
                _monitor_exit(CodeChallenge.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String f(){
       return this.canonicalPhoneNumber_;
    }
    public final int g(){
       return this.codeLength_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final int i(){
       return this.expiresIn_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
