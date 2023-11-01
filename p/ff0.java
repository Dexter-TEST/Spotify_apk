package p.ff0;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.google.android.material.chip.ChipGroup;
import java.lang.Object;
import android.widget.CompoundButton;
import java.util.List;
import android.view.View;

public final class ff0 implements CompoundButton$OnCheckedChangeListener	// class@0015b4 from classes.dex
{
    public final ChipGroup a;

    public void ff0(ChipGroup p0){
       this.a = p0;
       super();
    }
    public final void onCheckedChanged(CompoundButton p0,boolean p1){
       ChipGroup b;
       ff0 ta = this.a;
       if (ta.C != null) {
          return;
       }
       if (ta.getCheckedChipIds().isEmpty() && ta.y != null) {
          ta.c(p0.getId(), true);
          ta.B = p0.getId();
          return;
       }else {
          int id = p0.getId();
          int i = -1;
          if (p1) {
             if ((b = ta.B) != i && (b != id && ta.x != null)) {
                ta.c(b, false);
             }
             ChipGroup.a(ta, id);
          }else if(ta.B == id){
             ChipGroup.a(ta, i);
          }
          return;
       }
    }
}
