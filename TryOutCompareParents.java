import java.util.HashMap;

public class TryOutCompareParents {

    public static void main(String[] args) {

        HashMap<String, String> heroes_marvel_first_movie = new HashMap<>();
        HashMap<String, String> heroes_marvel_second_movie = new HashMap<>();
        HashMap<String, String> heroes_marvel_third_movie = new HashMap<>();

        HashMap<String, Integer> both = new HashMap<>();

        heroes_marvel_first_movie.put("Captain America", "2011");
        heroes_marvel_first_movie.put("Iron Man", "2008");
        heroes_marvel_first_movie.put("Hulk", "2008");
        heroes_marvel_first_movie.put("Thor", "2011");
        heroes_marvel_first_movie.put("Ant-man", "2015");

        heroes_marvel_second_movie.put("Captain America", "2014");
        heroes_marvel_second_movie.put("Iron Man", "2011");
        heroes_marvel_second_movie.put("Thor", "2013");
        heroes_marvel_second_movie.put("Ant-man", "2018");

        heroes_marvel_third_movie.put("Captain America", "2016");
        heroes_marvel_third_movie.put("Iron Man", "2013");
        heroes_marvel_third_movie.put("Thor", "2017");

        for (int movie = 0; movie < heroes_marvel_first_movie.size(); movie++) {
            System.out.println(movie);

        }

        // for each movie in heroes first movie check if the movie is in heroes second movie


    }
}
