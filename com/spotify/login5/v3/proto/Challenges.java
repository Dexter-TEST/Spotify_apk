package com.spotify.login5.v3.proto.Challenges;
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
import p.h40;
import p.p30;
import com.spotify.login5.v3.proto.Challenge;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Challenges extends c implements u74	// class@0009de from classes.dex
{
    private bc3 challenges_;
    public static final int CHALLENGES_FIELD_NUMBER = 1;
    private static final Challenges DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       Challenges uChallenges = new Challenges();
       Challenges.DEFAULT_INSTANCE = uChallenges;
       c.registerDefaultInstance(Challenges.class, uChallenges);
    }
    private void Challenges(){
       super();
       this.challenges_ = c.emptyProtobufList();
    }
    public static Challenges e(){
       return Challenges.DEFAULT_INSTANCE;
    }
    public static Challenges g(){
       return Challenges.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Challenges.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"challenges_",Challenge.class};
             return c.newMessageInfo(Challenges.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b", objArray);
           case 3:
             return new Challenges();
           case 4:
             return new h40(p2);
           case 5:
             return Challenges.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Challenges.PARSER) == null) {
                _monitor_enter(Challenges.class);
                if ((pARSER = Challenges.PARSER) == null) {
                   pARSER = new ii2(Challenges.DEFAULT_INSTANCE);
                   Challenges.PARSER = pARSER;
                }
                _monitor_exit(Challenges.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final bc3 f(){
       return this.challenges_;
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
