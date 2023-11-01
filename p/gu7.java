package p.gu7;
import p.o2;
import p.tv7;
import p.ou7;
import android.os.Parcel;
import p.is7;
import android.os.Parcelable;

public final class gu7 extends o2	// class@001782 from classes.dex
{
    public final int a;
    public final ou7 b;
    public static final Parcelable$Creator CREATOR;

    static {
       gu7.CREATOR = new tv7(6);
    }
    public void gu7(int p0,ou7 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void writeToParcel(Parcel p0,int p1){
       is7.I(p0, 1, 4);
       p0.writeInt(this.a);
       is7.B(p0, 2, this.b, p1);
       is7.J(p0, is7.F(p0, 0x4f45));
    }
}
