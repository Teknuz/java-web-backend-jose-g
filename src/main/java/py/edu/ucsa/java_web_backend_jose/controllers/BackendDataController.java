package py.edu.ucsa.java_web_backend_jose.controllers;

import org.springframework.cglib.core.Local;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import py.edu.ucsa.java_web_backend_jose.dto.BackendData;
import py.edu.ucsa.java_web_backend_jose.dto.BackendDataRecord;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/backend/data/")
public class BackendDataController {
    @GetMapping("/full")
    public ResponseEntity<?> getBackendDataGeneric(){
        BackendData data =new BackendData();
        data.setProjectName("JAVA WEB BACKEND JOSEG");
        data.setProjectVersion("0.0.0-SNAPSHOT");
        data.setProjectVersionDate(LocalDate.now());
        return ResponseEntity.ok(data);
    }

    @GetMapping("/class")
    public ResponseEntity<?> getBackendData(){
        BackendData data = buildBackendData();
        return ResponseEntity.ok(data);
    }
    @GetMapping("/record")
    public ResponseEntity<BackendDataRecord> getBackendDataRecord(){
        BackendData data = buildBackendData();

        BackendDataRecord dataRecord = new BackendDataRecord(data.getProjectName(),
                data.getProjectVersion(),
                data.getProjectVersionDate());

        return ResponseEntity.ok(dataRecord);
    }

    private BackendData buildBackendData() {
        BackendData data = new BackendData();
        data.setProjectName("JAVA WEB BACKEND JOSEG");
        data.setProjectVersion("0.0.0-SNAPSHOT");
        data.setProjectVersionDate(LocalDate.now());
        return data;
    }


}
