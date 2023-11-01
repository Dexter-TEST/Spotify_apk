package p.lm;
import p.xl;
import p.v55;
import p.x55;
import p.cm;
import java.lang.String;
import io.reactivex.rxjava3.core.Observable;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.os.BaseBundle;
import android.content.Context;
import java.lang.Class;
import java.lang.Object;
import p.am;
import p.b90;
import p.yl;
import p.yf2;
import io.reactivex.rxjava3.core.ObservableTransformer;

public class lm extends xl	// class@001d84 from classes.dex
{
    public static final int G;

    public void lm(){
       super();
    }
    public final v55 h(){
       return x55.y;
    }
    public final Observable u(cm p0,String p1){
       Bundle arguments;
       int i = ((arguments = this.getArguments()) == null)? 0: arguments.getInt("spotify.fragment.argument.GENRE_INDEX");
       p0.getClass();
       return p0.g(new am(p0, p1, i)).map(new yl(p0, this.requireContext(), 3)).compose(p0.y);
    }
}
