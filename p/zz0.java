package p.zz0;
import p.ir0;
import p.b01;
import java.lang.Object;
import p.l51;
import p.z4;
import android.view.View;
import p.ss;
import java.lang.Throwable;
import java.lang.String;
import com.spotify.base.java.logging.Logger;
import p.i77;
import p.rv;
import p.ym6;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import p.xj0;
import android.os.Bundle;
import android.os.BaseBundle;
import java.lang.NullPointerException;
import androidx.fragment.app.k;
import p.et0;
import p.jc7;
import android.widget.EditText;
import p.xe7;
import java.lang.Class;

public final class zz0 implements ir0	// class@002f93 from classes.dex
{
    public final int a;
    public final b01 b;

    public void zz0(b01 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       Object[] objArray;
       int i = 0x7f120105;
       String str = "Error creating playlist";
       int i1 = 0;
       zz0 tb = this.b;
       switch (this.a){
           case 0:
             et0.d(tb.getActivity());
             return;
           case 1:
             et0.d(tb.getActivity());
             return;
           case 2:
             xe7.B(tb.w);
             return;
           case 3:
             b01 z = tb.z;
             int i2 = (p0.a != null)? 0: 8;
             z.setVisibility(i2);
             l51 c = p0.c;
             if ((p0 = p0.b) != null) {
                objArray = new Object[i1];
                Logger.c(p0, str, objArray);
                tb.b.c(rv.a(i).l());
             }else if(c != null){
                p0 = c.c;
                if (!TextUtils.isEmpty(p0)) {
                   tb.startActivity(xj0.s(tb.requireContext(), p0));
                }
                p0 = tb.getArguments();
                String str1 = null;
                if (p0 != null) {
                   str1 = p0.getString("spotify.fragment.argument.TRACK_URI", str1);
                }
                if (str1 != null) {
                   p0 = tb.b;
                   Object[] objArray1 = new Object[]{c.a};
                   str1 = tb.getString(R.string.create_playlist_track_added_toast, objArray1);
                   i77 oi77 = new i77(10);
                   if (str1 != null) {
                      oi77.a = str1;
                      p0.c(oi77.l());
                   }else {
                      throw new NullPointerException("Null infoText");
                   }
                }
                et0.d(tb.getActivity());
             }
             return;
             break;
           default:
             tb.getClass();
             objArray = new Object[i1];
             Logger.c(p0, str, objArray);
             tb.b.c(rv.a(i).l());
             return;
       }
    }
}
