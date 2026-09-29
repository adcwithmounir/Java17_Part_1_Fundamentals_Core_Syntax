class User {

    String username;

    public void watchContent(boolean premium) {
        
        int streamsLeft = premium ? 4 : 1;

        for (int i = 0; i < streamsLeft; i++) {
            var content = fetchNext();
            play(content);
        } // content & i gone here

        // streamsLeft still alive
        logSession(username, streamsLeft);
    }
    String fetchNext() {
        return "Stranger Things S01E01";
    }

    void play(String content) {
        System.out.println("  Playing: " + content);
    }

    void logSession(String user, int streams) {
        System.out.println("Session logged for: " + user + " | Streams used: " + (4 - streams));
    }

    public static void main(String[] args) {
        User user = new User();
        user.username = "mounir_netflix";
        System.out.println("--- Starting watch session ---");
        user.watchContent(true);
        System.out.println("--- Session complete ---");
    }
}
