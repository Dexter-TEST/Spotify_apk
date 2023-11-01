package p.n64;
import android.view.ActionProvider$VisibilityListener;
import p.m64;
import p.r64;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import p.uv1;
import p.l64;
import p.e64;

public final class n64 extends m64 implements ActionProvider$VisibilityListener	// class@001f77 from classes.dex
{
    public uv1 c;

    public void n64(r64 p0,ActionProvider p1){
       super(p0, p1);
    }
    public final boolean a(){
       return this.a.isVisible();
    }
    public final View b(MenuItem p0){
       return this.a.onCreateActionView(p0);
    }
    public final boolean c(){
       return this.a.overridesItemVisibility();
    }
    public final void d(uv1 p0){
       this.c = p0;
       this.a.setVisibilityListener(this);
    }
    public final void onActionProviderVisibilityChanged(boolean p0){
       n64 tc;
       if ((tc = this.c) != null) {
          l64 n = tc.b.n;
          n.h = true;
          n.p(true);
       }
       return;
    }
}
