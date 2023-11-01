package p.qx7;
import p.o2;
import p.dj2;
import android.os.Bundle;
import p.q12;
import p.op0;
import android.os.Parcel;
import p.is7;
import android.os.Parcelable;

public final class qx7 extends o2	// class@002436 from classes.dex
{
    public final Bundle a;
    public final q12[] b;
    public final int c;
    public final op0 t;
    public static final Parcelable$Creator CREATOR;

    static {
       qx7.CREATOR = new dj2(26);
    }
    public void qx7(Bundle p0,q12[] p1,int p2,op0 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final void writeToParcel(Parcel p0,int p1){
       is7.A(p0, 1, this.a);
       is7.D(p0, 2, this.b, p1);
       is7.I(p0, 3, 4);
       p0.writeInt(this.c);
       is7.B(p0, 4, this.t, p1);
       is7.J(p0, is7.F(p0, 0x4f45));
    }
}
