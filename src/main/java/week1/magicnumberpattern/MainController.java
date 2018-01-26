package week1.magicnumberpattern;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/getnumber")

    public String patternDisplay(@RequestParam("number") int num) {
        int numResult=0;
        int startingNumber=num;
        String numSequence="Starting Number: "+startingNumber+"<br/>";

        do{
            if(num>0) {
                if (num % 2 == 0)
                    num /= 2;
                else if(num % 2 != 0)
                    num = (num * 3) + 1;
                numResult = num;
                numSequence += numResult + "  ";
            }
            else {
                num = 1;
                numSequence = "Please enter a positive integer";
            }
        }while(num!=1);

        return numSequence;
    }
}