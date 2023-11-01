package com.spotify.limited_offlining_esperanto.proto.SetOfflineResponse;
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
import p.en6;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.ic6;

public final class SetOfflineResponse extends c implements u74	// class@00090b from classes.dex
{
    private String errorMessage_;
    private int statusCode_;
    private static final SetOfflineResponse DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int STATUS_CODE_FIELD_NUMBER;

    static {
       SetOfflineResponse setOfflineRe = new SetOfflineResponse();
       SetOfflineResponse.DEFAULT_INSTANCE = setOfflineRe;
       c.registerDefaultInstance(SetOfflineResponse.class, setOfflineRe);
    }
    private void SetOfflineResponse(){
       super();
       this.errorMessage_ = "";
    }
    public static SetOfflineResponse e(){
       return SetOfflineResponse.DEFAULT_INSTANCE;
    }
    public static SetOfflineResponse h(byte[] p0){
       return c.parseFrom(SetOfflineResponse.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return SetOfflineResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"statusCode_","errorMessage_"};
             return c.newMessageInfo(SetOfflineResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\x02\x02", objArray);
           case 3:
             return new SetOfflineResponse();
           case 4:
             return new h40(p2);
           case 5:
             return SetOfflineResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = SetOfflineResponse.PARSER) == null) {
                _monitor_enter(SetOfflineResponse.class);
                if ((pARSER = SetOfflineResponse.PARSER) == null) {
                   pARSER = new ii2(SetOfflineResponse.DEFAULT_INSTANCE);
                   SetOfflineResponse.PARSER = pARSER;
                }
                _monitor_exit(SetOfflineResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String f(){
       return this.errorMessage_;
    }
    public final ic6 g(){
       SetOfflineResponse tstatusCode_;
       ic6 oic6;
       if ((tstatusCode_ = this.statusCode_) != null) {
          if (tstatusCode_ != 1) {
             oic6 = (tstatusCode_ != 2)? null: ic6.t;
          }else {
             oic6 = ic6.c;
          }
       }else {
          oic6 = ic6.b;
       }
       if (oic6 == null) {
          oic6 = ic6.v;
       }
       return oic6;
    }
}
