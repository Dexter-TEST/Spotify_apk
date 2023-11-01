package p.ru3;
import androidx.fragment.app.f;
import android.os.Bundle;
import android.app.Dialog;
import java.lang.String;
import androidx.fragment.app.Fragment;
import p.qu3;
import android.content.Context;
import java.lang.CharSequence;
import p.tj2;
import p.xe7;
import p.pu3;
import p.kf6;
import p.lj2;

public class ru3 extends f	// class@00255d from classes.dex
{
    public static final int H;

    public void ru3(){
       super();
    }
    public final Dialog x(Bundle p0){
       f tC;
       String str = this.getString(R.string.login_region_mismatch_error_dialog_title);
       String str1 = this.getString(R.string.login_region_mismatch_error_dialog_body);
       Fragment parentFragme = this.getParentFragment();
       if (parentFragme instanceof qu3) {
       }else {
          parentFragme = null;
       }
       boolean b = false;
       this.x = b;
       if ((tC = this.C) != null) {
          tC.setCancelable(b);
       }
       tj2 otj2 = xe7.k0(this.requireContext(), str, str1);
       otj2.b = this.getString(R.string.login_region_mismatch_error_dialog_logout);
       otj2.d = new pu3(parentFragme, b);
       otj2.a = this.getString(R.string.login_region_mismatch_error_dialog_update_location);
       otj2.c = new pu3(parentFragme, 1);
       return otj2.a().c;
    }
}
