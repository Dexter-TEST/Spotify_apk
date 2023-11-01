package p.pu0;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class pu0 extends Enum	// class@0022cf from classes.dex
{
    public final String a;
    public static final pu0 A;
    public static final pu0 B;
    public static final pu0 C;
    public static final pu0 D;
    public static final pu0 E;
    public static final pu0 F;
    public static final pu0 G;
    public static final pu0 H;
    public static final pu0[] I;
    public static final pu0 b;
    public static final pu0 c;
    public static final pu0 t;
    public static final pu0 v;
    public static final pu0 w;
    public static final pu0 x;
    public static final pu0 y;
    public static final pu0 z;

    static {
       pu0 opu0 = new pu0("ANON_ID", 0, "anon_id");
       pu0.b = opu0;
       pu0 opu01 = new pu0("FB_LOGIN_ID", 1, "fb_login_id");
       pu0.c = opu01;
       pu0 opu02 = new pu0("MAD_ID", 2, "madid");
       pu0.t = opu02;
       pu0 opu03 = new pu0("PAGE_ID", 3, "page_id");
       pu0.v = opu03;
       pu0 opu04 = new pu0("PAGE_SCOPED_USER_ID", 4, "page_scoped_user_id");
       pu0.w = opu04;
       pu0 opu05 = new pu0("ADV_TE", 6, "advertiser_tracking_enabled");
       pu0.x = opu05;
       pu0 opu06 = new pu0("APP_TE", 7, "application_tracking_enabled");
       pu0.y = opu06;
       pu0 opu07 = new pu0("CONSIDER_VIEWS", 8, "consider_views");
       pu0.z = opu07;
       pu0 opu08 = new pu0("DEVICE_TOKEN", 9, "device_token");
       pu0.A = opu08;
       pu0 opu09 = new pu0("EXT_INFO", 10, "extInfo");
       pu0.B = opu09;
       pu0 opu010 = new pu0("INCLUDE_DWELL_DATA", 11, "include_dwell_data");
       pu0.C = opu010;
       pu0 opu011 = new pu0("INCLUDE_VIDEO_DATA", 12, "include_video_data");
       pu0.D = opu011;
       pu0 opu012 = opu011;
       pu0 opu013 = new pu0("INSTALL_REFERRER", 13, "install_referrer");
       pu0.E = opu013;
       pu0 opu014 = opu013;
       opu011 = new pu0("INSTALLER_PACKAGE", 14, "installer_package");
       pu0.F = opu011;
       pu0 opu015 = opu011;
       opu013 = new pu0("RECEIPT_DATA", 15, "receipt_data");
       pu0.G = opu013;
       pu0 opu016 = opu013;
       opu011 = new pu0("URL_SCHEMES", 16, "url_schemes");
       pu0.H = opu011;
       pu0[] opu0Array = new pu0[17];
       opu0Array[0] = opu0;
       opu0Array[1] = opu01;
       opu0Array[2] = opu02;
       opu0Array[3] = opu03;
       opu0Array[4] = opu04;
       opu0Array[5] = new pu0("USER_DATA", 5, "ud");
       opu0Array[6] = opu05;
       opu0Array[7] = opu06;
       opu0Array[8] = opu07;
       opu0Array[9] = opu08;
       opu0Array[10] = opu09;
       opu0Array[11] = opu010;
       opu0Array[12] = opu012;
       opu0Array[13] = opu014;
       opu0Array[14] = opu015;
       opu0Array[15] = opu016;
       opu0Array[16] = opu011;
       pu0.I = opu0Array;
    }
    public void pu0(String p0,int p1,String p2){
       this.a = p2;
    }
    public static pu0 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(pu0.class, p0);
    }
    public static pu0[] values(){
       return Arrays.copyOf(pu0.I, 17);
    }
}
