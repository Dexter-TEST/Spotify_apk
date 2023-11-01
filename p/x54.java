package p.x54;
import android.os.Parcelable;
import p.g44;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public final class x54 implements Parcelable	// class@002c10 from classes.dex
{
    public final String a;
    public final Map b;
    public static final Parcelable$Creator CREATOR;

    static {
       x54.CREATOR = new g44(19);
    }
    public void x54(String p0,Map p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof x54 || (!co5.c(this.a, p0.a) || !co5.c(this.b, p0.b))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.b.hashCode() + (this.a.hashCode() * 31));
    }
    public final String toString(){
       return "Key\(key="+this.a+", extras="+this.b+')';
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.a);
       x54 tb = this.b;
       p0.writeInt(tb.size());
       Iterator iterator = tb.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          p0.writeString(key);
          p0.writeString(uEntry.getValue());
       }
       return;
    }
}
