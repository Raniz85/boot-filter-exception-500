package boot.filter

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@SpringBootApplication
@Controller
class DemoApplication {

    static void main(String[] args) {
        SpringApplication.run DemoApplication, args
    }

    @RequestMapping(["/", "/filter", "/controller"])
    def throwError() {
        throw new CustomException("Controller threw this exception")
    }

}
