package p.ik5;
import p.xo0;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import p.wh7;
import android.widget.ProgressBar;
import android.widget.Button;
import com.spotify.messaging.inappmessagingsdk.preview.views.PreviewSubmissionView;
import p.hr0;
import p.ap0;
import p.qd5;
import android.view.View$OnClickListener;
import p.hn7;
import java.lang.Object;
import p.hk5;

public final class ik5 extends FrameLayout implements xo0	// class@0019b0 from classes.dex
{
    public ProgressBar a;
    public Button b;
    public PreviewSubmissionView c;
    public static final int t;

    public void ik5(Context p0){
       super(p0);
       View.inflate(this.getContext(), R.layout.preview_tool, this);
       this.a = wh7.m(this, R.id.progress_circular);
       this.b = wh7.m(this, R.id.preview_button);
       this.c = wh7.m(this, R.id.in_app_messaging_preview_submission_view);
    }
    public final ap0 d(hr0 p0){
       this.b.setOnClickListener(new qd5(p0, 1));
       this.c.setSubmitAction(new hn7(this, 4, p0));
       this.c.setCancelAction(new qd5(p0, 2));
       return new hk5(this, p0);
    }
}
