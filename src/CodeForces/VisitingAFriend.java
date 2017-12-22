package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sahil on 20/12/17.
 */
public class VisitingAFriend {

    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String parameterStringList[] = reader.readLine().split(" ");
            int numOfTeleport = Integer.parseInt(parameterStringList[0]);
            int destination = Integer.parseInt(parameterStringList[1]);
            boolean isReacheable = true;
            int xCoordinate[] = new int[numOfTeleport];
            int yCoordinate[] = new int[numOfTeleport];
            for(int i=0;i<numOfTeleport;i++){
                String coordinateStringList[] = reader.readLine().split(" ");
                xCoordinate[i] = Integer.parseInt(coordinateStringList[0]);
                yCoordinate[i] = Integer.parseInt(coordinateStringList[1]);
            }

            for(int i=0;i<numOfTeleport;i++) {
                   if(yCoordinate[i] == destination){
                       break;
                   }
                   if(i != numOfTeleport-1)
                   if(yCoordinate[i] >= xCoordinate[i+1]){
                       continue;
                   }
                   isReacheable = false;
            }

            if(isReacheable){System.out.println("YES");}
            else{
                System.out.println("NO");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
