package p.ie;
import android.graphics.drawable.Animatable;
import p.fg7;
import android.content.Context;
import p.ee1;
import p.ge;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import p.ce1;
import android.graphics.Canvas;
import p.og7;
import android.animation.AnimatorSet;
import p.be1;
import java.lang.Class;
import java.lang.Object;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable$ConstantState;
import android.os.Build$VERSION;
import p.he;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import java.lang.String;
import p.tu6;
import android.content.res.TypedArray;
import p.ej4;
import android.graphics.drawable.Drawable$Callback;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import p.ry7;
import p.mg7;
import p.lg7;
import p.wh6;
import java.util.ArrayList;
import p.pk;
import android.content.res.Resources$NotFoundException;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.Throwable;
import java.lang.IllegalStateException;
import java.util.Collection;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.Rect;
import p.eb3;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;

public final class ie extends fg7 implements Animatable	// class@00197d from classes.dex
{
    public final ge b;
    public final Context c;
    public final ee1 t;

    public void ie(Context p0){
       super();
       ee1 uoee1 = new ee1(this);
       this.t = uoee1;
       this.c = p0;
       this.b = new ge(uoee1);
    }
    public final void applyTheme(Resources$Theme p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          ce1.a(ta, p0);
       }
       return;
    }
    public final boolean canApplyTheme(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ce1.b(ta);
       }
       return false;
    }
    public final void draw(Canvas p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.draw(p0);
          return;
       }else {
          ie tb = this.b;
          tb.a.draw(p0);
          if (tb.b.isStarted()) {
             this.invalidateSelf();
          }
          return;
       }
    }
    public final int getAlpha(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return be1.a(ta);
       }
       return this.b.a.getAlpha();
    }
    public final int getChangingConfigurations(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.getChangingConfigurations();
       }
       this.b.getClass();
       return (super.getChangingConfigurations() | 0x00);
    }
    public final ColorFilter getColorFilter(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ce1.c(ta);
       }
       return this.b.a.getColorFilter();
    }
    public final Drawable$ConstantState getConstantState(){
       if (this.a != null && Build$VERSION.SDK_INT >= 24) {
          return new he(this.a.getConstantState());
       }
       return null;
    }
    public final int getIntrinsicHeight(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.getIntrinsicHeight();
       }
       return this.b.a.getIntrinsicHeight();
    }
    public final int getIntrinsicWidth(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.getIntrinsicWidth();
       }
       return this.b.a.getIntrinsicWidth();
    }
    public final int getOpacity(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.getOpacity();
       }
       return this.b.a.getOpacity();
    }
    public final void inflate(Resources p0,XmlPullParser p1,AttributeSet p2){
       this.inflate(p0, p1, p2, null);
    }
    public final void inflate(Resources p0,XmlPullParser p1,AttributeSet p2,Resources$Theme p3){
       fg7 a;
       ie b;
       TypedArray typedArray;
       int resourceId;
       ge a1;
       ie c;
       Animator uAnimator;
       String str1;
       XmlResourceParser animation;
       StringBuilder str2;
       fg7 uofg7 = this;
       Resources resources = p0;
       AttributeSet uAttributeSe = p2;
       Resources$Theme theme = p3;
       if ((a = uofg7.a) != null) {
          ce1.d(a, resources, p1, uAttributeSe, theme);
          return;
       }else {
          int eventType = p1.getEventType();
          int i = 1;
          int i1 = p1.getDepth() + i;
          while (true) {
             b = uofg7.b;
             if (eventType != i && (p1.getDepth() >= i1 && eventType == 3)) {
                if (eventType == 2) {
                   String name = p1.getName();
                   int i2 = 0;
                   if ("animated-vector".equals(name)) {
                      typedArray = ej4.h0(resources, theme, uAttributeSe, tu6.v);
                      if (resourceId = typedArray.getResourceId(i2, i2)) {
                         og7 oog7 = og7.a(resources, resourceId, theme);
                         oog7.w = i2;
                         oog7.setCallback(uofg7.t);
                         if ((a1 = b.a) != null) {
                            a1.setCallback(null);
                         }
                         b.a = oog7;
                      }
                      typedArray.recycle();
                   }else if("target".equals(name)){
                      typedArray = resources.obtainAttributes(uAttributeSe, tu6.w);
                      String str = typedArray.getString(i2);
                      if (i2 = typedArray.getResourceId(i, i2)) {
                         if ((c = uofg7.c) != null) {
                            if (Build$VERSION.SDK_INT >= 24) {
                               uAnimator = AnimatorInflater.loadAnimator(c, i2);
                            }else {
                               Resources resources1 = c.getResources();
                               Resources$Theme theme1 = c.getTheme();
                               try{
                                  str1 = "Can\'t load animation resource ID #0x";
                                  animation = resources1.getAnimation(i2);
                                  try{
                                     AttributeSet uAttributeSe1 = Xml.asAttributeSet(animation);
                                     try{
                                        XmlResourceParser xmlResourceP = animation;
                                        uAnimator = ry7.k(c, resources1, theme1, xmlResourceP, uAttributeSe1, null, 0);
                                        animation.close();
                                     }catch(org.xmlpull.v1.XmlPullParserException e0){
                                     }catch(java.io.IOException e0){
                                     }
                                     int i3 = animation;
                                  }catch(org.xmlpull.v1.XmlPullParserException e0){
                                     str2 = str1;
                                  }catch(java.io.IOException e0){
                                     str2 = str1;
                                  }
                               }catch(org.xmlpull.v1.XmlPullParserException e0){
                                  str2 = str1;
                               }catch(java.io.IOException e0){
                                  str2 = str1;
                               }
                               Resources$NotFoundException notFoundExce = new Resources$NotFoundException(str2+Integer.toHexString(i2));
                               notFoundExce.initCause(e0);
                               throw notFoundExce;
                            }
                            uAnimator.setTarget(b.a.b.b.o.getOrDefault(str, null));
                            if (b.c == null) {
                               b.c = new ArrayList();
                               b.d = new pk();
                            }
                            b.c.add(uAnimator);
                            b.d.put(uAnimator, str);
                         }else {
                            typedArray.recycle();
                            throw new IllegalStateException("Context can\'t be null when inflating animators");
                         }
                      }
                      typedArray.recycle();
                   }
                }
                eventType = p1.next();
                i = 1;
             }else if(b.b == null){
                b.b = new AnimatorSet();
                break ;
             }
             break ;
          }
          b.b.playTogether(b.c);
          return;
       }
    }
    public final boolean isAutoMirrored(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return be1.d(ta);
       }
       return this.b.a.isAutoMirrored();
    }
    public final boolean isRunning(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.isRunning();
       }
       return this.b.b.isRunning();
    }
    public final boolean isStateful(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.isStateful();
       }
       return this.b.a.isStateful();
    }
    public final Drawable mutate(){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.mutate();
       }
       return this;
    }
    public final void onBoundsChange(Rect p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.setBounds(p0);
          return;
       }else {
          this.b.a.setBounds(p0);
          return;
       }
    }
    public final boolean onLevelChange(int p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.setLevel(p0);
       }
       return this.b.a.setLevel(p0);
    }
    public final boolean onStateChange(int[] p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.setState(p0);
       }
       return this.b.a.setState(p0);
    }
    public final void setAlpha(int p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.setAlpha(p0);
          return;
       }else {
          this.b.a.setAlpha(p0);
          return;
       }
    }
    public final void setAutoMirrored(boolean p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          be1.e(ta, p0);
          return;
       }else {
          this.b.a.setAutoMirrored(p0);
          return;
       }
    }
    public final void setColorFilter(ColorFilter p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.setColorFilter(p0);
          return;
       }else {
          this.b.a.setColorFilter(p0);
          return;
       }
    }
    public final void setTint(int p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          eb3.A(ta, p0);
          return;
       }else {
          this.b.a.setTint(p0);
          return;
       }
    }
    public final void setTintList(ColorStateList p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          eb3.B(ta, p0);
          return;
       }else {
          this.b.a.setTintList(p0);
          return;
       }
    }
    public final void setTintMode(PorterDuff$Mode p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          eb3.C(ta, p0);
          return;
       }else {
          this.b.a.setTintMode(p0);
          return;
       }
    }
    public final boolean setVisible(boolean p0,boolean p1){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.setVisible(p0, p1);
       }
       this.b.a.setVisible(p0, p1);
       return super.setVisible(p0, p1);
    }
    public final void start(){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.start();
          return;
       }else {
          ie tb = this.b;
          if (tb.b.isStarted()) {
             return;
          }
          tb.b.start();
          this.invalidateSelf();
          return;
       }
    }
    public final void stop(){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.stop();
          return;
       }else {
          this.b.b.end();
          return;
       }
    }
}
