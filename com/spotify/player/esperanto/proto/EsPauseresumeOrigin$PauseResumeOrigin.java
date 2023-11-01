package com.spotify.player.esperanto.proto.EsPauseresumeOrigin$PauseResumeOrigin;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.qq1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;

public final class EsPauseresumeOrigin$PauseResumeOrigin extends c implements u74	// class@000aff from classes.dex
{
    private String featureIdentifier_;
    private static final EsPauseresumeOrigin$PauseResumeOrigin DEFAULT_INSTANCE;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       EsPauseresumeOrigin$PauseResumeOrigin pauseResumeO = new EsPauseresumeOrigin$PauseResumeOrigin();
       EsPauseresumeOrigin$PauseResumeOrigin.DEFAULT_INSTANCE = pauseResumeO;
       c.registerDefaultInstance(EsPauseresumeOrigin$PauseResumeOrigin.class, pauseResumeO);
    }
    private void EsPauseresumeOrigin$PauseResumeOrigin(){
       super();
       this.featureIdentifier_ = "";
    }
    public static void e(EsPauseresumeOrigin$PauseResumeOrigin p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.featureIdentifier_ = p1;
    }
    public static EsPauseresumeOrigin$PauseResumeOrigin f(){
       return EsPauseresumeOrigin$PauseResumeOrigin.DEFAULT_INSTANCE;
    }
    public static qq1 g(){
       return EsPauseresumeOrigin$PauseResumeOrigin.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsPauseresumeOrigin$PauseResumeOrigin.DEFAULT_INSTANCE.getParserForType();
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
             objArray[0] = "featureIdentifier_";
             return c.newMessageInfo(EsPauseresumeOrigin$PauseResumeOrigin.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02", objArray);
           case 3:
             return new EsPauseresumeOrigin$PauseResumeOrigin();
           case 4:
             return new qq1();
           case 5:
             return EsPauseresumeOrigin$PauseResumeOrigin.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsPauseresumeOrigin$PauseResumeOrigin.PARSER) == null) {
                _monitor_enter(EsPauseresumeOrigin$PauseResumeOrigin.class);
                if ((pARSER = EsPauseresumeOrigin$PauseResumeOrigin.PARSER) == null) {
                   pARSER = new ii2(EsPauseresumeOrigin$PauseResumeOrigin.DEFAULT_INSTANCE);
                   EsPauseresumeOrigin$PauseResumeOrigin.PARSER = pARSER;
                }
                _monitor_exit(EsPauseresumeOrigin$PauseResumeOrigin.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
