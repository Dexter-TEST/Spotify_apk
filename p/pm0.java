package p.pm0;
import p.mm0;
import java.lang.String;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import p.io2;
import java.lang.Integer;
import java.util.Arrays;

public final class pm0 extends mm0	// class@00228a from classes.dex
{
    public final String d;
    public final Drawable e;

    public void pm0(String p0,Drawable p1){
       super(2, -1);
       this.d = p0;
       this.e = p1;
    }
    public final boolean b(Object p0){
       boolean b = false;
       if (p0 instanceof pm0 && (super.equals(p0) && io2.j(this.d, p0.d))) {
          b = true;
       }
       return b;
    }
    public final int c(){
       Object[] objArray = new Object[]{Integer.valueOf(super.hashCode()),this.d};
       return Arrays.hashCode(objArray);
    }
    public final boolean equals(Object p0){
       return this.b(p0);
    }
    public final int hashCode(){
       return this.c();
    }
}
