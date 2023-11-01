package p.ul2;
import p.o2;
import p.dj2;
import android.os.Bundle;
import android.os.Parcel;
import p.is7;

public final class ul2 extends o2	// class@0028d0 from classes.dex
{
    public final int a;
    public final int b;
    public final Bundle c;
    public static final Parcelable$Creator CREATOR;

    static {
       ul2.CREATOR = new dj2(15);
    }
    public void ul2(int p0,int p1,Bundle p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void writeToParcel(Parcel p0,int p1){
       is7.I(p0, 1, 4);
       p0.writeInt(this.a);
       is7.I(p0, 2, 4);
       p0.writeInt(this.b);
       is7.A(p0, 3, this.c);
       is7.J(p0, is7.F(p0, 0x4f45));
    }
}
