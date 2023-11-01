package p.rw;
import android.os.Parcelable;
import p.g44;
import android.os.Parcel;
import java.lang.Object;
import java.util.ArrayList;
import androidx.fragment.app.b;
import android.os.Parcelable$Creator;
import java.util.List;

public final class rw implements Parcelable	// class@002574 from classes.dex
{
    public final List a;
    public final List b;
    public static final Parcelable$Creator CREATOR;

    static {
       rw.CREATOR = new g44(10);
    }
    public void rw(Parcel p0){
       super();
       this.a = p0.createStringArrayList();
       this.b = p0.createTypedArrayList(b.CREATOR);
    }
    public void rw(ArrayList p0,ArrayList p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeStringList(this.a);
       p0.writeTypedList(this.b);
    }
}
