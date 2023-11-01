package p.ty;
import androidx.fragment.app.f;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.co5;
import androidx.fragment.app.Fragment;
import p.ej4;
import android.os.Bundle;
import android.view.Window;
import android.app.Dialog;
import android.view.View;

public abstract class ty extends f	// class@00280c from classes.dex
{

    public void ty(){
       super();
    }
    public void onAttach(Context p0){
       co5.o(p0, "context");
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.z(0, R.style.Lyrics.Fullscreen);
    }
    public void onStart(){
       f tC;
       super.onStart();
       Window window = ((tC = this.C) != null)? tC.getWindow(): null;
       if (window != null) {
          window.setLayout(-1, -1);
          window.getDecorView().setSystemUiVisibility(1796);
          window.clearFlags(2);
          window.setWindowAnimations(R.style.DialogNoAnimation);
       }
       return;
    }
}
