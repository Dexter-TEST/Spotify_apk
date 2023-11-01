package p.zl3;
import android.widget.ListView;
import android.widget.AbsListView;

public abstract class zl3	// class@002f1c from classes.dex
{

    public static boolean a(ListView p0,int p1){
       return p0.canScrollList(p1);
    }
    public static void b(ListView p0,int p1){
       p0.scrollListBy(p1);
    }
}
