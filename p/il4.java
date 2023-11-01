package p.il4;
import java.lang.Runnable;
import androidx.fragment.app.k;
import p.tl4;
import java.lang.Object;
import android.app.Activity;
import p.tl6;
import android.os.Bundle;
import java.lang.String;
import android.os.BaseBundle;
import androidx.fragment.app.Fragment;
import p.ae2;
import androidx.fragment.app.o;
import androidx.fragment.app.f;

public final class il4 implements Runnable	// class@0019b8 from classes.dex
{
    public final int a;
    public final k b;
    public final tl4 c;

    public void il4(k p0,tl4 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       il4 tc = this.c;
       il4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tl6 otl6 = new tl6();
             Bundle uBundle = new Bundle();
             uBundle.putString("uri", tc.P);
             otl6.setArguments(uBundle);
             otl6.B(tb.y(), "sleepTimerMenu");
             return;
       }
       tb.runOnUiThread(new il4(tb, tc, 1));
       return;
    }
}
