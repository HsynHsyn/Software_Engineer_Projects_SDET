package week11_review.string;
/*
The Method checks if every character in a specified sentence (ignoring spaces) can
be typed using the keys that are still working on a broken keyboard.

workingKeys contains keys that are still working
check if sentence can be typed using the keys that still working.
ignore spaces and case differences

canTypeSentence("ab cd","bad") => true
canTypeSentence("abcd","cabb") => true
canTypeSentence("helotwrdg","Hello world") => true
canTypeSentence("avd","java") => false

 */
public class T02BrokenKeyboard {
    public static void main(String[] args) {
        System.out.println(canTypeSentence("abcd", "bad"));
        System.out.println(canTypeSentence("helotwrdg", "Hello world"));
        System.out.println(canTypeSentence("abcd", "bad car"));
        System.out.println(canTypeSentence("avd", "java"));

    }

    public static boolean canTypeSentence(String workingKeys, String sentence) {
        //make all lowercase and remove spaces for correct checking:
        sentence = sentence.replace(" ","").toLowerCase();
        workingKeys = workingKeys.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            if (!workingKeys.contains(sentence.charAt(i)+"")) {
                return false;
            }
        }

//        for(char eachChar : sentence.toCharArray()) {
//            if (!workingKeys.contains(eachChar+"")) {
//                return false;
//            }
//        }
        return true;
    }
}











