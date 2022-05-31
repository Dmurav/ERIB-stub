package dima.stab.base;

import java.util.Map;

public class EribGetResponse {

    private Boolean success;
    private Map<String, Map<String, String>> status;

    public EribGetResponse(Boolean success, Map<String, Map<String, String>> status) {
        this.success= success;
        this.status = status;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setStatus(Map<String, Map<String, String>> status) {
        this.status = status;
    }

    public Boolean getSuccess() {
        return success;
    }

    public Map<String, Map<String, String>> getStatus() {
        return status;
    }
}
