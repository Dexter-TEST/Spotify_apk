package com.spotify.searchview.proto.DrillDownViewResponse;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.fq1;
import p.tp1;
import com.spotify.searchview.proto.Entity;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import java.util.List;
import p.r74;
import com.google.protobuf.b;

public final class DrillDownViewResponse extends c implements u74	// class@000c0a from classes.dex
{
    private bc3 hits_;
    private String nextPageToken_;
    private static final DrillDownViewResponse DEFAULT_INSTANCE;
    public static final int HITS_FIELD_NUMBER;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       DrillDownViewResponse uDrillDownVi = new DrillDownViewResponse();
       DrillDownViewResponse.DEFAULT_INSTANCE = uDrillDownVi;
       c.registerDefaultInstance(DrillDownViewResponse.class, uDrillDownVi);
    }
    private void DrillDownViewResponse(){
       super();
       this.hits_ = c.emptyProtobufList();
       this.nextPageToken_ = "";
    }
    public static DrillDownViewResponse e(){
       return DrillDownViewResponse.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return DrillDownViewResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"hits_",Entity.class,"nextPageToken_"};
             return c.newMessageInfo(DrillDownViewResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x02\x02\x02", objArray);
           case 3:
             return new DrillDownViewResponse();
           case 4:
             return new fq1(p2);
           case 5:
             return DrillDownViewResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = DrillDownViewResponse.PARSER) == null) {
                _monitor_enter(DrillDownViewResponse.class);
                if ((pARSER = DrillDownViewResponse.PARSER) == null) {
                   pARSER = new ii2(DrillDownViewResponse.DEFAULT_INSTANCE);
                   DrillDownViewResponse.PARSER = pARSER;
                }
                _monitor_exit(DrillDownViewResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final Entity f(int p0){
       return this.hits_.get(p0);
    }
    public final int g(){
       return this.hits_.size();
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
