package p.c9;
import p.h9;
import p.ie5;
import java.lang.String;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import android.os.Parcel;
import android.os.Parcelable;

public final class c9 extends h9	// class@0011c5 from classes.dex
{
    public final String a;
    public final SearchConfiguration b;
    public static final Parcelable$Creator CREATOR;

    static {
       c9.CREATOR = new ie5(22);
    }
    public void c9(String p0,SearchConfiguration p1){
       co5.o(p0, "step");
       co5.o(p1, "searchConfig");
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
       if (!p0 instanceof c9) {
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
       return (this.b.hashCode() + (this.a.hashCode() * 31));
    }
    public final String toString(){
       return "NavigateToSearch\(step="+this.a+", searchConfig="+this.b+')';
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeParcelable(this.b, p1);
    }
}
