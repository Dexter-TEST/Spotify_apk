package p.iu7;
import p.o2;
import p.tv7;
import p.fp0;
import p.pu7;
import android.os.Parcel;
import p.is7;
import android.os.Parcelable;

public final class iu7 extends o2	// class@001a0a from classes.dex
{
    public final int a;
    public final fp0 b;
    public final pu7 c;
    public static final Parcelable$Creator CREATOR;

    static {
       iu7.CREATOR = new tv7(7);
    }
    public void iu7(int p0,fp0 p1,pu7 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void writeToParcel(Parcel p0,int p1){
       is7.I(p0, 1, 4);
       p0.writeInt(this.a);
       is7.B(p0, 2, this.b, p1);
       is7.B(p0, 3, this.c, p1);
       is7.J(p0, is7.F(p0, 0x4f45));
    }
}
