package p.so0;
import androidx.fragment.app.f;
import android.os.Bundle;
import java.lang.String;
import android.os.BaseBundle;
import androidx.fragment.app.Fragment;
import android.content.Context;
import p.ro0;
import android.app.Dialog;
import java.lang.IllegalArgumentException;
import java.lang.CharSequence;
import p.tj2;
import p.xe7;
import p.qo0;
import p.kf6;
import p.lj2;

public class so0 extends f	// class@002667 from classes.dex
{
    public ro0 H;

    public void so0(){
       super();
    }
    public static so0 C(int p0,int p1,int p2,int p3,int p4){
       Bundle uBundle = new Bundle();
       uBundle.putInt("dialogId", p0);
       uBundle.putInt("title", p1);
       uBundle.putInt("body", p2);
       uBundle.putInt("positiveButton", p3);
       uBundle.putInt("negativeButton", p4);
       so0 oso0 = new so0();
       oso0.setArguments(uBundle);
       return oso0;
    }
    public final void onAttach(Context p0){
       super.onAttach(p0);
       this.H = p0;
    }
    public final Dialog x(Bundle p0){
       tj2 otj2;
       p0 = this.requireArguments();
       int i = 0;
       int intx = p0.getInt("title", i);
       int intx1 = p0.getInt("body", i);
       if (!intx && !intx1) {
          throw new IllegalArgumentException("Missing title and body");
       }
       int intx2 = p0.getInt("dialogId", i);
       int intx3 = p0.getInt("positiveButton", i);
       int intx4 = p0.getInt("negativeButton", i);
       Context uContext = this.requireContext();
       if (intx && intx1) {
          otj2 = xe7.k0(uContext, this.getString(intx), this.getString(intx1));
       }else if(intx){
          otj2 = xe7.j0(uContext, this.getString(intx));
       }else {
          otj2 = xe7.j0(uContext, this.getString(intx1));
       }
       if (intx3) {
          otj2.a = this.getText(intx3);
          otj2.c = new qo0(this, intx2);
       }
       if (intx4) {
          otj2.b = this.getText(intx4);
          otj2.d = null;
       }
       return otj2.a().c;
    }
}
