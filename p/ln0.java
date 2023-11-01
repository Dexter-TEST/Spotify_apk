package p.ln0;
import android.widget.CompoundButton;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;

public abstract class ln0	// class@001d85 from classes.dex
{

    public static ColorStateList a(CompoundButton p0){
       return p0.getButtonTintList();
    }
    public static PorterDuff$Mode b(CompoundButton p0){
       return p0.getButtonTintMode();
    }
    public static void c(CompoundButton p0,ColorStateList p1){
       p0.setButtonTintList(p1);
    }
    public static void d(CompoundButton p0,PorterDuff$Mode p1){
       p0.setButtonTintMode(p1);
    }
}
