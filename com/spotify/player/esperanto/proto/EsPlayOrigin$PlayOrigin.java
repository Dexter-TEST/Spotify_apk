package com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import com.google.common.collect.d;
import p.f2;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.a;
import java.lang.String;
import java.lang.Object;
import p.r75;
import p.tq1;
import com.google.protobuf.b;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;

public final class EsPlayOrigin$PlayOrigin extends c implements u74	// class@000b02 from classes.dex
{
    private String deviceIdentifier_;
    private String externalReferrer_;
    private bc3 featureClasses_;
    private String featureIdentifier_;
    private String featureVersion_;
    private String referrerIdentifier_;
    private String restrictionIdentifier_;
    private String viewUri_;
    private static final EsPlayOrigin$PlayOrigin DEFAULT_INSTANCE;
    public static final int DEVICE_IDENTIFIER_FIELD_NUMBER;
    public static final int EXTERNAL_REFERRER_FIELD_NUMBER;
    public static final int FEATURE_CLASSES_FIELD_NUMBER;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER;
    public static final int FEATURE_VERSION_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int REFERRER_IDENTIFIER_FIELD_NUMBER;
    public static final int RESTRICTION_IDENTIFIER_FIELD_NUMBER;
    public static final int VIEW_URI_FIELD_NUMBER;

    static {
       EsPlayOrigin$PlayOrigin playOrigin = new EsPlayOrigin$PlayOrigin();
       EsPlayOrigin$PlayOrigin.DEFAULT_INSTANCE = playOrigin;
       c.registerDefaultInstance(EsPlayOrigin$PlayOrigin.class, playOrigin);
    }
    private void EsPlayOrigin$PlayOrigin(){
       super();
       this.featureIdentifier_ = "";
       this.featureVersion_ = "";
       this.viewUri_ = "";
       this.externalReferrer_ = "";
       this.referrerIdentifier_ = "";
       this.deviceIdentifier_ = "";
       this.featureClasses_ = c.emptyProtobufList();
       this.restrictionIdentifier_ = "";
    }
    public static void e(EsPlayOrigin$PlayOrigin p0,d p1){
       EsPlayOrigin$PlayOrigin playOrigin = p0.featureClasses_;
       if (playOrigin.a == null) {
          p0.featureClasses_ = c.mutableCopy(playOrigin);
       }
       a.addAll(p1, p0.featureClasses_);
       return;
    }
    public static void f(EsPlayOrigin$PlayOrigin p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.deviceIdentifier_ = p1;
    }
    public static void g(EsPlayOrigin$PlayOrigin p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.externalReferrer_ = p1;
    }
    public static void h(EsPlayOrigin$PlayOrigin p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.featureIdentifier_ = p1;
    }
    public static void i(EsPlayOrigin$PlayOrigin p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.featureVersion_ = p1;
    }
    public static void j(EsPlayOrigin$PlayOrigin p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.referrerIdentifier_ = p1;
    }
    public static void k(EsPlayOrigin$PlayOrigin p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.restrictionIdentifier_ = p1;
    }
    public static void l(EsPlayOrigin$PlayOrigin p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.viewUri_ = p1;
    }
    public static EsPlayOrigin$PlayOrigin m(){
       return EsPlayOrigin$PlayOrigin.DEFAULT_INSTANCE;
    }
    public static EsPlayOrigin$PlayOrigin n(){
       return EsPlayOrigin$PlayOrigin.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsPlayOrigin$PlayOrigin.DEFAULT_INSTANCE.getParserForType();
    }
    public static tq1 w(){
       return EsPlayOrigin$PlayOrigin.DEFAULT_INSTANCE.createBuilder();
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
             Object[] objArray = new Object[]{"featureIdentifier_","featureVersion_","viewUri_","externalReferrer_","referrerIdentifier_","deviceIdentifier_","featureClasses_","restrictionIdentifier_"};
             return c.newMessageInfo(EsPlayOrigin$PlayOrigin.DEFAULT_INSTANCE, "\xff\x02\xff\x02\b\xff\x02\xff\x02\xff\x02\xff\x02\x01\b\b\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x02\x02\x05\x02\x02\x06\x02\x02\x07\x02\x02\b\x02\x02", objArray);
           case 3:
             return new EsPlayOrigin$PlayOrigin();
           case 4:
             return new tq1();
           case 5:
             return EsPlayOrigin$PlayOrigin.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsPlayOrigin$PlayOrigin.PARSER) == null) {
                _monitor_enter(EsPlayOrigin$PlayOrigin.class);
                if ((pARSER = EsPlayOrigin$PlayOrigin.PARSER) == null) {
                   pARSER = new ii2(EsPlayOrigin$PlayOrigin.DEFAULT_INSTANCE);
                   EsPlayOrigin$PlayOrigin.PARSER = pARSER;
                }
                _monitor_exit(EsPlayOrigin$PlayOrigin.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String o(){
       return this.deviceIdentifier_;
    }
    public final String p(){
       return this.externalReferrer_;
    }
    public final bc3 q(){
       return this.featureClasses_;
    }
    public final String r(){
       return this.featureIdentifier_;
    }
    public final String s(){
       return this.featureVersion_;
    }
    public final String t(){
       return this.referrerIdentifier_;
    }
    public final String u(){
       return this.restrictionIdentifier_;
    }
    public final String v(){
       return this.viewUri_;
    }
}
