package com.owen.tvwidget.demo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;


/**
 * Created by owen on 2016/10/19.
 */

public class PathView extends View {

    private Paint paint;

    public PathView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs);
    }

    public PathView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public PathView(Context context) {
        super(context);
        init(context, null);
    }

    private void init(Context context, AttributeSet attrs) {

        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.RED);
        // 设置画笔宽度
//        paint.setStrokeWidth(3);
        // 消除锯齿
        paint.setAntiAlias(true);
        // 设置镂空（方便查看效果）
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        // //绘制折线
        // Path path = new Path();
        // path.lineTo(100,100);
        // path.lineTo(100, 200);
        // path.lineTo(150, 250);
        // path.close();
        // canvas.drawPath(path, paint);

        // //绘制正方形
        // Rect rect = new Rect(100, 100, 300, 250);
        // canvas.drawRect(rect, paint);

        // //绘制椭圆
        // canvas.drawOval(new RectF(rect), paint);
        // //绘制线条
        // canvas.drawLine(50, 175, 350, 175, paint);
        // canvas.drawLine(200, 50, 200, 300, paint);

        /**
         * addArc(RectF oval, float startAngle, float sweepAngle)方法：
         *
         * path.addArc方法用于绘制圆弧，这个圆弧取自RectF矩形的内接椭圆上的一部分，圆弧长度由后两个参数决定
         *
         * startAngle：起始位置的角度值
         *
         * sweepAngle：旋转的角度值
         *
         */

        // 绘制圆弧
//		Rect rect = new Rect(100, 100, 300, 250);
//		Path path = new Path();
//		path.reset();
//		path.addArc(new RectF(rect), 0, 60);
//		canvas.drawPath(path, paint);

        /**
         * arcTo(RectF oval, float startAngle, float sweepAngle)方法：
         * arcTo和addArc的区别: 
         * 1. addArc可以直接加入一段椭圆弧。使用arcTo还需要使用moveTo指定当前点的坐标。
         * 2.arcTo如果当前点坐标和曲线的起始点不是同一个点的话，还会自动添加一条直线补齐路径
         */

//		Rect rect = new Rect(100, 100, 300, 250);
//		canvas.drawRect(rect, paint);
//		canvas.drawLine(50, 175, 350, 175, paint);
//		canvas.drawLine(200, 50, 200, 300, paint);
//		        
//		Path path = new Path();
//		path.moveTo(30, 30);
//		path.arcTo(new RectF(rect), 0, 90);
//		//path.addArc(new RectF(rect), 0, 90);
//		canvas.drawPath(path, paint);

        /**
         * quadTo(float x1, float y1, float x2, float y2)方法：
         * 以当前路径结束点为开始点，(x1,y1)为控制点，(x2,y2)为结束点画一条二次贝塞尔曲线（相关贝赛尔曲线请再做查询）
         */
//		Path path = new Path();
//
//		path.moveTo(20, 50);
//		path.lineTo(50, 200);
//		path.quadTo(100, 200, 150, 250);
//		canvas.drawPath(path, paint);



        /**
         * addCircle(float x, float y, float radius, Direction dir)方法：
         * 使用path绘制圆形，xy为圆的圆心 radius为圆的半径，
         * Direction 为绘制元的方向
         * Diection.CCW 逆时针方向Diection.CW 顺时针方向
         */
//		Path path = new Path();
//
//		path.reset();
//		path.addCircle(100, 100, 50, Direction.CW);
//		canvas.drawPath(path, paint);

        /**
         * addOval(RectF oval, Path.Direction dir)方法：
         * 绘制椭圆，同上绘制圆的方法
         */


        /**
         * addPath(Path src, float dx, float dy)方法：
         * 在已有的Path上通过平移创建新的path：
         */
//        Path path = new Path();
//        path.lineTo(100,100);
//        path.lineTo(100, 200);
//        path.lineTo(150, 250);
//
//        canvas.drawPath(path, paint);
//        path.addPath(path, 100, 0);
//        canvas.drawPath(path, paint);

        
//        canvas.translate(getWidth() / 2, 0);
//        Rect rect = new Rect(0, 0, 200, 200);
//        Path path = new Path();
//        path.moveTo(0, 0);
//        path.arcTo(new RectF(rect), 210, 30, false);
//        path.lineTo(200, 0);
//        path.lineTo(0, 200);
//        path.close();
        
//        path.addRect(new RectF(rect), Path.Direction.CCW);
//        path.addArc(new RectF(rect), 0, 360);

        int size = 100;
        int topLeftRadius = 15;
        Path path = new Path();
        
//        path.arcTo(new RectF(0, 0, topLeftRadius * 2, topLeftRadius * 2), 180, 90);
//        path.lineTo(size, 0);
//        path.lineTo(0, size);
        
//        path.arcTo(new RectF(0, 0, topLeftRadius * 2, topLeftRadius * 2), 270, 90);
//        path.lineTo(size, size);
//        path.lineTo(0, 0);

        path.moveTo(size - topLeftRadius, 0);
        path.lineTo(size, 0);
        path.lineTo(size, topLeftRadius);
        path.arcTo(new RectF(size - 2 * topLeftRadius, 0, size, topLeftRadius * 2), 0, -90);
        
        path.close();
        canvas.drawPath(path, paint);

        canvas.restore();
    }
}