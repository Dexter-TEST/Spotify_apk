package p.ta;
import p.md2;
import p.va;
import p.w76;
import p.ql6;
import p.wv6;
import p.tt0;
import java.lang.ClassLoader;
import java.lang.String;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import com.spotify.allboarding.allboardingimpl.mobius.AllBoardingFragment;
import p.ua;
import p.he2;
import p.sc;
import com.spotify.allboarding.contextualaudio.presentation.ContextualAudioFragment;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import com.spotify.allboarding.allboardingimpl.skip.SkipDialogFragment;
import com.spotify.allboarding.allboardingimpl.presentation.summary.SummaryFragment;
import p.tp2;
import com.spotify.base.java.logging.Logger;
import java.lang.reflect.Constructor;
import p.cd2;
import java.lang.Throwable;

public final class ta extends md2	// class@002735 from classes.dex
{
    public final va b;
    public final w76 c;
    public final ql6 d;
    public final wv6 e;
    public final tt0 f;

    public void ta(va p0,w76 p1,ql6 p2,wv6 p3,tt0 p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Fragment a(ClassLoader p0,String p1){
       ta tb;
       AllBoardingFragment uAllBoarding;
       String str;
       co5.o(p0, "classLoader");
       co5.o(p1, "className");
       Class uClass = md2.c(p0, p1);
       if (co5.c(uClass, AllBoardingFragment.class)) {
          tb = this.b;
          tb.getClass();
          uAllBoarding = new AllBoardingFragment(new ua(tb, 0));
       }else if(co5.c(uClass, ContextualAudioFragment.class)){
          tb = this.f;
          tb.getClass();
          uAllBoarding = new ContextualAudioFragment(new ua(tb, 4));
       }else if(co5.c(uClass, SearchFragment.class)){
          tb = this.c;
          tb.getClass();
          uAllBoarding = new SearchFragment(new ua(tb, 2));
       }else if(co5.c(uClass, SkipDialogFragment.class)){
          tb = this.d;
          tb.getClass();
          uAllBoarding = new SkipDialogFragment(new ua(tb, 3));
       }else if(co5.c(uClass, SummaryFragment.class)){
          tb = this.e;
          tb.getClass();
          uAllBoarding = new SummaryFragment(new ua(tb, 1));
       }else {
          Object[] objArray = new Object[0];
          Logger.i(tp2.m("No creator found for class: ", p1, ". Using default constructor"), objArray);
          try{
             str = "Unable to instantiate fragment ";
             Class[] uClassArray = new Class[0];
             Object[] objArray1 = new Object[0];
             Fragment uFragment = md2.c(p0, p1).getConstructor(uClassArray).newInstance(objArray1);
             co5.l(uFragment, "super.instantiate\(classLoader, className\)");
             uAllBoarding = uFragment;
          }catch(java.lang.InstantiationException e5){
             throw new cd2(0, tp2.m(str, uAllBoarding, ": make sure class name exists, is public, and has an empty constructor that is public"), e5);
          }catch(java.lang.IllegalAccessException e5){
             throw new cd2(0, tp2.m(str, uAllBoarding, ": make sure class name exists, is public, and has an empty constructor that is public"), e5);
          }catch(java.lang.NoSuchMethodException e5){
             throw new cd2(0, tp2.m(str, uAllBoarding, ": could not find Fragment constructor"), e5);
          }catch(java.lang.reflect.InvocationTargetException e5){
             throw new cd2(0, tp2.m(str, uAllBoarding, ": calling Fragment constructor caused an exception"), e5);
          }
       }
       return uAllBoarding;
    }
}
