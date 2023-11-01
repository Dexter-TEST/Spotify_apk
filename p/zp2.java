package p.zp2;
import android.view.inputmethod.InputConnectionWrapper;
import com.spotify.litesignup.phonesignup.view.HiddenOtpEditText;
import android.view.inputmethod.InputConnection;
import p.a55;
import android.view.KeyEvent;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Class;

public final class zp2 extends InputConnectionWrapper	// class@002f3e from classes.dex
{
    public final HiddenOtpEditText a;

    public void zp2(HiddenOtpEditText p0,InputConnection p1){
       this.a = p0;
       super(p1, true);
    }
    public final boolean deleteSurroundingText(int p0,int p1){
       HiddenOtpEditText x;
       zp2 ta = this.a;
       if ((x = ta.x) == null || p0 <= 0) {
          return false;
       }
       if (x != null) {
          x.a(ta);
       }
       return true;
    }
    public final boolean sendKeyEvent(KeyEvent p0){
       boolean b;
       HiddenOtpEditText x;
       co5.o(p0, "event");
       if (!p0.getAction()) {
          zp2 ta = this.a;
          if (p0.getKeyCode() != 67) {
             ta.getClass();
          }else if((x = ta.x) != null){
             b = x.a(ta);
          label_0027 :
             if (b) {
                return true;
             }
          }
          b = false;
          goto label_0027 ;
       }
       return super.sendKeyEvent(p0);
    }
}
