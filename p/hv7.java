package p.hv7;
import p.jv7;
import p.pt7;
import com.google.android.gms.common.api.Status;
import p.wx5;
import p.bl2;
import p.dv7;
import android.os.IInterface;
import p.ov7;
import p.gv7;
import android.os.Parcel;
import p.tu7;
import p.zu7;
import android.os.IBinder;
import p.o2;

public final class hv7 extends jv7	// class@0018d0 from classes.dex
{
    public final int x;

    public void hv7(pt7 p0,int p1){
       this.x = p1;
       super(p0, 0);
    }
    public final wx5 D(Status p0){
       return p0;
    }
    public final void H(bl2 p0){
       ov7 oov7;
       Parcel parcel;
       switch (this.x){
           case 0:
           default:
             oov7 = p0.i();
             parcel = oov7.g();
             parcel.writeStrongBinder(new gv7(this, 1));
             zu7.b(p0.A, parcel);
             oov7.k(parcel, 103);
             return;
       }
       oov7 = p0.i();
       parcel = oov7.g();
       parcel.writeStrongBinder(new gv7(this, 0));
       zu7.b(p0.A, parcel);
       oov7.k(parcel, 102);
       return;
    }
}
