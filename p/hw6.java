package p.hw6;
import androidx.fragment.app.f;
import androidx.fragment.app.o;
import java.lang.String;
import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;
import android.os.Bundle;
import android.app.Dialog;
import android.app.AlertDialog$Builder;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import android.content.Context;
import android.app.AlertDialog;

public class hw6 extends f	// class@0018d8 from classes.dex
{
    public Dialog H;
    public DialogInterface$OnCancelListener I;
    public AlertDialog J;

    public void hw6(){
       super();
    }
    public final void B(o p0,String p1){
       super.B(p0, p1);
    }
    public final void onCancel(DialogInterface p0){
       hw6 tI;
       if ((tI = this.I) != null) {
          tI.onCancel(p0);
       }
       return;
    }
    public final Dialog x(Bundle p0){
       hw6 tH;
       if ((tH = this.H) == null) {
          this.y = false;
          if (this.J == null) {
             this.J = new AlertDialog$Builder(this.getActivity()).create();
          }
          tH = this.J;
       }
       return tH;
    }
}
