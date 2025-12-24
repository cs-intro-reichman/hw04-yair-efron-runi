public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        if (str=="") {
            return "";
        }
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 &&  str.charAt(i) <= 90) {
                ret = ret + ((char) (str.charAt(i) + 32));
            } else {
                ret = ret + str.charAt(i);
            }
        }
        return ret;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return false;
        } else if (str2.length() == 0) {
            return true;
        }
        int indexOf1 = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                indexOf1 = i;
                int count = 0;
                for (int j = 0; j < str2.length(); j++) {
                    if (indexOf1 >= str1.length()) {
                        break;
                    }
                    if (str2.charAt(j) != str1.charAt(indexOf1)) {
                        break;
                    } else {
                        count++;
                    }
                    if (count == str2.length()) {
                        return true;
                    }
                    indexOf1++;
                }
            }
        }
        return false;
    }
}