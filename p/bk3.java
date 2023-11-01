package p.bk3;
import p.d74;
import p.ck3;
import java.lang.Object;
import android.view.MenuItem;
import java.lang.String;
import p.co5;
import android.view.Menu;
import android.view.MenuInflater;
import java.lang.Class;
import p.sj3;
import p.fr0;
import p.t63;

public final class bk3 implements d74	// class@0010df from classes.dex
{
    public final ck3 a;

    public void bk3(ck3 p0){
       this.a = p0;
       super();
    }
    public final boolean a(MenuItem p0){
       co5.o(p0, "menu");
       return false;
    }
    public final void b(Menu p0){
    }
    public final void c(Menu p0,MenuInflater p1){
       co5.o(p0, "menu");
       co5.o(p1, "menuInflater");
       ck3 r = this.a.R;
       r.getClass();
       r.o(new sj3(2, p0));
    }
    public final void d(Menu p0){
    }
}
