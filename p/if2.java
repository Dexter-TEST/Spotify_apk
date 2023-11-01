package p.if2;
import p.wf2;
import p.gi3;
import androidx.fragment.app.Fragment;
import p.dj7;
import androidx.fragment.app.k;
import androidx.activity.a;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.aj7;
import p.i01;

public final class if2 extends gi3 implements wf2	// class@001980 from classes.dex
{
    public final int a;
    public final Fragment b;

    public void if2(Fragment p0,int p1){
       this.a = p1;
       this.b = p0;
       super(0);
    }
    public final dj7 a(){
       dj7 viewModelSto;
       if2 tb = this.b;
       switch (this.a){
           case 2:
           default:
             viewModelSto = tb.requireActivity().getViewModelStore();
             co5.l(viewModelSto, "requireActivity\(\).viewModelStore");
             return viewModelSto;
       }
       viewModelSto = tb.requireActivity().getViewModelStore();
       co5.l(viewModelSto, "requireActivity\(\).viewModelStore");
       return viewModelSto;
    }
    public final Object invoke(){
       if2 tb = this.b;
       switch (this.a){
           case 0:
             i01 defaultViewM = tb.getDefaultViewModelCreationExtras();
             co5.l(defaultViewM, "defaultViewModelCreationExtras");
             return defaultViewM;
           case 1:
             aj7 defaultViewM1 = tb.getDefaultViewModelProviderFactory();
             co5.l(defaultViewM1, "defaultViewModelProviderFactory");
             return defaultViewM1;
           case 2:
             return this.a();
           case 3:
             return tb;
           default:
             return this.a();
       }
    }
}
