package project12;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.*;
@Component
public class MyFileController {
    @Value(value = "${input_name}")
    private String input_file;
    @Value(value = "${output_name}")
    private String output_file;
    MyfileProcess myfileProcess;
    @PostConstruct
    public void Init() throws IOException {
        System.out.println("Starting converting...");
        myfileProcess = new MyfileProcess(input_file,output_file);
        myfileProcess.transport();
    }
    @PreDestroy
    public void Destroy(){
        myfileProcess.deletik(input_file);
        System.out.println("Operation ended");
    }
}
