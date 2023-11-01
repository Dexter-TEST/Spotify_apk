package p.se2;
import p.ll7;
import androidx.fragment.app.Fragment;
import android.view.ViewGroup;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import p.co5;

public final class se2 extends ll7	// class@002610 from classes.dex
{

    public void se2(Fragment p0,ViewGroup p1,int p2){
       if (p2 != 1) {
          super(p0, "Attempting to use <fragment> tag to add fragment "+p0+" to container "+p1);
          return;
       }else {
          co5.o(p1, "container");
          super(p0, "Attempting to add fragment "+p0+" to container "+p1+" which is not a FragmentContainerView");
          return;
       }
    }
    public void se2(Fragment p0,String p1){
       co5.o(p0, "fragment");
       co5.o(p1, "previousFragmentId");
       super(p0, "Attempting to reuse fragment "+p0+" with previous ID "+p1);
    }
}
