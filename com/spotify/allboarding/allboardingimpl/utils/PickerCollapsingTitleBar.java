package com.spotify.allboarding.allboardingimpl.utils.PickerCollapsingTitleBar;
import p.ef;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.be5;
import p.ay6;
import p.wf2;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import com.spotify.search.view.ToolbarSearchFieldView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import p.hr5;
import p.h76;
import p.ri0;
import p.df;
import p.ur5;
import p.yq5;
import android.widget.Button;
import java.lang.CharSequence;

public final class PickerCollapsingTitleBar extends ef	// class@00050f from classes.dex
{
    public final TextView J;
    public final TextView K;
    public final ToolbarSearchFieldView L;
    public final RecyclerView M;
    public final h76 N;
    public final ay6 O;

    public void PickerCollapsingTitleBar(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0);
       this.O = new ay6(new be5(p0, 0));
       View.inflate(p0, R.layout.picker_collapsing_title_bar, this);
       View view = this.findViewById(R.id.expanded_title);
       co5.l(view, "findViewById\(R.id.expanded_title\)");
       this.J = view;
       view = this.findViewById(R.id.collapsed_title);
       co5.l(view, "findViewById\(R.id.collapsed_title\)");
       this.K = view;
       view = this.findViewById(R.id.search_toolbar);
       co5.l(view, "findViewById\(R.id.search_toolbar\)");
       this.L = view;
       View view1 = this.findViewById(R.id.filters_rv);
       co5.l(view1, "findViewById\(R.id.filters_rv\)");
       this.M = view1;
       view1.setLayoutManager(new LinearLayoutManager(0));
       this.N = new h76(p0, view, 0);
       this.a(new ri0(1, this));
    }
    private final ur5 getSmoothScroller(){
       return this.O.getValue();
    }
    public final void h(int p0){
       this.getSmoothScroller().a = p0;
       hr5 layoutManage = this.M.getLayoutManager();
       co5.j(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
       layoutManage.O0(this.getSmoothScroller());
    }
    public final void setFiltersRecyclerViewAdapter(yq5 p0){
       co5.o(p0, "adapter");
       this.M.setAdapter(p0);
    }
    public final void setFiltersVisible(boolean p0){
       int i = (p0)? 0: 8;
       this.M.setVisibility(i);
       return;
    }
    public final void setSearchPlaceholder(String p0){
       co5.o(p0, "placeholder");
       this.L.getSearchPlaceHolder().setText(p0);
    }
    public final void setSearchVisible(boolean p0){
       int i = (p0)? 0: 8;
       this.L.setVisibility(i);
       return;
    }
    public final void setTitle(String p0){
       co5.o(p0, "title");
       this.J.setText(p0);
       this.K.setText(p0);
    }
}
