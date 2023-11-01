package p.cl2;
import android.net.Uri$Builder;
import java.lang.String;
import android.net.Uri;
import java.lang.Object;
import p.w51;
import p.ye7;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.Arrays;

public final class cl2	// class@00122b from classes.dex
{
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public static final Uri e;

    static {
       cl2.e = new Uri$Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    }
    public void cl2(int p0,String p1,String p2,boolean p3){
       super();
       w51.i(p1);
       this.a = p1;
       w51.i(p2);
       this.b = p2;
       this.c = p0;
       this.d = p3;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof cl2) {
          return false;
       }
       if (ye7.x(this.a, p0.a) && (ye7.x(this.b, p0.b) && (ye7.x(null, null) && (this.c == p0.c && this.d == p0.d)))) {
          return true;
       }
       return false;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b,null,Integer.valueOf(this.c),Boolean.valueOf(this.d)};
       return Arrays.hashCode(objArray);
    }
    public final String toString(){
       cl2 ta;
       if ((ta = this.a) != null) {
          return ta;
       }
       w51.k(null);
       throw null;
    }
}
