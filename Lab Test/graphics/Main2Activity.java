package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        String color = i.getStringExtra("COLOR");
        String shape = i.getStringExtra("SHAPE");
        String fill = i.getStringExtra("FILL");

        Button b = (Button) findViewById(R.id.back);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int h = dm.heightPixels;
        int w = dm.widthPixels;

        ImageView img = (ImageView) findViewById(R.id.img);
        Bitmap bg = Bitmap.createBitmap(w, h - 300, Bitmap.Config.ARGB_8888);
        img.setBackgroundDrawable(new BitmapDrawable(this.getResources(), bg));

        Canvas can = new Canvas(bg);
        Paint p = new Paint();
        p.setAntiAlias(true);

        switch (shape) {
            case "Circle":
                if (fill.equals("Filled")) {
                    if (color.equals("Red")) {
                        p.setColor(Color.RED);
                        can.drawCircle(300, 600, 250, p);
                    } else if (color.equals("Blue")) {
                        p.setColor(Color.BLUE);
                        can.drawCircle(300, 600, 250, p);
                    } else {
                        p.setColor(Color.GREEN);
                        can.drawCircle(300, 600, 250, p);
                    }
                } else {
                    if (color.equals("Red")) {
                        p.setColor(Color.RED);
                        p.setStyle(Paint.Style.STROKE);
                        can.drawCircle(300, 600, 250, p);
                    } else if (color.equals("Blue")) {
                        p.setColor(Color.BLUE);
                        p.setStyle(Paint.Style.STROKE);
                        can.drawCircle(300, 600, 250, p);
                    } else {
                        p.setColor(Color.GREEN);
                        p.setStyle(Paint.Style.STROKE);
                        can.drawCircle(300, 600, 250, p);
                    }
                }
                break;
            case "Oval":
                if (fill.equals("Filled")) {
                    if (color.equals("Red")) {
                        RectF r = new RectF(300, 600, 200, 400);
                        p.setColor(Color.RED);
                        can.drawOval(r, p);
                    } else if (color.equals("Blue")) {
                        RectF r = new RectF(300, 600, 200, 400);
                        p.setColor(Color.BLUE);
                        can.drawOval(r, p);
                    } else {
                        RectF r = new RectF(300, 600, 200, 400);
                        p.setColor(Color.GREEN);
                        can.drawOval(r, p);
                    }
                } else {
                    if (color.equals("Red")) {
                        RectF r = new RectF(300, 600, 200, 400);
                        p.setStyle(Paint.Style.STROKE);
                        p.setColor(Color.RED);
                        can.drawOval(r, p);
                    } else if (color.equals("Blue")) {
                        RectF r = new RectF(300, 600, 200, 400);
                        p.setStyle(Paint.Style.STROKE);
                        p.setColor(Color.BLUE);
                        can.drawOval(r, p);
                    } else {
                        RectF r = new RectF(300, 600, 200, 400);
                        p.setStyle(Paint.Style.STROKE);
                        p.setColor(Color.GREEN);
                        can.drawOval(r, p);
                    }
                }
                break;
            case "Triangle":
                if (fill.equals("Filled")) {
                    if (color.equals("Red")) {
                        Point point1_draw = new Point(300, 200);
                        Point point2_draw = new Point(400, 200);
                        Point point3_draw = new Point(500, 300);
                        Path path = new Path();
                        path.moveTo(point1_draw.x, point1_draw.y);
                        path.lineTo(point2_draw.x, point2_draw.y);
                        path.lineTo(point3_draw.x, point3_draw.y);
                        path.lineTo(point1_draw.x, point1_draw.y);
                        path.close();
                        p.setColor(Color.RED);
                        can.drawPath(path, p);
                    } else if (color.equals("Blue")) {
                        Point point1_draw = new Point(300, 200);
                        Point point2_draw = new Point(400, 200);
                        Point point3_draw = new Point(500, 300);
                        Path path = new Path();
                        path.moveTo(point1_draw.x, point1_draw.y);
                        path.lineTo(point2_draw.x, point2_draw.y);
                        path.lineTo(point3_draw.x, point3_draw.y);
                        path.lineTo(point1_draw.x, point1_draw.y);
                        path.close();
                        p.setColor(Color.BLUE);
                        can.drawPath(path, p);
                    } else {
                        Point point1_draw = new Point(300, 200);
                        Point point2_draw = new Point(400, 200);
                        Point point3_draw = new Point(500, 300);
                        Path path = new Path();
                        path.moveTo(point1_draw.x, point1_draw.y);
                        path.lineTo(point2_draw.x, point2_draw.y);
                        path.lineTo(point3_draw.x, point3_draw.y);
                        path.lineTo(point1_draw.x, point1_draw.y);
                        path.close();
                        p.setColor(Color.GREEN);
                        can.drawPath(path, p);
                    }
                } else {
                    if (color.equals("Red")) {
                        Point point1_draw = new Point(300, 200);
                        Point point2_draw = new Point(400, 200);
                        Point point3_draw = new Point(500, 300);
                        Path path = new Path();
                        path.moveTo(point1_draw.x, point1_draw.y);
                        path.lineTo(point2_draw.x, point2_draw.y);
                        path.lineTo(point3_draw.x, point3_draw.y);
                        path.lineTo(point1_draw.x, point1_draw.y);
                        p.setStyle(Paint.Style.STROKE);
                        path.close();
                        p.setColor(Color.RED);
                        can.drawPath(path, p);
                    } else if (color.equals("Blue")) {
                        Point point1_draw = new Point(300, 200);
                        Point point2_draw = new Point(400, 200);
                        Point point3_draw = new Point(500, 300);
                        Path path = new Path();
                        path.moveTo(point1_draw.x, point1_draw.y);
                        path.lineTo(point2_draw.x, point2_draw.y);
                        path.lineTo(point3_draw.x, point3_draw.y);
                        path.lineTo(point1_draw.x, point1_draw.y);
                        path.close();
                        p.setStyle(Paint.Style.STROKE);
                        p.setColor(Color.BLUE);
                        can.drawPath(path, p);
                    } else {
                        Point point1_draw = new Point(300, 200);
                        Point point2_draw = new Point(400, 200);
                        Point point3_draw = new Point(500, 300);
                        Path path = new Path();
                        path.moveTo(point1_draw.x, point1_draw.y);
                        path.lineTo(point2_draw.x, point2_draw.y);
                        path.lineTo(point3_draw.x, point3_draw.y);
                        path.lineTo(point1_draw.x, point1_draw.y);
                        path.close();
                        p.setStyle(Paint.Style.STROKE);
                        p.setColor(Color.GREEN);
                        can.drawPath(path, p);
                    }
                }
                break;
            case "Rectangle":
                if (fill.equals("Filled")) {
                    if (color.equals("Red")) {
                        RectF r = new RectF(300, 600, 200, 400);
                        p.setColor(Color.RED);
                        can.drawRect(r, p);
                    } else if (color.equals("Blue")) {
                        RectF r = new RectF(300, 600, 200, 400);
                        p.setColor(Color.BLUE);
                        can.drawRect(r, p);
                    } else {
                        RectF r = new RectF(300, 600, 200, 400);
                        p.setColor(Color.GREEN);
                        can.drawRect(r, p);
                    }
                } else {
                    if (color.equals("Red")) {
                        RectF r = new RectF(300, 600, 200, 400);
                        p.setStyle(Paint.Style.STROKE);
                        p.setColor(Color.RED);
                        can.drawRect(r, p);
                    } else if (color.equals("Blue")) {
                        RectF r = new RectF(300, 600, 200, 400);
                        p.setStyle(Paint.Style.STROKE);
                        p.setColor(Color.BLUE);
                        can.drawRect(r, p);
                    } else {
                        RectF r = new RectF(300, 600, 200, 400);
                        p.setStyle(Paint.Style.STROKE);
                        p.setColor(Color.GREEN);
                        can.drawRect(r, p);
                    }
                    break;
                }
        }
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(i2);
            }
        });
    }
}
