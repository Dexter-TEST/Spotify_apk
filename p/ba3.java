package p.ba3;
import p.xe4;
import p.dj2;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.j3;
import p.ht3;
import p.et3;
import p.mj7;
import p.df4;
import p.mu3;
import androidx.fragment.app.k;
import android.content.Context;
import p.sz1;
import p.o61;
import p.bf4;
import p.bv3;
import p.cf4;
import java.util.Set;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import p.uz1;
import android.content.pm.ActivityInfo;
import p.eo5;

public final class ba3 extends xe4	// class@001086 from classes.dex
{
    public final String t;
    public final j3 v;
    public static final Parcelable$Creator CREATOR;

    static {
       ba3.CREATOR = new dj2(1);
    }
    public void ba3(Parcel p0){
       co5.o(p0, "source");
       super(p0);
       this.t = "instagram_login";
       this.v = j3.x;
    }
    public void ba3(ht3 p0){
       super(p0);
       this.t = "instagram_login";
       this.v = j3.x;
    }
    public final int C(et3 p0){
       k ok;
       et3 c;
       ResolveInfo resolveInfo;
       mu3 omu3 = this;
       et3 uoet3 = p0;
       String str = mj7.g();
       if ((ok = this.d().e()) == null) {
          ok = sz1.a();
       }
       k ok1 = ok;
       et3 b = uoet3.b;
       boolean b1 = p0.a();
       if ((c = uoet3.c) == null) {
          c = o61.b;
       }
       c = uoet3.t;
       co5.o(c, "applicationId");
       co5.o(b, "permissions");
       et3 y = uoet3.y;
       co5.o(y, "authType");
       k ok2 = ok1;
       String str1 = str;
       Intent intent = df4.b(new bf4(1), c, b, str, b1, c, omu3.c(uoet3.v), y, false, uoet3.A, uoet3.B, bv3.c, uoet3.D, uoet3.E, "");
       Intent intent1 = null;
       if (intent != null && (resolveInfo = ok2.getPackageManager().resolveActivity(intent, 0)) != null) {
          ActivityInfo packageName = resolveInfo.activityInfo.packageName;
          co5.l(packageName, "resolveInfo.activityInfo.packageName");
          if (!uz1.a(ok2, packageName)) {
             intent = intent1;
          }
          intent1 = intent;
       }
       omu3.a(str1, "e2e");
       eo5.Q();
       return omu3.O(intent1);
    }
    public final j3 L(){
       return this.v;
    }
    public final int describeContents(){
       return 0;
    }
    public final String e(){
       return this.t;
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "dest");
       super.writeToParcel(p0, p1);
    }
}
