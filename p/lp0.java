package p.lp0;
import android.view.View$OnClickListener;
import p.mp0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import android.content.Intent;
import java.lang.String;
import androidx.fragment.app.Fragment;
import android.content.Context;
import p.xj0;

public final class lp0 implements View$OnClickListener	// class@001d96 from classes.dex
{
    public final int a;
    public final mp0 b;

    public void lp0(mp0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       lp0 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.startActivity(xj0.z0(tb.requireContext(), "spotify.intent.action.OFFLINE_MODE_SETTINGS"));
             return;
       }
       tb.getClass();
       tb.startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
       return;
    }
}
