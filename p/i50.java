package p.i50;
import p.mg;
import androidx.fragment.app.f;
import p.h50;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.os.Bundle;
import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.Fragment;

public class i50 extends mg	// class@001926 from classes.dex
{
    public static final int H;

    public void i50(){
       super();
    }
    public final void u(){
       f tC = this.C;
       if (tC instanceof h50) {
          if (tC.w == null) {
             tC.g();
          }
          BottomSheetBehavior d = tC.w.D;
       }
       this.v(false, false);
       return;
    }
    public final Dialog x(Bundle p0){
       return new h50(this.getContext(), this.w());
    }
}
