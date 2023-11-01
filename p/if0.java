package p.if0;
import android.view.ViewGroup$OnHierarchyChangeListener;
import com.google.android.material.chip.ChipGroup;
import java.lang.Object;
import android.view.View;
import com.google.android.material.chip.Chip;
import p.wh7;
import p.eh7;
import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;

public final class if0 implements ViewGroup$OnHierarchyChangeListener	// class@00197e from classes.dex
{
    public ViewGroup$OnHierarchyChangeListener a;
    public final ChipGroup b;

    public void if0(ChipGroup p0){
       this.b = p0;
       super();
    }
    public final void onChildViewAdded(View p0,View p1){
       if0 tb = this.b;
       if (p0 == tb && p1 instanceof Chip) {
          if (p1.getId() == -1) {
             p1.setId(eh7.a());
          }
          CompoundButton uCompoundBut = p1;
          if (uCompoundBut.isChecked()) {
             p0.b(uCompoundBut.getId());
          }
          uCompoundBut.setOnCheckedChangeListenerInternal(tb.z);
       }
       if ((tb = this.a) != null) {
          tb.onChildViewAdded(p0, p1);
       }
       return;
    }
    public final void onChildViewRemoved(View p0,View p1){
       if0 ta;
       if (p0 == this.b && p1 instanceof Chip) {
          p1.setOnCheckedChangeListenerInternal(null);
       }
       if ((ta = this.a) != null) {
          ta.onChildViewRemoved(p0, p1);
       }
       return;
    }
}
