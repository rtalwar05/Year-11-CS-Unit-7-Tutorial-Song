import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Song {

    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    private ArrayList<String> all = new ArrayList<>();
    public int howMany(ArrayList<String> listeners )
    {
        int k = 0;

        for (String p: listeners)
        {
            String l = p.toLowerCase();
            if (!all.contains(l))
            {
                all.add(l);
                k++;
            }


        }

        return k;

    }




}
