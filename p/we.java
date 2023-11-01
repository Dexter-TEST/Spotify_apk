package p.we;
import p.ko1;
import p.re;
import java.lang.String;
import java.lang.Object;
import java.util.Arrays;
import p.ye7;

public final class we	// class@002b22 from classes.dex
{
    public final int a;
    public final ko1 b;
    public final re c;
    public final String d;

    public void we(ko1 p0,re p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       Object[] objArray = new Object[]{p0,p1,p2};
       this.a = Arrays.hashCode(objArray);
    }
    public final boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof we) {
          return false;
       }
       if (ye7.x(this.b, p0.b) && (ye7.x(this.c, p0.c) && ye7.x(this.d, p0.d))) {
          return true;
       }
       return false;
    }
    public final int hashCode(){
       return this.a;
    }
}
