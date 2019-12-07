package com.pana.demolucky.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.*;

@Component
@Slf4j
public class TestController {

    @FXML
    private TextField sum;

    @FXML
    private TextField first;

    @FXML
    private TextField second;

    @FXML
    private TextField third;

    @FXML
    private TextField fourth;

    public void submit(ActionEvent event) throws IOException {
        log.info("总人数：{}", sum);
        log.info("一等奖：{}", first);
        log.info("二等奖：{}", second);
        log.info("三等奖：{}", third);
        log.info("四等奖：{}", fourth);

        handleSum(sum);

        Alert alert = new Alert(Alert.AlertType.INFORMATION, "info", new ButtonType("确定", ButtonBar.ButtonData.YES));
        alert.setHeaderText(null);
        alert.setTitle("提示");
        alert.show();
    }

    /**
     * 处理总人数
     * @param sum 总人数
     */
    private void handleSum(TextField sum) throws IOException{

        String sumStr = sum.getText();

        int sumNum = Integer.parseInt(sumStr);

        File file = new File("userList.txt");
        FileWriter fileWriter = new FileWriter(file);

        for(int i=1; i<=sumNum; i++){
            String iStr = String.format("%04d",i);
            fileWriter.write(iStr+"\r\n");
        }
        fileWriter.flush();
        fileWriter.close();

    }

}
