package p.r76;
import p.d76;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import java.lang.Object;
import p.fh5;
import p.ds3;
import p.fb4;
import java.lang.Class;
import p.si4;
import p.zk;
import p.ob7;
import p.kb7;
import p.fb7;
import p.ib7;
import java.util.HashMap;
import java.lang.String;
import p.gb7;
import p.pb7;
import p.nb3;
import p.co5;
import p.x86;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;

public final class r76 implements d76	// class@002491 from classes.dex
{
    public final SearchFragment a;

    public void r76(SearchFragment p0){
       this.a = p0;
       super();
    }
    public final void a(){
       fh5 uofh5 = this.a.w();
       uofh5 = uofh5.c;
       uofh5.getClass();
       si4 osi4 = new si4(uofh5);
       zk uofh51 = new zk(osi4);
       ob7 oob7 = new ob7();
       oob7.c(uofh51.a);
       oob7.b = uofh51.b.b.a;
       oob7.d = new ib7(1, "text_clear", "key_stroke", new HashMap());
       uofh5.b.b(oob7.a());
    }
    public final void b(String p0){
       SearchFragment b;
       co5.o(p0, "newQuery");
       r76 ta = this.a;
       x86 ox86 = ta.v();
       if ((b = ta.b) != null) {
          ox86.e(p0, b.getUrl());
          ta.H = true;
          return;
       }else {
          co5.N("searchConfig");
          throw null;
       }
    }
    public final void c(boolean p0){
    }
    public final void d(){
    }
}
