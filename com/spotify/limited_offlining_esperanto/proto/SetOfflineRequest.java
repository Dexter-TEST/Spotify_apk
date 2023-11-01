package com.spotify.limited_offlining_esperanto.proto.SetOfflineRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import java.util.List;
import p.f2;
import java.lang.Iterable;
import com.google.protobuf.a;
import java.lang.String;
import java.lang.Object;
import p.hc6;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;

public final class SetOfflineRequest extends c implements u74	// class@00090a from classes.dex
{
    private String contextUri_;
    private bc3 trackUri_;
    public static final int CONTEXT_URI_FIELD_NUMBER = 1;
    private static final SetOfflineRequest DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int TRACK_URI_FIELD_NUMBER;

    static {
       SetOfflineRequest setOfflineRe = new SetOfflineRequest();
       SetOfflineRequest.DEFAULT_INSTANCE = setOfflineRe;
       c.registerDefaultInstance(SetOfflineRequest.class, setOfflineRe);
    }
    private void SetOfflineRequest(){
       super();
       this.contextUri_ = "";
       this.trackUri_ = c.emptyProtobufList();
    }
    public static void e(SetOfflineRequest p0,List p1){
       SetOfflineRequest trackUri_ = p0.trackUri_;
       if (trackUri_.a == null) {
          p0.trackUri_ = c.mutableCopy(trackUri_);
       }
       a.addAll(p1, p0.trackUri_);
       return;
    }
    public static void f(SetOfflineRequest p0,String p1){
       p0.getClass();
       p0.contextUri_ = p1;
    }
    public static SetOfflineRequest g(){
       return SetOfflineRequest.DEFAULT_INSTANCE;
    }
    public static hc6 h(){
       return SetOfflineRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return SetOfflineRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"contextUri_","trackUri_"};
             return c.newMessageInfo(SetOfflineRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02", objArray);
           case 3:
             return new SetOfflineRequest();
           case 4:
             return new hc6();
           case 5:
             return SetOfflineRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = SetOfflineRequest.PARSER) == null) {
                _monitor_enter(SetOfflineRequest.class);
                if ((pARSER = SetOfflineRequest.PARSER) == null) {
                   pARSER = new ii2(SetOfflineRequest.DEFAULT_INSTANCE);
                   SetOfflineRequest.PARSER = pARSER;
                }
                _monitor_exit(SetOfflineRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
