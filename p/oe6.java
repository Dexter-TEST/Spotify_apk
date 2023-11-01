package p.oe6;
import java.lang.Runnable;
import p.pe6;
import java.lang.String;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import p.ee6;
import p.co5;
import p.fe6;
import java.lang.CharSequence;

public final class oe6 implements Runnable	// class@002106 from classes.dex
{
    public final pe6 a;
    public final String b;
    public final String c;
    public final String t;
    public final String v;
    public final Context w;
    public final String x;
    public final Intent y;

    public void oe6(pe6 p0,String p1,String p2,String p3,String p4,Context p5,String p6,Intent p7){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
       this.y = p7;
    }
    public final void run(){
       oe6 ta = this.a;
       ta.getClass();
       oe6 tw = this.w;
       String str = tw.getString(R.string.share_integration_id_lite);
       oe6 tb = this.b;
       co5.o(tb, "entityUri");
       oe6 tc = this.c;
       co5.o(tc, "shareId");
       oe6 tt = this.t;
       co5.o(tt, "sourcePageUri");
       oe6 tv = this.v;
       co5.o(tv, "sourcePage");
       co5.o(str, "integrationId");
       oe6 tx = this.x;
       co5.o(tx, "shareUrl");
       ee6 v12 = new ee6(tb, "overflow-menu", "message", tc, tt, tv, str, tx, null, 3840);
       ta.b.a(v12);
       tw.startActivity(Intent.createChooser(this.y, tw.getText(R.string.share_chooser)));
    }
}
