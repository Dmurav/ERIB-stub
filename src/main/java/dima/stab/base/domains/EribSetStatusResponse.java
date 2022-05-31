package dima.stab.base;

import java.util.Map;

public class EribSetStatusResponse {

    private Map<String,String> status;

    public EribSetStatusResponse(Map<String, String> status) {
        this.status= status;
    }

    public void setStatus(Map<String, String> status) {
        this.status = status;
    }

    public Map<String, String> getStatus() {
        return status;
    }
}
