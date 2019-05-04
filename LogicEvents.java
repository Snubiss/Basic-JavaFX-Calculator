/********************************************************************
//  LogicEvents.java       Author: Snubiss
//
//  Date: March 17, 2019
//  Modified: March 19, 2019
//
//  Defines the instance data, constructors and associated
//  methods of a LogicEvents class object. This class contains
//  all of the logical events and mathematical calculations
//  relating to the Calculator class. This class is designed to 
//  be present when creating a Calculator class. 
//
//********************************************************************/

package basiccalculator;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class LogicEvents {
    
    // Create a couple flags to watch for events.
    int cursor;
    boolean equaled;
    
    LogicEvents(){
        cursor = 0;
        equaled = false;
    }
    
    
    /************************************
    *                                   *
    *          BUTTON EVENTS            *
    *                                   *
    *************************************/
    public EventHandler event0(Calculator calc){
        
        EventHandler test = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(equaled){
                    calc.bigText.setText("0");
                    calc.A.setText(null);
                    calc.B.setText(null);
                    calc.action.setText(null);
                    calc.answer.setText(null);
                    equaled = false;
                }
                
                if (cursor == 0){
                    if(calc.bigText.getText().equals("0") || calc.bigText.getText().isEmpty()){
                        calc.bigText.setText("0");
                        calc.A.setText("0");
                    }
                    else{
                        calc.bigText.setText(calc.bigText.getText() + "0");
                        calc.A.setText(calc.A.getText() + "0");
                    }
                }
                if (cursor == 1){
                    if(calc.bigText.getText().equals("0")){
                        calc.bigText.setText("0");
                        calc.B.setText("0");
                    }
                    else{
                        calc.B.setText(calc.B.getText() + ("0"));
                        calc.bigText.setText(calc.bigText.getText() + "0");
                    }
                }
            }
        };
    return test;
    }
    
    public EventHandler event1(Calculator calc){
        
        EventHandler test = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(equaled){
                    calc.bigText.setText("0");
                    calc.A.setText(null);
                    calc.B.setText(null);
                    calc.action.setText(null);
                    calc.answer.setText(null);
                    equaled = false;
                }
                
                if (cursor == 0){
                    if(calc.bigText.getText().equals("0") || calc.bigText.getText().isEmpty()){
                        calc.bigText.setText("1");
                        calc.A.setText("1");
                    }
                    else{
                        calc.bigText.setText(calc.bigText.getText() + "1");
                        calc.A.setText(calc.A.getText() + "1");
                    }
                }
                if (cursor == 1){
                    if(calc.bigText.getText().equals("0")){
                        calc.bigText.setText("1");
                        calc.B.setText("1");
                    }
                    else{
                        calc.B.setText(calc.B.getText() + ("1"));
                        calc.bigText.setText(calc.bigText.getText() + "1");
                    }
                }
            }
        };
    return test;
    }
    
    public EventHandler event2(Calculator calc){
        
        EventHandler test = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(equaled){
                    calc.bigText.setText("0");
                    calc.A.setText(null);
                    calc.B.setText(null);
                    calc.action.setText(null);
                    calc.answer.setText(null);
                    equaled = false;
                }
                
                if (cursor == 0){
                    if(calc.bigText.getText().equals("0") || calc.bigText.getText().isEmpty()){
                        calc.bigText.setText("2");
                        calc.A.setText("2");
                    }
                    else{
                        calc.bigText.setText(calc.bigText.getText() + "2");
                        calc.A.setText(calc.A.getText() + "2");
                    }
                }
                if (cursor == 1){
                    if(calc.bigText.getText().equals("0")){
                        calc.bigText.setText("2");
                        calc.B.setText("2");
                    }
                    else{
                        calc.B.setText(calc.B.getText() + ("2"));
                        calc.bigText.setText(calc.bigText.getText() + "2");
                    }
                }
            }
        };
    return test;
    }
    
    public EventHandler event3(Calculator calc){
        
        EventHandler test = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(equaled){
                    calc.bigText.setText("0");
                    calc.A.setText(null);
                    calc.B.setText(null);
                    calc.action.setText(null);
                    calc.answer.setText(null);
                    equaled = false;
                }
                
                if (cursor == 0){
                    if(calc.bigText.getText().equals("0") || calc.bigText.getText().isEmpty()){
                        calc.bigText.setText("3");
                        calc.A.setText("3");
                    }
                    else{
                        calc.bigText.setText(calc.bigText.getText() + "3");
                        calc.A.setText(calc.A.getText() + "3");
                    }
                }
                if (cursor == 1){
                    if(calc.bigText.getText().equals("0")){
                        calc.bigText.setText("3");
                        calc.B.setText("3");
                    }
                    else{
                        calc.B.setText(calc.B.getText() + ("3"));
                        calc.bigText.setText(calc.bigText.getText() + "3");
                    }
                }
            }
        };
    return test;
    }
    
    public EventHandler event4(Calculator calc){
        
        EventHandler test = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(equaled){
                    calc.bigText.setText("0");
                    calc.A.setText(null);
                    calc.B.setText(null);
                    calc.action.setText(null);
                    calc.answer.setText(null);
                    equaled = false;
                }
                
                if (cursor == 0){
                    if(calc.bigText.getText().equals("0") || calc.bigText.getText().isEmpty()){
                        calc.bigText.setText("4");
                        calc.A.setText("4");
                    }
                    else{
                        calc.bigText.setText(calc.bigText.getText() + "4");
                        calc.A.setText(calc.A.getText() + "4");
                    }
                }
                if (cursor == 1){
                    if(calc.bigText.getText().equals("0")){
                        calc.bigText.setText("4");
                        calc.B.setText("4");
                    }
                    else{
                        calc.B.setText(calc.B.getText() + ("4"));
                        calc.bigText.setText(calc.bigText.getText() + "4");
                    }
                }
            }
        };
    return test;
    }
    
    public EventHandler event5(Calculator calc){
        
        EventHandler test = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(equaled){
                    calc.bigText.setText("0");
                    calc.A.setText(null);
                    calc.B.setText(null);
                    calc.action.setText(null);
                    calc.answer.setText(null);
                    equaled = false;
                }
                
                if (cursor == 0){
                    if(calc.bigText.getText().equals("0") || calc.bigText.getText().isEmpty()){
                        calc.bigText.setText("5");
                        calc.A.setText("5");
                    }
                    else{
                        calc.bigText.setText(calc.bigText.getText() + "5");
                        calc.A.setText(calc.A.getText() + "5");
                    }
                }
                if (cursor == 1){
                    if(calc.bigText.getText().equals("0")){
                        calc.bigText.setText("5");
                        calc.B.setText("5");
                    }
                    else{
                        calc.B.setText(calc.B.getText() + ("5"));
                        calc.bigText.setText(calc.bigText.getText() + "5");
                    }
                }
            }
        };
    return test;
    }
    
    public EventHandler event6(Calculator calc){
        
        EventHandler test = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(equaled){
                    calc.bigText.setText("0");
                    calc.A.setText(null);
                    calc.B.setText(null);
                    calc.action.setText(null);
                    calc.answer.setText(null);
                    equaled = false;
                }
                
                if (cursor == 0){
                    if(calc.bigText.getText().equals("0") || calc.bigText.getText().isEmpty()){
                        calc.bigText.setText("6");
                        calc.A.setText("6");
                    }
                    else{
                        calc.bigText.setText(calc.bigText.getText() + "6");
                        calc.A.setText(calc.A.getText() + "6");
                    }
                }
                if (cursor == 1){
                    if(calc.bigText.getText().equals("0")){
                        calc.bigText.setText("6");
                        calc.B.setText("6");
                    }
                    else{
                        calc.B.setText(calc.B.getText() + ("6"));
                        calc.bigText.setText(calc.bigText.getText() + "6");
                    }
                }
            }
        };
    return test;
    }
    
    public EventHandler event7(Calculator calc){
        
        EventHandler test = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(equaled){
                    calc.bigText.setText("0");
                    calc.A.setText(null);
                    calc.B.setText(null);
                    calc.action.setText(null);
                    calc.answer.setText(null);
                    equaled = false;
                }
                
                if (cursor == 0){
                    if(calc.bigText.getText().equals("0") || calc.bigText.getText().isEmpty()){
                        calc.bigText.setText("7");
                        calc.A.setText("7");
                    }
                    else{
                        calc.bigText.setText(calc.bigText.getText() + "7");
                        calc.A.setText(calc.A.getText() + "7");
                    }
                }
                if (cursor == 1){
                    if(calc.bigText.getText().equals("0")){
                        calc.bigText.setText("7");
                        calc.B.setText("7");
                    }
                    else{
                        calc.B.setText(calc.B.getText() + ("7"));
                        calc.bigText.setText(calc.bigText.getText() + "7");
                    }
                }
            }
        };
    return test;
    }
    
    public EventHandler event8(Calculator calc){
        
        EventHandler test = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(equaled){
                    calc.bigText.setText("0");
                    calc.A.setText(null);
                    calc.B.setText(null);
                    calc.action.setText(null);
                    calc.answer.setText(null);
                    equaled = false;
                }
                
                if (cursor == 0){
                    if(calc.bigText.getText().equals("0") || calc.bigText.getText().isEmpty()){
                        calc.bigText.setText("8");
                        calc.A.setText("8");
                    }
                    else{
                        calc.bigText.setText(calc.bigText.getText() + "8");
                        calc.A.setText(calc.A.getText() + "8");
                    }
                }
                if (cursor == 1){
                    if(calc.bigText.getText().equals("0")){
                        calc.bigText.setText("8");
                        calc.B.setText("8");
                    }
                    else{
                        calc.B.setText(calc.B.getText() + ("8"));
                        calc.bigText.setText(calc.bigText.getText() + "8");
                    }
                }
            }
        };
    return test;
    }
    
    public EventHandler event9(Calculator calc){
        
        EventHandler test = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(equaled){
                    calc.bigText.setText("0");
                    calc.A.setText(null);
                    calc.B.setText(null);
                    calc.action.setText(null);
                    calc.answer.setText(null);
                    equaled = false;
                }
                
                if (cursor == 0){
                    if(calc.bigText.getText().equals("0") || calc.bigText.getText().isEmpty()){
                        calc.bigText.setText("9");
                        calc.A.setText("9");
                    }
                    else{
                        calc.bigText.setText(calc.bigText.getText() + "9");
                        calc.A.setText(calc.A.getText() + "9");
                    }
                }
                if (cursor == 1){
                    if(calc.bigText.getText().equals("0")){
                        calc.bigText.setText("9");
                        calc.B.setText("9");
                    }
                    else{
                        calc.B.setText(calc.B.getText() + ("9"));
                        calc.bigText.setText(calc.bigText.getText() + "9");
                    }
                }
            }
        };
    return test;
    }
     
    
    /************************************
    *                                   *
    *        CALCULATION EVENTS         *
    *                                   *
    *************************************/
    
    public EventHandler eventPlus(Calculator calc){
        
        EventHandler test = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {

                Long digTemp;
                
                try{
                    digTemp = Long.parseLong(calc.bigText.getText());
                    eventClear(calc);
                    String temp = String.valueOf(digTemp);
                    
                    if ( temp.length() > 10){
                        temp = String.valueOf(digTemp).substring(0,9);
                    }
                    
                    equaled = false;
                    calc.A.setText(temp);
                    calc.bigText.setText("0");
                    calc.action.setText("+");
                    calc.B.setText(null);
                    calc.answer.setText(null);
                    cursor = 1;
                }
                catch(NumberFormatException ex){
                    
                    calc.bigText.setText("0");
                    calc.A.setText("0");
                    calc.B.setText(null);
                    calc.answer.setText(null);
                    cursor = 0;
                }
            }
        };
        return test;
    }
    
    public EventHandler eventMinus(Calculator calc){
        
        EventHandler test = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {

                Long digTemp;
                
                try{
                    digTemp = Long.parseLong(calc.bigText.getText());
                    eventClear(calc);
                    String temp = String.valueOf(digTemp);
                    
                    if ( temp.length() > 10){
                        temp = String.valueOf(digTemp).substring(0,9);
                    }
                    
                    equaled = false;
                    calc.A.setText(temp);
                    calc.bigText.setText("0");
                    calc.action.setText("-");
                    calc.B.setText(null);
                    calc.answer.setText(null);
                    cursor = 1;
                }
                catch(NumberFormatException ex){
                    
                    calc.bigText.setText("0");
                    calc.A.setText("0");
                    calc.B.setText(null);
                    calc.answer.setText(null);
                    cursor = 0;
                }
            }
        };
        return test;
    }
    
    public EventHandler eventMultiply(Calculator calc){
        
        EventHandler test = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {

                Long digTemp;
                
                try{
                    digTemp = Long.parseLong(calc.bigText.getText());
                    eventClear(calc);
                    String temp = String.valueOf(digTemp);
                    
                    if ( temp.length() > 10){
                        temp = String.valueOf(digTemp).substring(0,9);
                    }
                    
                    equaled = false;
                    calc.A.setText(temp);
                    calc.bigText.setText("0");
                    calc.action.setText("x");
                    calc.B.setText(null);
                    calc.answer.setText(null);
                    cursor = 1;
                }
                catch(NumberFormatException ex){
                    
                    calc.bigText.setText("0");
                    calc.A.setText("0");
                    calc.B.setText(null);
                    calc.answer.setText(null);
                    cursor = 0;
                }
            }
        };
        return test;
    }
    
    public EventHandler eventDivide(Calculator calc){
        
        EventHandler test = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {

                Long digTemp;
                
                try{
                    
                    digTemp = Long.parseLong(calc.bigText.getText());
                    eventClear(calc);
                    String temp = String.valueOf(digTemp);
                    
                    if ( temp.length() > 10){
                        temp = String.valueOf(digTemp).substring(0,9);
                    }
                    
                    equaled = false;
                    calc.A.setText(temp);
                    calc.bigText.setText("0");
                    calc.action.setText("/");
                    calc.B.setText(null);
                    calc.answer.setText(null);
                    cursor = 1;
                }
                catch(NumberFormatException ex){
                    
                    calc.bigText.setText("0");
                    calc.A.setText("0");
                    calc.B.setText(null);
                    calc.answer.setText(null);
                    cursor = 0;
                }
            }
        };
        return test;
    }
    
    public EventHandler eventEquals(Calculator calc){
        
        EventHandler test = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {

                
                Long digTempA;
                Long digTempB;
                char temp;
                
                try{
                    digTempA = Long.parseLong(calc.A.getText());
                }
                catch(NumberFormatException ex){
                    //calc.bigText.setText("0");
                    return;
                }
                
                try{
                    digTempA = Long.parseLong(calc.A.getText());
                    digTempB = Long.parseLong(calc.B.getText());
                }
                catch(NumberFormatException ex){
                    calc.bigText.setText("ERROR");
                    calc.answer.setText("ERROR");
                    return;
                }
                
                try{
                    //digTempA = Long.parseLong(calc.A.getText());
                    //digTempB = Long.parseLong(calc.B.getText());
                    temp = calc.action.getText().charAt(0);
                    
                    switch(temp){
                        case 'x': calc.answer.setText(String.valueOf(digTempA * digTempB));
                                  calc.bigText.setText(String.valueOf(digTempA * digTempB));
                                  if (String.valueOf(digTempA * digTempB).length() > 10){
                                      calc.bigText.setText("ERROR");
                                      calc.answer.setText("ERROR");
                                  }
                                  
                        break;
                        case '+': calc.answer.setText(String.valueOf(digTempA + digTempB));
                                  calc.bigText.setText(String.valueOf(digTempA + digTempB));
                                  if (String.valueOf(digTempA + digTempB).length() > 10){
                                      calc.bigText.setText("ERROR");
                                      calc.answer.setText("ERROR");
                                  }
                        break;
                        case '/': calc.answer.setText(String.valueOf(digTempA / digTempB));
                                  calc.bigText.setText(String.valueOf(digTempA / digTempB));
                                  if (String.valueOf(digTempA / digTempB).length() > 10){
                                      calc.bigText.setText("ERROR");
                                      calc.answer.setText("ERROR");
                                  }
                        break;
                        case '-': calc.answer.setText(String.valueOf(digTempA - digTempB));
                                  calc.bigText.setText(String.valueOf(digTempA - digTempB));
                                  if (String.valueOf(digTempA - digTempB).length() > 9){
                                      calc.bigText.setText("ERROR");
                                      calc.answer.setText("ERROR");
                                  }
                        break;
                        default: 
                        break;
                    }
                    cursor = 0;
                    equaled = true;
                }
                catch(NumberFormatException ex){
                    //calc.bigText.setText("0");
                }
            }
        };
        return test;
    }
    
    public EventHandler eventClear(Calculator calc){
        
        EventHandler test = (EventHandler<ActionEvent>) (ActionEvent event) -> {
            calc.bigText.setText("0");
            calc.A.setText(null);
            calc.B.setText(null);
            calc.action.setText(null);
            calc.answer.setText(null);
            equaled = false;
            cursor = 0;
        };
    return test;
    }
    
    
}// END OF CLASS

