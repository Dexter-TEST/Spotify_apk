package p.ih3;
import p.xe4;
import p.dj2;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ht3;
import p.et3;
import p.sz1;
import p.xe7;
import p.ct3;
import p.mj7;
import p.df4;
import p.mu3;
import androidx.fragment.app.k;
import p.o61;
import java.lang.Enum;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import p.cf4;
import p.bv3;
import java.util.Set;
import android.content.Intent;
import p.eo5;

public final class ih3 extends xe4	// class@001993 from classes.dex
{
    public final String t;
    public static final Parcelable$Creator CREATOR;

    static {
       ih3.CREATOR = new dj2(2);
    }
    public void ih3(Parcel p0){
       co5.o(p0, "source");
       super(p0);
       this.t = "katana_proxy_auth";
    }
    public void ih3(ht3 p0){
       super(p0);
       this.t = "katana_proxy_auth";
    }
    public final int C(et3 p0){
       et3 c;
       Intent intent;
       mu3 omu3 = this;
       et3 uoet3 = p0;
       int i = (sz1.l && (xe7.w() != null && uoet3.a.v != null))? 1: 0;
       String str = mj7.g();
       this.d().e();
       et3 b = uoet3.b;
       boolean b1 = p0.a();
       if ((c = uoet3.c) == null) {
          c = o61.b;
       }
       et3 uoet31 = c;
       String str1 = omu3.c(uoet3.v);
       et3 a = uoet3.A;
       et3 b2 = uoet3.B;
       et3 d = uoet3.D;
       et3 e = uoet3.E;
       et3 f = uoet3.F;
       if ((c = uoet3.I) != null) {
          c.name();
       }
       et3 t = uoet3.t;
       co5.o(t, "applicationId");
       co5.o(b, "permissions");
       uoet3 = uoet3.y;
       co5.o(uoet3, "authType");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = df4.a.iterator();
       while (iterator.hasNext()) {
          ArrayList uArrayList1 = uArrayList;
          et3 uoet32 = t;
          et3 uoet33 = f;
          et3 uoet34 = e;
          et3 uoet35 = d;
          et3 uoet36 = b2;
          et3 uoet37 = a;
          et3 uoet38 = b;
          String str2 = str;
          if ((intent = df4.b(iterator.next(), t, b, str, b1, uoet31, str1, uoet3, i, uoet37, uoet36, bv3.b, uoet35, uoet34, uoet33)) != null) {
             uArrayList1.add(intent);
          }
          str = str2;
          uArrayList = uArrayList1;
          t = uoet32;
          f = uoet33;
          e = uoet34;
          d = uoet35;
          b2 = uoet36;
          a = uoet37;
          b = uoet38;
       }
       omu3.a(str, "e2e");
       Iterator iterator1 = uArrayList.iterator();
       i = 0;
       while (true) {
          if (!iterator1.hasNext()) {
             return 0;
          }
          i = i + 1;
          eo5.Q();
          if (omu3.O(iterator1.next())) {
             break ;
          }
       }
       return i;
    }
    public final int describeContents(){
       return 0;
    }
    public final String e(){
       return this.t;
    }
}
