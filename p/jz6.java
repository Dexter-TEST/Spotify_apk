package p.jz6;
import p.az6;
import p.wz3;
import com.google.android.material.tabs.TabLayout;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.cz6;
import p.lz6;
import p.mz6;
import p.nz6;
import java.util.ArrayList;

public final class jz6 extends wz3 implements az6	// class@001b77 from classes.dex
{
    public final TabLayout b;
    public final Observer c;

    public void jz6(TabLayout p0,Observer p1){
       co5.q(p0, "view");
       co5.q(p1, "observer");
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(cz6 p0){
       co5.q(p0, "tab");
       if (!this.isDisposed()) {
          this.c.onNext(new lz6(this.b, p0));
       }
       return;
    }
    public final void b(cz6 p0){
       co5.q(p0, "tab");
       if (!this.isDisposed()) {
          this.c.onNext(new mz6(this.b, p0));
       }
       return;
    }
    public final void e(cz6 p0){
       if (!this.isDisposed()) {
          this.c.onNext(new nz6(this.b, p0));
       }
       return;
    }
    public final void f(){
       this.b.b0.remove(this);
    }
}
