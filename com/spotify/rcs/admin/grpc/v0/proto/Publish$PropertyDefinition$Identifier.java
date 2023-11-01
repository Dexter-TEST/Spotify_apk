package com.spotify.rcs.admin.grpc.v0.proto.Publish$PropertyDefinition$Identifier;
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
import p.up1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Publish$PropertyDefinition$Identifier extends c implements u74	// class@000bab from classes.dex
{
    private String name_;
    private String scope_;
    private static final Publish$PropertyDefinition$Identifier DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SCOPE_FIELD_NUMBER;

    static {
       Publish$PropertyDefinition$Identifier propertyDefi = new Publish$PropertyDefinition$Identifier();
       Publish$PropertyDefinition$Identifier.DEFAULT_INSTANCE = propertyDefi;
       c.registerDefaultInstance(Publish$PropertyDefinition$Identifier.class, propertyDefi);
    }
    private void Publish$PropertyDefinition$Identifier(){
       super();
       this.scope_ = "";
       this.name_ = "";
    }
    public static Publish$PropertyDefinition$Identifier e(){
       return Publish$PropertyDefinition$Identifier.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Publish$PropertyDefinition$Identifier.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"scope_","name_"};
             return c.newMessageInfo(Publish$PropertyDefinition$Identifier.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02", objArray);
           case 3:
             return new Publish$PropertyDefinition$Identifier();
           case 4:
             return new fq1(p2);
           case 5:
             return Publish$PropertyDefinition$Identifier.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Publish$PropertyDefinition$Identifier.PARSER) == null) {
                _monitor_enter(Publish$PropertyDefinition$Identifier.class);
                if ((pARSER = Publish$PropertyDefinition$Identifier.PARSER) == null) {
                   pARSER = new ii2(Publish$PropertyDefinition$Identifier.DEFAULT_INSTANCE);
                   Publish$PropertyDefinition$Identifier.PARSER = pARSER;
                }
                _monitor_exit(Publish$PropertyDefinition$Identifier.class);
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
