package p.pu7;
import p.o2;
import p.dj2;
import android.os.IBinder;
import p.fp0;
import java.lang.Object;
import p.m4;
import java.lang.String;
import android.os.IInterface;
import p.i43;
import p.h43;
import p.ye7;
import android.os.Parcel;
import p.is7;
import android.os.Parcelable;

public final class pu7 extends o2	// class@0022d5 from classes.dex
{
    public final int a;
    public final IBinder b;
    public final fp0 c;
    public final boolean t;
    public final boolean v;
    public static final Parcelable$Creator CREATOR;

    static {
       pu7.CREATOR = new dj2(25);
    }
    public void pu7(int p0,IBinder p1,fp0 p2,boolean p3,boolean p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final boolean equals(Object p0){
       pu7 tb;
       IInterface iInterface1;
       if (p0 == null) {
          return false;
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof pu7) {
          return false;
       }
       if (this.c.equals(p0.c)) {
          IInterface iInterface = null;
          String str = "com.google.android.gms.common.internal.IAccountAccessor";
          if ((tb = this.b) == null) {
             iInterface1 = iInterface;
          }else {
             iInterface1 = tb.queryLocalInterface(str);
             if (iInterface1 instanceof i43) {
             }else {
                iInterface1 = new h43(tb);
             }
          }
          if ((p0 = p0.b) != null) {
             iInterface = p0.queryLocalInterface(str);
             if (iInterface instanceof i43) {
             }else {
                iInterface = new h43(p0);
             }
          }
          if (ye7.x(iInterface1, iInterface)) {
             return true;
          }
       }
       return false;
    }
    public final void writeToParcel(Parcel p0,int p1){
       pu7 tb;
       int i = is7.F(p0, 0x4f45);
       is7.I(p0, 1, 4);
       p0.writeInt(this.a);
       if ((tb = this.b) == null) {
       }else {
          p0.writeStrongBinder(tb);
          is7.J(p0, is7.F(p0, 2));
       }
       is7.B(p0, 3, this.c, p1);
       is7.I(p0, 4, 4);
       p0.writeInt(this.t);
       is7.I(p0, 5, 4);
       p0.writeInt(this.v);
       is7.J(p0, i);
       return;
    }
}
