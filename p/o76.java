package p.o76;
import p.e76;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import java.lang.Object;
import p.fh5;
import p.ds3;
import p.fb4;
import java.lang.Class;
import p.si4;
import p.xq7;
import p.ob7;
import p.kb7;
import p.fb7;
import p.ib7;
import java.util.HashMap;
import java.lang.String;
import p.gb7;
import p.pb7;
import p.nb3;
import androidx.fragment.app.Fragment;
import p.lg4;
import p.tu6;

public final class o76 implements e76	// class@0020c6 from classes.dex
{
    public final SearchFragment a;

    public void o76(SearchFragment p0){
       this.a = p0;
       super();
    }
    public final boolean c(){
       o76 ta = this.a;
       fh5 uofh5 = ta.w();
       uofh5 = uofh5.c;
       uofh5.getClass();
       si4 osi4 = new si4(uofh5);
       xq7 uofh51 = new xq7(osi4);
       ob7 oob7 = new ob7();
       oob7.c(uofh51.b);
       oob7.b = uofh51.c.b.a;
       oob7.d = new ib7(1, "ui_hide", "hit", new HashMap());
       uofh5.b.b(oob7.a());
       return tu6.p(ta).k();
    }
}
