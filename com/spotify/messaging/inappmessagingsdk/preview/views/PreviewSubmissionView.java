package com.spotify.messaging.inappmessagingsdk.preview.views.PreviewSubmissionView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p.wh7;
import android.widget.EditText;
import android.widget.Spinner;
import java.util.ArrayList;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import java.lang.String;
import java.lang.Object;
import android.widget.ArrayAdapter;
import java.util.List;
import android.widget.SpinnerAdapter;
import p.rj5;
import android.view.View$OnFocusChangeListener;
import android.widget.Button;
import android.view.inputmethod.InputMethodManager;
import android.os.IBinder;
import android.text.Editable;
import android.widget.AdapterView;
import android.view.View$OnClickListener;
import p.sj5;
import android.widget.TextView$OnEditorActionListener;
import android.widget.TextView;

public class PreviewSubmissionView extends LinearLayout	// class@000a51 from classes.dex
{
    public EditText a;
    public Spinner b;
    public Button c;
    public Button t;
    public static final int v;

    public void PreviewSubmissionView(Context p0,AttributeSet p1){
       super(p0, p1);
       View.inflate(this.getContext(), R.layout.preview_submission, this);
       this.a = wh7.m(this, R.id.creative_id);
       this.b = wh7.m(this, R.id.trigger_type);
       ArrayList uArrayList = new ArrayList(3);
       uArrayList.add(TriggerType.URI.toString());
       uArrayList.add(TriggerType.PLAYBACK_STARTED.toString());
       uArrayList.add(TriggerType.CLIENT_EVENT.toString());
       ArrayAdapter uArrayAdapte = new ArrayAdapter(this.getContext(), 0x7f0d013c, uArrayList);
       uArrayAdapte.setDropDownViewResource(0x1090009);
       this.b.setAdapter(uArrayAdapte);
       this.b.setOnFocusChangeListener(new rj5(0, this));
       this.c = wh7.m(this, R.id.button_positive);
       this.t = wh7.m(this, R.id.button_negative);
    }
    public final void a(){
       this.getContext().getSystemService("input_method").hideSoftInputFromWindow(this.a.getWindowToken(), 0);
    }
    public String getCreativeId(){
       String str = (this.a.getText() == null)? null: this.a.getText().toString();
       return str;
    }
    public TriggerType getTriggerType(){
       return TriggerType.valueOf(this.b.getSelectedItem().toString());
    }
    public void setCancelAction(View$OnClickListener p0){
       this.t.setOnClickListener(p0);
    }
    public void setSubmitAction(View$OnClickListener p0){
       this.c.setOnClickListener(p0);
       this.a.setOnEditorActionListener(new sj5(0, p0));
    }
}
