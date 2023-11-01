package com.spotify.login5.v3.credentials.proto.OneTimeToken;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.x35;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class OneTimeToken extends c implements u74	// class@0009d5 from classes.dex
{
    private String token_;
    private static final OneTimeToken DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int TOKEN_FIELD_NUMBER;

    static {
       OneTimeToken oneTimeToken = new OneTimeToken();
       OneTimeToken.DEFAULT_INSTANCE = oneTimeToken;
       c.registerDefaultInstance(OneTimeToken.class, oneTimeToken);
    }
    private void OneTimeToken(){
       super();
       this.token_ = "";
    }
    public static OneTimeToken e(){
       return OneTimeToken.DEFAULT_INSTANCE;
    }
    public static void f(OneTimeToken p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.token_ = p1;
    }
    public static x35 g(){
       return OneTimeToken.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return OneTimeToken.DEFAULT_INSTANCE.getParserForType();
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
             objArray[0] = "token_";
             return c.newMessageInfo(OneTimeToken.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02", objArray);
           case 3:
             return new OneTimeToken();
           case 4:
             return new x35();
           case 5:
             return OneTimeToken.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = OneTimeToken.PARSER) == null) {
                _monitor_enter(OneTimeToken.class);
                if ((pARSER = OneTimeToken.PARSER) == null) {
                   pARSER = new ii2(OneTimeToken.DEFAULT_INSTANCE);
                   OneTimeToken.PARSER = pARSER;
                }
                _monitor_exit(OneTimeToken.class);
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
