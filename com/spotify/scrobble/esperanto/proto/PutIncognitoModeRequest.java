package com.spotify.scrobble.esperanto.proto.PutIncognitoModeRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.fn5;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class PutIncognitoModeRequest extends c implements u74	// class@000bfe from classes.dex
{
    private boolean incognitoMode_;
    private static final PutIncognitoModeRequest DEFAULT_INSTANCE;
    public static final int INCOGNITO_MODE_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       PutIncognitoModeRequest putIncognito = new PutIncognitoModeRequest();
       PutIncognitoModeRequest.DEFAULT_INSTANCE = putIncognito;
       c.registerDefaultInstance(PutIncognitoModeRequest.class, putIncognito);
    }
    private void PutIncognitoModeRequest(){
       super();
    }
    public static void e(PutIncognitoModeRequest p0,boolean p1){
       p0.incognitoMode_ = p1;
    }
    public static PutIncognitoModeRequest f(){
       return PutIncognitoModeRequest.DEFAULT_INSTANCE;
    }
    public static fn5 g(){
       return PutIncognitoModeRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return PutIncognitoModeRequest.DEFAULT_INSTANCE.getParserForType();
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
             objArray[0] = "incognitoMode_";
             return c.newMessageInfo(PutIncognitoModeRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07", objArray);
           case 3:
             return new PutIncognitoModeRequest();
           case 4:
             return new fn5();
           case 5:
             return PutIncognitoModeRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = PutIncognitoModeRequest.PARSER) == null) {
                _monitor_enter(PutIncognitoModeRequest.class);
                if ((pARSER = PutIncognitoModeRequest.PARSER) == null) {
                   pARSER = new ii2(PutIncognitoModeRequest.DEFAULT_INSTANCE);
                   PutIncognitoModeRequest.PARSER = pARSER;
                }
                _monitor_exit(PutIncognitoModeRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
