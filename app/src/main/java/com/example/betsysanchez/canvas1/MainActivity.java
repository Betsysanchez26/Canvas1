package com.example.betsysanchez.canvas1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

   // private int[] numeros={1,2,3,4,5,6,7,8,9,10,11,12};
   // private Rect rect = new Rect();
   // private int radio=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // PapelView papel = new PapelView(this);

       // setContentView(papel);
    }


   /* private class PapelView extends View {

        public PapelView(Context context) {
            super(context);
        }

        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
// Objeto Paint
            Paint paint = new Paint();
            paint.setColor(Color.BLACK);

            // Pintar el canvas
            canvas.drawPaint(paint);

            // Obtener dimensiones
            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();
            paint.setColor(Color.WHITE);
            paint.setTextSize(50);
            paint.setAntiAlias(true);

            // Texto
            canvas.drawText("ancho" + ancho + "altura" + alto, 30, 30, paint);

            // Lineas
            paint.setColor(Color.WHITE);
            canvas.drawLine(0, 40, ancho, 40, paint);
            canvas.drawLine(20, 0, 20, alto, paint);

            paint.setTextSize(50);

            int min = Math.min(alto,ancho);
            radio=min/2;

            for (int n : numeros) {
                String tmp = String.valueOf(n);
                paint.getTextBounds(tmp, 0, tmp.length(), rect);
                double angle = Math.PI / 6 * (n - 3);
                int x = (int) (ancho / 2 + Math.cos(angle) * radio - rect.width() / 2);
                int y = (int) (ancho / 2 + Math.sin(angle) * radio - rect.width() / 2);
                canvas.drawText(tmp, x, y, paint);

            }

        }


    }*/

}
