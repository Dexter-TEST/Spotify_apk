package p.t76;
import p.wf2;
import p.gi3;
import java.lang.Object;
import p.ej7;
import p.dj7;
import java.lang.String;
import p.co5;
import java.util.List;
import p.ll1;

public final class t76 extends gi3 implements wf2	// class@002717 from classes.dex
{
    public final int a;
    public final wf2 b;

    public void t76(wf2 p0,int p1){
       this.a = p1;
       this.b = p0;
       super(0);
    }
    public final Object invoke(){
       List list;
       t76 tb = this.b;
       switch (this.a){
           case 0:
           default:
             try{
                list = tb.invoke();
             }catch(javax.net.ssl.SSLPeerUnverifiedException e0){
                list = ll1.a;
             }
             return list;
       }
       dj7 viewModelSto = tb.invoke().getViewModelStore();
       co5.l(viewModelSto, "ownerProducer\(\).viewModelStore");
       return viewModelSto;
    }
}
