import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        // Creates a new Linkedlist Object
        LinkedList<String> Playlist = new LinkedList<>();

        // Adds new songs to Playlist
        Playlist.add("Yuugure no Tori");
        Playlist.add("Tabidachi no Uta");
        Playlist.add("New Song");
        Playlist.add("Waltz of Four Left Feet");
        Playlist.add("Centimeter");

        // Adds a new song at the front of the Playlist
        Playlist.addFirst("Gunjou");

        // Adds a new song at the end of the Playlist
        Playlist.addLast("Yorimichi");

        // Display node at the front in the LinkedList
        System.out.println(Playlist.get(0));

        // Replace the last song using the set() method
        Playlist.set(6, "Holly Hell");

        // Remove the first song using the remove() method
        Playlist.remove(0);

        // Display all songs in Playlist
        System.out.println("Updated playlist: " + Playlist);
    }
}
