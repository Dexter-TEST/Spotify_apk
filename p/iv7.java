package p.iv7;
import p.jv7;
import p.pt7;
import com.google.android.gms.common.api.Status;
import p.wx5;
import p.pv7;
import p.ev7;
import p.ly;
import android.os.Parcel;
import p.tu7;
import p.zu7;
import android.os.IBinder;

public final class iv7 extends jv7	// class@001a13 from classes.dex
{

    public void iv7(pt7 p0){
       super(p0, 1);
    }
    public final wx5 D(Status p0){
       return p0;
    }
    public final void J(pv7 p0){
       Parcel parcel = p0.g();
       parcel.writeStrongBinder(new ev7(this));
       p0.k(parcel, 4);
    }
}
