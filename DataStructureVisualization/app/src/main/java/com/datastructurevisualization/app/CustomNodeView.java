package com.datastructurevisualization.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ResourceCursorTreeAdapter;

import androidx.annotation.Nullable;

public class CustomNodeView extends View {

    private static final int SQUARE_SIZE = 150;

    private Rect mRectSquare;
    private Paint mPaintSquare;

    private int Key;

    public CustomNodeView(Context context) {
        super(context);

        init(null);
    }

    public CustomNodeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(attrs);
    }

    public CustomNodeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(attrs);
    }

    public CustomNodeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init(attrs);
    }

    private void init(@Nullable AttributeSet set){
        mRectSquare = new Rect();
        mPaintSquare = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaintSquare.setColor(Color.GREEN);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        mRectSquare.left = 100;
        mRectSquare.top = 1000;
        mRectSquare.right = mRectSquare.left + SQUARE_SIZE;
        mRectSquare.bottom = mRectSquare.top + SQUARE_SIZE;


        canvas.drawRect(mRectSquare,mPaintSquare);
    }
}
