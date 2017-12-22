package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by sahil on 25/10/17.
 */
public class KeyBoard {

    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String orientation = reader.readLine();
            String message = reader.readLine();
            String key[] = {"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l",";","z","x","c","v","b","n","m",",",".","/"};
            HashMap<String,Integer> map = new HashMap<>();
            for(int i=0;i<key.length;i++)
                map.put(key[i],i);
            StringBuilder newMessage = new StringBuilder();
            for(int i=0;i<message.length();i++) {
                String w = message.substring(i,i+1);
                int index = map.get(w);

                    if (orientation.equals("L")) {
                      if(index ==9 || index==19||index==29) newMessage.append(w);
                      else newMessage.append(key[index+1]);
                    } else {
                        if(index ==0 || index==10||index==20) newMessage.append(w);
                        else newMessage.append(key[index-1]);
                    }

            }

            System.out.println(newMessage.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
