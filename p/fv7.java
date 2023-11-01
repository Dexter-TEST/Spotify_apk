package p.fv7;
import p.jv7;
import p.pt7;
import p.o2;
import com.google.android.gms.common.api.Status;
import p.wx5;
import p.cv7;
import com.google.android.gms.auth.api.credentials.Credential;
import p.pv7;
import p.ev7;
import p.ly;
import p.nv7;
import android.os.Parcel;
import p.tu7;
import p.zu7;
import android.os.IBinder;
import p.rv7;
import p.j01;

public final class fv7 extends jv7	// class@001649 from classes.dex
{
    public final int x;
    public final o2 y;

    public void fv7(pt7 p0,o2 p1,int p2){
       this.x = p2;
       this.y = p1;
       super(p0, 1);
    }
    public final wx5 D(Status p0){
       switch (this.x){
           case 0:
           case 1:
           default:
             return new cv7(p0, null);
       }
       return p0;
    }
    public final void J(pv7 p0){
       Parcel parcel;
       fv7 ty = this.y;
       switch (this.x){
           case 0:
             parcel = p0.g();
             parcel.writeStrongBinder(new ev7(this));
             zu7.b(new rv7(ty), parcel);
             p0.k(parcel, 2);
             return;
           case 1:
             parcel = p0.g();
             parcel.writeStrongBinder(new ev7(this));
             zu7.b(new nv7(ty), parcel);
             p0.k(parcel, 3);
             return;
           default:
             Parcel parcel1 = p0.g();
             parcel1.writeStrongBinder(new ev7(this));
             zu7.b(ty, parcel1);
             p0.k(parcel1, 1);
             return;
       }
    }
}
