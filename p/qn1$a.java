package p.qn1$a;
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

public final class qn1$a extends f	// class@0023d4 from classes.dex
{
    public static final int H;

    public void qn1$a(){
       super();
    }
    public final Dialog x(Bundle p0){
       tj2 otj2 = xe7.k0(this.requireContext(), this.getString(R.string.explicit_content_dialog_title), this.getString(R.string.explicit_content_dialog_subtitle));
       otj2.a = this.getString(R.string.explicit_content_dialog_action);
       otj2.c = new ba1(2, this);
       otj2.b = this.getString(R.string.explicit_content_dialog_dismiss);
       otj2.d = null;
       return otj2.a().c;
    }
}
