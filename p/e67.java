package p.e67;
import p.b74;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import java.lang.Float;
import p.r80;
import p.e64;
import p.f67;
import p.p67;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ActionMenuView;
import p.w5;
import p.v64;
import p.if6;
import android.view.Menu;
import android.view.Window$Callback;
import java.lang.StringBuilder;
import p.kg4;

public final class e67 implements b74	// class@00142c from classes.dex
{
    public final int a;
    public boolean b;
    public Object c;

    public void e67(){
       this.a = 6;
       super();
    }
    public void e67(int p0,Object p1,boolean p2){
       this.a = p0;
       this.c = p1;
       this.b = p2;
       super();
    }
    public void e67(Object p0){
       this.a = 0;
       this.c = p0;
       super();
    }
    public void e67(String p0,boolean p1){
       this.a = 1;
       super();
       this.b = p1;
       this.c = p0;
    }
    public static e67 a(Context p0){
       int intExtra;
       BroadcastReceiver uBroadcastRe = null;
       Intent intent = p0.registerReceiver(uBroadcastRe, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
       boolean b = false;
       if (intent != null) {
          if ((intExtra = intent.getIntExtra("status", -1)) != -1 && (intExtra == 2 || intExtra == 5)) {
             b = true;
          }
          intExtra = intent.getIntExtra("level", -1);
          int intExtra1 = intent.getIntExtra("scale", -1);
          if (intExtra != -1 && intExtra1 != -1) {
             uBroadcastRe = Float.valueOf(((float)intExtra / (float)intExtra1));
          }
       }
       return new e67(5, uBroadcastRe, b);
    }
    public static e67 d(r80 p0,int p1){
       int i2;
       e67 uoe67 = new e67();
       int[] ointArray = new int[p1];
       uoe67.c = ointArray;
       ointArray = 8;
       int i = 8;
       for (int i1 = 0; i1 < p1; i1 = i1 + 1) {
          if (ointArray) {
             i2 = p0.e("deltaScale") + i;
             i2 = i2 + 256;
             i2 = i2 % 256;
             boolean b = (!i1 && !i2)? true: false;
             uoe67.b = b;
          }
          e67 c = uoe67.c;
          if (i2) {
             i = i2;
          }
          c[i1] = i;
       }
       return uoe67;
    }
    public final void b(e64 p0,boolean p1){
       Toolbar a;
       ActionMenuView k;
       w5 k1;
       if (this.b != null) {
          return;
       }
       this.b = true;
       if ((a = this.c.F.a.a) != null && (k = a.K) != null) {
          k.c();
          if ((k1 = k.K) != null && k1.b()) {
             k1.j.dismiss();
          }
       }
       this.c.G.onPanelClosed(108, p0);
       this.b = false;
       return;
    }
    public final int c(){
       if (this.b != null) {
          e67 tc = this.c;
          if (tc != null) {
             if (((double)tc.floatValue() - 0x3fefae147ae147ae) < 0) {
                return 2;
             }else {
                return 3;
             }
          }
       }
       return 1;
    }
    public final boolean p(e64 p0){
       this.c.G.onMenuOpened(108, p0);
       return true;
    }
    public final String toString(){
       switch (this.a){
           case 6:
           default:
             return super.toString();
       }
       return kg4.p("ScalingList{scalingList="+this.c+", useDefaultScalingMatrixFlag=", this.b, '}');
    }
}
