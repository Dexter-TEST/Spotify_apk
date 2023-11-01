package com.spotify.metadata.proto.Metadata$Restriction;
import p.u74;
import com.google.protobuf.c;
import p.cr0;
import java.lang.Class;
import p.xb3;
import p.bc3;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.sq1;
import p.p84;
import p.r84;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class Metadata$Restriction extends c implements u74	// class@000a72 from classes.dex
{
    private int bitField0_;
    private bc3 catalogueStr_;
    private xb3 catalogue_;
    private int countryRestrictionCase_;
    private Object countryRestriction_;
    private int type_;
    public static final int CATALOGUE_FIELD_NUMBER = 1;
    public static final int CATALOGUE_STR_FIELD_NUMBER = 5;
    public static final int COUNTRIES_ALLOWED_FIELD_NUMBER = 2;
    public static final int COUNTRIES_FORBIDDEN_FIELD_NUMBER = 3;
    private static final Metadata$Restriction DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int TYPE_FIELD_NUMBER;
    private static final yb3 catalogue_converter_;

    static {
       Metadata$Restriction.catalogue_converter_ = new cr0(26);
       Metadata$Restriction restriction = new Metadata$Restriction();
       Metadata$Restriction.DEFAULT_INSTANCE = restriction;
       c.registerDefaultInstance(Metadata$Restriction.class, restriction);
    }
    private void Metadata$Restriction(){
       super();
       this.countryRestrictionCase_ = 0;
       this.catalogue_ = c.emptyIntList();
       this.catalogueStr_ = c.emptyProtobufList();
    }
    public static Metadata$Restriction e(){
       return Metadata$Restriction.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$Restriction.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"countryRestriction_","countryRestrictionCase_","bitField0_","catalogue_",p84.a,"type_",r84.a,"catalogueStr_"};
             return c.newMessageInfo(Metadata$Restriction.DEFAULT_INSTANCE, "\x01\x05\x01\x01\x01\x05\x05\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\x1e\x02\x10\x02\xff\x02\xff\x02\x03\x10\x02\xff\x02\xff\x02\x04\x10\x02\x02\x05\x1a", objArray);
           case 3:
             return new Metadata$Restriction();
           case 4:
             return new sq1(10);
           case 5:
             return Metadata$Restriction.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$Restriction.PARSER) == null) {
                _monitor_enter(Metadata$Restriction.class);
                if ((pARSER = Metadata$Restriction.PARSER) == null) {
                   pARSER = new ii2(Metadata$Restriction.DEFAULT_INSTANCE);
                   Metadata$Restriction.PARSER = pARSER;
                }
                _monitor_exit(Metadata$Restriction.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String f(){
       Metadata$Restriction tcountryRest = (this.countryRestrictionCase_ == 2)? this.countryRestriction_: "";
       return tcountryRest;
    }
    public final boolean g(){
       boolean b = (this.countryRestrictionCase_ == 2)? true: false;
       return b;
    }
    public final boolean h(){
       boolean b = (this.countryRestrictionCase_ == 3)? true: false;
       return b;
    }
}
