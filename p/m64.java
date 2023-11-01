package p.m64;
import p.r64;
import android.view.ActionProvider;
import java.lang.Object;
import android.view.MenuItem;
import android.view.View;
import p.uv1;

public abstract class m64	// class@001e34 from classes.dex
{
    public final ActionProvider a;
    public final r64 b;

    public void m64(r64 p0,ActionProvider p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public abstract boolean a();
    public abstract View b(MenuItem p0);
    public abstract boolean c();
    public abstract void d(uv1 p0);
}
