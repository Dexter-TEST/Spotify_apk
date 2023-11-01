package p.vf2;
import java.lang.Object;
import android.text.SpannableStringBuilder;
import java.util.Random;
import java.util.ArrayList;
import p.im0;
import p.bm0;
import p.am0;
import android.content.Context;
import android.text.SpannableString;
import p.n6;
import java.lang.CharSequence;
import android.text.style.ForegroundColorSpan;
import java.util.Iterator;
import p.wf2;

public final class vf2	// class@0029e2 from classes.dex
{
    public final ArrayList a;
    public boolean b;
    public boolean c;
    public int d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;

    public void vf2(){
       super();
       this.e = new SpannableStringBuilder();
       this.f = new Random();
       this.a = new ArrayList();
       this.g = new ArrayList();
    }
    public void vf2(im0 p0,bm0 p1){
       super();
       this.e = p0;
       this.f = p1;
       this.g = new Object();
       this.a = new ArrayList();
       this.h = new am0(3, this);
    }
    public static SpannableString b(Context p0){
       SpannableString spannableStr = new SpannableString("  •  ");
       spannableStr.setSpan(new ForegroundColorSpan(n6.b(p0, R.color.gray_70)), 0, spannableStr.length(), 33);
       return spannableStr;
    }
    public final void a(){
       vf2 tg = this.g;
       _monitor_enter(tg);
       this.c = true;
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().invoke();
       }
       this.a.clear();
       _monitor_exit(tg);
       return;
    }
}
