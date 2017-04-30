/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam26;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class RootController implements Initializable {

    @FXML
    private PieChart pieChart;
    @FXML//객체만들어가야 한다 클래스 타입이 들어가야한다.
    private BarChart<String,Integer> barChart;
    @FXML
    private AreaChart<String,Integer> areaChart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ObservableList<PieChart.Data>data1=FXCollections.observableArrayList();//옵저러블이라는 어레이 리스트 스태틱 메소드가 존재한다 FXcolletions 에 
       data1.add(new PieChart.Data("AWT",10));
       data1.add(new PieChart.Data("Swing",10));
       data1.add(new PieChart.Data("SWT",10));
       data1.add(new PieChart.Data("JavaFX",10));//추가 시켜주고
       
       pieChart.setData(data1);//파이차트에 값을 집어 넣어준다.
       
       //////////////////////////////////////////////////////////////////////////
       XYChart.Series<String,Integer> series1=new XYChart.Series<>();
       series1.setName("남자");
       ObservableList <XYChart.Data<String,Integer>> data2=FXCollections.observableArrayList();//옵저러블이라는 어레이 리스트 스태틱 메소드가 존재한다 FXcolletions 에 
       data2.add(new XYChart.Data<String,Integer>("2015",70));
       data2.add(new XYChart.Data<String,Integer>("2016",40));
       data2.add(new XYChart.Data<String,Integer>("2017",50));
       data2.add(new XYChart.Data<String,Integer>("2018",30));//추가 시켜주고
       
       series1.setData(data2);
  
       barChart.getData().add(series1);
   
       ////////////////////////////////////////////////////////////////////////
        XYChart.Series<String,Integer> series2=new XYChart.Series<>();
       series2.setName("여자");
       ObservableList <XYChart.Data<String,Integer>> data3=FXCollections.observableArrayList();//옵저러블이라는 어레이 리스트 스태틱 메소드가 존재한다 FXcolletions 에 
       data3.add(new XYChart.Data<String,Integer>("2015",70));
       data3.add(new XYChart.Data<String,Integer>("2016",40));
       data3.add(new XYChart.Data<String,Integer>("2017",50));
       data3.add(new XYChart.Data<String,Integer>("2018",30));//추가 시켜주고
       
       series2.setData(data3);
       barChart.getData().add(series2);
       ////////////////////////////////////////////////////////////////////////
       XYChart.Series<String,Integer> series3=new XYChart.Series<>();
       series3.setName("평균온도");
       ObservableList <XYChart.Data<String,Integer>> data4=FXCollections.observableArrayList();//옵저러블이라는 어레이 리스트 스태틱 메소드가 존재한다 FXcolletions 에 
       data4.add(new XYChart.Data<String,Integer>("2015",70));
       data4.add(new XYChart.Data<String,Integer>("2016",40));
       data4.add(new XYChart.Data<String,Integer>("2017",50));
       data4.add(new XYChart.Data<String,Integer>("2018",30));//추가 시켜주고
       series3.setData(data4);
       areaChart.getData().add(series3);
  
    
      
       
    }    
    
}
