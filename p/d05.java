package p.d05;
import android.content.DialogInterface$OnClickListener;
import p.g05;
import android.os.Bundle;
import java.lang.Object;
import android.content.DialogInterface;
import p.f05;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import java.lang.String;
import android.os.BaseBundle;

public final class d05 implements DialogInterface$OnClickListener	// class@0012b3 from classes.dex
{
    public final int a;
    public final g05 b;
    public final Bundle c;

    public void d05(g05 p0,Bundle p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       Fragment parentFragme;
       k activity;
       e05 o = f05.o;
       d05 tc = this.c;
       d05 tb = this.b;
       switch (this.a){
           case 0:
             parentFragme = tb.getParentFragment();
             if (parentFragme instanceof f05) {
                o = parentFragme;
             }else {
                activity = tb.getActivity();
                if (activity instanceof f05) {
                   o = activity;
                }
             }
             break;
           default:
             parentFragme = tb.getParentFragment();
             if (parentFragme instanceof f05) {
                o = parentFragme;
             }else {
                activity = tb.getActivity();
                if (activity instanceof f05) {
                   o = activity;
                }
             }
             tc.getInt("returnCode");
             o.m();
             return;
       }
       o.f(tc.getInt("returnCode"));
       return;
    }
}
