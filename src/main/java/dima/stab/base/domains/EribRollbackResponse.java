package dima.stab.base.domains;

import java.util.ArrayList;
import java.util.Map;

public class EribRollbackResponse {

        private Map<String,String> status;

        public EribRollbackResponse(Map<String, String> status) {
            this.status= status;
        }

    public void setStatus(Map<String, String> status) {
        this.status = status;
    }

    public Map<String, String> getStatus() {
        return status;
    }
}
