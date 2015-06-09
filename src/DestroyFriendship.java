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
import javax.swing.DefaultListModel;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.examples.friendship.ShowFriendship;

/**
 * Unfollows the specified user.
 *
 * @author Yusuke Yamamoto - yusuke at mac.com
 */
public final class DestroyFriendship {
    /**
     * Usage: java twitter4j.examples.friendship.DestroyFriendship [screen name]
     *
     * @param args message
     */
    public void destroyFriendship() {
   
        ShowFriendshi df=new ShowFriendshi();
        
        
        
        ArrayList<Long> getFilteredtarget=df.showFriendship();
       
        try {
            Twitter twitter = new TwitterFactory().getInstance();
            User user;
             String get;
             DefaultListModel m1=new DefaultListModel();
             for(Long target:getFilteredtarget){
           
            user=twitter.showUser(target);
          get= user.getScreenName();
          
           
          if(!get.equalsIgnoreCase("prometheanBrain")&&!get.equalsIgnoreCase("tweetrackdevs")){
              m1.addElement(get);
          twitter.destroyFriendship(target);
          }
           
            System.out.println("Successfully unfollowed [" + target + "].");
             }
             MainActivity.deletedList.setModel(m1);
             
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to unfollow: " + te.getMessage());
          
        }
    }
}
