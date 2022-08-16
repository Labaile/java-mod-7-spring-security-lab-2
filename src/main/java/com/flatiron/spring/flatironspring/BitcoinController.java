package com.flatiron.spring.flatironspring;
import com.flatiron.spring.flatironspring.BitcoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/coingecko")
public class BitcoinController {
    @Autowired
    private BitcoinService bitcoinService;

    public BitcoinController(BitcoinService bitcoinService) {
        this.bitcoinService = bitcoinService;
    }
    @GetMapping("/coingecko/price")
    public String getBitcoinPrice(){
        return bitcoinService.getBitcoinPrice();
    }
    @GetMapping("/coingecko/{currency}")
    public String getCurrencyPrice(@PathVariable String currency){return bitcoinService.getCurrencyPrice(currency);
    }
}
