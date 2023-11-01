package p.rv7;
import p.o2;
import p.tv7;
import com.google.android.gms.auth.api.credentials.Credential;
import android.os.Parcel;
import p.is7;
import android.os.Parcelable;

public final class rv7 extends o2	// class@00256a from classes.dex
{
    public final Credential a;
    public static final Parcelable$Creator CREATOR;

    static {
       rv7.CREATOR = new tv7(3);
    }
    public void rv7(Credential p0){
       this.a = p0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       is7.B(p0, 1, this.a, p1);
       is7.J(p0, is7.F(p0, 0x4f45));
    }
}
