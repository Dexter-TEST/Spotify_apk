package com.spotify.legacyglue.pasteview.PasteViewLayoutParamHelper;
import java.lang.Object;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import java.lang.AssertionError;

public final class PasteViewLayoutParamHelper	// class@000902 from classes.dex
{

    private void PasteViewLayoutParamHelper(){
       super();
    }
    public static ViewGroup$LayoutParams generateMatchParentLayoutParams(Context p0,ViewGroup p1){
       if (p1 == null) {
          return null;
       }
       XmlResourceParser layout = p0.getResources().getLayout(R.layout.paste_match_parent_width);
       try{
          do {
          } while (layout.nextToken() != 2);
          return p1.generateLayoutParams(layout);
       }catch(java.lang.Exception e2){
          throw new AssertionError(e2);
       }
    }
    public static ViewGroup$LayoutParams generateMatchParentWidthAndHeightLayoutParams(Context p0,ViewGroup p1){
       if (p1 == null) {
          return null;
       }
       XmlResourceParser layout = p0.getResources().getLayout(R.layout.paste_match_parent_width_and_height);
       try{
          do {
          } while (layout.nextToken() != 2);
          return p1.generateLayoutParams(layout);
       }catch(java.lang.Exception e2){
          throw new AssertionError(e2);
       }
    }
    public static ViewGroup$LayoutParams generateWrapContentLayoutParams(Context p0,ViewGroup p1){
       if (p1 == null) {
          return null;
       }
       XmlResourceParser layout = p0.getResources().getLayout(R.layout.paste_wrap_content);
       try{
          do {
          } while (layout.nextToken() != 2);
          return p1.generateLayoutParams(layout);
       }catch(java.lang.Exception e2){
          throw new AssertionError(e2);
       }
    }
}
