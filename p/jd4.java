package p.jd4;
import java.lang.Object;
import p.wh6;
import android.content.Context;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;
import java.util.List;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import p.ld4;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import p.je;
import android.view.animation.DecelerateInterpolator;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.System;

public final class jd4	// class@001ab5 from classes.dex
{
    public final wh6 a;
    public final wh6 b;

    public void jd4(){
       super();
       this.a = new wh6();
       this.b = new wh6();
    }
    public static jd4 a(Context p0,int p1){
       jd4 ojd4 = null;
       try{
          Animator uAnimator = AnimatorInflater.loadAnimator(p0, p1);
          if (uAnimator instanceof AnimatorSet) {
             return jd4.b(uAnimator.getChildAnimations());
          }
          if (uAnimator == null) {
             return ojd4;
          }
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(uAnimator);
          return jd4.b(uArrayList);
       }catch(java.lang.Exception e0){
          Integer.toHexString(p1);
          return e0;
       }
    }
    public static jd4 b(ArrayList p0){
       Animator uAnimator;
       jd4 ojd4 = new jd4();
       int i = p0.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return ojd4;
          }
          uAnimator = p0.get(i1);
          if (uAnimator instanceof ObjectAnimator) {
             ojd4.b.put(uAnimator.getPropertyName(), uAnimator.getValues());
             String propertyName = uAnimator.getPropertyName();
             long startDelay = uAnimator.getStartDelay();
             long duration = uAnimator.getDuration();
             TimeInterpolator interpolator = uAnimator.getInterpolator();
             if (!interpolator instanceof AccelerateDecelerateInterpolator && interpolator != null) {
                if (interpolator instanceof AccelerateInterpolator) {
                   interpolator = je.c;
                }else if(interpolator instanceof DecelerateInterpolator){
                   interpolator = je.d;
                }
             }else {
                interpolator = je.b;
             }
             ld4 v11 = new ld4(startDelay, duration, interpolator);
             v11.d = uAnimator.getRepeatCount();
             v11.e = uAnimator.getRepeatMode();
             ojd4.a.put(propertyName, v11);
             i1 = i1 + 1;
          }else {
             break ;
          }
       }
       throw new IllegalArgumentException("Animator must be an ObjectAnimator: "+uAnimator);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof jd4) {
          return false;
       }
       return this.a.equals(p0.a);
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return "\n"+jd4.class.getName()+'{'+Integer.toHexString(System.identityHashCode(this))+" timings: "+this.a+"}\n";
    }
}
