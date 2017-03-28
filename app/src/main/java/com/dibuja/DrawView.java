package com.dibuja;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.view.View;

public class DrawView extends View {
	Paint paint = new Paint();

	public DrawView(Context context) {
		super(context);
	}

	@Override
	public void onDraw(Canvas canvas) {
	   /*//.drawRect(left, top, right, bottom, paint)
        paint.setColor(Color.RED);
		canvas.drawRect(30, 30, 80, 80, paint);
	    paint.setColor(Color.CYAN);
		canvas.drawRect(33, 60, 77, 77, paint);
		paint.setColor(Color.YELLOW);
		canvas.drawRect(33, 33, 77, 60, paint);
		
		//.drawCircle(cx, cy, radius, paint);
		paint.setColor(Color.RED);
		canvas.drawCircle(100, 100, 20, paint);
		
		//.drawText(text, x, y, paint)
		canvas.drawText("Texto con CANVAS", 200, 30, paint);
		*/
		//.drawLine(startX, startY, stopX, stopY, paint)
        //paint.setColor(Color.BLUE);
        //canvas.drawLine(300, 70, 300, 400, paint);

		paint.setColor(Color.BLUE);
		//Arriba
		canvas.drawLine(200, 200, 270, 200, paint);
		//En medio
		//canvas.drawLine(150, 250, 320, 250, paint);
		//canvas.drawLine(150, 300, 320, 300, paint);
		//Abajo
		canvas.drawLine(200, 350, 270, 350, paint);
		//Conecciones arriba-enmedio
		canvas.drawLine(200, 200, 150, 250, paint);
		canvas.drawLine(270, 200, 320, 250, paint);
		//Conecciones abajo-en medio
		canvas.drawLine(200, 350, 150, 300, paint);
		canvas.drawLine(270, 350, 320, 300, paint);
		//Conecciones de En medio
		canvas.drawLine(150, 250, 150, 300, paint);
		canvas.drawLine(320, 250, 320, 300, paint);


		paint.setColor(Color.RED);
		//base 100
		//canvas.drawLine(500, 350, 600, 350, paint);
		//altura 150
		//canvas.drawLine(550, 200, 550, 350,paint);
		//lados a
		canvas.drawLine(500, 350, 550, 200,paint);
		//
		//canvas.drawLine(500, 295, 600, 295, paint);
		canvas.drawLine(470, 255, 630, 255, paint);
		//
		canvas.drawLine(600, 350, 550, 200,paint);
		//lados b
		canvas.drawLine(470,255,600,350,paint);
		canvas.drawLine(630,255,500,350,paint);

		//canvas.drawLine(600, 350, );





		/*
        Path trazo = new Path();
        trazo.addCircle(150, 450, 100, Path.Direction.CCW);
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(8);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(trazo, paint);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(20);
        paint.setTypeface(Typeface.SANS_SERIF);
        canvas.drawTextOnPath("Cecyt 9 \"Juan de Dios Bátiz\" graficos en Android ", trazo, 150, 40, paint);
*/
	}

}
