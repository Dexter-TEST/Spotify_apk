package p.y60;
import p.ir0;
import p.z60;
import java.lang.Object;
import p.jc7;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.String;
import android.content.Intent;
import p.xj0;

public final class y60 implements ir0	// class@002d56 from classes.dex
{
    public final int a;
    public final z60 b;

    public void y60(z60 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       y60 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.startActivity(xj0.s(tb.getContext(), p0));
             return;
       }
       tb.startActivity(xj0.s(tb.getContext(), "spotify:search"));
       return;
    }
}
