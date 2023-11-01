package p.b0;
import android.os.Parcelable;
import p.a0;
import p.q86;
import java.lang.Object;
import android.os.Parcel;
import java.lang.ClassLoader;
import java.lang.IllegalArgumentException;
import java.lang.String;

public abstract class b0 implements Parcelable	// class@00102f from classes.dex
{
    public final Parcelable a;
    public static final Parcelable$Creator CREATOR;
    public static final a0 b;

    static {
       b0.b = new a0();
       b0.CREATOR = new q86(3);
    }
    public void b0(){
       super();
       this.a = null;
    }
    public void b0(Parcel p0,ClassLoader p1){
       Parcelable parcelable;
       super();
       if ((parcelable = p0.readParcelable(p1)) != null) {
       }else {
          parcelable = b0.b;
       }
       this.a = parcelable;
       return;
    }
    public void b0(Parcelable p0){
       super();
       if (p0 == null) {
          throw new IllegalArgumentException("superState must not be null");
       }
       if (p0 == b0.b) {
          p0 = null;
       }
       this.a = p0;
       return;
    }
    public final int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeParcelable(this.a, p1);
    }
}
