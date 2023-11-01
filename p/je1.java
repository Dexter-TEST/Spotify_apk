package p.je1;
import p.c22;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import p.co5;
import p.en6;

public final class je1 extends c22	// class@001abb from classes.dex
{
    public final Drawable a;
    public final boolean b;
    public final int c;

    public void je1(Drawable p0,boolean p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof je1 || (!co5.c(this.a, p0.a) || (this.b != p0.b || this.c != p0.c))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = this.a.hashCode() * 31;
       int i1 = (this.b != null)? 1231: 1237;
       return (en6.A(this.c) + ((i + i1) * 31));
    }
}
