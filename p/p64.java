package p.p64;
import android.view.MenuItem$OnActionExpandListener;
import p.r64;
import java.lang.Object;
import android.view.MenuItem;
import p.uy;

public final class p64 implements MenuItem$OnActionExpandListener	// class@0021fe from classes.dex
{
    public final MenuItem$OnActionExpandListener a;
    public final r64 b;

    public void p64(r64 p0,MenuItem$OnActionExpandListener p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public final boolean onMenuItemActionCollapse(MenuItem p0){
       return this.a.onMenuItemActionCollapse(this.b.e(p0));
    }
    public final boolean onMenuItemActionExpand(MenuItem p0){
       return this.a.onMenuItemActionExpand(this.b.e(p0));
    }
}
