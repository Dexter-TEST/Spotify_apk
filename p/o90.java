package p.o90;
import android.os.Parcelable;
import p.tv7;
import p.uc4;
import p.n90;
import java.lang.Object;
import java.util.Calendar;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.GregorianCalendar;
import p.yo4;
import java.util.Arrays;
import android.os.Parcel;

public final class o90 implements Parcelable	// class@0020d2 from classes.dex
{
    public final uc4 a;
    public final uc4 b;
    public final n90 c;
    public final uc4 t;
    public final int v;
    public final int w;
    public static final Parcelable$Creator CREATOR;

    static {
       o90.CREATOR = new tv7(9);
    }
    public void o90(uc4 p0,uc4 p1,n90 p2,uc4 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.t = p3;
       this.c = p2;
       if (p3 != null && p0.a.compareTo(p3.a) > 0) {
          throw new IllegalArgumentException("start Month cannot be after current Month");
       }
       if (p3 != null && p3.a.compareTo(p1.a) > 0) {
          throw new IllegalArgumentException("current Month cannot be after end Month");
       }
       if (!p0.a instanceof GregorianCalendar) {
          throw new IllegalArgumentException("Only Gregorian calendars are supported.");
       }
       uc4 c = p1.c;
       p3 = p0.c;
       this.w = ((p1.b - p0.b) + ((c - p3) * 12)) + 1;
       this.v = (c - p3) + 1;
       return;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof o90) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (!yo4.a(this.t, p0.t) || !this.c.equals(p0.c)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b,this.t,this.c};
       return Arrays.hashCode(objArray);
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeParcelable(this.a, 0);
       p0.writeParcelable(this.b, 0);
       p0.writeParcelable(this.t, 0);
       p0.writeParcelable(this.c, 0);
    }
}
