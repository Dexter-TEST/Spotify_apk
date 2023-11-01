package p.wt5;
import androidx.fragment.app.Fragment;
import p.fn0;
import p.ty0;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ej4;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import p.ut5;
import android.view.View$OnClickListener;

public final class wt5 extends Fragment	// class@002ba3 from classes.dex
{
    public final fn0 a;
    public static final int b;

    public void wt5(){
       super();
       this.a = new fn0();
    }
    public final void onAttach(Context p0){
       co5.o(p0, "context");
       ej4.T(this);
       super.onAttach(p0);
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       co5.o(p0, "inflater");
       View view = p0.inflate(R.layout.fragment_remoteconfiguration, p1, false);
       co5.j(view, "null cannot be cast to non-null type android.view.ViewGroup");
       co5.l(view.findViewById(R.id.remote_config_ps_value_delivered), "currentView.findViewById…onfig_ps_value_delivered\)");
       co5.l(view.findViewById(R.id.remote_config_ps_value_use), "currentView.findViewById…mote_config_ps_value_use\)");
       co5.l(view.findViewById(R.id.remote_config_core_property), "currentView.findViewById…ote_config_core_property\)");
       co5.l(view.findViewById(R.id.remote_config_button), "currentView.findViewById….id.remote_config_button\)");
       co5.l(view.findViewById(R.id.remote_config_text), "currentView.findViewById\(R.id.remote_config_text\)");
       co5.l(view.findViewById(R.id.remote_config_unauth_color), "currentView.findViewById…mote_config_unauth_color\)");
       view.findViewById(R.id.remote_config_button_refresh).setOnClickListener(new ut5(this, false));
       view.findViewById(R.id.remote_config_button_activate).setOnClickListener(new ut5(this, 1));
       return view;
    }
    public final void onStop(){
       this.a.dispose();
       super.onStop();
    }
    public final void onViewCreated(View p0,Bundle p1){
       co5.o(p0, "view");
       super.onViewCreated(p0, p1);
       co5.N("rxProductState");
       throw null;
    }
}
