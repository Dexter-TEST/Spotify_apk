package p.sh7;
import android.view.View;
import java.lang.String;
import p.rr0;
import p.wr0;
import android.view.ContentInfo;
import p.vr0;
import java.lang.Object;
import java.util.Objects;
import p.u44;
import p.k25;
import p.th7;

public abstract class sh7	// class@00262f from classes.dex
{

    public static String[] a(View p0){
       return rr0.n(p0);
    }
    public static wr0 b(View p0,wr0 p1){
       ContentInfo uContentInfo1;
       ContentInfo uContentInfo = p1.a.k();
       Objects.requireNonNull(uContentInfo);
       if ((uContentInfo1 = rr0.f(p0, uContentInfo)) == null) {
          return null;
       }
       if (uContentInfo1 == uContentInfo) {
          return p1;
       }
       return new wr0(new u44(uContentInfo1));
    }
    public static void c(View p0,String[] p1,k25 p2){
       if (p2 == null) {
          rr0.l(p0, p1);
       }else {
          rr0.m(p0, p1, new th7(p2));
       }
       return;
    }
}
