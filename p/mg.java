package p.mg;
import androidx.fragment.app.f;
import android.app.Dialog;
import p.lg;
import android.view.Window;
import p.rf;
import android.os.Bundle;
import android.content.Context;
import androidx.fragment.app.Fragment;

public class mg extends f	// class@001e92 from classes.dex
{

    public void mg(){
       super();
    }
    public final void A(Dialog p0,int p1){
       if (p0 instanceof lg) {
          lg olg = p0;
          if (p1 != 1 && p1 != 2) {
             if (p1 == 3) {
                p0.getWindow().addFlags(24);
             }
          }
          olg.d().g(1);
       }else {
          super.A(p0, p1);
       }
       return;
    }
    public Dialog x(Bundle p0){
       return new lg(this.getContext(), this.w());
    }
}
