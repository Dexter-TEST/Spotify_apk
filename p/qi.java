package p.qi;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class qi extends Enum	// class@0023ae from classes.dex
{
    public final String a;
    public static final qi A;
    public static final qi B;
    public static final qi C;
    public static final qi D;
    public static final qi E;
    public static final qi F;
    public static final qi G;
    public static final qi H;
    public static final qi I;
    public static final qi[] J;
    public static final qi b;
    public static final qi c;
    public static final qi t;
    public static final qi v;
    public static final qi w;
    public static final qi x;
    public static final qi y;
    public static final qi z;

    static {
       qi oqi = new qi("ANON_ID", 0, "anon_id");
       qi.b = oqi;
       qi oqi1 = new qi("APP_USER_ID", 1, "app_user_id");
       qi.c = oqi1;
       qi oqi2 = new qi("ADVERTISER_ID", 2, "advertiser_id");
       qi.t = oqi2;
       qi oqi3 = new qi("PAGE_ID", 3, "page_id");
       qi.v = oqi3;
       qi oqi4 = new qi("PAGE_SCOPED_USER_ID", 4, "page_scoped_user_id");
       qi.w = oqi4;
       qi oqi5 = new qi("USER_DATA", 5, "ud");
       qi.x = oqi5;
       qi oqi6 = new qi("ADV_TE", 6, "advertiser_tracking_enabled");
       qi.y = oqi6;
       qi oqi7 = new qi("APP_TE", 7, "application_tracking_enabled");
       qi.z = oqi7;
       qi oqi8 = new qi("CONSIDER_VIEWS", 8, "consider_views");
       qi.A = oqi8;
       qi oqi9 = new qi("DEVICE_TOKEN", 9, "device_token");
       qi.B = oqi9;
       qi oqi10 = new qi("EXT_INFO", 10, "extInfo");
       qi.C = oqi10;
       qi oqi11 = new qi("INCLUDE_DWELL_DATA", 11, "include_dwell_data");
       qi.D = oqi11;
       qi oqi12 = new qi("INCLUDE_VIDEO_DATA", 12, "include_video_data");
       qi.E = oqi12;
       qi oqi13 = oqi12;
       qi oqi14 = new qi("INSTALL_REFERRER", 13, "install_referrer");
       qi.F = oqi14;
       qi oqi15 = oqi14;
       oqi12 = new qi("INSTALLER_PACKAGE", 14, "installer_package");
       qi.G = oqi12;
       qi oqi16 = oqi12;
       oqi14 = new qi("RECEIPT_DATA", 15, "receipt_data");
       qi.H = oqi14;
       qi oqi17 = oqi14;
       oqi12 = new qi("URL_SCHEMES", 16, "url_schemes");
       qi.I = oqi12;
       qi[] oqiArray = new qi[17];
       oqiArray[0] = oqi;
       oqiArray[1] = oqi1;
       oqiArray[2] = oqi2;
       oqiArray[3] = oqi3;
       oqiArray[4] = oqi4;
       oqiArray[5] = oqi5;
       oqiArray[6] = oqi6;
       oqiArray[7] = oqi7;
       oqiArray[8] = oqi8;
       oqiArray[9] = oqi9;
       oqiArray[10] = oqi10;
       oqiArray[11] = oqi11;
       oqiArray[12] = oqi13;
       oqiArray[13] = oqi15;
       oqiArray[14] = oqi16;
       oqiArray[15] = oqi17;
       oqiArray[16] = oqi12;
       qi.J = oqiArray;
    }
    public void qi(String p0,int p1,String p2){
       this.a = p2;
    }
    public static qi valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(qi.class, p0);
    }
    public static qi[] values(){
       return Arrays.copyOf(qi.J, 17);
    }
}
