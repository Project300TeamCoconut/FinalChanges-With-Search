package com.project300.movieswipe;

public class WishlistObject {

    private String MovieName;
    public WishlistObject(String moveiname){
        this.MovieName = moveiname;
    }


    public String getMovieName()
    {return MovieName; }

    public void setMovieName(String movieName)
    {this.MovieName = movieName;}

    public String changeStatus()
    {
        return "Are you Sure?";
    }




}

