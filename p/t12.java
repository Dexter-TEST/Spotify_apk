package p.t12;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class t12 extends Enum	// class@0026dc from classes.dex
{
    public final int a;
    public static final t12 A;
    public static final t12 B;
    public static final t12 C;
    public static final t12 D;
    public static final t12 E;
    public static final t12 F;
    public static final t12 G;
    public static final t12 H;
    public static final t12 I;
    public static final t12 J;
    public static final t12 K;
    public static final t12 L;
    public static final t12 M;
    public static final t12 N;
    public static final t12 O;
    public static final t12 P;
    public static final t12 Q;
    public static final t12 R;
    public static final t12 S;
    public static final t12[] T;
    public static final t12 b;
    public static final t12 c;
    public static final t12 t;
    public static final t12 v;
    public static final t12 w;
    public static final t12 x;
    public static final t12 y;
    public static final t12 z;

    static {
       t12 ot12 = new t12("Unknown", 0, -1);
       t12.b = ot12;
       t12 ot121 = new t12("Core", 1, 0);
       t12.c = ot121;
       t12 ot122 = new t12("AppEvents", 2, 0x10000);
       t12.t = ot122;
       t12 ot123 = new t12("CodelessEvents", 3, 0x10100);
       t12.v = ot123;
       t12 ot124 = new t12("CloudBridge", 4, 0x10800);
       t12.w = ot124;
       t12 ot125 = new t12("RestrictiveDataFiltering", 5, 0x10200);
       t12.x = ot125;
       t12 ot126 = new t12("AAM", 6, 0x10300);
       t12.y = ot126;
       t12 ot127 = new t12("PrivacyProtection", 7, 0x10400);
       t12.z = ot127;
       t12 ot128 = new t12("SuggestedEvents", 8, 0x10401);
       t12.A = ot128;
       t12 ot129 = new t12("IntelligentIntegrity", 9, 0x10402);
       t12.B = ot129;
       t12 ot1210 = new t12("ModelRequest", 10, 0x10403);
       t12.C = ot1210;
       t12 ot1211 = new t12("EventDeactivation", 11, 0x10500);
       t12.D = ot1211;
       t12 ot1212 = new t12("OnDeviceEventProcessing", 12, 0x10600);
       t12.E = ot1212;
       t12 ot1213 = ot1212;
       t12 ot1214 = new t12("OnDevicePostInstallEventProcessing", 13, 0x10601);
       t12.F = ot1214;
       t12 ot1215 = ot1214;
       ot1212 = new t12("IapLogging", 14, 0x10700);
       t12.G = ot1212;
       t12 ot1216 = ot1212;
       ot1214 = new t12("IapLoggingLib2", 15, 0x10701);
       t12.H = ot1214;
       t12 ot1217 = ot1214;
       ot1212 = new t12("Instrument", 16, 0x20000);
       t12.I = ot1212;
       t12 ot1218 = ot1212;
       ot1214 = new t12("CrashReport", 17, 0x20100);
       t12.J = ot1214;
       t12 ot1219 = ot1214;
       ot1212 = new t12("CrashShield", 18, 0x20101);
       t12.K = ot1212;
       t12 ot1220 = ot1212;
       ot1214 = new t12("ThreadCheck", 19, 0x20102);
       t12.L = ot1214;
       t12 ot1221 = ot1214;
       ot1212 = new t12("ErrorReport", 20, 0x20200);
       t12.M = ot1212;
       t12 ot1222 = ot1212;
       ot1214 = new t12("AnrReport", 21, 0x20300);
       t12.N = ot1214;
       t12 ot1223 = ot1214;
       ot1212 = new t12("Monitoring", 22, 0x30000);
       t12.O = ot1212;
       t12 ot1224 = ot1212;
       ot1214 = new t12("ServiceUpdateCompliance", 23, 0x30100);
       t12.P = ot1214;
       t12 ot1225 = ot1214;
       ot1214 = new t12("ChromeCustomTabsPrefetching", 25, 0x1010000);
       t12.Q = ot1214;
       t12 ot1226 = ot1214;
       ot1212 = new t12("IgnoreAppSwitchToLoggedOut", 26, 0x1020000);
       t12.R = ot1212;
       t12 ot1227 = ot1212;
       ot1214 = new t12("BypassAppSwitch", 27, 0x1030000);
       t12.S = ot1214;
       t12 ot1228 = ot1214;
       t12[] ot12Array = new t12[29];
       ot12Array[0] = ot12;
       ot12Array[1] = ot121;
       ot12Array[2] = ot122;
       ot12Array[3] = ot123;
       ot12Array[4] = ot124;
       ot12Array[5] = ot125;
       ot12Array[6] = ot126;
       ot12Array[7] = ot127;
       ot12Array[8] = ot128;
       ot12Array[9] = ot129;
       ot12Array[10] = ot1210;
       ot12Array[11] = ot1211;
       ot12Array[12] = ot1213;
       ot12Array[13] = ot1215;
       ot12Array[14] = ot1216;
       ot12Array[15] = ot1217;
       ot12Array[16] = ot1218;
       ot12Array[17] = ot1219;
       ot12Array[18] = ot1220;
       ot12Array[19] = ot1221;
       ot12Array[20] = ot1222;
       ot12Array[21] = ot1223;
       ot12Array[22] = ot1224;
       ot12Array[23] = ot1225;
       ot12Array[24] = new t12("Login", 24, 0x1000000);
       ot12Array[25] = ot1226;
       ot12Array[26] = ot1227;
       ot12Array[27] = ot1228;
       ot12Array[28] = new t12("Share", 28, 0x2000000);
       t12.T = ot12Array;
    }
    public void t12(String p0,int p1,int p2){
       this.a = p2;
    }
    public static t12 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(t12.class, p0);
    }
    public static t12[] values(){
       return Arrays.copyOf(t12.T, 29);
    }
    public final String toString(){
       String str;
       switch (this.ordinal()){
           case 1:
             str = "CoreKit";
             break;
           case 2:
             str = "AppEvents";
             break;
           case 3:
             str = "CodelessEvents";
             break;
           case 4:
             str = "AppEventsCloudbridge";
             break;
           case 5:
             str = "RestrictiveDataFiltering";
             break;
           case 6:
             str = "AAM";
             break;
           case 7:
             str = "PrivacyProtection";
             break;
           case 8:
             str = "SuggestedEvents";
             break;
           case 9:
             str = "IntelligentIntegrity";
             break;
           case 10:
             str = "ModelRequest";
             break;
           case 11:
             str = "EventDeactivation";
             break;
           case 12:
             str = "OnDeviceEventProcessing";
             break;
           case 13:
             str = "OnDevicePostInstallEventProcessing";
             break;
           case 14:
             str = "IAPLogging";
             break;
           case 15:
             str = "IAPLoggingLib2";
             break;
           case 16:
             str = "Instrument";
             break;
           case 17:
             str = "CrashReport";
             break;
           case 18:
             str = "CrashShield";
             break;
           case 19:
             str = "ThreadCheck";
             break;
           case 20:
             str = "ErrorReport";
             break;
           case 21:
             str = "AnrReport";
             break;
           case 22:
             str = "Monitoring";
             break;
           case 23:
             str = "ServiceUpdateCompliance";
             break;
           case 24:
             str = "LoginKit";
             break;
           case 25:
             str = "ChromeCustomTabsPrefetching";
             break;
           case 26:
             str = "IgnoreAppSwitchToLoggedOut";
             break;
           case 27:
             str = "BypassAppSwitch";
             break;
           case 28:
             str = "ShareKit";
             break;
           default:
             str = "unknown";
       }
       return str;
    }
}
