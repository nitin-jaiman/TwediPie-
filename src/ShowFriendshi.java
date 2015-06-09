//package app.nitin.jaiman;

/*
 * Copyright 2007 Yusuke Yamamoto
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */



import java.util.ArrayList;
import java.util.Collections;
import twitter4j.Relationship;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
/**
 * Shows friendship between two users.
 *
 * @author Yusuke Yamamoto - yusuke at mac.com
 */
public final class ShowFriendshi {
    /**
     * Usage: java twitter4j.examples.friendship.ShowFriendship  [source screen name] [target screen name]
     *
     * @param args message
     */
    public  ArrayList<Long> showFriendship() {
        GetFriendsIDs getFriendsId=new GetFriendsIDs();
        ArrayList<Long> target=getFriendsId.getFriendsId();
        ArrayList<Long> filteredTarget=new ArrayList<Long>();
      Collections.shuffle(target);
        try {
            Twitter twitter = new TwitterFactory().getInstance();
            int authenticatedUserId=(int) twitter.getId();
            if(target.size()<50){
            
               for(int i=0;i<target.size();i++){
            Relationship relationship = twitter.showFriendship(authenticatedUserId, target.get(i));
   if( !relationship.isSourceFollowedByTarget()){
       
   filteredTarget.add(target.get(i));
   }
   
   }
            
            
            }
            else{
            for(int i=0;i<50;i++){
            Relationship relationship = twitter.showFriendship(authenticatedUserId, target.get(i));
   if( !relationship.isSourceFollowedByTarget()){
   
   filteredTarget.add(target.get(i));
   }
   
   }
           
            } 
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to show friendship: " + te.getMessage());
           
        }
        
    return filteredTarget;
    }
}
