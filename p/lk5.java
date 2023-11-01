package p.lk5;
import java.util.Comparator;
import java.lang.Object;
import p.kr6;
import com.google.android.material.button.MaterialButton;
import java.lang.Boolean;
import android.view.View;
import com.google.android.material.button.MaterialButtonToggleGroup;
import android.view.ViewGroup;
import java.lang.Integer;
import p.u65;
import java.lang.Float;
import p.fn6;
import java.lang.String;
import java.lang.Comparable;
import p.ej4;

public final class lk5 implements Comparator	// class@001d70 from classes.dex
{
    public final int a;
    public final Object b;

    public void lk5(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final int compare(Object p0,Object p1){
       int i3;
       lk5 tb = this.b;
       int i = 0;
       switch (this.a){
           case 0:
             p0 = p0.b;
             p1 = p1.b;
             break;
           case 1:
             int i1 = p0[i];
             int i2 = p1[i];
             break;
           case 2:
             float f = p0.b.floatValue();
             float f1 = p1.b.floatValue();
             if ((f - f1) > 0) {
                i = 1;
             }else if((f1 - f) > 0){
                i = -1;
             }
             return i;
             break;
           case 3:
             if (!(i3 = Boolean.valueOf(p0.isChecked()).compareTo(Boolean.valueOf(p1.isChecked()))) && !(i3 = Boolean.valueOf(p0.isPressed()).compareTo(Boolean.valueOf(p1.isPressed())))) {
                i3 = Integer.valueOf(tb.indexOfChild(p0)).compareTo(Integer.valueOf(tb.indexOfChild(p1)));
             }
             return i3;
             break;
           case 4:
             p0 = p0.d;
             p1 = p1.d;
             break;
           default:
             if (!(i3 = tb.compare(p0, p1))) {
                i3 = ej4.n(p0, p1);
             }
             return i3;
       }
       return (p0 - p1);
    }
}
