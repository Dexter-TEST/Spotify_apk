package p.a55;
import p.yp2;
import com.spotify.litesignup.phonesignup.view.OtpInputView;
import java.lang.Object;
import com.spotify.litesignup.phonesignup.view.HiddenOtpEditText;
import java.lang.String;
import p.co5;

public final class a55 implements yp2	// class@000f19 from classes.dex
{
    public final OtpInputView a;

    public void a55(OtpInputView p0){
       this.a = p0;
       super();
    }
    public boolean a(HiddenOtpEditText p0){
       OtpInputView z;
       boolean b;
       co5.o(p0, "view");
       a55 ta = this.a;
       if ((z = ta.z) < null) {
          b = false;
       }else if(co5.c(ta.c(z), " ")){
          if ((z = ta.z) > null) {
             ta.a((z - 1));
             ta.e(ta.z, " ");
          }
       }else {
          ta.e(ta.z, " ");
       }
       b = true;
       return b;
    }
}
