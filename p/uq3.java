package p.uq3;
import p.qq3;
import p.ek3;
import p.dj7;
import p.qo5;
import p.tq3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ce2;
import java.lang.Class;
import p.vi7;
import java.io.PrintWriter;
import p.jo6;
import java.lang.StringBuilder;
import p.rq3;
import p.mn;
import p.sq3;
import androidx.lifecycle.b;
import p.w51;
import java.lang.System;
import java.lang.Integer;

public final class uq3 extends qq3	// class@0028fe from classes.dex
{
    public final ek3 a;
    public final tq3 b;

    public void uq3(ek3 p0,dj7 p1){
       super();
       this.a = p0;
       co5.o(p1, "store");
       this.b = new qo5(p1, tq3.w).g(tq3.class);
    }
    public final void b(String p0,PrintWriter p1){
       StringBuilder p1;
       uq3 tb = this.b;
       if (tb.t.g() > 0) {
          p1.print(p0);
          p1.println("Loaders:");
          String str = p0+"    ";
          for (int i = 0; i < tb.t.g(); i = i + 1) {
             rq3 orq3 = tb.t.h(i);
             p1.print(p0);
             p1.print("  #");
             tq3 t = tb.t;
             if (t.a != null) {
                t.d();
             }
             p1.print(t.b[i]);
             p1.print(": ");
             p1.println(orq3.toString());
             p1.print(str);
             p1.print("mId=");
             p1.print(orq3.l);
             p1.print(" mArgs=");
             p1.println(orq3.m);
             p1.print(str);
             p1.print("mLoader=");
             p1.println(orq3.n);
             rq3 n = orq3.n;
             String str1 = "".append(str).append("  ").toString();
             n.getClass();
             p1.print(str1);
             p1.print("mId=");
             p1.print(n.a);
             p1.print(" mListener=");
             p1.println(n.b);
             if (n.c != null || n.f != null) {
                p1.print(str1);
                p1.print("mStarted=");
                p1.print(n.c);
                p1.print(" mContentChanged=");
                p1.print(n.f);
                p1.print(" mProcessingChange=");
                p1.println(false);
             }
             if (n.d != null || n.e != null) {
                p1.print(str1);
                p1.print("mAbandoned=");
                p1.print(n.d);
                p1.print(" mReset=");
                p1.println(n.e);
             }
             if (n.h != null) {
                p1.print(str1);
                p1.print("mTask=");
                p1.print(n.h);
                p1.print(" waiting=");
                n.h.getClass();
                p1.println(false);
             }
             if (n.i != null) {
                p1.print(str1);
                p1.print("mCancellingTask=");
                p1.print(n.i);
                p1.print(" waiting=");
                n.i.getClass();
                p1.println(false);
             }
             if (orq3.p != null) {
                p1.print(str);
                p1.print("mCallbacks=");
                p1.println(orq3.p);
                rq3 p = orq3.p;
                p.getClass();
                p1.print("".append(str).append("  ").toString());
                p1.print("mDeliveredData=");
                p1.println(p.b);
             }
             p1.print(str);
             p1.print("mData=");
             orq3.n.getClass();
             p1 = new StringBuilder(64);
             w51.a(orq3.e(), p1);
             p1.println(p1.append("}").toString());
             p1.print(str);
             p1.print("mStarted=");
             boolean b = (orq3.c > null)? true: false;
             p1.println(b);
          }
       }
       return;
    }
    public final String toString(){
       StringBuilder str = new StringBuilder(128)+"LoaderManager{"+Integer.toHexString(System.identityHashCode(this))+" in ";
       w51.a(this.a, str);
       return str+"}}";
    }
}
