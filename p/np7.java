package p.np7;
import p.pp7;
import android.view.WindowInsets$Builder;
import p.xp7;
import android.view.WindowInsets;
import p.jy6;
import android.view.View;
import p.aa3;
import p.vp7;
import android.graphics.Insets;

public class np7 extends pp7	// class@002026 from classes.dex
{
    public final WindowInsets$Builder a;

    public void np7(){
       super();
       this.a = new WindowInsets$Builder();
    }
    public void np7(xp7 p0){
       WindowInsets windowInsets;
       super(p0);
       WindowInsets$Builder uBuilder = ((windowInsets = p0.f()) != null)? new WindowInsets$Builder(windowInsets): new WindowInsets$Builder();
       this.a = uBuilder;
       return;
    }
    public xp7 b(){
       this.a();
       xp7 oxp7 = xp7.g(jy6.e(this.a), null);
       oxp7.a.o(null);
       return oxp7;
    }
    public void c(aa3 p0){
       jy6.w(this.a, p0.c());
    }
    public void d(aa3 p0){
       jy6.q(this.a, p0.c());
    }
}
