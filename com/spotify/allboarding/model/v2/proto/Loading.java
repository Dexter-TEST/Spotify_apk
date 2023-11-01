package com.spotify.allboarding.model.v2.proto.Loading;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.cl1;
import p.vk1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Loading extends c implements u74	// class@00052a from classes.dex
{
    private String title_;
    private static final Loading DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int TITLE_FIELD_NUMBER;

    static {
       Loading loading = new Loading();
       Loading.DEFAULT_INSTANCE = loading;
       c.registerDefaultInstance(Loading.class, loading);
    }
    private void Loading(){
       super();
       this.title_ = "";
    }
    public static Loading e(){
       return Loading.DEFAULT_INSTANCE;
    }
    public static Loading f(){
       return Loading.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Loading.DEFAULT_INSTANCE.getParserForType();
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
             objArray[0] = "title_";
             return c.newMessageInfo(Loading.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02", objArray);
           case 3:
             return new Loading();
           case 4:
             return new cl1(p2);
           case 5:
             return Loading.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Loading.PARSER) == null) {
                _monitor_enter(Loading.class);
                if ((pARSER = Loading.PARSER) == null) {
                   pARSER = new ii2(Loading.DEFAULT_INSTANCE);
                   Loading.PARSER = pARSER;
                }
                _monitor_exit(Loading.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String g(){
       return this.title_;
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
