package p.vh7;
import java.util.ArrayList;
import java.lang.Object;
import android.view.View;
import p.tp2;
import java.util.WeakHashMap;
import android.view.ViewGroup;

public final class vh7	// class@0029f9 from classes.dex
{
    public WeakHashMap a;
    public SparseArray b;
    public WeakReference c;
    public static final ArrayList d;

    static {
       vh7.d = new ArrayList();
    }
    public void vh7(){
       super();
       this.a = null;
       this.b = null;
       this.c = null;
    }
    public static void b(View p0){
       ArrayList tag;
       int i;
       if ((tag = p0.getTag(R.id.tag_unhandled_key_listeners)) == null || (i = tag.size() - 1) < 0) {
          return;
       }
       tp2.v(tag.get(i));
       throw null;
    }
    public final View a(View p0){
       vh7 ta;
       View view;
       if ((ta = this.a) != null && ta.containsKey(p0)) {
          if (p0 instanceof ViewGroup) {
             ViewGroup viewGroup = p0;
             int childCount = viewGroup.getChildCount();
             while (true) {
                if ((childCount = childCount - 1) >= 0) {
                   if ((view = this.a(viewGroup.getChildAt(childCount))) != null) {
                      return view;
                   }
                   continue ;
                }
             }
          }
          vh7.b(p0);
       }
       return null;
    }
}
