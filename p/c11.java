package p.c11;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class c11 extends Enum	// class@001175 from classes.dex
{
    public final String a;
    public static final c11 A;
    public static final c11 B;
    public static final c11 C;
    public static final c11 D;
    public static final c11 E;
    public static final c11 F;
    public static final c11 G;
    public static final c11 H;
    public static final c11 I;
    public static final c11[] J;
    public static final c11 b;
    public static final c11 c;
    public static final c11 t;
    public static final c11 v;
    public static final c11 w;
    public static final c11 x;
    public static final c11 y;
    public static final c11 z;

    static {
       c11 uoc11 = new c11("EVENT_TIME", 0, "_logTime");
       c11.b = uoc11;
       c11 uoc111 = new c11("EVENT_NAME", 1, "_eventName");
       c11.c = uoc111;
       c11 uoc112 = new c11("VALUE_TO_SUM", 2, "_valueToSum");
       c11.t = uoc112;
       c11 uoc113 = new c11("CONTENT_IDS", 3, "fb_content_id");
       c11.v = uoc113;
       c11 uoc114 = new c11("CONTENTS", 4, "fb_content");
       c11.w = uoc114;
       c11 uoc115 = new c11("CONTENT_TYPE", 5, "fb_content_type");
       c11.x = uoc115;
       c11 uoc116 = new c11("DESCRIPTION", 6, "fb_description");
       c11.y = uoc116;
       c11 uoc117 = new c11("LEVEL", 7, "fb_level");
       c11.z = uoc117;
       c11 uoc118 = new c11("MAX_RATING_VALUE", 8, "fb_max_rating_value");
       c11.A = uoc118;
       c11 uoc119 = new c11("NUM_ITEMS", 9, "fb_num_items");
       c11.B = uoc119;
       c11 uoc1110 = new c11("PAYMENT_INFO_AVAILABLE", 10, "fb_payment_info_available");
       c11.C = uoc1110;
       c11 uoc1111 = new c11("REGISTRATION_METHOD", 11, "fb_registration_method");
       c11.D = uoc1111;
       c11 uoc1112 = new c11("SEARCH_STRING", 12, "fb_search_string");
       c11.E = uoc1112;
       c11 uoc1113 = uoc1112;
       c11 uoc1114 = new c11("SUCCESS", 13, "fb_success");
       c11.F = uoc1114;
       c11 uoc1115 = uoc1114;
       uoc1112 = new c11("ORDER_ID", 14, "fb_order_id");
       c11.G = uoc1112;
       c11 uoc1116 = uoc1112;
       uoc1114 = new c11("AD_TYPE", 15, "ad_type");
       c11.H = uoc1114;
       c11 uoc1117 = uoc1114;
       uoc1112 = new c11("CURRENCY", 16, "fb_currency");
       c11.I = uoc1112;
       c11[] uoc11Array = new c11[17];
       uoc11Array[0] = uoc11;
       uoc11Array[1] = uoc111;
       uoc11Array[2] = uoc112;
       uoc11Array[3] = uoc113;
       uoc11Array[4] = uoc114;
       uoc11Array[5] = uoc115;
       uoc11Array[6] = uoc116;
       uoc11Array[7] = uoc117;
       uoc11Array[8] = uoc118;
       uoc11Array[9] = uoc119;
       uoc11Array[10] = uoc1110;
       uoc11Array[11] = uoc1111;
       uoc11Array[12] = uoc1113;
       uoc11Array[13] = uoc1115;
       uoc11Array[14] = uoc1116;
       uoc11Array[15] = uoc1117;
       uoc11Array[16] = uoc1112;
       c11.J = uoc11Array;
    }
    public void c11(String p0,int p1,String p2){
       this.a = p2;
    }
    public static c11 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(c11.class, p0);
    }
    public static c11[] values(){
       return Arrays.copyOf(c11.J, 17);
    }
}
