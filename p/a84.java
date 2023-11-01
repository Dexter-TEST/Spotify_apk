package p.a84;
import p.ym7;
import android.content.Context;
import androidx.fragment.app.Fragment;
import p.ej4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.spotify.legacyglue.icons.SpotifyIconView;
import p.jm7;
import java.lang.Object;
import android.view.View$OnClickListener;
import p.sp6;
import java.lang.Integer;
import java.lang.String;
import p.jl;

public class a84 extends ym7	// class@000f32 from classes.dex
{
    public static final int H;

    public void a84(){
       super();
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       throw null;
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view = super.onCreateView(p0, p1, p2);
       SpotifyIconView spotifyIconV = view.findViewById(R.id.btn_close);
       spotifyIconV.setOnClickListener(new jm7(7, this));
       spotifyIconV.setIcon(sp6.q0);
       return view;
    }
    public final void onDetach(){
       super.onDetach();
    }
    public final int u(){
       return 0x7f0d0090;
    }
    public final Integer v(){
       return Integer.valueOf(0x106000b);
    }
    public final boolean w(){
       throw false;
    }
    public final void x(){
       if (this.c == null) {
          jl.d("Attempted to render url while view was detached.");
          return;
       }else {
          jl.d("Attempted to render null url.");
          return;
       }
    }
}
