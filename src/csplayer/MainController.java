/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csplayer;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;




public class MainController implements Initializable {
    
    @FXML
    private MediaView mv;
    private MediaPlayer mp;
    private Media me;
 //   private Slider vs1;
  
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    
        String path = new File("src/media/stext.mp4").getAbsolutePath();    
        me=new Media(new File(path).toURI().toString());
        mp=new MediaPlayer(me);
        mv.setSmooth(true);
        mv.setMediaPlayer(mp);
      //  vs1.setValue(100);
        
        
    }   
    
    
    public void play(ActionEvent e){
    mp.play();
    }
    public void pause(ActionEvent e){
    mp.pause();
    }
    public void stop(ActionEvent e){
    mp.stop();
    }
    public void exit(ActionEvent e){
    System.exit(0);
    }
    
}
