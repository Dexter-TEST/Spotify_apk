package p.s76;
import java.lang.Runnable;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.String;
import p.co5;

public final class s76 implements Runnable	// class@0025d4 from classes.dex
{
    public final SearchFragment a;

    public void s76(SearchFragment p0){
       this.a = p0;
       super();
    }
    public final void run(){
       SearchFragment z;
       s76 ta = this.a;
       if (ta.H != null) {
          ta.H = false;
          if ((z = ta.z) != null) {
             z.g0(false);
          }else {
             co5.N("searchRecyclerView");
             throw null;
          }
       }
       return;
    }
}
