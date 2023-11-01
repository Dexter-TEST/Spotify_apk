package com.spotify.allboarding.model.v2.proto.ExperimentProperty;
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
import p.pk1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class ExperimentProperty extends c implements u74	// class@000529 from classes.dex
{
    private String key_;
    private String value_;
    private static final ExperimentProperty DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       ExperimentProperty uExperimentP = new ExperimentProperty();
       ExperimentProperty.DEFAULT_INSTANCE = uExperimentP;
       c.registerDefaultInstance(ExperimentProperty.class, uExperimentP);
    }
    private void ExperimentProperty(){
       super();
       this.key_ = "";
       this.value_ = "";
    }
    public static ExperimentProperty e(){
       return ExperimentProperty.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return ExperimentProperty.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"key_","value_"};
             return c.newMessageInfo(ExperimentProperty.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02", objArray);
           case 3:
             return new ExperimentProperty();
           case 4:
             return new cl1(p2);
           case 5:
             return ExperimentProperty.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ExperimentProperty.PARSER) == null) {
                _monitor_enter(ExperimentProperty.class);
                if ((pARSER = ExperimentProperty.PARSER) == null) {
                   pARSER = new ii2(ExperimentProperty.DEFAULT_INSTANCE);
                   ExperimentProperty.PARSER = pARSER;
                }
                _monitor_exit(ExperimentProperty.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String f(){
       return this.key_;
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
