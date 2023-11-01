package com.spotify.player.esperanto.proto.EsSkipToTrack$SkipToTrack;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import java.lang.Object;
import java.lang.String;
import p.rr1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;

public final class EsSkipToTrack$SkipToTrack extends c implements u74	// class@000b10 from classes.dex
{
    private EsOptional$OptionalInt64 pageIndex_;
    private String pageUrl_;
    private EsOptional$OptionalInt64 trackIndex_;
    private String trackUid_;
    private String trackUri_;
    private static final EsSkipToTrack$SkipToTrack DEFAULT_INSTANCE;
    public static final int PAGE_INDEX_FIELD_NUMBER;
    public static final int PAGE_URL_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int TRACK_INDEX_FIELD_NUMBER;
    public static final int TRACK_UID_FIELD_NUMBER;
    public static final int TRACK_URI_FIELD_NUMBER;

    static {
       EsSkipToTrack$SkipToTrack skipToTrack = new EsSkipToTrack$SkipToTrack();
       EsSkipToTrack$SkipToTrack.DEFAULT_INSTANCE = skipToTrack;
       c.registerDefaultInstance(EsSkipToTrack$SkipToTrack.class, skipToTrack);
    }
    private void EsSkipToTrack$SkipToTrack(){
       super();
       this.pageUrl_ = "";
       this.trackUid_ = "";
       this.trackUri_ = "";
    }
    public static void e(EsSkipToTrack$SkipToTrack p0,EsOptional$OptionalInt64 p1){
       p0.getClass();
       p1.getClass();
       p0.pageIndex_ = p1;
    }
    public static void f(EsSkipToTrack$SkipToTrack p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.pageUrl_ = p1;
    }
    public static void g(EsSkipToTrack$SkipToTrack p0,EsOptional$OptionalInt64 p1){
       p0.getClass();
       p1.getClass();
       p0.trackIndex_ = p1;
    }
    public static void h(EsSkipToTrack$SkipToTrack p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.trackUid_ = p1;
    }
    public static void i(EsSkipToTrack$SkipToTrack p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.trackUri_ = p1;
    }
    public static EsSkipToTrack$SkipToTrack j(){
       return EsSkipToTrack$SkipToTrack.DEFAULT_INSTANCE;
    }
    public static rr1 k(){
       return EsSkipToTrack$SkipToTrack.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsSkipToTrack$SkipToTrack.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"pageUrl_","pageIndex_","trackUid_","trackUri_","trackIndex_"};
             return c.newMessageInfo(EsSkipToTrack$SkipToTrack.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\t\x03\x02\x02\x04\x02\x02\x05\t", objArray);
           case 3:
             return new EsSkipToTrack$SkipToTrack();
           case 4:
             return new rr1();
           case 5:
             return EsSkipToTrack$SkipToTrack.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsSkipToTrack$SkipToTrack.PARSER) == null) {
                _monitor_enter(EsSkipToTrack$SkipToTrack.class);
                if ((pARSER = EsSkipToTrack$SkipToTrack.PARSER) == null) {
                   pARSER = new ii2(EsSkipToTrack$SkipToTrack.DEFAULT_INSTANCE);
                   EsSkipToTrack$SkipToTrack.PARSER = pARSER;
                }
                _monitor_exit(EsSkipToTrack$SkipToTrack.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
