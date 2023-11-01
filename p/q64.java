package p.q64;
import android.view.MenuItem$OnMenuItemClickListener;
import p.r64;
import java.lang.Object;
import android.view.MenuItem;
import p.uy;

public final class q64 implements MenuItem$OnMenuItemClickListener	// class@00233e from classes.dex
{
    public final MenuItem$OnMenuItemClickListener a;
    public final r64 b;

    public void q64(r64 p0,MenuItem$OnMenuItemClickListener p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public final boolean onMenuItemClick(MenuItem p0){
       return this.a.onMenuItemClick(this.b.e(p0));
    }
}
