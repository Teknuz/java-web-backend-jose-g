package py.edu.ucsa.java_web_backend_jose.dto;

import java.time.LocalDate;

public class BackendData {

    private String projectName;
    private String projectVerion;
    private LocalDate projectVersionDate;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectVerion() {
        return projectVerion;
    }

    public void setProjectVerion(String projectVerion) {
        this.projectVerion = projectVerion;
    }

    public LocalDate getProjectVersionDate() {
        return projectVersionDate;
    }

    public void setProjectVersionDate(LocalDate projectVersionDate) {
        this.projectVersionDate = projectVersionDate;
    }
}
