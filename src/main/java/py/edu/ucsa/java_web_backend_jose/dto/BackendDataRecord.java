package py.edu.ucsa.java_web_backend_jose.dto;

import java.time.LocalDate;

public record BackendDataRecord(String projectName, String projectVersion, LocalDate projectVersionDate) {
}
