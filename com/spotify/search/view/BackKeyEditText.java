package com.spotify.search.view.BackKeyEditText;
import p.pg;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import p.bc2;
import p.qw;
import android.view.KeyEvent;
import p.up0;
import com.spotify.search.view.ToolbarSearchFieldView;
import p.m67;
import android.widget.EditText;

public class BackKeyEditText extends pg	// class@000bff from classes.dex
{
    public qw x;

    public void BackKeyEditText(Context p0,AttributeSet p1){
       super(p0, p1, 0x101006e);
       bc2.a(this, p0);
    }
    public qw getListener(){
       return this.x;
    }
    public final boolean onKeyPreIme(int p0,KeyEvent p1){
       BackKeyEditText tx;
       if (p0 != 4 || (p1.getAction() != 1 || (tx = this.x) == null)) {
          return super.onKeyPreIme(p0, p1);
       }
       tx.b.B.a();
       return true;
    }
    public void setBackKeyListener(qw p0){
       this.x = p0;
    }
}
