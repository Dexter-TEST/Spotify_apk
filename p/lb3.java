package p.lb3;
import android.os.Parcelable;
import p.g44;
import android.content.IntentSender;
import android.content.Intent;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.os.Parcel;

public final class lb3 implements Parcelable	// class@001d1e from classes.dex
{
    public final IntentSender a;
    public final Intent b;
    public final int c;
    public final int t;
    public static final Parcelable$Creator CREATOR;

    static {
       lb3.CREATOR = new g44(6);
    }
    public void lb3(IntentSender p0,Intent p1,int p2,int p3){
       co5.o(p0, "intentSender");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "dest");
       p0.writeParcelable(this.a, p1);
       p0.writeParcelable(this.b, p1);
       p0.writeInt(this.c);
       p0.writeInt(this.t);
    }
}
