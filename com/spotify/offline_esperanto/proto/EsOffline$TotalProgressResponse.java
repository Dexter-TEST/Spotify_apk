package com.spotify.offline_esperanto.proto.EsOffline$TotalProgressResponse;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.sq1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.offline_esperanto.proto.EsOffline$Progress;

public final class EsOffline$TotalProgressResponse extends c implements u74	// class@000ac2 from classes.dex
{
    private EsOffline$Progress progress_;
    private static final EsOffline$TotalProgressResponse DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int PROGRESS_FIELD_NUMBER;

    static {
       EsOffline$TotalProgressResponse totalProgres = new EsOffline$TotalProgressResponse();
       EsOffline$TotalProgressResponse.DEFAULT_INSTANCE = totalProgres;
       c.registerDefaultInstance(EsOffline$TotalProgressResponse.class, totalProgres);
    }
    private void EsOffline$TotalProgressResponse(){
       super();
    }
    public static EsOffline$TotalProgressResponse e(){
       return EsOffline$TotalProgressResponse.DEFAULT_INSTANCE;
    }
    public static EsOffline$TotalProgressResponse g(byte[] p0){
       return c.parseFrom(EsOffline$TotalProgressResponse.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return EsOffline$TotalProgressResponse.DEFAULT_INSTANCE.getParserForType();
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
             objArray[0] = "progress_";
             return c.newMessageInfo(EsOffline$TotalProgressResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t", objArray);
           case 3:
             return new EsOffline$TotalProgressResponse();
           case 4:
             return new sq1(24);
           case 5:
             return EsOffline$TotalProgressResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsOffline$TotalProgressResponse.PARSER) == null) {
                _monitor_enter(EsOffline$TotalProgressResponse.class);
                if ((pARSER = EsOffline$TotalProgressResponse.PARSER) == null) {
                   pARSER = new ii2(EsOffline$TotalProgressResponse.DEFAULT_INSTANCE);
                   EsOffline$TotalProgressResponse.PARSER = pARSER;
                }
                _monitor_exit(EsOffline$TotalProgressResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final EsOffline$Progress f(){
       EsOffline$TotalProgressResponse tprogress_;
       if ((tprogress_ = this.progress_) == null) {
          tprogress_ = EsOffline$Progress.f();
       }
       return tprogress_;
    }
}
