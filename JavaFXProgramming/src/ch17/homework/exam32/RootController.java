/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.homework.exam32;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class RootController implements Initializable {

    @FXML//FXML 로 사용할 경우는 
    private ListView<Food> listView;//필드에서만 사용이 가능하다 FXML 은 
   //fx:id 컨트롤러에 FXML 어노테이션으로 참조하기 위해서 사용하는것이고
    //코드에서 직접 id 값으로 객체를 찾을 때 사용을 하거나 CSS에서 객체를 찾을 때 사용을 한다.
    //lookup("id") 으로 아이디를 주게 되면은 id 에 해당하는 객체가 리턴된다.메소드가 실행하면서fxml 의 객체를 찾아 사용하는 경우 
    //lookup 메소드를 id 를 줘서 찾는다.한곳에 두가지 사용가능하다. fx:id 와 id 값 두개 다 가능
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listView.setCellFactory(new Callback<ListView<Food>, ListCell<Food>>() {//팩토리 객체이다 머를 만드는 역할을 한다.셀을 만드는 객체를 등록하겠다.
            @Override
            public ListCell<Food> call(ListView<Food> param) {//폰갯수만큼 리스트 셀을 만드는 역할 외부에서 폰객체가 들어올 때 실행한다.셀을 만들어서 리턴하는 역할을 한다.
                ListCell<Food>listCell=new ListCell<Food>(){//리스트 셀을 상속해서 자식객체로 만든다.
                    @Override//업데이트 아이템 재정의 한다 
                    protected void updateItem(Food item, boolean empty) {//기본값이 true 이다.
                        super.updateItem(item, empty);//부모에특정내용을 시켜야 한다.
                        if(empty)return;//맨처음 실행할때는 폰객체가 없다. 그래서 그냥실행을 시키게 되면 에러난다.
                        try {
                        //셀안에 들어갈 내용을 구성하는 곳이다.  셀안에 들어가는 메소드내용 phone item.fxml 을 결합해서 call 메소드 를 통해서 만들어 낸다.
                        HBox hbox=(HBox)FXMLLoader.load(getClass().getResource("food.fxml"));//루트 컨테이너
                        ImageView foodImage=(ImageView)hbox.lookup("#image");//id 값 lookup 은 노드값을 리턴하기 때문에 강제 형변환을 해준다.
                        Label foodName=(Label)hbox.lookup("#name");//id 로 넣어줄때는#을 붙여줘야한다.
                        ImageView starImage=(ImageView)hbox.lookup("#score");
                            System.out.println(starImage.toString());
                        Label foodContent=(Label)hbox.lookup("#content");
                            System.out.println(foodContent.toString());
                        
                        foodImage.setImage(new Image(getClass().getResource("images/"+item.getImage()).toString()));
                        foodName.setText(item.getName());
                        System.out.println(foodName.toString());
                        foodContent.setText(item.getDescription());
                        System.out.println(foodContent.toString());
                            System.out.println(item.getScore());
                        starImage.setImage(new Image(getClass().getResource("images/"+"star"+item.getScore()+".png").toString()));
                     
                       
                        //cell 의 내용으로 설정하는 것이다
                        setGraphic(hbox);
                        } catch (IOException ex) {}
                    }
                
                };//익명객체일때 객체만들때 클래스면 상속해서 자식객체로 만들고 인터페이스는 구현하는 것이다.
                     return listCell; 
                
            }
            
        });//하나의 행을 만드는 놈을 셋팅하겠다.call 은 phone 객체가listView 에 들어오면은 그걸로 cell을 만들어 준다. 
        //선택 속성감시
//        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Food>(){
//            @Override
//            public void changed(ObservableValue<? extends Food> observable, Food oldValue, Food newValue) {
//                System.out.println(newValue.getName()+":"+newValue.getImage());
//            }
//        
//        });
        ObservableList<Food>value=FXCollections.observableArrayList();
        value.add(new Food("food01.png","삼겹살",3,"짱맛"));
        value.add(new Food("food02.png","장어",5,"존맛"));
        value.add(new Food("food03.png","장어맛",8,"개맛"));
     
        listView.setItems(value);
        
    }    
    
}
//리스트 뷰는 안에 항목을 cell 이라고 부른다.cell 은 팩토리가 만들어 준다. callBack 이라는 객체를 통해서 만든다.
//콜백이라는 객체로 셀을 만들고 셀안에 들어가는 것은 item.fxml 을 로드 한다.셀안에 머가 들어간다.폰에잇는객체를 fxml 에다가 
//정보를 넣어줘서 로드한다. 첫번째 클래스 phone 만들고 두번째로 fxml 을 만들고 3 셀팩토리를 만든다.
