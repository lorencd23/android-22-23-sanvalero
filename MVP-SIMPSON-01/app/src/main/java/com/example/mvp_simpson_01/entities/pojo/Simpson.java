package com.example.mvp_simpson_01.entities.pojo;

import com.google.gson.annotations.SerializedName;

public class Simpson {
    /*
    * "quote": "Last night's 'Itchy and Scratchy' was, without a doubt, the worst episode ever. Rest assured that I was on the Internet within minutes, registering my disgust throughout the world.",
        "character": "Comic Book Guy",
        "image": "https://cdn.glitch.com/3c3ffadc-3406-4440-bb95-d40ec8fcde72%2FComicBookGuy.png?1497567511970",
        "characterDirection": "Right"
    * */
    //private static final String QUOTE = "QUOTE"
    @SerializedName("quote")
    private String quote;

    @SerializedName("character")
    private String character;

    @SerializedName("image")
    private String image;

    @SerializedName("characterDirection")
    private String characterDirection;

    @Override
    public String toString() {
        return "Simpson{" +
                "quote='" + quote + '\'' +
                ", character='" + character + '\'' +
                ", image='" + image + '\'' +
                ", characterDirection='" + characterDirection + '\'' +
                '}';
    }
}
