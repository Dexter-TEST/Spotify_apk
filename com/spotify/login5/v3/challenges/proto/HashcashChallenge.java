package com.spotify.login5.v3.challenges.proto.HashcashChallenge;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.h40;
import p.v30;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class HashcashChallenge extends c implements u74	// class@0009d0 from classes.dex
{
    private int length_;
    private i80 prefix_;
    private static final HashcashChallenge DEFAULT_INSTANCE;
    public static final int LENGTH_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PREFIX_FIELD_NUMBER;

    static {
       HashcashChallenge hashcashChal = new HashcashChallenge();
       HashcashChallenge.DEFAULT_INSTANCE = hashcashChal;
       c.registerDefaultInstance(HashcashChallenge.class, hashcashChal);
    }
    private void HashcashChallenge(){
       super();
       this.prefix_ = i80.b;
    }
    public static HashcashChallenge e(){
       return HashcashChallenge.DEFAULT_INSTANCE;
    }
    public static HashcashChallenge f(){
       return HashcashChallenge.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return HashcashChallenge.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"prefix_","length_"};
             return c.newMessageInfo(HashcashChallenge.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\n\x02\x04", objArray);
           case 3:
             return new HashcashChallenge();
           case 4:
             return new h40(p2);
           case 5:
             return HashcashChallenge.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = HashcashChallenge.PARSER) == null) {
                _monitor_enter(HashcashChallenge.class);
                if ((pARSER = HashcashChallenge.PARSER) == null) {
                   pARSER = new ii2(HashcashChallenge.DEFAULT_INSTANCE);
                   HashcashChallenge.PARSER = pARSER;
                }
                _monitor_exit(HashcashChallenge.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final int g(){
       return this.length_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final i80 h(){
       return this.prefix_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
