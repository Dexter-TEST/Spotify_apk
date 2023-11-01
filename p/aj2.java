package p.aj2;
import p.o2;
import p.dj2;
import java.lang.String;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import android.os.Bundle;
import android.accounts.Account;
import p.q12;
import java.lang.Object;
import p.m4;
import android.os.IInterface;
import p.i43;
import p.h43;
import android.os.Binder;
import p.il2;
import android.os.Parcel;
import p.is7;
import android.os.Parcelable;

public final class aj2 extends o2	// class@000f92 from classes.dex
{
    public q12[] A;
    public final boolean B;
    public final int C;
    public boolean D;
    public final String E;
    public final int a;
    public final int b;
    public final int c;
    public String t;
    public IBinder v;
    public Scope[] w;
    public Bundle x;
    public Account y;
    public q12[] z;
    public static final Parcelable$Creator CREATOR;

    static {
       aj2.CREATOR = new dj2(28);
    }
    public void aj2(int p0,int p1,int p2,String p3,IBinder p4,Scope[] p5,Bundle p6,Account p7,q12[] p8,q12[] p9,boolean p10,int p11,boolean p12,String p13){
       Account uAccount;
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       String str = "com.google.android.gms";
       this.t = (str.equals(p3))? str: p3;
       if (p0 < 2) {
          if (p4 != null) {
             IInterface iInterface = p4.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
             if (iInterface instanceof i43) {
             }else {
                iInterface = new h43(p4);
             }
             if (iInterface != null) {
                h43 oh43 = Binder.clearCallingIdentity();
                try{
                   uAccount = iInterface.g();
                   Binder.restoreCallingIdentity(oh43);
                label_0048 :
                   this.y = uAccount;
                }catch(android.os.RemoteException e0){
                   Binder.restoreCallingIdentity(oh43);
                }
             }
          }
          uAccount = null;
          goto label_0048 ;
       }else {
          this.v = p4;
          this.y = p7;
       }
       this.w = p5;
       this.x = p6;
       this.z = p8;
       this.A = p9;
       this.B = p10;
       this.C = p11;
       this.D = p12;
       this.E = p13;
       return;
    }
    public void aj2(int p0,String p1){
       super();
       this.a = 6;
       this.c = il2.a;
       this.b = p0;
       this.B = true;
       this.E = p1;
    }
    public final void writeToParcel(Parcel p0,int p1){
       aj2 tv;
       int i = is7.F(p0, 0x4f45);
       is7.I(p0, 1, 4);
       p0.writeInt(this.a);
       is7.I(p0, 2, 4);
       p0.writeInt(this.b);
       is7.I(p0, 3, 4);
       p0.writeInt(this.c);
       is7.C(p0, 4, this.t);
       if ((tv = this.v) == null) {
       }else {
          p0.writeStrongBinder(tv);
          is7.J(p0, is7.F(p0, 5));
       }
       is7.D(p0, 6, this.w, p1);
       is7.A(p0, 7, this.x);
       is7.B(p0, 8, this.y, p1);
       is7.D(p0, 10, this.z, p1);
       is7.D(p0, 11, this.A, p1);
       is7.I(p0, 12, 4);
       p0.writeInt(this.B);
       is7.I(p0, 13, 4);
       p0.writeInt(this.C);
       is7.I(p0, 14, 4);
       p0.writeInt(this.D);
       is7.C(p0, 15, this.E);
       is7.J(p0, i);
       return;
    }
}
