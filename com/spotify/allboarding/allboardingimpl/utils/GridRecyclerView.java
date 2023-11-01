package com.spotify.allboarding.allboardingimpl.utils.GridRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import androidx.recyclerview.widget.GridLayoutManager;
import p.hn2;
import p.hr5;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import p.yq5;
import android.content.res.Resources;
import android.view.animation.GridLayoutAnimationController$AnimationParameters;
import android.view.animation.LayoutAnimationController;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import p.j50;
import android.view.animation.Interpolator;
import android.view.ViewGroup;

public final class GridRecyclerView extends RecyclerView	// class@00050e from classes.dex
{

    public void GridRecyclerView(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0);
       GridLayoutManager gridLayoutMa = new GridLayoutManager(30);
       gridLayoutMa.c0 = new hn2(this, gridLayoutMa);
       this.setLayoutManager(gridLayoutMa);
       this.p0();
    }
    public final void attachLayoutAnimationParameters(View p0,ViewGroup$LayoutParams p1,int p2,int p3){
       int i;
       ViewGroup$LayoutParams layoutAnimat;
       co5.o(p0, "child");
       co5.o(p1, "params");
       yq5 adapter = this.getAdapter();
       co5.i(adapter);
       if (adapter.d() <= p2) {
       label_002f :
          i = 1;
       }else {
          adapter = this.getAdapter();
          co5.i(adapter);
          if ((i = adapter.f(p2)) == 0x7f0d002e || i == 0x7f0d002f) {
             goto label_002f ;
          }else if(i == 0x7f0d002d){
             i = this.getResources().getInteger(R.integer.allboarding_row_number_of_items_2);
          }else {
             i = this.getResources().getInteger(R.integer.allboarding_row_number_of_items_3);
          }
       }
       if ((layoutAnimat = p1.layoutAnimationParameters) == null) {
          layoutAnimat = new GridLayoutAnimationController$AnimationParameters();
       }
       p1.layoutAnimationParameters = layoutAnimat;
       layoutAnimat.count = p3;
       layoutAnimat.index = p2;
       layoutAnimat.columnsCount = i;
       int i1 = p3 / i;
       layoutAnimat.rowsCount = i1;
       p3 = (p3 - 1) - p2;
       layoutAnimat.column = (i - 1) - (p3 % i);
       layoutAnimat.row = (i1 - 1) - (p3 / i);
       return;
    }
    public GridLayoutManager getLayoutManager(){
       hr5 layoutManage = super.getLayoutManager();
       co5.i(layoutManage);
       return layoutManage;
    }
    public hr5 getLayoutManager(){
       return this.getLayoutManager();
    }
    public final void p0(){
       LayoutAnimationController layoutAnimat = AnimationUtils.loadLayoutAnimation(this.getContext(), R.anim.artist_picker_item_animation);
       layoutAnimat.getAnimation().setInterpolator(new j50());
       layoutAnimat.getAnimation().setDuration(800);
       this.setLayoutAnimation(layoutAnimat);
    }
}
