package p.vm3;
import androidx.fragment.app.Fragment;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ej4;
import p.ab3;
import p.jp3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LitePageView;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import android.view.View;
import android.os.Bundle;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import p.k8;
import android.view.View$OnClickListener;
import p.um3;

public final class vm3 extends Fragment	// class@002a22 from classes.dex
{
    public ac a;
    public static final int b;

    public void vm3(){
       super(0x7f0d00d2);
    }
    public final void onAttach(Context p0){
       vm3 ta;
       co5.o(p0, "context");
       ej4.T(this);
       super.onAttach(p0);
       if ((ta = this.a) != null) {
          jp3 ojp3 = LitePageView.i();
          ojp3.d("enter");
          ojp3.c("lite/blocking-dialog");
          ojp3.e("spotify:blocking-dialog");
          ta.a.a(ojp3.build());
          return;
       }else {
          co5.N("mEventSender");
          throw null;
       }
    }
    public final void onDetach(){
       vm3 ta;
       super.onDetach();
       if ((ta = this.a) != null) {
          jp3 ojp3 = LitePageView.i();
          ojp3.d("exit");
          ojp3.c("lite/blocking-dialog");
          ojp3.e("spotify:blocking-dialog");
          ta.a.a(ojp3.build());
          return;
       }else {
          co5.N("mEventSender");
          throw null;
       }
    }
    public final void onViewCreated(View p0,Bundle p1){
       co5.o(p0, "view");
       super.onViewCreated(p0, p1);
       p0 = this.requireView().findViewById(R.id.download_button);
       co5.l(p0, "requireView\(\).findViewById\(R.id.download_button\)");
       p0.setOnClickListener(new k8(10, this));
       this.requireView().setOnClickListener(um3.a);
    }
}
