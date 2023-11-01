package p.a11;
import android.widget.Filter;
import p.z01;
import java.lang.Object;
import java.lang.CharSequence;
import android.database.Cursor;
import p.uv6;
import java.lang.String;
import android.widget.Filter$FilterResults;
import java.lang.Class;
import android.view.View;
import android.app.SearchableInfo;
import p.y01;

public final class a11 extends Filter	// class@000ef0 from classes.dex
{
    public final z01 a;

    public void a11(z01 p0){
       super();
       this.a = p0;
    }
    public final CharSequence convertResultToString(Object p0){
       return this.a.c(p0);
    }
    public final Filter$FilterResults performFiltering(CharSequence p0){
       String str;
       Cursor uCursor;
       a11 ta = this.a;
       if (p0 == null) {
          str = "";
       }else {
          ta.getClass();
          str = p0.toString();
       }
       try{
          uv6 b = ta.B;
          if (!b.getVisibility() && (!b.getWindowVisibility() && (uCursor = ta.g(ta.C, str)) != null)) {
             uCursor.getCount();
          label_002e :
             Filter$FilterResults uFilterResul = new Filter$FilterResults();
             if (uCursor != null) {
                uFilterResul.count = uCursor.getCount();
                uFilterResul.values = uCursor;
             }else {
                uFilterResul.count = 0;
                uFilterResul.values = 0;
             }
             return uFilterResul;
          }
       }catch(java.lang.RuntimeException e0){
       }
       uCursor = null;
       goto label_002e ;
    }
    public final void publishResults(CharSequence p0,Filter$FilterResults p1){
       a11 ta = this.a;
       y01 c = ta.c;
       if ((p1 = p1.values) != null && p1 != c) {
          ta.b(p1);
       }
       return;
    }
}
