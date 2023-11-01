package p.et7;
import p.wx5;
import p.o2;
import p.tv7;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;
import p.is7;
import android.os.Parcelable;

public final class et7 extends o2 implements wx5	// class@0014f7 from classes.dex
{
    public final int a;
    public final int b;
    public final Intent c;
    public static final Parcelable$Creator CREATOR;

    static {
       et7.CREATOR = new tv7(4);
    }
    public void et7(int p0,int p1,Intent p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Status a(){
       if (this.b == null) {
          return Status.w;
       }
       return Status.A;
    }
    public final void writeToParcel(Parcel p0,int p1){
       is7.I(p0, 1, 4);
       p0.writeInt(this.a);
       is7.I(p0, 2, 4);
       p0.writeInt(this.b);
       is7.B(p0, 3, this.c, p1);
       is7.J(p0, is7.F(p0, 0x4f45));
    }
}
