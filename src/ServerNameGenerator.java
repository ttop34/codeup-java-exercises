import java.util.Arrays;

public class ServerNameGenerator {

    public static void main(String[] args) {
        String[] adjectives = new String[]{"Fuzzy", "Relaxed", "Solid", "Angular", "Narrow", "Lucid", "Antiquated", "Hollow", "Bulky", "Pixelated"};

        String[] nouns = new String[]{"Nebula", "Parallax", "Quandary", "Nova", "Singularity", "Dwarf", "Graviton", "Equinox", "Light Year", "Continuum"};

        System.out.println("Here is your server name:");
        System.out.print(getString(adjectives));
        System.out.print("-");
        System.out.print(getString(nouns));


    }


    public static String getString(String[] array) {
        int random = (int) (Math.random() * array.length);
        return array[random];

    }


}

