package p.ye2;
import p.af2;
import android.transition.Transition;
import java.util.List;
import android.view.View;
import java.lang.Object;
import java.util.ArrayList;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.transition.TransitionManager;
import p.ve2;
import android.transition.Transition$TransitionListener;
import p.we2;
import android.graphics.Rect;
import p.ue2;
import android.transition.Transition$EpicenterCallback;
import p.ac0;
import p.ka0;
import p.xe2;
import java.util.Collection;

public final class ye2 extends af2	// class@002d9e from classes.dex
{

    public void ye2(){
       super();
    }
    public static boolean s(Transition p0){
       boolean b = (af2.h(p0.getTargetIds()) && (af2.h(p0.getTargetNames()) && af2.h(p0.getTargetTypes())))? false: true;
       return b;
    }
    public final void a(View p0,Object p1){
       p1.addTarget(p0);
    }
    public final void b(Object p0,ArrayList p1){
       int transitionCo;
       if (p0 == null) {
          return;
       }
       int i = 0;
       if (p0 instanceof TransitionSet) {
          transitionCo = p0.getTransitionCount();
          for (; i < transitionCo; i = i + 1) {
             this.b(p0.getTransitionAt(i), p1);
          }
       }else if(!ye2.s(p0) && af2.h(p0.getTargets())){
          transitionCo = p1.size();
          for (; i < transitionCo; i = i + 1) {
             p0.addTarget(p1.get(i));
          }
       }
       return;
    }
    public final void c(ViewGroup p0,Object p1){
       TransitionManager.beginDelayedTransition(p0, p1);
    }
    public final boolean e(Object p0){
       return p0 instanceof Transition;
    }
    public final Object f(Object p0){
       p0 = (p0 != null)? p0.clone(): null;
       return p0;
    }
    public final Object i(Object p0,Object p1,Object p2){
       if (p0 != null && p1 != null) {
          p0 = new TransitionSet().addTransition(p0).addTransition(p1).setOrdering(1);
       }else if(p0 != null){
          p0 = (p1 != null)? p1: null;
       }
       if (p2 != null) {
          p1 = new TransitionSet();
          if (p0 != null) {
             p1.addTransition(p0);
          }
          p1.addTransition(p2);
          return p1;
       }else {
          return p0;
       }
    }
    public final Object j(Object p0,Object p1){
       TransitionSet transitionSe = new TransitionSet();
       if (p0 != null) {
          transitionSe.addTransition(p0);
       }
       transitionSe.addTransition(p1);
       return transitionSe;
    }
    public final void k(Object p0,View p1,ArrayList p2){
       p0.addListener(new ve2(p1, p2));
    }
    public final void l(Object p0,Object p1,ArrayList p2,Object p3,ArrayList p4){
       we2 v6 = new we2(this, p1, p2, p3, p4);
       p0.addListener(v6);
    }
    public final void m(View p0,Object p1){
       if (p0 != null) {
          Rect rect = new Rect();
          af2.g(p0, rect);
          p1.setEpicenterCallback(new ue2(rect, 0));
       }
       return;
    }
    public final void n(Object p0,Rect p1){
       p0.setEpicenterCallback(new ue2(p1, 1));
    }
    public final void o(Object p0,ac0 p1,ka0 p2){
       p0.addListener(new xe2(p2));
    }
    public final void p(Object p0,View p1,ArrayList p2){
       List tars = p0.getTargets();
       tars.clear();
       int i = p2.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          af2.d(p2.get(i1), tars);
       }
       tars.add(p1);
       p2.add(p1);
       this.b(p0, p2);
       return;
    }
    public final void q(Object p0,ArrayList p1,ArrayList p2){
       if (p0 != null) {
          p0.getTargets().clear();
          p0.getTargets().addAll(p2);
          this.t(p0, p1, p2);
       }
       return;
    }
    public final Object r(Object p0){
       if (p0 == null) {
          return null;
       }
       TransitionSet transitionSe = new TransitionSet();
       transitionSe.addTransition(p0);
       return transitionSe;
    }
    public final void t(Object p0,ArrayList p1,ArrayList p2){
       List tars;
       int i = 0;
       if (p0 instanceof TransitionSet) {
          int transitionCo = p0.getTransitionCount();
          for (; i < transitionCo; i = i + 1) {
             this.t(p0.getTransitionAt(i), p1, p2);
          }
       }else if(!ye2.s(p0) && ((tars = p0.getTargets()) != null && (tars.size() == p1.size() && tars.containsAll(p1)))){
          tars = (p2 == null)? 0: p2.size();
          while (i < tars) {
             p0.addTarget(p2.get(i));
             i = i + 1;
          }
          int i1 = p1.size();
          while ((i1--) >= 0) {
             p0.removeTarget(p1.get(i1));
          }
       }
       return;
    }
}
