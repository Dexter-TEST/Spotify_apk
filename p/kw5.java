package p.kw5;
import p.jw3;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffColorFilter;
import java.lang.Object;
import java.lang.Integer;

public final class kw5 extends jw3	// class@001c97 from classes.dex
{
    public final int j;

    public void kw5(int p0){
       this.j = p0;
       super(6);
    }
    public final PorterDuffColorFilter j(int p0,PorterDuff$Mode p1){
       switch (this.j){
           case 0:
           default:
             return this.b(Integer.valueOf((p1.hashCode() + ((p0 + 31) * 31))));
       }
       return this.b(Integer.valueOf((p1.hashCode() + ((p0 + 31) * 31))));
    }
    public final void k(int p0,PorterDuff$Mode p1,PorterDuffColorFilter p2){
       switch (this.j){
           case 0:
           default:
             this.c(Integer.valueOf((p1.hashCode() + ((p0 + 31) * 31))), p2);
             return;
       }
       this.c(Integer.valueOf((p1.hashCode() + ((p0 + 31) * 31))), p2);
       return;
    }
}
