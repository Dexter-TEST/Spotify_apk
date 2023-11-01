package p.l5;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.s70;
import android.view.View;
import android.content.res.ColorStateList;
import p.n6;
import p.wh7;
import java.lang.Enum;
import p.cd2;
import android.widget.TextView;
import p.vv7;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import java.lang.IllegalStateException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p.eb3;
import android.content.res.TypedArray;

public abstract class l5 extends StateListAnimatorButton	// class@001cec from classes.dex
{
    public final AttributeSet w;
    public final int x;
    public final int y;

    public void l5(Context p0,AttributeSet p1,int p2,int p3){
       co5.o(p0, "context");
       super(p0, p1, p2);
       this.w = p1;
       this.x = p2;
       this.y = p3;
    }
    private final void setAppearance(s70 p0){
       int i = -1;
       if (this.getBtnTintList$src_main_java_com_spotify_encoremobile_buttons_buttons_kt() != i) {
          wh7.q(this, n6.c(this.getContext(), this.getBtnTintList$src_main_java_com_spotify_encoremobile_buttons_buttons_kt()));
       }
       int i1 = p0.ordinal();
       boolean b = true;
       if (i1) {
          if (i1 == b) {
             i1 = 0x7f13026b;
          }else {
             throw new cd2(10);
          }
       }else {
          i1 = 0x7f130261;
       }
       vv7.Q(this, i1);
       if (this.getTextTintList$src_main_java_com_spotify_encoremobile_buttons_buttons_kt() != i) {
          this.setTextColor(n6.c(this.getContext(), this.getTextTintList$src_main_java_com_spotify_encoremobile_buttons_buttons_kt()));
       }else if(this.getTextColorAttr$src_main_java_com_spotify_encoremobile_buttons_buttons_kt() != i){
          TypedValue typedValue = new TypedValue();
          this.getContext().getTheme().resolveAttribute(this.getTextColorAttr$src_main_java_com_spotify_encoremobile_buttons_buttons_kt(), typedValue, b);
          this.setTextColor(typedValue.data);
       }else {
          throw new IllegalStateException("Either textTintList or textColorAttr must be defined".toString());
       }
       return;
    }
    private final void setButtonSize(s70 p0){
       this.setDimensions(p0);
       this.setAppearance(p0);
    }
    private final void setDimensions(s70 p0){
       int i;
       int i1;
       Resources resources = this.getContext().getResources();
       if (i = p0.ordinal()) {
          if (i == 1) {
             i = 0x7f060109;
          }else {
             throw new cd2(10);
          }
       }else {
          i = 0x7f060108;
       }
       this.setMinimumHeight(resources.getDimensionPixelSize(i));
       resources = this.getContext().getResources();
       if (i1 = p0.ordinal()) {
          if (i1 == 1) {
             i1 = 0x7f06010b;
          }else {
             throw new cd2(10);
          }
       }else {
          i1 = 0x7f06010a;
       }
       this.setPadding(resources.getDimensionPixelSize(i1), 0, resources.getDimensionPixelSize(i1), 0);
       return;
    }
    public abstract int getActionButtonBackground$src_main_java_com_spotify_encoremobile_buttons_buttons_kt();
    public abstract int getBtnTintList$src_main_java_com_spotify_encoremobile_buttons_buttons_kt();
    public abstract int getTextColorAttr$src_main_java_com_spotify_encoremobile_buttons_buttons_kt();
    public abstract int getTextTintList$src_main_java_com_spotify_encoremobile_buttons_buttons_kt();
    public final void k(){
       this.setGravity(17);
       this.setSingleLine(true);
       this.setBackground(eb3.m(this.getContext(), this.getActionButtonBackground$src_main_java_com_spotify_encoremobile_buttons_buttons_kt()));
       Context context = this.getContext();
       co5.l(context, "context");
       TypedArray typedArray = context.obtainStyledAttributes(this.w, co5.p, this.x, this.y);
       co5.l(typedArray, "obtainStyledAttributes\(s…efStyleAttr, defStyleRes\)");
       this.setButtonSize(s70.values()[typedArray.getInt(0, 0)]);
       typedArray.recycle();
    }
}
