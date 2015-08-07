package wheeler.michael.codechallenge.REST;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael Wheeler on 8/6/2015.
 * <p/>
 * Generated from http://www.jsonschema2pojo.org/
 */
public class MovieSearchModel {

    public class AbridgedCast {

        @Expose
        private String name;
        @Expose
        private String id;
        @Expose
        private List<String> characters = new ArrayList<String>();

        /**
         * @return The name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return The id
         */
        public String getId() {
            return id;
        }

        /**
         * @param id The id
         */
        public void setId(String id) {
            this.id = id;
        }

        /**
         * @return The characters
         */
        public List<String> getCharacters() {
            return characters;
        }

        /**
         * @param characters The characters
         */
        public void setCharacters(List<String> characters) {
            this.characters = characters;
        }

    }

    public class AlternateIds {

        @Expose
        private String imdb;

        /**
         * @return The imdb
         */
        public String getImdb() {
            return imdb;
        }

        /**
         * @param imdb The imdb
         */
        public void setImdb(String imdb) {
            this.imdb = imdb;
        }

    }

    public class Example {

        @Expose
        private Integer total;
        @Expose
        private List<Movie> movies = new ArrayList<Movie>();
        @Expose
        private Links_ links;
        @SerializedName("link_template")
        @Expose
        private String linkTemplate;

        /**
         * @return The total
         */
        public Integer getTotal() {
            return total;
        }

        /**
         * @param total The total
         */
        public void setTotal(Integer total) {
            this.total = total;
        }

        /**
         * @return The movies
         */
        public List<Movie> getMovies() {
            return movies;
        }

        /**
         * @param movies The movies
         */
        public void setMovies(List<Movie> movies) {
            this.movies = movies;
        }

        /**
         * @return The links
         */
        public Links_ getLinks() {
            return links;
        }

        /**
         * @param links The links
         */
        public void setLinks(Links_ links) {
            this.links = links;
        }

        /**
         * @return The linkTemplate
         */
        public String getLinkTemplate() {
            return linkTemplate;
        }

        /**
         * @param linkTemplate The link_template
         */
        public void setLinkTemplate(String linkTemplate) {
            this.linkTemplate = linkTemplate;
        }

    }

    public class Links {

        @Expose
        private String self;
        @Expose
        private String alternate;
        @Expose
        private String cast;
        @Expose
        private String reviews;
        @Expose
        private String similar;

        /**
         * @return The self
         */
        public String getSelf() {
            return self;
        }

        /**
         * @param self The self
         */
        public void setSelf(String self) {
            this.self = self;
        }

        /**
         * @return The alternate
         */
        public String getAlternate() {
            return alternate;
        }

        /**
         * @param alternate The alternate
         */
        public void setAlternate(String alternate) {
            this.alternate = alternate;
        }

        /**
         * @return The cast
         */
        public String getCast() {
            return cast;
        }

        /**
         * @param cast The cast
         */
        public void setCast(String cast) {
            this.cast = cast;
        }

        /**
         * @return The reviews
         */
        public String getReviews() {
            return reviews;
        }

        /**
         * @param reviews The reviews
         */
        public void setReviews(String reviews) {
            this.reviews = reviews;
        }

        /**
         * @return The similar
         */
        public String getSimilar() {
            return similar;
        }

        /**
         * @param similar The similar
         */
        public void setSimilar(String similar) {
            this.similar = similar;
        }

    }

    public class Links_ {

        @Expose
        private String self;
        @Expose
        private String next;

        /**
         * @return The self
         */
        public String getSelf() {
            return self;
        }

        /**
         * @param self The self
         */
        public void setSelf(String self) {
            this.self = self;
        }

        /**
         * @return The next
         */
        public String getNext() {
            return next;
        }

        /**
         * @param next The next
         */
        public void setNext(String next) {
            this.next = next;
        }

    }

    public class Movie {

        @Expose
        private String id;
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
        @SerializedName("abridged_cast")
        @Expose
        private List<AbridgedCast> abridgedCast = new ArrayList<AbridgedCast>();
        @SerializedName("alternate_ids")
        @Expose
        private AlternateIds alternateIds;
        @Expose
        private Links links;

        /**
         * @return The id
         */
        public String getId() {
            return id;
        }

        /**
         * @param id The id
         */
        public void setId(String id) {
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

        /**
         * @return The abridgedCast
         */
        public List<AbridgedCast> getAbridgedCast() {
            return abridgedCast;
        }

        /**
         * @param abridgedCast The abridged_cast
         */
        public void setAbridgedCast(List<AbridgedCast> abridgedCast) {
            this.abridgedCast = abridgedCast;
        }

        /**
         * @return The alternateIds
         */
        public AlternateIds getAlternateIds() {
            return alternateIds;
        }

        /**
         * @param alternateIds The alternate_ids
         */
        public void setAlternateIds(AlternateIds alternateIds) {
            this.alternateIds = alternateIds;
        }

        /**
         * @return The links
         */
        public Links getLinks() {
            return links;
        }

        /**
         * @param links The links
         */
        public void setLinks(Links links) {
            this.links = links;
        }

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
