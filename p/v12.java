package p.v12;
import java.util.HashMap;
import java.lang.Object;
import p.s12;
import p.t12;
import p.u12;
import p.e22;
import java.lang.Enum;
import java.lang.String;
import p.co5;
import p.sz1;
import android.content.Context;
import android.content.SharedPreferences;
import p.mj7;

public final class v12	// class@00295f from classes.dex
{
    public static final v12 a;
    public static final HashMap b;

    static {
       v12.a = new v12();
       v12.b = new HashMap();
    }
    public void v12(){
       super();
    }
    public static final void a(s12 p0,t12 p1){
       e22.c(new u12(p0, p1));
    }
    public static boolean b(t12 p0){
       boolean b;
       switch (p0.ordinal()){
           case 4:
           case 6:
           case 7:
           case 8:
           case 9:
           case 10:
           case 11:
           case 12:
           case 13:
           case 14:
           case 15:
           case 16:
           case 17:
           case 18:
           case 19:
           case 20:
           case 21:
           case 22:
           case 25:
           case 26:
           case 27:
           case 5:
             b = false;
             break;
           default:
             b = true;
       }
       return e22.b(co5.K(p0, "FBSDKFeature"), sz1.b(), b);
    }
    public static final boolean c(t12 p0){
       String str;
       co5.o(p0, "feature");
       boolean b = false;
       if (t12.b == p0) {
          return b;
       }
       if (t12.c == p0) {
          return true;
       }
       if ((str = sz1.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", b).getString(co5.K(p0, "FBSDKFeature"), null)) != null && co5.c(str, "15.0.1")) {
          return b;
       }
       t12 a = p0.a;
       if (((a & 0x00ff)) > 0) {
          a = mj7.c((a & 0xff00));
       }else if(((0xff00 & a)) > 0){
          a = mj7.c((a & 0xffff0000));
       }else if(((0xff0000 & a)) > 0){
          a = mj7.c((a & 0xff000000));
       }else {
          a = mj7.c(b);
       }
       if (a == p0) {
          b = v12.b(p0);
       }else if(v12.c(a) && v12.b(p0)){
          b = true;
       }
       return b;
    }
}
