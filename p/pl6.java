package p.pl6;
import android.view.View$OnClickListener;
import com.spotify.allboarding.allboardingimpl.skip.SkipDialogFragment;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import p.bb7;
import p.co5;
import p.eb4;
import p.db4;
import p.fh5;
import p.ob7;
import p.kb7;
import p.fb7;
import p.ib7;
import java.util.HashMap;
import p.gb7;
import p.pb7;
import p.nb3;
import p.ds3;

public final class pl6 implements View$OnClickListener	// class@002287 from classes.dex
{
    public final SkipDialogFragment a;
    public final String b;

    public void pl6(SkipDialogFragment p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onClick(View p0){
       pl6 ta = this.a;
       pl6 tb = this.b;
       co5.o(tb, "step");
       fh5 tb1 = new fh5(new db4(bb7.a(tb), 1));
       ob7 oob7 = new ob7();
       oob7.c(tb1.b);
       oob7.b = tb1.c.b.a;
       oob7.d = new ib7(1, "ui_hide", "hit", new HashMap());
       ta.D().a.b(oob7.a());
       ta.C(false);
    }
}
