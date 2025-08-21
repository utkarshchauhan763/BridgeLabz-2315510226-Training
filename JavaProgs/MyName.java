public class MyName {
    public static void main(String[] args) {
        System.out.println("I am a teapot who refuses to make coffee!");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Beep boop, I'm a robot counting: " + i);
        }
        
        String[] sillyWords = {"banana", "pickle", "rubber duck", "spaghetti"};
        System.out.println("Random silly word: " + sillyWords[(int)(Math.random() * sillyWords.length)]);
    }
}