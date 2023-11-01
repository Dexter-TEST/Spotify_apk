package p.b70;
import p.zk2;
import android.content.Context;
import android.view.ViewGroup;
import p.a70;
import java.lang.Object;
import p.jk2;
import android.view.ViewGroup$LayoutParams;
import com.spotify.legacyglue.pasteview.PasteViewLayoutParamHelper;
import android.view.View;
import p.ry7;
import p.kp2;
import p.hk2;
import java.lang.Class;

public final class b70 implements zk2	// class@001067 from classes.dex
{
    public final jk2 a;
    public final a70 b;
    public final kp2 c;

    public void b70(Context p0,ViewGroup p1,a70 p2){
       super();
       jk2 ojk2 = new jk2(p0);
       this.a = ojk2;
       ojk2.setLayoutParams(PasteViewLayoutParamHelper.generateMatchParentLayoutParams(p0, p1));
       ojk2.setContentTopMargin(ry7.F(p0));
       kp2 okp2 = new kp2(p0, ojk2);
       this.c = okp2;
       ojk2.setContentViewBinder(okp2);
       p2.getClass();
       this.b = p2;
    }
    public final View getView(){
       return this.a;
    }
}
