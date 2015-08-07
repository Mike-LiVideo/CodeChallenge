package wheeler.michael.codechallenge.REST;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Michael Wheeler on 8/6/2015.
 * <p/>
 * Generated from http://www.jsonschema2pojo.org/
 */
public class MovieDetailModel implements Parcelable{
    @Expose
    private Integer id;
    @Expose
    private String title;
    @Expose
    private Integer year;
    @SerializedName("mpaa_rating")
    @Expose
    private String mpaaRating;
    @Expose
    private Integer runtime;
    @SerializedName("critics_consensus")
    @Expose
    private String criticsConsensus;
    @SerializedName("release_dates")
    @Expose
    private ReleaseDates releaseDates;
    @Expose
    private Ratings ratings;
    @Expose
    private String synopsis;
    @Expose
    private Posters posters;

    protected MovieDetailModel(Parcel in) {
        title = in.readString();
        mpaaRating = in.readString();
        criticsConsensus = in.readString();
        synopsis = in.readString();
    }

    public static final Creator<MovieDetailModel> CREATOR = new Creator<MovieDetailModel>() {
        @Override
        public MovieDetailModel createFromParcel(Parcel in) {
            return new MovieDetailModel(in);
        }

        @Override
        public MovieDetailModel[] newArray(int size) {
            return new MovieDetailModel[size];
        }
    };

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * @param year The year
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * @return The mpaaRating
     */
    public String getMpaaRating() {
        return mpaaRating;
    }

    /**
     * @param mpaaRating The mpaa_rating
     */
    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    /**
     * @return The runtime
     */
    public Integer getRuntime() {
        return runtime;
    }

    /**
     * @param runtime The runtime
     */
    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    /**
     * @return The criticsConsensus
     */
    public String getCriticsConsensus() {
        return criticsConsensus;
    }

    /**
     * @param criticsConsensus The critics_consensus
     */
    public void setCriticsConsensus(String criticsConsensus) {
        this.criticsConsensus = criticsConsensus;
    }

    /**
     * @return The releaseDates
     */
    public ReleaseDates getReleaseDates() {
        return releaseDates;
    }

    /**
     * @param releaseDates The release_dates
     */
    public void setReleaseDates(ReleaseDates releaseDates) {
        this.releaseDates = releaseDates;
    }

    /**
     * @return The ratings
     */
    public Ratings getRatings() {
        return ratings;
    }

    /**
     * @param ratings The ratings
     */
    public void setRatings(Ratings ratings) {
        this.ratings = ratings;
    }

    /**
     * @return The synopsis
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * @param synopsis The synopsis
     */
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    /**
     * @return The posters
     */
    public Posters getPosters() {
        return posters;
    }

    /**
     * @param posters The posters
     */
    public void setPosters(Posters posters) {
        this.posters = posters;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.mpaaRating);
        dest.writeString(this.synopsis);
        dest.writeInt(this.year);
        dest.writeInt(this.runtime);
        dest.writeString(this.posters.original);
    }

    public class Posters {

        @Expose
        private String thumbnail;
        @Expose
        private String profile;
        @Expose
        private String detailed;
        @Expose
        private String original;

        /**
         * @return The thumbnail
         */
        public String getThumbnail() {
            return thumbnail;
        }

        /**
         * @param thumbnail The thumbnail
         */
        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        /**
         * @return The profile
         */
        public String getProfile() {
            return profile;
        }

        /**
         * @param profile The profile
         */
        public void setProfile(String profile) {
            this.profile = profile;
        }

        /**
         * @return The detailed
         */
        public String getDetailed() {
            return detailed;
        }

        /**
         * @param detailed The detailed
         */
        public void setDetailed(String detailed) {
            this.detailed = detailed;
        }

        /**
         * @return The original
         */
        public String getOriginal() {
            return original;
        }

        /**
         * @param original The original
         */
        public void setOriginal(String original) {
            this.original = original;
        }

    }

    public class Ratings {

        @SerializedName("critics_rating")
        @Expose
        private String criticsRating;
        @SerializedName("critics_score")
        @Expose
        private Integer criticsScore;
        @SerializedName("audience_rating")
        @Expose
        private String audienceRating;
        @SerializedName("audience_score")
        @Expose
        private Integer audienceScore;

        /**
         * @return The criticsRating
         */
        public String getCriticsRating() {
            return criticsRating;
        }

        /**
         * @param criticsRating The critics_rating
         */
        public void setCriticsRating(String criticsRating) {
            this.criticsRating = criticsRating;
        }

        /**
         * @return The criticsScore
         */
        public Integer getCriticsScore() {
            return criticsScore;
        }

        /**
         * @param criticsScore The critics_score
         */
        public void setCriticsScore(Integer criticsScore) {
            this.criticsScore = criticsScore;
        }

        /**
         * @return The audienceRating
         */
        public String getAudienceRating() {
            return audienceRating;
        }

        /**
         * @param audienceRating The audience_rating
         */
        public void setAudienceRating(String audienceRating) {
            this.audienceRating = audienceRating;
        }

        /**
         * @return The audienceScore
         */
        public Integer getAudienceScore() {
            return audienceScore;
        }

        /**
         * @param audienceScore The audience_score
         */
        public void setAudienceScore(Integer audienceScore) {
            this.audienceScore = audienceScore;
        }

    }

    public class ReleaseDates {

        @Expose
        private String theater;
        @Expose
        private String dvd;

        /**
         * @return The theater
         */
        public String getTheater() {
            return theater;
        }

        /**
         * @param theater The theater
         */
        public void setTheater(String theater) {
            this.theater = theater;
        }

        /**
         * @return The dvd
         */
        public String getDvd() {
            return dvd;
        }

        /**
         * @param dvd The dvd
         */
        public void setDvd(String dvd) {
            this.dvd = dvd;
        }

    }
}
