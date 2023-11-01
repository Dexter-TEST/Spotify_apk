package p.sg;
import android.widget.ImageButton;
import android.content.Context;
import android.util.AttributeSet;
import p.d57;
import android.view.View;
import p.n37;
import p.if;
import p.tg;
import android.widget.ImageView;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import p.e57;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.Bitmap;
import android.net.Uri;

public class sg extends ImageButton	// class@002627 from classes.dex
{
    private final if a;
    private final tg b;
    public boolean c;

    public void sg(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f0302ec);
    }
    public void sg(Context p0,AttributeSet p1,int p2){
       d57.a(p0);
       super(p0, p1, p2);
       this.c = false;
       n37.a(this.getContext(), this);
       if oif = new if(this);
       this.a = oif;
       oif.d(p1, p2);
       tg otg = new tg(this);
       this.b = otg;
       otg.b(p1, p2);
    }
    public final void drawableStateChanged(){
       sg ta;
       super.drawableStateChanged();
       if ((ta = this.a) != null) {
          ta.a();
       }
       if ((ta = this.b) != null) {
          ta.a();
       }
       return;
    }
    public ColorStateList getSupportBackgroundTintList(){
       sg ta;
       ColorStateList uColorStateL = ((ta = this.a) != null)? ta.b(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       sg ta;
       PorterDuff$Mode mode = ((ta = this.a) != null)? ta.c(): null;
       return mode;
    }
    public ColorStateList getSupportImageTintList(){
       tg b;
       sg tb = this.b;
       ColorStateList uColorStateL = null;
       if (tb != null && (b = tb.b) != null) {
          uColorStateL = b.c;
       }
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportImageTintMode(){
       tg b;
       sg tb = this.b;
       PorterDuff$Mode mode = null;
       if (tb != null && (b = tb.b) != null) {
          mode = b.d;
       }
       return mode;
    }
    public final boolean hasOverlappingRendering(){
       int i = 1;
       if (!((this.b.a.getBackground() instanceof RippleDrawable ^ i)) || !super.hasOverlappingRendering()) {
          i = false;
       }
       return i;
    }
    public void setBackgroundDrawable(Drawable p0){
       sg ta;
       super.setBackgroundDrawable(p0);
       if ((ta = this.a) != null) {
          ta.e();
       }
       return;
    }
    public void setBackgroundResource(int p0){
       sg ta;
       super.setBackgroundResource(p0);
       if ((ta = this.a) != null) {
          ta.f(p0);
       }
       return;
    }
    public void setImageBitmap(Bitmap p0){
       sg tb;
       super.setImageBitmap(p0);
       if ((tb = this.b) != null) {
          tb.a();
       }
       return;
    }
    public void setImageDrawable(Drawable p0){
       sg tb;
       sg tb1;
       if ((tb = this.b) != null && (p0 != null && this.c == null)) {
          tb.d = p0.getLevel();
       }
       super.setImageDrawable(p0);
       if ((tb1 = this.b) != null) {
          tb1.a();
          if (this.c == null) {
             tb1 = this.b;
             tg a = tb1.a;
             if (a.getDrawable() != null) {
                a.getDrawable().setLevel(tb1.d);
             }
          }
       }
       return;
    }
    public void setImageLevel(int p0){
       super.setImageLevel(p0);
       this.c = true;
    }
    public void setImageResource(int p0){
       this.b.c(p0);
    }
    public void setImageURI(Uri p0){
       sg tb;
       super.setImageURI(p0);
       if ((tb = this.b) != null) {
          tb.a();
       }
       return;
    }
    public void setSupportBackgroundTintList(ColorStateList p0){
       sg ta;
       if ((ta = this.a) != null) {
          ta.h(p0);
       }
       return;
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       sg ta;
       if ((ta = this.a) != null) {
          ta.i(p0);
       }
       return;
    }
    public void setSupportImageTintList(ColorStateList p0){
       sg tb;
       if ((tb = this.b) != null) {
          if (tb.b == null) {
             tb.b = new e57();
          }
          tg b = tb.b;
          b.c = p0;
          b.b = true;
          tb.a();
       }
       return;
    }
    public void setSupportImageTintMode(PorterDuff$Mode p0){
       sg tb;
       if ((tb = this.b) != null) {
          if (tb.b == null) {
             tb.b = new e57();
          }
          tg b = tb.b;
          b.d = p0;
          b.a = true;
          tb.a();
       }
       return;
    }
}
