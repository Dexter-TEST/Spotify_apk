package p.uc4;
import java.lang.Comparable;
import android.os.Parcelable;
import p.tv7;
import java.util.Calendar;
import java.lang.Object;
import p.pe7;
import android.content.Context;
import java.lang.String;
import java.util.TimeZone;
import android.text.format.DateUtils;
import java.lang.Integer;
import java.util.Arrays;
import android.os.Parcel;

public final class uc4 implements Comparable, Parcelable	// class@002884 from classes.dex
{
    public final Calendar a;
    public final int b;
    public final int c;
    public final int t;
    public final int v;
    public final long w;
    public String x;
    public static final Parcelable$Creator CREATOR;

    static {
       uc4.CREATOR = new tv7(11);
    }
    public void uc4(Calendar p0){
       super();
       p0.set(5, 1);
       p0 = pe7.a(p0);
       this.a = p0;
       this.b = p0.get(2);
       this.c = p0.get(1);
       this.t = p0.getMaximum(7);
       this.v = p0.getActualMaximum(5);
       this.w = p0.getTimeInMillis();
    }
    public static uc4 a(int p0,int p1){
       Calendar uCalendar = pe7.c(null);
       uCalendar.set(1, p0);
       uCalendar.set(2, p1);
       return new uc4(uCalendar);
    }
    public static uc4 b(long p0){
       Calendar uCalendar = pe7.c(null);
       uCalendar.setTimeInMillis(p0);
       return new uc4(uCalendar);
    }
    public final int c(){
       uc4 ta = this.a;
       int i = ta.get(7);
       if ((i = i - ta.getFirstDayOfWeek()) < 0) {
          i = i + this.t;
       }
       return i;
    }
    public final int compareTo(Object p0){
       return this.a.compareTo(p0.a);
    }
    public final String d(Context p0){
       if (this.x == null) {
          long timeInMillis = this.a.getTimeInMillis();
          this.x = DateUtils.formatDateTime(p0, (timeInMillis - (long)TimeZone.getDefault().getOffset(timeInMillis)), 36);
       }
       return this.x;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof uc4) {
          return false;
       }
       if (this.b != p0.b || this.c != p0.c) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{Integer.valueOf(this.b),Integer.valueOf(this.c)};
       return Arrays.hashCode(objArray);
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.c);
       p0.writeInt(this.b);
    }
}
