package com.spotify.scrobble.esperanto.proto.GetIncognitoModeResponse;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.fq1;
import p.zp1;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class GetIncognitoModeResponse extends c implements u74	// class@000bfd from classes.dex
{
    private boolean incognitoMode_;
    private static final GetIncognitoModeResponse DEFAULT_INSTANCE;
    public static final int INCOGNITO_MODE_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       GetIncognitoModeResponse getIncognito = new GetIncognitoModeResponse();
       GetIncognitoModeResponse.DEFAULT_INSTANCE = getIncognito;
       c.registerDefaultInstance(GetIncognitoModeResponse.class, getIncognito);
    }
    private void GetIncognitoModeResponse(){
       super();
    }
    public static GetIncognitoModeResponse e(){
       return GetIncognitoModeResponse.DEFAULT_INSTANCE;
    }
    public static GetIncognitoModeResponse f(byte[] p0){
       return c.parseFrom(GetIncognitoModeResponse.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return GetIncognitoModeResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[b];
             objArray[0] = "incognitoMode_";
             return c.newMessageInfo(GetIncognitoModeResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07", objArray);
           case 3:
             return new GetIncognitoModeResponse();
           case 4:
             return new fq1(p2);
           case 5:
             return GetIncognitoModeResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = GetIncognitoModeResponse.PARSER) == null) {
                _monitor_enter(GetIncognitoModeResponse.class);
                if ((pARSER = GetIncognitoModeResponse.PARSER) == null) {
                   pARSER = new ii2(GetIncognitoModeResponse.DEFAULT_INSTANCE);
                   GetIncognitoModeResponse.PARSER = pARSER;
                }
                _monitor_exit(GetIncognitoModeResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
