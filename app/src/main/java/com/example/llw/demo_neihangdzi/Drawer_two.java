package com.example.llw.demo_neihangdzi;

/**
 * Created by llw on 2016/8/2.
 */
public class Drawer_two {
    public String textView_one, textView_two, textView_three, textView_four;
    public int image = 0;

    public Drawer_two(String textView_one, String textView_two, String textView_three, String textView_four, int image) {
        this.textView_one = textView_one;
        this.textView_two = textView_two;
        this.textView_three = textView_three;
        this.textView_four = textView_four;
        this.image = image;
    }

    public String getTextView_one() {
        return textView_one;
    }

    public void setTextView_one(String textView_one) {
        this.textView_one = textView_one;
    }

    public String getTextView_two() {
        return textView_two;
    }

    public void setTextView_two(String textView_two) {
        this.textView_two = textView_two;
    }

    public String getTextView_three() {
        return textView_three;
    }

    public void setTextView_three(String textView_three) {
        this.textView_three = textView_three;
    }

    public String getTextView_four() {
        return textView_four;
    }

    public void setTextView_four(String textView_four) {
        this.textView_four = textView_four;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
