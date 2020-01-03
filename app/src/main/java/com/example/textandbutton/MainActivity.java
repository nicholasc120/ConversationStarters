package com.example.textandbutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView myText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myText = (TextView)findViewById(R.id.myText);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                myText.setText(getString());
            }
        });
    }

    public String getString(){
        String[] returnString = {"If you were in a circus, which character would you be?", "What is the worst advice you have given?", "What is one thing you should never say at a wedding?", "What is the worst pickup line you have ever heard?", "If you could only store one type of food in your pocket, what would you carry?", "What is the worst present you have ever received and why?", "If you were a farm animal, which would you be and why?", "What is the worst first date you have ever been on?", "Have you ever stalked someone on social media?", "What is the best part about taking a selfie?", "What is your favorite celebrity scandal?", "If you could do anything illegal without getting caught, what would you do?", "What is the weirdest food combination you’ve ever tried?", "Did you have an imaginary friend? What was his/her name?", "Have you ever had a dream where everyone was in their underwear?", "Who’s your favorite comedian?", "Have you ever been on a blind date?", "What do you most like about yourself?", "What hurts your feelings?", "If you could be famous, would you want to? Why?", "Who is a celebrity you admire?", "What made you laugh at school today?", "Did anything make you upset today?", "If you could have more friends, would you?", "What do you like most about your friends?", "Is there anyone at school you’d like to know better?", "Have you ever lost a friend? Why?", "Where do you want to be ten years from now?", "If you had $100, what would you spend it on?", "Is there something you’d want to do as a family?", "If you were to choose one way to be disciplined, what would it be?", "What do you think are the best traits for a person to have?", "Would you ever get a tattoo? What would it be?", "What do you think is a good age to start dating?", "Why do you think popular kids are popular?", "If you could go anywhere in the world, where would you choose and why?", "What is something you wish you could do everyday?", "What are the top three things on your bucket list?", "How do you think you will die?", "What has been the lowest point of your life?", "If you could ask for a miracle, what would it be?", "Where do you see yourself in five years?", "What is the biggest risk you’ve ever taken?", "What would your ideal life look like?", "If someone gave you an envelope with your death date inside of it, would you open it?", "When have you been the most happy?", "Do you know anyone who is living their life to the fullest?", "What is your idea of the perfect day?", "Who has been the most influential person in your life and why?", "What book had a big influence on you?", "Do you think your priorities have changed since you were younger?", "What is the most memorable lesson you learned from your parents?", "What does success mean to you?", "What is the most difficult thing you’ve ever done?", "What scares you most about your future?", "What keeps you up at night?", "How long can you go without checking your phone?", "Have you ever really kept a New Year’s resolution?", "What bad habits do you wish you could stop?", "Do you have a morning ritual?", "Have you ever been stalked on social media?", "Can you tell when someone is lying?", "Are you a jealous person?", "Do you prefer polaroid or digital cameras?", "If someone offered to tell you your future, would you accept it?", "Who’s your biggest hero?", "Have you ever stolen anything?", "If you were to remove one social media app from your phone, which would it be and why?", "If you could have tea with a fictional character, who would that be?", "What is your most embarrassing moment?", "If you were on death row, what would your last meal be?", "If you could sit down with your 13-year old self, what would you say?", "If you could only pack one thing for a trip (besides clothing) what would it be?", "What makes you really angry?", "What is your spirit animal?", "What would be the title of your memoire?", "What’s your guilty pleasure?", "What would your theme song be if you had your own show?", "What bores you?", "What would you do if you were home alone and the power went out?", "What’s the weirdest dream you’ve ever had?", "If your plane was going down, who would you would call?", "What would your rock band group be called?"
        };
        final int min = 0;
        final int max = returnString.length - 1;
        final int random = new Random().nextInt((max - min) + 1) + min;

        return returnString[random];
    }
}
