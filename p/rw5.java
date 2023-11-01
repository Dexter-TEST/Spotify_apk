package p.rw5;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources$Theme;
import java.lang.Object;

public final class rw5	// class@002571 from classes.dex
{
    public final ColorStateList a;
    public final Configuration b;
    public final int c;

    public void rw5(ColorStateList p0,Configuration p1,Resources$Theme p2){
       super();
       this.a = p0;
       this.b = p1;
       int i = (p2 == null)? 0: p2.hashCode();
       this.c = i;
       return;
    }
}
