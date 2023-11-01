package p.il6;
import p.xt2;
import java.util.EnumSet;
import java.lang.Object;
import android.view.ViewGroup;
import p.uu2;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;

public abstract class il6 implements xt2	// class@0019ba from classes.dex
{
    public final EnumSet a;
    public final int b;

    public void il6(EnumSet p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final View c(ViewGroup p0,uu2 p1){
       return LayoutInflater.from(p0.getContext()).inflate(this.b, p0, false);
    }
    public final EnumSet d(){
       return this.a;
    }
}
