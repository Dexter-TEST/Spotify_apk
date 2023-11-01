package com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarOverflowHelper$MenuAdapter;
import android.widget.BaseAdapter;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarOverflowHelper;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarOverflowHelper$1;
import java.util.List;
import android.view.MenuItem;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup;
import p.uz5;
import java.lang.Class;
import p.zk2;
import android.content.Context;
import p.o85;
import p.xj0;
import p.wz5;
import p.eo5;
import java.lang.CharSequence;
import p.sz5;
import java.lang.IllegalStateException;
import java.lang.String;

class GlueToolbarOverflowHelper$MenuAdapter extends BaseAdapter	// class@0008eb from classes.dex
{
    final GlueToolbarOverflowHelper this$0;

    private void GlueToolbarOverflowHelper$MenuAdapter(GlueToolbarOverflowHelper p0){
       this.this$0 = p0;
       super();
    }
    public void GlueToolbarOverflowHelper$MenuAdapter(GlueToolbarOverflowHelper p0,GlueToolbarOverflowHelper$1 p1){
       super(p0);
    }
    public int getCount(){
       return GlueToolbarOverflowHelper.access$100(this.this$0).size();
    }
    public MenuItem getItem(int p0){
       return GlueToolbarOverflowHelper.access$100(this.this$0).get(p0);
    }
    public Object getItem(int p0){
       return this.getItem(p0);
    }
    public long getItemId(int p0){
       return (long)p0;
    }
    public View getView(int p0,View p1,ViewGroup p2){
       uz5 ouz5;
       sz5 a;
       if (p1 == null) {
          ouz5 = null;
       }else if((ouz5 = uz5.class.cast(p1.getTag(R.id.glue_viewholder_tag))) != null){
          throw new IllegalStateException("This view doesn\'t have a GlueViewBinder associated with it. Have you called GlueViewBinders.save\(\)?");
       }
       if (ouz5 == null) {
          wz5 owz5 = new wz5(xj0.x0(p2.getContext(), p2, R.layout.glue_listtile_1));
          eo5.P(owz5);
          ouz5 = owz5;
       }
       MenuItem menuItem = GlueToolbarOverflowHelper.access$100(this.this$0).get(p0);
       ouz5.setText(menuItem.getTitle());
       a = ouz5.a;
       a.setEnabled(menuItem.isEnabled());
       return a;
    }
}
