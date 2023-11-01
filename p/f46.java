package p.f46;
import p.n46;
import p.ie5;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.kg4;
import android.os.Parcel;
import java.util.Iterator;
import android.os.Parcelable;

public final class f46 implements n46	// class@00155a from classes.dex
{
    public final String a;
    public final List b;
    public static final Parcelable$Creator CREATOR;

    static {
       f46.CREATOR = new ie5(2);
    }
    public void f46(String p0,List p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof f46) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       f46 ta;
       int i = ((ta = this.a) == null)? 0: ta.hashCode();
       return (this.b.hashCode() + (i * 31));
    }
    public final String toString(){
       return kg4.o("ContextualAudio\(mixId="+this.a+", selectedContent=", this.b, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       f46 tb = this.b;
       p0.writeInt(tb.size());
       Iterator iterator = tb.iterator();
       while (iterator.hasNext()) {
          p0.writeParcelable(iterator.next(), p1);
       }
       return;
    }
}
