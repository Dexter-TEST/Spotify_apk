package p.ut7;
import p.jl2;
import p.kl2;
import p.kt7;
import p.jt7;
import android.content.Context;
import p.nu7;
import p.yg0;
import p.bl2;
import p.lf6;
import java.lang.Class;
import java.lang.Object;
import android.accounts.Account;
import java.lang.String;
import p.qs6;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p.ou7;
import p.w51;
import java.lang.Integer;
import android.os.IInterface;
import p.bu7;
import android.os.Parcel;
import p.tu7;
import p.xt7;
import p.is7;
import android.os.Parcelable;
import android.os.IBinder;
import p.iu7;
import p.fp0;
import android.app.PendingIntent;
import p.pu7;
import p.t5;
import java.lang.Runnable;
import android.os.Handler;
import p.nl2;

public final class ut7 extends kt7 implements jl2, kl2	// class@00291c from classes.dex
{
    public final Context a;
    public final Handler b;
    public final ye7 c;
    public final Set d;
    public final yg0 e;
    public zt7 f;
    public vt7 g;
    public static final sv7 h;

    static {
       ut7.h = jt7.a;
    }
    public void ut7(Context p0,nu7 p1,yg0 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.e = p2;
       this.d = p2.b;
       this.c = ut7.h;
    }
    public final void g(int p0){
       this.f.d();
    }
    public final void k(){
       int i;
       ut7 tf = this.f;
       tf.getClass();
       try{
          i = 0;
          yg0 a = tf.B.a;
          String str = "<<default account>>";
          if (a == null) {
             a = new Account(str, "com.google");
          }
          GoogleSignInAccount googleSignIn = (str.equals(a.name))? qs6.a(tf.c).b(): i;
          lf6 d = tf.D;
          w51.k(d);
          bu7 uobu7 = tf.i();
          Parcel parcel = Parcel.obtain();
          parcel.writeInterfaceToken(uobu7.b);
          parcel.writeInt(1);
          is7.I(parcel, 1, 4);
          parcel.writeInt(1);
          is7.B(parcel, 2, new ou7(2, a, d.intValue(), googleSignIn), 0);
          is7.J(parcel, is7.F(parcel, 0x4f45));
          parcel.writeStrongBinder(this);
          Parcel parcel1 = Parcel.obtain();
          uobu7.a.transact(12, parcel, parcel1, 0);
          parcel1.readException();
          parcel.recycle();
          parcel1.recycle();
       }catch(android.os.RemoteException e0){
          this.b.post(new t5(this, 14, new iu7(1, new fp0(8, i), i)));
       }
       return;
    }
    public final void n(fp0 p0){
       this.g.b(p0);
    }
}
