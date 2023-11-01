package p.ou7;
import p.o2;
import p.dj2;
import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.os.Parcel;
import p.is7;
import android.os.Parcelable;

public final class ou7 extends o2	// class@002194 from classes.dex
{
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount t;
    public static final Parcelable$Creator CREATOR;

    static {
       ou7.CREATOR = new dj2(24);
    }
    public void ou7(int p0,Account p1,int p2,GoogleSignInAccount p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final void writeToParcel(Parcel p0,int p1){
       is7.I(p0, 1, 4);
       p0.writeInt(this.a);
       is7.B(p0, 2, this.b, p1);
       is7.I(p0, 3, 4);
       p0.writeInt(this.c);
       is7.B(p0, 4, this.t, p1);
       is7.J(p0, is7.F(p0, 0x4f45));
    }
}
