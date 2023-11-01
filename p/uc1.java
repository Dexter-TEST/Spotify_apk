package p.uc1;
import p.gl6;
import android.content.Context;
import java.lang.Object;
import p.tp5;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.Math;
import p.ib1;
import p.fl6;
import p.oi;
import p.co5;

public final class uc1 implements gl6	// class@002881 from classes.dex
{
    public final Context a;

    public void uc1(Context p0){
       this.a = p0;
    }
    public final Object a(tp5 p0){
       DisplayMetrics displayMetri = this.a.getResources().getDisplayMetrics();
       return new fl6(new ib1(Math.max(displayMetri.widthPixels, displayMetri.heightPixels)), new ib1(Math.max(displayMetri.widthPixels, displayMetri.heightPixels)));
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof uc1 || !co5.c(this.a, p0.a)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
}
