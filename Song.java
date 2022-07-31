public class Song {

    private int sNO;
    private String songsName;
    private String lyricists;
    private String moviesName;
    private String SongDuration;

    public Song(int sNO, String songsName, String lyricists, String moviesName, String songDuration) {
        this.sNO=sNO;
        this.songsName = songsName;
        this.lyricists = lyricists;
        this.moviesName = moviesName;
        SongDuration = songDuration;
    }

    public String getSongsName() {
        return songsName;
    }

    public void setSongsName(String songsName) {
        this.songsName = songsName;
    }

    public String getLyricists() {
        return lyricists;
    }

    public void setLyricists(String lyricists) {
        this.lyricists = lyricists;
    }

    public String getMoviesName() {
        return moviesName;
    }

    public void setMoviesName(String moviesName) {
        this.moviesName = moviesName;
    }

    public String getSongDuration() {
        return SongDuration;
    }

    public void setSongDuration(String songDuration) {
        SongDuration = songDuration;
    }

    public int getsNO() {
        return sNO;
    }

    public void setsNO(int sNO) {
        this.sNO = sNO;
    }

    @Override
    public String toString() {
        return "Song{" +
                "sNO=" + sNO +
                ", songsName='" + songsName + '\'' +
                ", lyricists='" + lyricists + '\'' +
                ", moviesName='" + moviesName + '\'' +
                ", SongDuration='" + SongDuration + '\'' +
                '}';
    }
}
