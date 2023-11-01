package p.bn7;
import p.sm7;
import p.dj2;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.j3;
import p.ht3;
import p.et3;
import android.os.Bundle;
import p.an7;
import p.mj7;
import p.mu3;
import androidx.fragment.app.k;
import android.content.Context;
import p.ej4;
import p.zm7;
import p.km7;
import p.rm7;
import p.ly1;
import androidx.fragment.app.Fragment;
import p.ae2;
import androidx.fragment.app.o;
import androidx.fragment.app.f;
import java.lang.NullPointerException;

public final class bn7 extends sm7	// class@0010fe from classes.dex
{
    public rm7 t;
    public String v;
    public final String w;
    public final j3 x;
    public static final Parcelable$Creator CREATOR;

    static {
       bn7.CREATOR = new dj2(6);
    }
    public void bn7(Parcel p0){
       co5.o(p0, "source");
       super(p0);
       this.w = "web_view";
       this.x = j3.t;
       this.v = p0.readString();
    }
    public void bn7(ht3 p0){
       super(p0);
       this.w = "web_view";
       this.x = j3.t;
    }
    public final int C(et3 p0){
       k ok;
       bn7 tv;
       Bundle uBundle = this.D(p0);
       an7 uoan7 = new an7(this, p0);
       String str = mj7.g();
       this.v = str;
       this.a(str, "e2e");
       if ((ok = this.d().e()) == null) {
          return 0;
       }
       boolean b = ej4.W(ok);
       zm7 ozm7 = new zm7(this, ok, p0.t, uBundle);
       if ((tv = this.v) == null) {
          throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
       }
       ozm7.j = tv;
       String str1 = (b)? "fbconnect://chrome_os_success": "fbconnect://success";
       ozm7.e = str1;
       et3 y = p0.y;
       co5.o(y, "authType");
       ozm7.k = y;
       y = p0.a;
       co5.o(y, "loginBehavior");
       ozm7.f = y;
       y = p0.C;
       co5.o(y, "targetApp");
       ozm7.g = y;
       ozm7.h = p0.D;
       ozm7.i = p0.E;
       ozm7.c = uoan7;
       this.t = ozm7.a();
       ly1 oly1 = new ly1();
       oly1.setRetainInstance(true);
       oly1.H = this.t;
       oly1.B(ok.y(), "FacebookDialogFragment");
       return true;
    }
    public final j3 L(){
       return this.x;
    }
    public final void b(){
       bn7 tt;
       if ((tt = this.t) != null) {
          if (tt != null) {
             tt.cancel();
          }
          this.t = null;
       }
       return;
    }
    public final int describeContents(){
       return 0;
    }
    public final String e(){
       return this.w;
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "dest");
       super.writeToParcel(p0, p1);
       p0.writeString(this.v);
    }
}
