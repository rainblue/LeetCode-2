import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

// https://leetcode-cn.com/problems/number-of-music-playlists/
class L0920_Number_of_Music_Playlists {
    public String[] uncommonFromSentences(String A, String B) {
                String C = A + " " + B;
        String[] splitC = C.split(" ");
        Map<String, Integer> mapC = new HashMap<>();
        for (String s : splitC) {
            if (s != null && !"".equals(s) && !" ".equals(s)) {
                if (mapC.containsKey(s)) {
                    mapC.put(s, 2);
                } else {
                    mapC.put(s, 1);
                }
            }
        }

        List<String> list = new ArrayList<>();
        mapC.forEach((k, v) -> {
            if (v == 1) {
                list.add(k);
            }
        });

        String[] strings = new String[list.size()];
        list.toArray(strings);

        return strings;
    }
}