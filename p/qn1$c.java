package p.qn1$c;
import androidx.fragment.app.f;
import android.os.Bundle;
import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.String;
import java.lang.CharSequence;
import p.tj2;
import p.xe7;
import p.kf6;
import p.lj2;

public final class qn1$c extends f	// class@0023d6 from classes.dex
{

    public void qn1$c(){
       super();
    }
    public final Dialog x(Bundle p0){
       tj2 otj2 = xe7.k0(this.requireContext(), this.getString(R.string.entity_play_offline_title), this.getString(R.string.entity_play_offline_message));
       otj2.a = this.getString(R.string.entity_play_offline_button_positive);
       otj2.c = null;
       return otj2.a().c;
    }
}
