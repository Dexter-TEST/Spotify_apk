package p.po1;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;
import android.os.Bundle;
import android.app.Dialog;
import android.app.AlertDialog$Builder;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.app.AlertDialog;
import android.app.FragmentManager;
import java.lang.String;

public final class po1 extends DialogFragment	// class@00229b from classes.dex
{
    public Dialog a;
    public DialogInterface$OnCancelListener b;
    public AlertDialog c;

    public void po1(){
       super();
    }
    public final void onCancel(DialogInterface p0){
       po1 tb;
       if ((tb = this.b) != null) {
          tb.onCancel(p0);
       }
       return;
    }
    public final Dialog onCreateDialog(Bundle p0){
       po1 ta;
       if ((ta = this.a) == null) {
          this.setShowsDialog(false);
          if (this.c == null) {
             this.c = new AlertDialog$Builder(this.getActivity()).create();
          }
          ta = this.c;
       }
       return ta;
    }
    public final void show(FragmentManager p0,String p1){
       super.show(p0, p1);
    }
}
