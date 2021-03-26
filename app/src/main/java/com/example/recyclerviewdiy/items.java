package com.example.recyclerviewdiy;

public class items {
    //declaring variables
  private int imageView;
  private String textView;

  //a constructor
    public items(int imageView, String textView) {
        this.imageView = imageView;
        this.textView = textView;
    }
  //getters and setters (press alt + insert)
    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getTextView() {
        return textView;
    }

    public void setTextView(String textView) {
        this.textView = textView;
    }
}
