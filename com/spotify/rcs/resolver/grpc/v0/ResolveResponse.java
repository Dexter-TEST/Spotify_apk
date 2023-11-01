package com.spotify.rcs.resolver.grpc.v0.ResolveResponse;
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
import p.vp1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.rcs.resolver.grpc.v0.Configuration;
import p.r74;
import com.google.protobuf.b;

public final class ResolveResponse extends c implements u74	// class@000bd4 from classes.dex
{
    private Configuration configuration_;
    public static final int CONFIGURATION_FIELD_NUMBER = 1;
    private static final ResolveResponse DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       ResolveResponse resolveRespo = new ResolveResponse();
       ResolveResponse.DEFAULT_INSTANCE = resolveRespo;
       c.registerDefaultInstance(ResolveResponse.class, resolveRespo);
    }
    private void ResolveResponse(){
       super();
    }
    public static ResolveResponse e(){
       return ResolveResponse.DEFAULT_INSTANCE;
    }
    public static ResolveResponse g(){
       return ResolveResponse.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return ResolveResponse.DEFAULT_INSTANCE.getParserForType();
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
             objArray[0] = "configuration_";
             return c.newMessageInfo(ResolveResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t", objArray);
           case 3:
             return new ResolveResponse();
           case 4:
             return new fq1(p2);
           case 5:
             return ResolveResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ResolveResponse.PARSER) == null) {
                _monitor_enter(ResolveResponse.class);
                if ((pARSER = ResolveResponse.PARSER) == null) {
                   pARSER = new ii2(ResolveResponse.DEFAULT_INSTANCE);
                   ResolveResponse.PARSER = pARSER;
                }
                _monitor_exit(ResolveResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final Configuration f(){
       ResolveResponse tconfigurati;
       if ((tconfigurati = this.configuration_) == null) {
          tconfigurati = Configuration.h();
       }
       return tconfigurati;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final boolean h(){
       boolean b = (this.configuration_ != null)? true: false;
       return b;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
