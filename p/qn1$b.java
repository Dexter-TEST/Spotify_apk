package p.qn1$b;
import androidx.fragment.app.f;
import android.os.Bundle;
import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.String;
import java.lang.CharSequence;
import p.tj2;
import p.xe7;
import p.ba1;
import java.lang.Object;
import p.kf6;
import p.lj2;

public final class qn1$b extends f	// class@0023d5 from classes.dex
{
    public static final int H;

    public void qn1$b(){
       super();
    }
    public final Dialog x(Bundle p0){
       tj2 otj2 = xe7.k0(this.requireContext(), this.getString(R.string.entity_play_forced_offline_title), this.getString(R.string.entity_play_forced_offline_message));
       otj2.a = this.getString(R.string.entity_play_forced_offline_button_positive);
       otj2.c = new ba1(3, this);
       otj2.b = this.getString(R.string.entity_play_forced_offline_button_negative);
       otj2.d = null;
       return otj2.a().c;
    }
}
