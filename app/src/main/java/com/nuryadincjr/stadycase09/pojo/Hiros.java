package com.nuryadincjr.stadycase09.pojo;

import android.os.Parcel;
import android.os.Parcelable;

public class Hiros implements Parcelable {

    private final int img;
    private final String title, reting, description,
            platform, metascore,genre, realise, developer;

    public Hiros(int img, String title, String reting, String description,
                 String platform, String metascore, String genre, String realise, String developer) {
        this.img = img;
        this.title = title;
        this.reting = reting;
        this.description = description;
        this.platform = platform;
        this.metascore = metascore;
        this.genre = genre;
        this.realise = realise;
        this.developer = developer;
    }

    public Hiros(Parcel parcel) {
        img = parcel.readInt();
        title = parcel.readString();
        reting = parcel.readString();
        description = parcel.readString();
        platform = parcel.readString();
        metascore = parcel.readString();
        genre = parcel.readString();
        realise = parcel.readString();
        developer = parcel.readString();
    }

    public static final Creator<Hiros> CREATOR = new Creator<Hiros>() {
        @Override
        public Hiros createFromParcel(Parcel in) {
            return new Hiros(in);
        }

        @Override
        public Hiros[] newArray(int size) {
            return new Hiros[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(img);
        parcel.writeString(title);
        parcel.writeString(reting);
        parcel.writeString(description);
        parcel.writeString(platform);
        parcel.writeString(metascore);
        parcel.writeString(genre);
        parcel.writeString(realise);
        parcel.writeString(developer);
    }


    public int getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public String getReting() {
        return reting;
    }

    public String getDescription() {
        return description;
    }

    public String getPlatform() {
        return platform;
    }

    public String getMetascore() {
        return metascore;
    }

    public String getGenre() {
        return genre;
    }

    public String getRealise() {
        return realise;
    }

    public String getDeveloper() {
        return developer;
    }
}
