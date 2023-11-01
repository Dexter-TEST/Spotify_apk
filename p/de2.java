package p.de2;
import p.gg4;
import p.dh4;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import p.eb3;
import android.content.res.TypedArray;
import java.lang.StringBuilder;

public final class de2 extends gg4	// class@00132d from classes.dex
{
    public String B;

    public void de2(dh4 p0){
       co5.o(p0, "fragmentNavigator");
       super(p0);
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (p0 != null && (p0 instanceof de2 && (super.equals(p0) && co5.c(this.B, p0.B)))) {
          b = true;
       }
       return b;
    }
    public final int hashCode(){
       de2 tB;
       int i = super.hashCode() * 31;
       int i1 = ((tB = this.B) != null)? tB.hashCode(): 0;
       return (i + i1);
    }
    public final void k(Context p0,AttributeSet p1){
       String str;
       co5.o(p0, "context");
       super.k(p0, p1);
       TypedArray typedArray = p0.getResources().obtainAttributes(p1, eb3.C);
       co5.l(typedArray, "context.resources.obtain…leable.FragmentNavigator\)");
       if ((str = typedArray.getString(0)) != null) {
          this.B = str;
       }
       typedArray.recycle();
       return;
    }
    public final String toString(){
       de2 tB;
       StringBuilder str = super.toString()+" class=";
       str = ((tB = this.B) == null)? str+"null": str+tB;
       str = str;
       co5.l(str, "sb.toString\(\)");
       return str;
    }
}
