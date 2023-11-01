package com.spotify.login5.v3.proto.Challenge;
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
import p.z30;
import com.spotify.login5.v3.challenges.proto.HashcashChallenge;
import com.spotify.login5.v3.challenges.proto.CodeChallenge;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Challenge extends c implements u74	// class@0009db from classes.dex
{
    private int challengeCase_;
    private Object challenge_;
    public static final int CODE_FIELD_NUMBER = 2;
    private static final Challenge DEFAULT_INSTANCE;
    public static final int HASHCASH_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       Challenge uChallenge = new Challenge();
       Challenge.DEFAULT_INSTANCE = uChallenge;
       c.registerDefaultInstance(Challenge.class, uChallenge);
    }
    private void Challenge(){
       super();
       this.challengeCase_ = 0;
    }
    public static Challenge e(){
       return Challenge.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Challenge.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"challenge_","challengeCase_",HashcashChallenge.class,CodeChallenge.class};
             return c.newMessageInfo(Challenge.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\x01\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01<\xff\x02\xff\x02\x02<\xff\x02\xff\x02", objArray);
           case 3:
             return new Challenge();
           case 4:
             return new h40(p2);
           case 5:
             return Challenge.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Challenge.PARSER) == null) {
                _monitor_enter(Challenge.class);
                if ((pARSER = Challenge.PARSER) == null) {
                   pARSER = new ii2(Challenge.DEFAULT_INSTANCE);
                   Challenge.PARSER = pARSER;
                }
                _monitor_exit(Challenge.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final int f(){
       Challenge tchallengeCa;
       int i;
       if ((tchallengeCa = this.challengeCase_) != null) {
          i = 1;
          if (tchallengeCa != i) {
             i = 2;
             if (tchallengeCa != i) {
                i = 0;
             }
          }
       }else {
          i = 3;
       }
       return i;
    }
    public final CodeChallenge g(){
       if (this.challengeCase_ == 2) {
          return this.challenge_;
       }
       return CodeChallenge.h();
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final HashcashChallenge h(){
       if (this.challengeCase_ == 1) {
          return this.challenge_;
       }
       return HashcashChallenge.f();
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
