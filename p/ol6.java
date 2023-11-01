package p.ol6;
import android.view.View$OnClickListener;
import com.spotify.allboarding.allboardingimpl.skip.SkipDialogFragment;
import java.lang.String;
import p.nl6;
import java.lang.Object;
import android.view.View;
import p.bb7;
import p.co5;
import p.eb4;
import p.db4;
import p.kf6;
import p.pb7;
import p.nb3;
import p.ds3;

public final class ol6 implements View$OnClickListener	// class@002145 from classes.dex
{
    public final SkipDialogFragment a;
    public final String b;
    public final nl6 c;

    public void ol6(SkipDialogFragment p0,String p1,nl6 p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onClick(View p0){
       ol6 ta = this.a;
       ol6 tb = this.b;
       co5.o(tb, "step");
       ta.D().a.b(new kf6(new db4(bb7.a(tb), 1)).h());
       ta.C(this.c.e);
    }
}
