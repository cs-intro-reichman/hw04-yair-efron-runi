public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {
             for (int j = 0; j < keywords.length; j++) {
                if (contains(lowerCase(sentences[i]), lowerCase(keywords[j]))) {
                    System.out.println(sentences[i]);
                    break;
                }
            }
            
        }
    }
    public static String lowerCase(String str) {
        if (str.equals("")) {
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
        
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                indexOf1 = i;
                int count = 0;
                for (int j = 0; j < str2.length(); j++) {
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
