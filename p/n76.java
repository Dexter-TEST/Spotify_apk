package p.n76;
import android.view.View$OnClickListener;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import java.lang.Object;
import android.view.View;
import p.fh5;
import p.x86;
import java.lang.String;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import java.lang.Class;
import p.co5;
import androidx.lifecycle.b;
import p.mk7;

public final class n76 implements View$OnClickListener	// class@001f82 from classes.dex
{
    public final SearchFragment a;

    public void n76(SearchFragment p0){
       this.a = p0;
       super();
    }
    public final void onClick(View p0){
       SearchFragment b;
       mk7 omk7;
       n76 ta = this.a;
       ta.w().h();
       x86 ox86 = ta.v();
       if ((b = ta.b) != null) {
          String url = b.getUrl();
          ox86.getClass();
          co5.o(url, "url");
          if ((omk7 = ox86.A.e()) != null) {
             ox86.e(omk7.a, url);
          }
          return;
       }else {
          co5.N("searchConfig");
          throw null;
       }
    }
}
