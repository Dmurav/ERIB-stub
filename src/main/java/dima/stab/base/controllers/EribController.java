package dima.stab.base.controllers;

import dima.stab.base.domains.EribSetTimeResponse;
import dima.stab.base.domains.EribExecResponse;
import dima.stab.base.domains.EribGetResponse;
import dima.stab.base.domains.EribRollbackResponse;
import dima.stab.base.domains.EribSetStatusResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path="/ERIBRouter/erib/limits", produces= MediaType.APPLICATION_JSON_VALUE)
public class EribController {

        private static int time;
        private static boolean status;

        @RequestMapping(path="/rollback/*", produces= MediaType.APPLICATION_JSON_VALUE)
        public EribRollbackResponse rollbackResponse() throws InterruptedException {

            Map<String, String> body = new HashMap<>();
            body.put("code", "SUCCESS");

            Thread.sleep(time);

            return new EribRollbackResponse(body);
        }

        @RequestMapping(path="/exec/*", produces= MediaType.APPLICATION_JSON_VALUE)
        public EribExecResponse execResponse() throws InterruptedException {

            Map<String, String> statusBody = new HashMap<>();
            statusBody.put("code", "SUCCESS");

            Map<String, Map<String,String>> body = new HashMap<>();
            body.put("body", statusBody);

            Thread.sleep(time);

            return new EribExecResponse(status, body);
        }

        @RequestMapping(path="/get", produces= MediaType.APPLICATION_JSON_VALUE)
        public EribGetResponse getResponse() throws InterruptedException {

            Map<String, String> statusBody = new HashMap<>();
            statusBody.put("code", "SUCCESS");

            Map<String, Map<String,String>> body = new HashMap<>();
            body.put("body", statusBody);

            EribGetResponse response = new EribGetResponse(status, body);

            Thread.sleep(time);

            return response;
        }

        @RequestMapping("/settime")
        public EribSetTimeResponse setTime(@RequestParam(value = "time", defaultValue = "0") int time) {

            EribController.time = time;

            Map<String, String> body = new HashMap<>();
            body.put("you have set time of response", String.valueOf(time) + " ms");

            return new EribSetTimeResponse(body);

        }

        @RequestMapping("/setstatus")
        public EribSetStatusResponse setTime(@RequestParam(value = "status", defaultValue = "true") boolean status) {

            EribController.status = status;

            Map<String, String> body = new HashMap<>();
            body.put("you have set status of response", String.valueOf(status));
            return new EribSetStatusResponse(body);

    }
}
