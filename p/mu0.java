package p.mu0;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class mu0 extends Enum	// class@001f05 from classes.dex
{
    public final String a;
    public static final mu0 A;
    public static final mu0 B;
    public static final mu0 C;
    public static final mu0 D;
    public static final mu0 E;
    public static final mu0 F;
    public static final mu0 G;
    public static final mu0 H;
    public static final mu0 I;
    public static final mu0[] J;
    public static final mu0 b;
    public static final mu0 c;
    public static final mu0 t;
    public static final mu0 v;
    public static final mu0 w;
    public static final mu0 x;
    public static final mu0 y;
    public static final mu0 z;

    static {
       mu0 omu0 = new mu0("VALUE_TO_SUM", 0, "value");
       mu0.b = omu0;
       mu0 omu01 = new mu0("EVENT_TIME", 1, "event_time");
       mu0.c = omu01;
       mu0 omu02 = new mu0("EVENT_NAME", 2, "event_name");
       mu0.t = omu02;
       mu0 omu03 = new mu0("CONTENT_IDS", 3, "content_ids");
       mu0.v = omu03;
       mu0 omu04 = new mu0("CONTENTS", 4, "contents");
       mu0.w = omu04;
       mu0 omu05 = new mu0("CONTENT_TYPE", 5, "content_type");
       mu0.x = omu05;
       mu0 omu06 = new mu0("DESCRIPTION", 6, "description");
       mu0.y = omu06;
       mu0 omu07 = new mu0("LEVEL", 7, "level");
       mu0.z = omu07;
       mu0 omu08 = new mu0("MAX_RATING_VALUE", 8, "max_rating_value");
       mu0.A = omu08;
       mu0 omu09 = new mu0("NUM_ITEMS", 9, "num_items");
       mu0.B = omu09;
       mu0 omu010 = new mu0("PAYMENT_INFO_AVAILABLE", 10, "payment_info_available");
       mu0.C = omu010;
       mu0 omu011 = new mu0("REGISTRATION_METHOD", 11, "registration_method");
       mu0.D = omu011;
       mu0 omu012 = new mu0("SEARCH_STRING", 12, "search_string");
       mu0.E = omu012;
       mu0 omu013 = omu012;
       mu0 omu014 = new mu0("SUCCESS", 13, "success");
       mu0.F = omu014;
       mu0 omu015 = omu014;
       mu0 omu016 = new mu0("ORDER_ID", 14, "order_id");
       mu0.G = omu016;
       mu0 omu017 = omu016;
       omu012 = new mu0("AD_TYPE", 15, "ad_type");
       mu0.H = omu012;
       mu0 omu018 = omu012;
       omu014 = new mu0("CURRENCY", 16, "currency");
       mu0.I = omu014;
       mu0[] omu0Array = new mu0[17];
       omu0Array[0] = omu0;
       omu0Array[1] = omu01;
       omu0Array[2] = omu02;
       omu0Array[3] = omu03;
       omu0Array[4] = omu04;
       omu0Array[5] = omu05;
       omu0Array[6] = omu06;
       omu0Array[7] = omu07;
       omu0Array[8] = omu08;
       omu0Array[9] = omu09;
       omu0Array[10] = omu010;
       omu0Array[11] = omu011;
       omu0Array[12] = omu013;
       omu0Array[13] = omu015;
       omu0Array[14] = omu017;
       omu0Array[15] = omu018;
       omu0Array[16] = omu014;
       mu0.J = omu0Array;
    }
    public void mu0(String p0,int p1,String p2){
       this.a = p2;
    }
    public static mu0 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(mu0.class, p0);
    }
    public static mu0[] values(){
       return Arrays.copyOf(mu0.J, 17);
    }
}
