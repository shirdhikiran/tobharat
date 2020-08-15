package com.dbs.cmsautomation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestForwardController {

        @RequestMapping(value = "/**/{[path:[^\\.]*}")
        public String redirect() {
            // Forward to home page so that angular routing is preserved.
            return "forward:/";
        }

}
