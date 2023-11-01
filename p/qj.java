package p.qj;
import androidx.fragment.app.f;
import android.content.Context;
import androidx.fragment.app.Fragment;
import p.pj;
import androidx.fragment.app.k;
import android.content.DialogInterface;
import p.rj;
import p.ab3;
import java.lang.Class;
import java.lang.Object;
import p.jp3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LitePageView;
import java.lang.String;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import android.os.Bundle;
import android.app.Dialog;
import android.content.pm.ApplicationInfo;
import java.lang.CharSequence;
import p.tj2;
import p.xe7;
import p.oj;
import p.kf6;
import p.lj2;

public class qj extends f	// class@0023b7 from classes.dex
{
    public pj H;

    public void qj(){
       super();
    }
    public final void onAttach(Context p0){
       super.onAttach(p0);
       Fragment parentFragme = this.getParentFragment();
       if (parentFragme instanceof pj) {
       }else {
          parentFragme = this.getActivity();
          if (parentFragme instanceof pj) {
          }else {
             parentFragme = null;
          }
       }
       this.H = parentFragme;
       return;
    }
    public final void onDismiss(DialogInterface p0){
       qj tH;
       super.onDismiss(p0);
       if ((tH = this.H) != null) {
          rj b = tH.b;
          b.getClass();
          jp3 ojp3 = LitePageView.i();
          ojp3.d("exit");
          ojp3.c("lite/app-rater");
          ojp3.e("spotify:app-rater");
          b.a.a(ojp3.build());
       }
       return;
    }
    public final Dialog x(Bundle p0){
       ApplicationInfo labelRes;
       String str;
       ApplicationInfo applicationI = this.requireContext().getApplicationInfo();
       if ((labelRes = applicationI.labelRes) != null) {
          str = this.getString(labelRes);
       }else if((applicationI = applicationI.nonLocalizedLabel) != null){
          str = applicationI.toString();
       }else {
          str = null;
       }
       Object[] objArray = new Object[]{str};
       Object[] objArray1 = new Object[]{str};
       tj2 otj2 = xe7.k0(this.requireContext(), this.getString(R.string.app_rater_dialog_title, objArray), this.getString(R.string.app_rater_dialog_body, objArray1));
       otj2.b = this.getString(R.string.app_rater_dialog_negative);
       otj2.d = new oj(this, 0);
       otj2.a = this.getString(R.string.app_rater_dialog_positive);
       otj2.c = new oj(this, 1);
       return otj2.a().c;
    }
}
