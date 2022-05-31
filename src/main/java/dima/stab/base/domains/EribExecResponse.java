package dima.stab.base;

import java.util.Map;

public class EribExecResponse {

    private Boolean success;
    private Map<String, Map<String, String>> status;

    public EribExecResponse(Boolean success, Map<String, Map<String, String>> status) {
        this.success= success;
        this.status = status;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getSuccess() {
        return success;
    }

    public Map<String, Map<String, String>> getStatus() {
        return status;
    }
}
