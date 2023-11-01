package p.o8;
import android.view.ContextThemeWrapper;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import android.view.LayoutInflater;

public final class o8	// class@0020d1 from classes.dex
{
    public final Context a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public DialogInterface$OnKeyListener f;
    public ListAdapter g;
    public DialogInterface$OnClickListener h;
    public boolean i;
    public int j;

    public void o8(ContextThemeWrapper p0){
       super();
       this.j = -1;
       this.a = p0;
       this.b = p0.getSystemService("layout_inflater");
    }
}
