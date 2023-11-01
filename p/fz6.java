package p.fz6;
import p.tj7;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.ref.Reference;
import p.cz6;

public final class fz6 extends tj7	// class@00166c from classes.dex
{
    public final WeakReference a;
    public int b;
    public int c;

    public void fz6(TabLayout p0){
       super();
       this.a = new WeakReference(p0);
       this.c = 0;
       this.b = 0;
    }
    public final void a(int p0){
       this.b = this.c;
       this.c = p0;
    }
    public final void b(int p0,float p1,int p2){
       TabLayout tabLayout;
       if ((tabLayout = this.a.get()) != null) {
          fz6 tc = this.c;
          boolean b = false;
          boolean b1 = (tc == 2 && this.b != 1)? false: true;
          if (tc != 2 || this.b != null) {
             b = true;
          }
          tabLayout.k(p0, p1, b1, b);
       }
       return;
    }
    public final void c(int p0){
       TabLayout tabLayout;
       fz6 tc;
       if ((tabLayout = this.a.get()) != null && (tabLayout.getSelectedTabPosition() != p0 && p0 < tabLayout.getTabCount())) {
          boolean b = ((tc = this.c) != null && (tc != 2 && this.b == null))? false: true;
          tabLayout.j(tabLayout.f(p0), b);
       }
       return;
    }
}
