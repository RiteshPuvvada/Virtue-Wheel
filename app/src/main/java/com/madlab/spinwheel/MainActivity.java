package com.madlab.spinwheel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView2;

    String[] sectors = {"Courage",
            "Patience", "Discipline", "Delicacy",
            "Humility", "Spontaneity", "Responsibility",
            "Harmony", "Wisdom", "Faith",
            "Friendship","Self-Confidence","Detachment",
            "Happiness","Enthusiasm","Discernment",
            "Tolerance","Contentment","Compassion",
            "BrotherHood","Simplicity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        textView2 = (TextView) findViewById(R.id.textView2);

        Collections.reverse(Arrays.asList(sectors));

    }
    public void spinWheel(View view){
        Random random = new Random();
        final int degree = random.nextInt(360);

        RotateAnimation rotateAnimation = new RotateAnimation(0,degree+720,
                RotateAnimation.RELATIVE_TO_SELF,0.5f,
                RotateAnimation.RELATIVE_TO_SELF,0.5f);

        rotateAnimation.setDuration(5000);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setInterpolator(new DecelerateInterpolator());


        rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                CalculatePoint(degree);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        imageView.startAnimation(rotateAnimation);
    }
    public void CalculatePoint(int degree){
        // 360 degrees || 21 segments || 17.14285714285714 each Segment

        int initialPoint = 0;
        float endPoint = (float) 17.14285714285714;
        int i = 0;
        String res = null;

        do{
            if(degree > initialPoint && degree < endPoint){
                res = sectors[i];
            }
            initialPoint += 17.14285714285714;
            endPoint += 17.14285714285714;
            i++;
        }while (res == null);
        textView2.setText(res);
        String result = "";
        String color;
        int updateBack;
        Intent intent = new Intent(getApplicationContext(), second.class);
        if(res == "Courage"){
            result = "Courage : \n"+"You have won your greatest battle by agreeing to change";
            color = "#b2d61c";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if(res == "Self-Confidence"){
            result = "Self-confidence : \n"+"You accept your good points with humility and simply dare to be great";
            color = "#faa800";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if(res == "Contentment"){
            result = "Contentment : \n"+"Just by writing a list of your achievements you realize that you have everything you need.";
            color = "#a62a90";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if(res == "Detachment"){
            result = "Detachment : \n"+"You know that less expectations means less disappointment";
            color = "#fc6720";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if(res == "Friendship"){
            result = "Friendship : \n"+"You are your own best friend";
            color = "#fed900";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if(res == "Compassion"){
            result = "Compassion : \n"+"You perceive needs without judging and send out good wishes";
            color = "#186cba";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if (res == "Delicacy"){
            result = "Delicacy : \n"+"You make magic wands of your thoughts and actions to turn vulgarity into subtlety";
            color = "#176299";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if(res == "Harmony"){
            result = "Harmony : \n"+"When you let go, you see how life dances";
            color = "#de6679";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if(res == "Faith"){
            result = "Faith : \n"+"You remove any doubt that blocks your path forward";
            color = "#C08000";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if(res == "Happiness"){
            result = "Happiness : \n"+"You receive the little miracles of daily life as winks from the divine";
            color = "#f54a00";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if(res == "Brotherhood"){
            result = "Brotherhood : \n"+"Because you know the father every human being has become your brother.";
            color = "#3eb2cf";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if(res == "Humility"){
            result = "Humility : \n"+"You are a spiritual warrior who lays down the weapons of arrogance and resists to the pleasures of praise";
            color = "#8c669f";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if(res == "Tolerance"){
            result = "Tolerance : \n" +"Diversity glorifies the garden of life. That's why you like different flowers in your bouquet of friends.";
            color = "#f13359";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if(res == "Discipline"){
            result = "Discipline : \n" +"You obey the natural laws of the universe and receive in return protection, abundance and peace of mind";
            color = "#3ca08a";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if(res == "Wisdom"){
            result = "Wisdom : \n" +"You balance masterly depth and childlike lightness and learn something new in every situation";
            color = "#f2c495";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if(res == "Simplicity"){
            result = "Simplicity : \n"+"You see the essentials in the charms of life and light your load by letting go of complications.";
            color = "#4ac0a5";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if(res == "Enthusiasm"){
            result = "Enthusiasm : \n" + "By listening to the child inside you, you give souls wings to fly";
            color = "#d0331f";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if(res == "Patience"){
            result = "Patience : \n"+"Knowing the tiny seed contains the future tree you let your success grow in the soil of constancy";
            color = "#81a16c";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if(res == "Discernment"){
            result = "Discernment : \n"+"When in doubt, you know you can trust your instinct";
            color = "#9d221d";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if(res == "Spontaneity"){
            result = "Spontaneity : \n" +"Your spontaneity is like a gurgling brook which quenches all thirsts and lightens burdens";
            color = "#261E63";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else if(res == "Responsibility"){
            result = "Responsibility : \n" +"Knowing your role is UNIQUE, you are the hero, not the spectator, in the drama of life";
            color = "#11103c";
            updateBack = Color.parseColor(color);
            intent.putExtra("COL",updateBack);
        }else {
            result = "";
        }
        Toast.makeText(MainActivity.this,res,Toast.LENGTH_SHORT).show();
        intent.putExtra("RES",result);
        startActivity(intent);
    }
}