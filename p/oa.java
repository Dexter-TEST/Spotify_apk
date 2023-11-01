package p.oa;
import p.xz4;
import com.spotify.allboarding.allboardingimpl.mobius.AllBoardingFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import p.co5;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class oa implements xz4	// class@0020e4 from classes.dex
{
    public final AllBoardingFragment a;

    public void oa(AllBoardingFragment p0){
       this.a = p0;
       super();
    }
    public final void b(Object p0){
       co5.l(p0, "skipped");
       if (p0.booleanValue()) {
          this.a.requireActivity().finish();
       }
       return;
    }
}
