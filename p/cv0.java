package p.cv0;
import p.b0;
import p.q86;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.os.Parcelable;
import android.util.SparseArray;
import java.lang.Object;

public final class cv0 extends b0	// class@001281 from classes.dex
{
    public SparseArray c;
    public static final Parcelable$Creator CREATOR;

    static {
       cv0.CREATOR = new q86(2);
    }
    public void cv0(Parcel p0,ClassLoader p1){
       super(p0, p1);
       int i = p0.readInt();
       int[] ointArray = new int[i];
       p0.readIntArray(ointArray);
       Parcelable[] parcelableAr = p0.readParcelableArray(p1);
       this.c = new SparseArray(i);
       for (int i1 = 0; i1 < i; i1++) {
          this.c.append(ointArray[i1], parcelableAr[i1]);
       }
       return;
    }
    public void cv0(Parcelable p0){
       super(p0);
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeParcelable(this.a, p1);
       cv0 tc = this.c;
       int i = 0;
       int i1 = (tc != null)? tc.size(): 0;
       p0.writeInt(i1);
       int[] ointArray = new int[i1];
       Parcelable[] parcelableAr = new Parcelable[i1];
       for (; i < i1; i = i + 1) {
          ointArray[i] = this.c.keyAt(i);
          parcelableAr[i] = this.c.valueAt(i);
       }
       p0.writeIntArray(ointArray);
       p0.writeParcelableArray(parcelableAr, p1);
       return;
    }
}
