package p.ae;
import p.xe7;
import android.graphics.drawable.Animatable;
import p.ie;

public final class ae extends xe7	// class@000f6b from classes.dex
{
    public final int F;
    public final Animatable G;

    public void ae(Animatable p0,int p1){
       this.F = p1;
       this.G = p0;
    }
    public final void f0(){
       ae tG = this.G;
       switch (this.F){
           case 0:
           default:
             tG.start();
             return;
       }
       tG.start();
       return;
    }
    public final void g0(){
       ae tG = this.G;
       switch (this.F){
           case 0:
           default:
             tG.stop();
             return;
       }
       tG.stop();
       return;
    }
}
