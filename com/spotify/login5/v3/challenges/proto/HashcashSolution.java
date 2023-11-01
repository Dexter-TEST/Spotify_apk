package com.spotify.login5.v3.challenges.proto.HashcashSolution;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
import p.h80;
import java.lang.Object;
import com.google.protobuf.Duration;
import p.jo2;
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

public final class HashcashSolution extends c implements u74	// class@0009d1 from classes.dex
{
    private Duration duration_;
    private i80 suffix_;
    private static final HashcashSolution DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SUFFIX_FIELD_NUMBER;

    static {
       HashcashSolution hashcashSolu = new HashcashSolution();
       HashcashSolution.DEFAULT_INSTANCE = hashcashSolu;
       c.registerDefaultInstance(HashcashSolution.class, hashcashSolu);
    }
    private void HashcashSolution(){
       super();
       this.suffix_ = i80.b;
    }
    public static HashcashSolution e(){
       return HashcashSolution.DEFAULT_INSTANCE;
    }
    public static void f(HashcashSolution p0,h80 p1){
       p0.getClass();
       p0.suffix_ = p1;
    }
    public static void g(HashcashSolution p0,Duration p1){
       p0.getClass();
       p1.getClass();
       p0.duration_ = p1;
    }
    public static jo2 h(){
       return HashcashSolution.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return HashcashSolution.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"suffix_","duration_"};
             return c.newMessageInfo(HashcashSolution.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\n\x02\t", objArray);
           case 3:
             return new HashcashSolution();
           case 4:
             return new jo2();
           case 5:
             return HashcashSolution.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = HashcashSolution.PARSER) == null) {
                _monitor_enter(HashcashSolution.class);
                if ((pARSER = HashcashSolution.PARSER) == null) {
                   pARSER = new ii2(HashcashSolution.DEFAULT_INSTANCE);
                   HashcashSolution.PARSER = pARSER;
                }
                _monitor_exit(HashcashSolution.class);
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
