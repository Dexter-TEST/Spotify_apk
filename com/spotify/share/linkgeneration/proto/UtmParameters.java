package com.spotify.share.linkgeneration.proto.UtmParameters;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.q04;
import p.yz3;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class UtmParameters extends c implements u74	// class@000c21 from classes.dex
{
    private String utmCampaign_;
    private String utmContent_;
    private String utmMedium_;
    private String utmSource_;
    private String utmTerm_;
    private static final UtmParameters DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int UTM_CAMPAIGN_FIELD_NUMBER;
    public static final int UTM_CONTENT_FIELD_NUMBER;
    public static final int UTM_MEDIUM_FIELD_NUMBER;
    public static final int UTM_SOURCE_FIELD_NUMBER;
    public static final int UTM_TERM_FIELD_NUMBER;

    static {
       UtmParameters utmParameter = new UtmParameters();
       UtmParameters.DEFAULT_INSTANCE = utmParameter;
       c.registerDefaultInstance(UtmParameters.class, utmParameter);
    }
    private void UtmParameters(){
       super();
       this.utmCampaign_ = "";
       this.utmSource_ = "";
       this.utmMedium_ = "";
       this.utmTerm_ = "";
       this.utmContent_ = "";
    }
    public static UtmParameters e(){
       return UtmParameters.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return UtmParameters.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"utmCampaign_","utmSource_","utmMedium_","utmTerm_","utmContent_"};
             return c.newMessageInfo(UtmParameters.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x02\x02\x05\x02\x02", objArray);
           case 3:
             return new UtmParameters();
           case 4:
             return new q04(p2);
           case 5:
             return UtmParameters.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = UtmParameters.PARSER) == null) {
                _monitor_enter(UtmParameters.class);
                if ((pARSER = UtmParameters.PARSER) == null) {
                   pARSER = new ii2(UtmParameters.DEFAULT_INSTANCE);
                   UtmParameters.PARSER = pARSER;
                }
                _monitor_exit(UtmParameters.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final String f(){
       return this.utmCampaign_;
    }
    public final String g(){
       return this.utmContent_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final String h(){
       return this.utmMedium_;
    }
    public final String i(){
       return this.utmSource_;
    }
    public final String j(){
       return this.utmTerm_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
