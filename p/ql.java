package p.ql;
import p.xl;
import p.v55;
import p.x55;
import p.cm;
import java.lang.String;
import io.reactivex.rxjava3.core.Observable;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.os.BaseBundle;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import android.content.Context;
import java.lang.Class;
import java.lang.Object;
import p.zl;
import p.vi7;
import java.io.Serializable;
import p.b90;
import p.yl;
import p.yf2;
import io.reactivex.rxjava3.core.ObservableTransformer;

public class ql extends xl	// class@0023c9 from classes.dex
{
    public static final int G;

    public void ql(){
       super();
    }
    public final v55 h(){
       return x55.v;
    }
    public final Observable u(cm p0,String p1){
       Bundle arguments;
       Serializable serializable = ((arguments = this.getArguments()) == null)? null: arguments.getString("spotify.fragment.argument.ALBUM_URI");
       if (serializable == null) {
          return Observable.error(new IllegalArgumentException());
       }else {
          p0.getClass();
          return p0.g(new zl(p0, p1, serializable, 0)).map(new yl(p0, this.requireContext(), 1)).compose(p0.y);
       }
    }
}
