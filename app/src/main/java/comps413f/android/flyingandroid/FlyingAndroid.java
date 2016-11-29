package comps413f.android.flyingandroid;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable.Callback;

/** The flying android. */
public class FlyingAndroid extends Sprite {
    private static final float INITIAL_DY = 50;  // Initial velocity in vertical direction
    private float dy;  // y velocity of the flying android object

    /** Constructor. */
    public FlyingAndroid(Callback callback, Context context) {
        drawable = (AnimationDrawable) context.getResources().getDrawable(R.drawable.flying_android);
        drawable.setCallback(callback);

        dy = 30;
    }

    /** Reset the x, y position of the flying android. */
    public void reset() {
        // Add code here
        // Task 1: Reset the flying android
        // i. Locate it at the center of the arena 
        float x = (FlyingAndroidView.arenaWidth - getWidth()) / 10.f;
        float y = (FlyingAndroidView.arenaHeight - getHeight());// / 2.f;

        // ii. Update its position
        setPosition(x, y);
    }

    /** Move the flying android upward.*/
    public void fly() {
        float y = (FlyingAndroidView.arenaHeight - getHeight());
        if (curPos.y > y) {
            curPos.y -= y*0.4;
        }
    }
    @Override
    /** Move the flying android. */
    public void move() {

        float y = (FlyingAndroidView.arenaHeight - getHeight());
        if ( curPos.y <= y) {
            // Add code here
            // Task 2: Move the flying android
            // i. Update the new y position of the flying android
            curPos.y += dy;

            // ii. Update the boundary of the flying android drawable
            updateBounds();
        }
    }

    @Override
    /** Evaluate if the flying android is moving out of the arena, i.e., game end. */
    public boolean isOutOfArena() {
        if (curPos.y < 0)
            return false;
        return false;
    }
}
