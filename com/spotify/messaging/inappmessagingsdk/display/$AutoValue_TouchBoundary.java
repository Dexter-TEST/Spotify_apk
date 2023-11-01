package com.spotify.messaging.inappmessagingsdk.display.$AutoValue_TouchBoundary;
import com.spotify.messaging.inappmessagingsdk.display.TouchBoundary;
import java.lang.Object;
import java.lang.Float;
import java.lang.String;
import java.lang.StringBuilder;

abstract class $AutoValue_TouchBoundary extends TouchBoundary	// class@000a2b from classes.dex
{
    private final float mHeight;
    private final float mWidth;
    private final float mXPos;
    private final float mYPos;

    public void $AutoValue_TouchBoundary(float p0,float p1,float p2,float p3){
       super();
       this.mXPos = p0;
       this.mYPos = p1;
       this.mHeight = p2;
       this.mWidth = p3;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof TouchBoundary) {
          return false;
       }
       if (Float.floatToIntBits(this.mXPos) != Float.floatToIntBits(p0.mXPos()) || (Float.floatToIntBits(this.mYPos) != Float.floatToIntBits(p0.mYPos()) || (Float.floatToIntBits(this.mHeight) != Float.floatToIntBits(p0.mHeight()) || Float.floatToIntBits(this.mWidth) != Float.floatToIntBits(p0.mWidth())))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return (((((((Float.floatToIntBits(this.mXPos) ^ 0xf4243) * 0xf4243) ^ Float.floatToIntBits(this.mYPos)) * 0xf4243) ^ Float.floatToIntBits(this.mHeight)) * 0xf4243) ^ Float.floatToIntBits(this.mWidth));
    }
    public float mHeight(){
       return this.mHeight;
    }
    public float mWidth(){
       return this.mWidth;
    }
    public float mXPos(){
       return this.mXPos;
    }
    public float mYPos(){
       return this.mYPos;
    }
    public String toString(){
       return "TouchBoundary{mXPos="+this.mXPos+", mYPos="+this.mYPos+", mHeight="+this.mHeight+", mWidth="+this.mWidth+"}";
    }
}
