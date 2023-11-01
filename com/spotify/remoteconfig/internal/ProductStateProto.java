package com.spotify.remoteconfig.internal.ProductStateProto;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import p.jl5;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.kl5;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class ProductStateProto extends c implements u74	// class@000bfc from classes.dex
{
    private g14 values_;
    private static final ProductStateProto DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VALUES_FIELD_NUMBER;

    static {
       ProductStateProto productState = new ProductStateProto();
       ProductStateProto.DEFAULT_INSTANCE = productState;
       c.registerDefaultInstance(ProductStateProto.class, productState);
    }
    private void ProductStateProto(){
       super();
       this.values_ = g14.b;
    }
    public static ProductStateProto e(){
       return ProductStateProto.DEFAULT_INSTANCE;
    }
    public static g14 f(ProductStateProto p0){
       ProductStateProto values_ = p0.values_;
       if (values_.a == null) {
          p0.values_ = values_.d();
       }
       return p0.values_;
    }
    public static jl5 g(){
       return ProductStateProto.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return ProductStateProto.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"values_",kl5.a};
             return c.newMessageInfo(ProductStateProto.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\x012", objArray);
           case 3:
             return new ProductStateProto();
           case 4:
             return new jl5();
           case 5:
             return ProductStateProto.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ProductStateProto.PARSER) == null) {
                _monitor_enter(ProductStateProto.class);
                if ((pARSER = ProductStateProto.PARSER) == null) {
                   pARSER = new ii2(ProductStateProto.DEFAULT_INSTANCE);
                   ProductStateProto.PARSER = pARSER;
                }
                _monitor_exit(ProductStateProto.class);
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
