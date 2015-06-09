
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import twitter4j.Relationship;
import twitter4j.StreamController.User;
import twitter4j.Twitter;
import twitter4j.TwitterException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nitin
 */
public class MainActivity extends javax.swing.JFrame {

    private Twitter twitter = null;
    public String screenName=null;

    /**
     * Creates new form MainActivity
     */
    public MainActivity() throws TwitterException {
        //name.setText(twitter.getScreenName());
        initComponents();
    }

    public void setTwitter(Twitter t) throws TwitterException, MalformedURLException, IOException {

        twitter = t;
screenName=twitter.getScreenName();
        name.setText(twitter.getScreenName());

        twitter4j.User user = twitter.showUser(twitter.getId());
        URL url = new URL(user.getBiggerProfileImageURL());
        //URL url = new URL(fullUrlPath);
        BufferedImage img = ImageIO.read(url);
        ImageIcon icon = new ImageIcon(img);
        imgIcon.setIcon(icon);
                  //JOptionPane.showMessageDialog(null, icon);
        Afollowing.setText(user.getFriendsCount() + "");
        Afollowers.setText(user.getFollowersCount() + "");
        createdAt.setText(user.getCreatedAt() + "");
        lists.setText(user.getListedCount() + "");
        favourites.setText(user.getFavouritesCount() + "");
        tweets.setText(user.getStatusesCount() + "");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        imgIcon = new javax.swing.JLabel();
        followers = new javax.swing.JLabel();
        Following = new javax.swing.JLabel();
        Afollowers = new javax.swing.JLabel();
        Afollowing = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        createdAt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        favourites = new javax.swing.JLabel();
        lists = new javax.swing.JLabel();
        tweets = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        param1 = new javax.swing.JTextField();
        nooftweet = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        display1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        trendfield = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        followstatus = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        trendlist = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        userlist = new javax.swing.JList();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deletedList = new javax.swing.JList();
        jPanel5 = new javax.swing.JPanel();
        uu1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        uu2 = new javax.swing.JTextField();
        u1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1366, 720));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setFocusCycleRoot(true);
        jPanel1.setMinimumSize(new java.awt.Dimension(1361, 700));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 37, 175, 21));

        imgIcon.setPreferredSize(new java.awt.Dimension(73, 73));
        jPanel1.add(imgIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 37, -1, -1));

        followers.setText("Followers");
        jPanel1.add(followers, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 69, -1, -1));

        Following.setText("Following");
        jPanel1.add(Following, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 89, -1, -1));
        jPanel1.add(Afollowers, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 69, -1, -1));
        jPanel1.add(Afollowing, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 89, -1, -1));

        jLabel1.setText("CreatedAt");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 109, -1, -1));
        jPanel1.add(createdAt, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 109, 124, 14));

        jLabel2.setText("Favourites");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 129, -1, -1));

        jLabel4.setText("Lists");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 161, -1, -1));

        jLabel5.setText("Tweets");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 189, -1, -1));
        jPanel1.add(favourites, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 129, 103, 12));
        jPanel1.add(lists, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 161, 125, 16));
        jPanel1.add(tweets, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 188, 124, 14));

        jTabbedPane1.addTab("Your Profile", jPanel1);

        jButton1.setText("Store Usernames");
        jButton1.setToolTipText("By clicking on this you are able to store usernames of all those who have tweeted about a particular trend/keyword or replied to particular user that you are tracking");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Track keyword");

        param1.setToolTipText("Input different trends seprated by ,(comma) you can also input usernames for eg : #followback,@prometheanbrain");

        nooftweet.setToolTipText("Enter number of usernames that you want to store and follow them later don't enter very largs number try to do less than 1000 at a time.");

        jLabel12.setText("Number of users");

        display1.setColumns(20);
        display1.setRows(5);
        jScrollPane5.setViewportView(display1);

        jLabel9.setText("Trend");

        trendfield.setText("Enter a trend name from trend history");
        trendfield.setToolTipText("This field should not be blank dont forget to input trend name from trend history before clicking follow button");
        trendfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trendfieldMouseClicked(evt);
            }
        });

        jButton2.setText("Follow");
        jButton2.setToolTipText("Good job. Now let the app process the user it  might take a while if there are too many users in the database");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(trendlist);

        jScrollPane4.setViewportView(userlist);

        jButton3.setText("Refresh Trend History");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel13.setText("Trend history");

        jLabel14.setText("Username");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(trendfield, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jButton3))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(followstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(trendfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(followstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nooftweet, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(param1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(param1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(nooftweet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)))
                .addContainerGap(336, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("# HashTag Follow", jPanel3);

        jButton4.setText("Unfollow");
        jButton4.setToolTipText("Don't use unfollow option more than twice otherwice twitter will limit your request.");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Unfollow whoever doesn't follow you back.");

        jScrollPane1.setViewportView(deletedList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap(1085, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(386, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Non Followers", jPanel2);

        jLabel6.setText("Uername of user 1:");

        jLabel7.setText("Username of user 2:");

        jButton5.setText("Check Friendship");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uu1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uu2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(u1, javax.swing.GroupLayout.PREFERRED_SIZE, 1272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 89, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(uu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(59, 59, 59)
                .addComponent(u1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(384, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Check Friendship", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            PrintUserStream print=new PrintUserStream();
            String param[]=new String[50];
            param=param1.getText().split(",");

            Insert in=new Insert();
            String a=param[0].replaceAll(" ", "");
            String b=a.replaceAll("@", "");
            String c=b.replaceAll("#", "");
            System.out.println(c);
            //in.createColoumn(c,masterusername);
            System.out.println("muser "+screenName);
            print.Trigger(param,Integer.parseInt(nooftweet.getText()),screenName);}
        catch(Exception e){
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void trendfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trendfieldMouseClicked

        trendfield.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_trendfieldMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        followstatus.setText("Processing userlist wait..");
        try {
            Insert in=new Insert();
            ResultSet rs=in.getResultSet(trendfield.getText(), screenName);

            DefaultListModel m1=new DefaultListModel();
            ArrayList<String> retrievedlist=new ArrayList<String> ();

            while(rs.next()){
                retrievedlist.add(rs.getString("userlist"));
                m1.addElement(rs.getString("userlist"));
            }
            userlist.setModel(m1);
            CreateFriendship cf=new CreateFriendship();
            cf.Follow(retrievedlist);
        }catch(SQLException e){

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Insert in=new Insert();
            DefaultListModel m=new DefaultListModel();
            ResultSet r=in.getTrends(screenName);

            while(r.next()){
                m.addElement(r.getString(1));

            }
            trendlist.setModel(m);
        }catch(Exception  e){

            followstatus.setText("Something went wrong are you sure you are logged in");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DestroyFriendship df=new DestroyFriendship();
        df.destroyFriendship();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {
            
            Relationship r=twitter.showFriendship(uu1.getText(),uu2.getText());
            String s=r.getSourceUserScreenName()+" is ";
            if(r.isSourceFollowingTarget()){
            
            s=s+" following "+r.getTargetUserScreenName();
            if(r.isSourceFollowedByTarget()){
            s=s+" aslo "+r.getSourceUserScreenName()+" is followed by "+r.getTargetUserScreenName();
            }else{
            s=s+" but "+r.getSourceUserScreenName()+" is not followed by "+r.getTargetUserScreenName();
            }
            
            }
            else{
                
                s=s+" not following "+r.getTargetUserScreenName();
            
                if(r.isSourceFollowedByTarget()){
                
                s=s+" interestingly "+r.getSourceUserScreenName()+" is followed by "+r.getTargetUserScreenName();
                }
                else{
                s=s+" neither  "+r.getSourceUserScreenName()+" is followed by "+r.getTargetUserScreenName();
                }
              
            }
            
                if(r.isSourceNotificationsEnabled()){
                s=s+", "+r.getSourceUserScreenName()+" has enabled notification for "+r.getTargetUserScreenName();
                
                }
                else{
                 s=s+", "+r.getSourceUserScreenName()+" has no intention of enabling notification for "+r.getTargetUserScreenName();
                }
                
                    if(r.isSourceBlockingTarget()){
                s=s+" its strange but "+r.getSourceUserScreenName()+" is blocking "+r.getTargetUserScreenName();
                
                }
                else{
                 s=s+" needless to say "+r.getSourceUserScreenName()+" is not blocking "+r.getTargetUserScreenName();
                }
                   
                        
                 u1.setText(s);
            
// TODO add your handling code here:
        } catch (TwitterException ex) {
            Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainActivity().setVisible(true);
                } catch (TwitterException ex) {
                    Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Afollowers;
    private javax.swing.JLabel Afollowing;
    private javax.swing.JLabel Following;
    private javax.swing.JLabel createdAt;
    public static javax.swing.JList deletedList;
    public static javax.swing.JTextArea display1;
    private javax.swing.JLabel favourites;
    private javax.swing.JLabel followers;
    public static javax.swing.JLabel followstatus;
    private javax.swing.JLabel imgIcon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lists;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nooftweet;
    public static javax.swing.JTextField param1;
    private javax.swing.JTextField trendfield;
    private javax.swing.JList trendlist;
    private javax.swing.JLabel tweets;
    private javax.swing.JLabel u1;
    private javax.swing.JList userlist;
    private javax.swing.JTextField uu1;
    private javax.swing.JTextField uu2;
    // End of variables declaration//GEN-END:variables
}